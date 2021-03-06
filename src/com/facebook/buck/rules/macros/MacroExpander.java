/*
 * Copyright 2014-present Facebook, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License. You may obtain
 * a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package com.facebook.buck.rules.macros;

import com.facebook.buck.model.BuildTarget;
import com.facebook.buck.model.macros.MacroException;
import com.facebook.buck.rules.BuildRuleResolver;
import com.facebook.buck.rules.CellPathResolver;
import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.ImmutableList;

public interface MacroExpander {

  /** Expand the input given for the this macro to some string. */
  String expand(
      BuildTarget target,
      CellPathResolver cellNames,
      BuildRuleResolver resolver,
      ImmutableList<String> input,
      Object precomputedWork)
      throws MacroException;

  /**
   * Expand the input given for the this macro to some string, which is intended to be written to a
   * file.
   */
  default String expandForFile(
      BuildTarget target,
      CellPathResolver cellNames,
      BuildRuleResolver resolver,
      ImmutableList<String> input,
      Object precomputedWork)
      throws MacroException {
    return expand(target, cellNames, resolver, input, precomputedWork);
  }

  /**
   * @return names of additional {@link com.facebook.buck.rules.TargetNode}s which must be followed
   *     by the parser to support this macro when constructing the target graph. To be used by
   *     {@link
   *     com.facebook.buck.rules.ImplicitDepsInferringDescription#findDepsForTargetFromConstructorArgs}
   *     to extract implicit dependencies hidden behind macros.
   */
  void extractParseTimeDeps(
      BuildTarget target,
      CellPathResolver cellNames,
      ImmutableList<String> input,
      ImmutableCollection.Builder<BuildTarget> buildDepsBuilder,
      ImmutableCollection.Builder<BuildTarget> targetGraphOnlyDepsBuilder)
      throws MacroException;

  /** @return something that should be added to the rule key of the rule that expands this macro. */
  Object extractRuleKeyAppendables(
      BuildTarget target,
      CellPathResolver cellNames,
      BuildRuleResolver resolver,
      ImmutableList<String> input,
      Object precomputedWork)
      throws MacroException;

  /** @return cache-able work that can be re-used for the various extract/expand functions */
  Object precomputeWork(
      BuildTarget target,
      CellPathResolver cellNames,
      BuildRuleResolver resolver,
      ImmutableList<String> input)
      throws MacroException;
}
