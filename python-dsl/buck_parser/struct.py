from __future__ import absolute_import
from __future__ import division
from __future__ import print_function
from __future__ import with_statement

import json


class StructEncoder(json.JSONEncoder):
    """Extends built-in JSONEncoder to support Struct serialization."""

    def default(self, o):
        if isinstance(o, Struct):
            return o._asdict()


class Struct(object):
    """
    An immutable container using the keyword arguments as attributes.

    __setattr__ makes sure that fields can be mutated only during initialization.
    __getattr__ delegates attribute reads to internal dictionary.
    """

    _KWARGS_ATTRIBUTE_NAME = "__kwargs"

    def __init__(self, **kwargs):
        super(Struct, self).__setattr__(self._KWARGS_ATTRIBUTE_NAME, kwargs)

    def _get_kwargs(self):
        return super(Struct, self).__getattribute__(self._KWARGS_ATTRIBUTE_NAME)

    def __getattr__(self, item):
        """Handles retrieval of attributes not explicitly defined in this instance."""
        return dict.__getitem__(self._get_kwargs(), item)

    def __setattr__(self, key, value):
        """Handles attribute writes on this instance.

        All writes fail to ensure immutability.
        """
        raise AttributeError("Mutation of struct attributes (%r) is not allowed." % key)

    def to_json(self):
        """Creates a JSON string representation of this struct instance."""
        return json.dumps(self, cls=StructEncoder, separators=(",", ":"))

    def _asdict(self):
        """Converts this struct into dict."""
        return self._get_kwargs()


def struct(**kwargs):
    """Creates an immutable container using the keyword arguments as attributes.

    It can be used to group multiple values and/or functions together. Example:
        def _my_function():
          return 3
        s = struct(x = 2, foo = _my_function)
        return s.x + s.foo()  # returns 5
    """
    return Struct(**kwargs)
