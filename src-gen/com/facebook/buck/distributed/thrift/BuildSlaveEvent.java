/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.facebook.buck.distributed.thrift;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2017-12-19")
public class BuildSlaveEvent implements org.apache.thrift.TBase<BuildSlaveEvent, BuildSlaveEvent._Fields>, java.io.Serializable, Cloneable, Comparable<BuildSlaveEvent> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("BuildSlaveEvent");

  private static final org.apache.thrift.protocol.TField EVENT_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("eventType", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField STAMPEDE_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("stampedeId", org.apache.thrift.protocol.TType.STRUCT, (short)2);
  private static final org.apache.thrift.protocol.TField BUILD_SLAVE_RUN_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("buildSlaveRunId", org.apache.thrift.protocol.TType.STRUCT, (short)3);
  private static final org.apache.thrift.protocol.TField CONSOLE_EVENT_FIELD_DESC = new org.apache.thrift.protocol.TField("consoleEvent", org.apache.thrift.protocol.TType.STRUCT, (short)10);
  private static final org.apache.thrift.protocol.TField BUILD_RULE_FINISHED_EVENT_FIELD_DESC = new org.apache.thrift.protocol.TField("buildRuleFinishedEvent", org.apache.thrift.protocol.TType.STRUCT, (short)11);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new BuildSlaveEventStandardSchemeFactory());
    schemes.put(TupleScheme.class, new BuildSlaveEventTupleSchemeFactory());
  }

  /**
   * 
   * @see BuildSlaveEventType
   */
  public BuildSlaveEventType eventType; // optional
  public com.facebook.buck.distributed.thrift.StampedeId stampedeId; // optional
  public com.facebook.buck.distributed.thrift.BuildSlaveRunId buildSlaveRunId; // optional
  public BuildSlaveConsoleEvent consoleEvent; // optional
  public BuildRuleFinishedEvent buildRuleFinishedEvent; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * 
     * @see BuildSlaveEventType
     */
    EVENT_TYPE((short)1, "eventType"),
    STAMPEDE_ID((short)2, "stampedeId"),
    BUILD_SLAVE_RUN_ID((short)3, "buildSlaveRunId"),
    CONSOLE_EVENT((short)10, "consoleEvent"),
    BUILD_RULE_FINISHED_EVENT((short)11, "buildRuleFinishedEvent");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // EVENT_TYPE
          return EVENT_TYPE;
        case 2: // STAMPEDE_ID
          return STAMPEDE_ID;
        case 3: // BUILD_SLAVE_RUN_ID
          return BUILD_SLAVE_RUN_ID;
        case 10: // CONSOLE_EVENT
          return CONSOLE_EVENT;
        case 11: // BUILD_RULE_FINISHED_EVENT
          return BUILD_RULE_FINISHED_EVENT;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final _Fields optionals[] = {_Fields.EVENT_TYPE,_Fields.STAMPEDE_ID,_Fields.BUILD_SLAVE_RUN_ID,_Fields.CONSOLE_EVENT,_Fields.BUILD_RULE_FINISHED_EVENT};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.EVENT_TYPE, new org.apache.thrift.meta_data.FieldMetaData("eventType", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, BuildSlaveEventType.class)));
    tmpMap.put(_Fields.STAMPEDE_ID, new org.apache.thrift.meta_data.FieldMetaData("stampedeId", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, com.facebook.buck.distributed.thrift.StampedeId.class)));
    tmpMap.put(_Fields.BUILD_SLAVE_RUN_ID, new org.apache.thrift.meta_data.FieldMetaData("buildSlaveRunId", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, com.facebook.buck.distributed.thrift.BuildSlaveRunId.class)));
    tmpMap.put(_Fields.CONSOLE_EVENT, new org.apache.thrift.meta_data.FieldMetaData("consoleEvent", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRUCT        , "BuildSlaveConsoleEvent")));
    tmpMap.put(_Fields.BUILD_RULE_FINISHED_EVENT, new org.apache.thrift.meta_data.FieldMetaData("buildRuleFinishedEvent", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRUCT        , "BuildRuleFinishedEvent")));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(BuildSlaveEvent.class, metaDataMap);
  }

  public BuildSlaveEvent() {
    this.eventType = com.facebook.buck.distributed.thrift.BuildSlaveEventType.UNKNOWN;

  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public BuildSlaveEvent(BuildSlaveEvent other) {
    if (other.isSetEventType()) {
      this.eventType = other.eventType;
    }
    if (other.isSetStampedeId()) {
      this.stampedeId = new com.facebook.buck.distributed.thrift.StampedeId(other.stampedeId);
    }
    if (other.isSetBuildSlaveRunId()) {
      this.buildSlaveRunId = new com.facebook.buck.distributed.thrift.BuildSlaveRunId(other.buildSlaveRunId);
    }
    if (other.isSetConsoleEvent()) {
      this.consoleEvent = other.consoleEvent;
    }
    if (other.isSetBuildRuleFinishedEvent()) {
      this.buildRuleFinishedEvent = other.buildRuleFinishedEvent;
    }
  }

  public BuildSlaveEvent deepCopy() {
    return new BuildSlaveEvent(this);
  }

  @Override
  public void clear() {
    this.eventType = com.facebook.buck.distributed.thrift.BuildSlaveEventType.UNKNOWN;

    this.stampedeId = null;
    this.buildSlaveRunId = null;
    this.consoleEvent = null;
    this.buildRuleFinishedEvent = null;
  }

  /**
   * 
   * @see BuildSlaveEventType
   */
  public BuildSlaveEventType getEventType() {
    return this.eventType;
  }

  /**
   * 
   * @see BuildSlaveEventType
   */
  public BuildSlaveEvent setEventType(BuildSlaveEventType eventType) {
    this.eventType = eventType;
    return this;
  }

  public void unsetEventType() {
    this.eventType = null;
  }

  /** Returns true if field eventType is set (has been assigned a value) and false otherwise */
  public boolean isSetEventType() {
    return this.eventType != null;
  }

  public void setEventTypeIsSet(boolean value) {
    if (!value) {
      this.eventType = null;
    }
  }

  public com.facebook.buck.distributed.thrift.StampedeId getStampedeId() {
    return this.stampedeId;
  }

  public BuildSlaveEvent setStampedeId(com.facebook.buck.distributed.thrift.StampedeId stampedeId) {
    this.stampedeId = stampedeId;
    return this;
  }

  public void unsetStampedeId() {
    this.stampedeId = null;
  }

  /** Returns true if field stampedeId is set (has been assigned a value) and false otherwise */
  public boolean isSetStampedeId() {
    return this.stampedeId != null;
  }

  public void setStampedeIdIsSet(boolean value) {
    if (!value) {
      this.stampedeId = null;
    }
  }

  public com.facebook.buck.distributed.thrift.BuildSlaveRunId getBuildSlaveRunId() {
    return this.buildSlaveRunId;
  }

  public BuildSlaveEvent setBuildSlaveRunId(com.facebook.buck.distributed.thrift.BuildSlaveRunId buildSlaveRunId) {
    this.buildSlaveRunId = buildSlaveRunId;
    return this;
  }

  public void unsetBuildSlaveRunId() {
    this.buildSlaveRunId = null;
  }

  /** Returns true if field buildSlaveRunId is set (has been assigned a value) and false otherwise */
  public boolean isSetBuildSlaveRunId() {
    return this.buildSlaveRunId != null;
  }

  public void setBuildSlaveRunIdIsSet(boolean value) {
    if (!value) {
      this.buildSlaveRunId = null;
    }
  }

  public BuildSlaveConsoleEvent getConsoleEvent() {
    return this.consoleEvent;
  }

  public BuildSlaveEvent setConsoleEvent(BuildSlaveConsoleEvent consoleEvent) {
    this.consoleEvent = consoleEvent;
    return this;
  }

  public void unsetConsoleEvent() {
    this.consoleEvent = null;
  }

  /** Returns true if field consoleEvent is set (has been assigned a value) and false otherwise */
  public boolean isSetConsoleEvent() {
    return this.consoleEvent != null;
  }

  public void setConsoleEventIsSet(boolean value) {
    if (!value) {
      this.consoleEvent = null;
    }
  }

  public BuildRuleFinishedEvent getBuildRuleFinishedEvent() {
    return this.buildRuleFinishedEvent;
  }

  public BuildSlaveEvent setBuildRuleFinishedEvent(BuildRuleFinishedEvent buildRuleFinishedEvent) {
    this.buildRuleFinishedEvent = buildRuleFinishedEvent;
    return this;
  }

  public void unsetBuildRuleFinishedEvent() {
    this.buildRuleFinishedEvent = null;
  }

  /** Returns true if field buildRuleFinishedEvent is set (has been assigned a value) and false otherwise */
  public boolean isSetBuildRuleFinishedEvent() {
    return this.buildRuleFinishedEvent != null;
  }

  public void setBuildRuleFinishedEventIsSet(boolean value) {
    if (!value) {
      this.buildRuleFinishedEvent = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case EVENT_TYPE:
      if (value == null) {
        unsetEventType();
      } else {
        setEventType((BuildSlaveEventType)value);
      }
      break;

    case STAMPEDE_ID:
      if (value == null) {
        unsetStampedeId();
      } else {
        setStampedeId((com.facebook.buck.distributed.thrift.StampedeId)value);
      }
      break;

    case BUILD_SLAVE_RUN_ID:
      if (value == null) {
        unsetBuildSlaveRunId();
      } else {
        setBuildSlaveRunId((com.facebook.buck.distributed.thrift.BuildSlaveRunId)value);
      }
      break;

    case CONSOLE_EVENT:
      if (value == null) {
        unsetConsoleEvent();
      } else {
        setConsoleEvent((BuildSlaveConsoleEvent)value);
      }
      break;

    case BUILD_RULE_FINISHED_EVENT:
      if (value == null) {
        unsetBuildRuleFinishedEvent();
      } else {
        setBuildRuleFinishedEvent((BuildRuleFinishedEvent)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case EVENT_TYPE:
      return getEventType();

    case STAMPEDE_ID:
      return getStampedeId();

    case BUILD_SLAVE_RUN_ID:
      return getBuildSlaveRunId();

    case CONSOLE_EVENT:
      return getConsoleEvent();

    case BUILD_RULE_FINISHED_EVENT:
      return getBuildRuleFinishedEvent();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case EVENT_TYPE:
      return isSetEventType();
    case STAMPEDE_ID:
      return isSetStampedeId();
    case BUILD_SLAVE_RUN_ID:
      return isSetBuildSlaveRunId();
    case CONSOLE_EVENT:
      return isSetConsoleEvent();
    case BUILD_RULE_FINISHED_EVENT:
      return isSetBuildRuleFinishedEvent();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof BuildSlaveEvent)
      return this.equals((BuildSlaveEvent)that);
    return false;
  }

  public boolean equals(BuildSlaveEvent that) {
    if (that == null)
      return false;

    boolean this_present_eventType = true && this.isSetEventType();
    boolean that_present_eventType = true && that.isSetEventType();
    if (this_present_eventType || that_present_eventType) {
      if (!(this_present_eventType && that_present_eventType))
        return false;
      if (!this.eventType.equals(that.eventType))
        return false;
    }

    boolean this_present_stampedeId = true && this.isSetStampedeId();
    boolean that_present_stampedeId = true && that.isSetStampedeId();
    if (this_present_stampedeId || that_present_stampedeId) {
      if (!(this_present_stampedeId && that_present_stampedeId))
        return false;
      if (!this.stampedeId.equals(that.stampedeId))
        return false;
    }

    boolean this_present_buildSlaveRunId = true && this.isSetBuildSlaveRunId();
    boolean that_present_buildSlaveRunId = true && that.isSetBuildSlaveRunId();
    if (this_present_buildSlaveRunId || that_present_buildSlaveRunId) {
      if (!(this_present_buildSlaveRunId && that_present_buildSlaveRunId))
        return false;
      if (!this.buildSlaveRunId.equals(that.buildSlaveRunId))
        return false;
    }

    boolean this_present_consoleEvent = true && this.isSetConsoleEvent();
    boolean that_present_consoleEvent = true && that.isSetConsoleEvent();
    if (this_present_consoleEvent || that_present_consoleEvent) {
      if (!(this_present_consoleEvent && that_present_consoleEvent))
        return false;
      if (!this.consoleEvent.equals(that.consoleEvent))
        return false;
    }

    boolean this_present_buildRuleFinishedEvent = true && this.isSetBuildRuleFinishedEvent();
    boolean that_present_buildRuleFinishedEvent = true && that.isSetBuildRuleFinishedEvent();
    if (this_present_buildRuleFinishedEvent || that_present_buildRuleFinishedEvent) {
      if (!(this_present_buildRuleFinishedEvent && that_present_buildRuleFinishedEvent))
        return false;
      if (!this.buildRuleFinishedEvent.equals(that.buildRuleFinishedEvent))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_eventType = true && (isSetEventType());
    list.add(present_eventType);
    if (present_eventType)
      list.add(eventType.getValue());

    boolean present_stampedeId = true && (isSetStampedeId());
    list.add(present_stampedeId);
    if (present_stampedeId)
      list.add(stampedeId);

    boolean present_buildSlaveRunId = true && (isSetBuildSlaveRunId());
    list.add(present_buildSlaveRunId);
    if (present_buildSlaveRunId)
      list.add(buildSlaveRunId);

    boolean present_consoleEvent = true && (isSetConsoleEvent());
    list.add(present_consoleEvent);
    if (present_consoleEvent)
      list.add(consoleEvent);

    boolean present_buildRuleFinishedEvent = true && (isSetBuildRuleFinishedEvent());
    list.add(present_buildRuleFinishedEvent);
    if (present_buildRuleFinishedEvent)
      list.add(buildRuleFinishedEvent);

    return list.hashCode();
  }

  @Override
  public int compareTo(BuildSlaveEvent other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetEventType()).compareTo(other.isSetEventType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetEventType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.eventType, other.eventType);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetStampedeId()).compareTo(other.isSetStampedeId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStampedeId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.stampedeId, other.stampedeId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetBuildSlaveRunId()).compareTo(other.isSetBuildSlaveRunId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBuildSlaveRunId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.buildSlaveRunId, other.buildSlaveRunId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetConsoleEvent()).compareTo(other.isSetConsoleEvent());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetConsoleEvent()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.consoleEvent, other.consoleEvent);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetBuildRuleFinishedEvent()).compareTo(other.isSetBuildRuleFinishedEvent());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBuildRuleFinishedEvent()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.buildRuleFinishedEvent, other.buildRuleFinishedEvent);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("BuildSlaveEvent(");
    boolean first = true;

    if (isSetEventType()) {
      sb.append("eventType:");
      if (this.eventType == null) {
        sb.append("null");
      } else {
        sb.append(this.eventType);
      }
      first = false;
    }
    if (isSetStampedeId()) {
      if (!first) sb.append(", ");
      sb.append("stampedeId:");
      if (this.stampedeId == null) {
        sb.append("null");
      } else {
        sb.append(this.stampedeId);
      }
      first = false;
    }
    if (isSetBuildSlaveRunId()) {
      if (!first) sb.append(", ");
      sb.append("buildSlaveRunId:");
      if (this.buildSlaveRunId == null) {
        sb.append("null");
      } else {
        sb.append(this.buildSlaveRunId);
      }
      first = false;
    }
    if (isSetConsoleEvent()) {
      if (!first) sb.append(", ");
      sb.append("consoleEvent:");
      if (this.consoleEvent == null) {
        sb.append("null");
      } else {
        sb.append(this.consoleEvent);
      }
      first = false;
    }
    if (isSetBuildRuleFinishedEvent()) {
      if (!first) sb.append(", ");
      sb.append("buildRuleFinishedEvent:");
      if (this.buildRuleFinishedEvent == null) {
        sb.append("null");
      } else {
        sb.append(this.buildRuleFinishedEvent);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (stampedeId != null) {
      stampedeId.validate();
    }
    if (buildSlaveRunId != null) {
      buildSlaveRunId.validate();
    }
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class BuildSlaveEventStandardSchemeFactory implements SchemeFactory {
    public BuildSlaveEventStandardScheme getScheme() {
      return new BuildSlaveEventStandardScheme();
    }
  }

  private static class BuildSlaveEventStandardScheme extends StandardScheme<BuildSlaveEvent> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, BuildSlaveEvent struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // EVENT_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.eventType = com.facebook.buck.distributed.thrift.BuildSlaveEventType.findByValue(iprot.readI32());
              struct.setEventTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // STAMPEDE_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.stampedeId = new com.facebook.buck.distributed.thrift.StampedeId();
              struct.stampedeId.read(iprot);
              struct.setStampedeIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // BUILD_SLAVE_RUN_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.buildSlaveRunId = new com.facebook.buck.distributed.thrift.BuildSlaveRunId();
              struct.buildSlaveRunId.read(iprot);
              struct.setBuildSlaveRunIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 10: // CONSOLE_EVENT
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.consoleEvent = new BuildSlaveConsoleEvent();
              struct.consoleEvent.read(iprot);
              struct.setConsoleEventIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 11: // BUILD_RULE_FINISHED_EVENT
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.buildRuleFinishedEvent = new BuildRuleFinishedEvent();
              struct.buildRuleFinishedEvent.read(iprot);
              struct.setBuildRuleFinishedEventIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, BuildSlaveEvent struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.eventType != null) {
        if (struct.isSetEventType()) {
          oprot.writeFieldBegin(EVENT_TYPE_FIELD_DESC);
          oprot.writeI32(struct.eventType.getValue());
          oprot.writeFieldEnd();
        }
      }
      if (struct.stampedeId != null) {
        if (struct.isSetStampedeId()) {
          oprot.writeFieldBegin(STAMPEDE_ID_FIELD_DESC);
          struct.stampedeId.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.buildSlaveRunId != null) {
        if (struct.isSetBuildSlaveRunId()) {
          oprot.writeFieldBegin(BUILD_SLAVE_RUN_ID_FIELD_DESC);
          struct.buildSlaveRunId.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.consoleEvent != null) {
        if (struct.isSetConsoleEvent()) {
          oprot.writeFieldBegin(CONSOLE_EVENT_FIELD_DESC);
          struct.consoleEvent.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.buildRuleFinishedEvent != null) {
        if (struct.isSetBuildRuleFinishedEvent()) {
          oprot.writeFieldBegin(BUILD_RULE_FINISHED_EVENT_FIELD_DESC);
          struct.buildRuleFinishedEvent.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class BuildSlaveEventTupleSchemeFactory implements SchemeFactory {
    public BuildSlaveEventTupleScheme getScheme() {
      return new BuildSlaveEventTupleScheme();
    }
  }

  private static class BuildSlaveEventTupleScheme extends TupleScheme<BuildSlaveEvent> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, BuildSlaveEvent struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetEventType()) {
        optionals.set(0);
      }
      if (struct.isSetStampedeId()) {
        optionals.set(1);
      }
      if (struct.isSetBuildSlaveRunId()) {
        optionals.set(2);
      }
      if (struct.isSetConsoleEvent()) {
        optionals.set(3);
      }
      if (struct.isSetBuildRuleFinishedEvent()) {
        optionals.set(4);
      }
      oprot.writeBitSet(optionals, 5);
      if (struct.isSetEventType()) {
        oprot.writeI32(struct.eventType.getValue());
      }
      if (struct.isSetStampedeId()) {
        struct.stampedeId.write(oprot);
      }
      if (struct.isSetBuildSlaveRunId()) {
        struct.buildSlaveRunId.write(oprot);
      }
      if (struct.isSetConsoleEvent()) {
        struct.consoleEvent.write(oprot);
      }
      if (struct.isSetBuildRuleFinishedEvent()) {
        struct.buildRuleFinishedEvent.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, BuildSlaveEvent struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(5);
      if (incoming.get(0)) {
        struct.eventType = com.facebook.buck.distributed.thrift.BuildSlaveEventType.findByValue(iprot.readI32());
        struct.setEventTypeIsSet(true);
      }
      if (incoming.get(1)) {
        struct.stampedeId = new com.facebook.buck.distributed.thrift.StampedeId();
        struct.stampedeId.read(iprot);
        struct.setStampedeIdIsSet(true);
      }
      if (incoming.get(2)) {
        struct.buildSlaveRunId = new com.facebook.buck.distributed.thrift.BuildSlaveRunId();
        struct.buildSlaveRunId.read(iprot);
        struct.setBuildSlaveRunIdIsSet(true);
      }
      if (incoming.get(3)) {
        struct.consoleEvent = new BuildSlaveConsoleEvent();
        struct.consoleEvent.read(iprot);
        struct.setConsoleEventIsSet(true);
      }
      if (incoming.get(4)) {
        struct.buildRuleFinishedEvent = new BuildRuleFinishedEvent();
        struct.buildRuleFinishedEvent.read(iprot);
        struct.setBuildRuleFinishedEventIsSet(true);
      }
    }
  }

}

