/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.young.java.examples.api;

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
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2016-04-20")
public class NetObject implements org.apache.thrift.TBase<NetObject, NetObject._Fields>, java.io.Serializable, Cloneable, Comparable<NetObject> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("NetObject");

  private static final org.apache.thrift.protocol.TField ID_FIELD_DESC = new org.apache.thrift.protocol.TField("id", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("type", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField FILEDS_FIELD_DESC = new org.apache.thrift.protocol.TField("fileds", org.apache.thrift.protocol.TType.MAP, (short)3);
  private static final org.apache.thrift.protocol.TField STREAM_FIELD_DESC = new org.apache.thrift.protocol.TField("stream", org.apache.thrift.protocol.TType.STRING, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new NetObjectStandardSchemeFactory());
    schemes.put(TupleScheme.class, new NetObjectTupleSchemeFactory());
  }

  public String id; // required
  public int type; // required
  public Map<String,NetField> fileds; // required
  public ByteBuffer stream; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ID((short)1, "id"),
    TYPE((short)2, "type"),
    FILEDS((short)3, "fileds"),
    STREAM((short)4, "stream");

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
        case 1: // ID
          return ID;
        case 2: // TYPE
          return TYPE;
        case 3: // FILEDS
          return FILEDS;
        case 4: // STREAM
          return STREAM;
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
  private static final int __TYPE_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ID, new org.apache.thrift.meta_data.FieldMetaData("id", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.TYPE, new org.apache.thrift.meta_data.FieldMetaData("type", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.FILEDS, new org.apache.thrift.meta_data.FieldMetaData("fileds", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING), 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, NetField.class))));
    tmpMap.put(_Fields.STREAM, new org.apache.thrift.meta_data.FieldMetaData("stream", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , true)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(NetObject.class, metaDataMap);
  }

  public NetObject() {
    this.type = 0;

  }

  public NetObject(
    String id,
    int type,
    Map<String,NetField> fileds,
    ByteBuffer stream)
  {
    this();
    this.id = id;
    this.type = type;
    setTypeIsSet(true);
    this.fileds = fileds;
    this.stream = org.apache.thrift.TBaseHelper.copyBinary(stream);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public NetObject(NetObject other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetId()) {
      this.id = other.id;
    }
    this.type = other.type;
    if (other.isSetFileds()) {
      Map<String,NetField> __this__fileds = new HashMap<String,NetField>(other.fileds.size());
      for (Map.Entry<String, NetField> other_element : other.fileds.entrySet()) {

        String other_element_key = other_element.getKey();
        NetField other_element_value = other_element.getValue();

        String __this__fileds_copy_key = other_element_key;

        NetField __this__fileds_copy_value = new NetField(other_element_value);

        __this__fileds.put(__this__fileds_copy_key, __this__fileds_copy_value);
      }
      this.fileds = __this__fileds;
    }
    if (other.isSetStream()) {
      this.stream = org.apache.thrift.TBaseHelper.copyBinary(other.stream);
    }
  }

  public NetObject deepCopy() {
    return new NetObject(this);
  }

  @Override
  public void clear() {
    this.id = null;
    this.type = 0;

    this.fileds = null;
    this.stream = null;
  }

  public String getId() {
    return this.id;
  }

  public NetObject setId(String id) {
    this.id = id;
    return this;
  }

  public void unsetId() {
    this.id = null;
  }

  /** Returns true if field id is set (has been assigned a value) and false otherwise */
  public boolean isSetId() {
    return this.id != null;
  }

  public void setIdIsSet(boolean value) {
    if (!value) {
      this.id = null;
    }
  }

  public int getType() {
    return this.type;
  }

  public NetObject setType(int type) {
    this.type = type;
    setTypeIsSet(true);
    return this;
  }

  public void unsetType() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __TYPE_ISSET_ID);
  }

  /** Returns true if field type is set (has been assigned a value) and false otherwise */
  public boolean isSetType() {
    return EncodingUtils.testBit(__isset_bitfield, __TYPE_ISSET_ID);
  }

  public void setTypeIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __TYPE_ISSET_ID, value);
  }

  public int getFiledsSize() {
    return (this.fileds == null) ? 0 : this.fileds.size();
  }

  public void putToFileds(String key, NetField val) {
    if (this.fileds == null) {
      this.fileds = new HashMap<String,NetField>();
    }
    this.fileds.put(key, val);
  }

  public Map<String,NetField> getFileds() {
    return this.fileds;
  }

  public NetObject setFileds(Map<String,NetField> fileds) {
    this.fileds = fileds;
    return this;
  }

  public void unsetFileds() {
    this.fileds = null;
  }

  /** Returns true if field fileds is set (has been assigned a value) and false otherwise */
  public boolean isSetFileds() {
    return this.fileds != null;
  }

  public void setFiledsIsSet(boolean value) {
    if (!value) {
      this.fileds = null;
    }
  }

  public byte[] getStream() {
    setStream(org.apache.thrift.TBaseHelper.rightSize(stream));
    return stream == null ? null : stream.array();
  }

  public ByteBuffer bufferForStream() {
    return org.apache.thrift.TBaseHelper.copyBinary(stream);
  }

  public NetObject setStream(byte[] stream) {
    this.stream = stream == null ? (ByteBuffer)null : ByteBuffer.wrap(Arrays.copyOf(stream, stream.length));
    return this;
  }

  public NetObject setStream(ByteBuffer stream) {
    this.stream = org.apache.thrift.TBaseHelper.copyBinary(stream);
    return this;
  }

  public void unsetStream() {
    this.stream = null;
  }

  /** Returns true if field stream is set (has been assigned a value) and false otherwise */
  public boolean isSetStream() {
    return this.stream != null;
  }

  public void setStreamIsSet(boolean value) {
    if (!value) {
      this.stream = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case ID:
      if (value == null) {
        unsetId();
      } else {
        setId((String)value);
      }
      break;

    case TYPE:
      if (value == null) {
        unsetType();
      } else {
        setType((Integer)value);
      }
      break;

    case FILEDS:
      if (value == null) {
        unsetFileds();
      } else {
        setFileds((Map<String,NetField>)value);
      }
      break;

    case STREAM:
      if (value == null) {
        unsetStream();
      } else {
        setStream((ByteBuffer)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case ID:
      return getId();

    case TYPE:
      return getType();

    case FILEDS:
      return getFileds();

    case STREAM:
      return getStream();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case ID:
      return isSetId();
    case TYPE:
      return isSetType();
    case FILEDS:
      return isSetFileds();
    case STREAM:
      return isSetStream();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof NetObject)
      return this.equals((NetObject)that);
    return false;
  }

  public boolean equals(NetObject that) {
    if (that == null)
      return false;

    boolean this_present_id = true && this.isSetId();
    boolean that_present_id = true && that.isSetId();
    if (this_present_id || that_present_id) {
      if (!(this_present_id && that_present_id))
        return false;
      if (!this.id.equals(that.id))
        return false;
    }

    boolean this_present_type = true;
    boolean that_present_type = true;
    if (this_present_type || that_present_type) {
      if (!(this_present_type && that_present_type))
        return false;
      if (this.type != that.type)
        return false;
    }

    boolean this_present_fileds = true && this.isSetFileds();
    boolean that_present_fileds = true && that.isSetFileds();
    if (this_present_fileds || that_present_fileds) {
      if (!(this_present_fileds && that_present_fileds))
        return false;
      if (!this.fileds.equals(that.fileds))
        return false;
    }

    boolean this_present_stream = true && this.isSetStream();
    boolean that_present_stream = true && that.isSetStream();
    if (this_present_stream || that_present_stream) {
      if (!(this_present_stream && that_present_stream))
        return false;
      if (!this.stream.equals(that.stream))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_id = true && (isSetId());
    list.add(present_id);
    if (present_id)
      list.add(id);

    boolean present_type = true;
    list.add(present_type);
    if (present_type)
      list.add(type);

    boolean present_fileds = true && (isSetFileds());
    list.add(present_fileds);
    if (present_fileds)
      list.add(fileds);

    boolean present_stream = true && (isSetStream());
    list.add(present_stream);
    if (present_stream)
      list.add(stream);

    return list.hashCode();
  }

  @Override
  public int compareTo(NetObject other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetId()).compareTo(other.isSetId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.id, other.id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetType()).compareTo(other.isSetType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.type, other.type);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetFileds()).compareTo(other.isSetFileds());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFileds()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.fileds, other.fileds);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetStream()).compareTo(other.isSetStream());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStream()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.stream, other.stream);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("NetObject(");
    boolean first = true;

    sb.append("id:");
    if (this.id == null) {
      sb.append("null");
    } else {
      sb.append(this.id);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("type:");
    sb.append(this.type);
    first = false;
    if (!first) sb.append(", ");
    sb.append("fileds:");
    if (this.fileds == null) {
      sb.append("null");
    } else {
      sb.append(this.fileds);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("stream:");
    if (this.stream == null) {
      sb.append("null");
    } else {
      org.apache.thrift.TBaseHelper.toString(this.stream, sb);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
    if (id == null) {
      throw new TProtocolException("Required field 'id' was not present! Struct: " + toString());
    }
    // alas, we cannot check 'type' because it's a primitive and you chose the non-beans generator.
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class NetObjectStandardSchemeFactory implements SchemeFactory {
    public NetObjectStandardScheme getScheme() {
      return new NetObjectStandardScheme();
    }
  }

  private static class NetObjectStandardScheme extends StandardScheme<NetObject> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, NetObject struct) throws TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.id = iprot.readString();
              struct.setIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.type = iprot.readI32();
              struct.setTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // FILEDS
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map0 = iprot.readMapBegin();
                struct.fileds = new HashMap<String,NetField>(2*_map0.size);
                String _key1;
                NetField _val2;
                for (int _i3 = 0; _i3 < _map0.size; ++_i3)
                {
                  _key1 = iprot.readString();
                  _val2 = new NetField();
                  _val2.read(iprot);
                  struct.fileds.put(_key1, _val2);
                }
                iprot.readMapEnd();
              }
              struct.setFiledsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // STREAM
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.stream = iprot.readBinary();
              struct.setStreamIsSet(true);
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
      if (!struct.isSetType()) {
        throw new TProtocolException("Required field 'type' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, NetObject struct) throws TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.id != null) {
        oprot.writeFieldBegin(ID_FIELD_DESC);
        oprot.writeString(struct.id);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(TYPE_FIELD_DESC);
      oprot.writeI32(struct.type);
      oprot.writeFieldEnd();
      if (struct.fileds != null) {
        oprot.writeFieldBegin(FILEDS_FIELD_DESC);
        {
          oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRUCT, struct.fileds.size()));
          for (Map.Entry<String, NetField> _iter4 : struct.fileds.entrySet())
          {
            oprot.writeString(_iter4.getKey());
            _iter4.getValue().write(oprot);
          }
          oprot.writeMapEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.stream != null) {
        oprot.writeFieldBegin(STREAM_FIELD_DESC);
        oprot.writeBinary(struct.stream);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class NetObjectTupleSchemeFactory implements SchemeFactory {
    public NetObjectTupleScheme getScheme() {
      return new NetObjectTupleScheme();
    }
  }

  private static class NetObjectTupleScheme extends TupleScheme<NetObject> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, NetObject struct) throws TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeString(struct.id);
      oprot.writeI32(struct.type);
      BitSet optionals = new BitSet();
      if (struct.isSetFileds()) {
        optionals.set(0);
      }
      if (struct.isSetStream()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetFileds()) {
        {
          oprot.writeI32(struct.fileds.size());
          for (Map.Entry<String, NetField> _iter5 : struct.fileds.entrySet())
          {
            oprot.writeString(_iter5.getKey());
            _iter5.getValue().write(oprot);
          }
        }
      }
      if (struct.isSetStream()) {
        oprot.writeBinary(struct.stream);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, NetObject struct) throws TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.id = iprot.readString();
      struct.setIdIsSet(true);
      struct.type = iprot.readI32();
      struct.setTypeIsSet(true);
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TMap _map6 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.fileds = new HashMap<String,NetField>(2*_map6.size);
          String _key7;
          NetField _val8;
          for (int _i9 = 0; _i9 < _map6.size; ++_i9)
          {
            _key7 = iprot.readString();
            _val8 = new NetField();
            _val8.read(iprot);
            struct.fileds.put(_key7, _val8);
          }
        }
        struct.setFiledsIsSet(true);
      }
      if (incoming.get(1)) {
        struct.stream = iprot.readBinary();
        struct.setStreamIsSet(true);
      }
    }
  }

}

