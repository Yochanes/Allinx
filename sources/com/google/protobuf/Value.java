package com.google.protobuf;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.ListValue;
import com.google.protobuf.Struct;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class Value extends GeneratedMessageLite<Value, Builder> implements ValueOrBuilder {
    public static final int BOOL_VALUE_FIELD_NUMBER = 4;
    private static final Value DEFAULT_INSTANCE;
    public static final int LIST_VALUE_FIELD_NUMBER = 6;
    public static final int NULL_VALUE_FIELD_NUMBER = 1;
    public static final int NUMBER_VALUE_FIELD_NUMBER = 2;
    private static volatile Parser<Value> PARSER = null;
    public static final int STRING_VALUE_FIELD_NUMBER = 3;
    public static final int STRUCT_VALUE_FIELD_NUMBER = 5;
    private int kindCase_ = 0;
    private Object kind_;

    /* JADX INFO: renamed from: com.google.protobuf.Value$1 */
    /* JADX INFO: compiled from: Proguard */
    public static /* synthetic */ class C49351 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f42908xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f42908xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f42908xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f42908xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f42908xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f42908xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f42908xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f42908xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class Builder extends GeneratedMessageLite.Builder<Value, Builder> implements ValueOrBuilder {
        public /* synthetic */ Builder(C49351 c49351) {
            this();
        }

        public Builder clearBoolValue() {
            copyOnWrite();
            Value.access$1100((Value) this.instance);
            return this;
        }

        public Builder clearKind() {
            copyOnWrite();
            Value.access$100((Value) this.instance);
            return this;
        }

        public Builder clearListValue() {
            copyOnWrite();
            Value.access$1700((Value) this.instance);
            return this;
        }

        public Builder clearNullValue() {
            copyOnWrite();
            Value.access$400((Value) this.instance);
            return this;
        }

        public Builder clearNumberValue() {
            copyOnWrite();
            Value.access$600((Value) this.instance);
            return this;
        }

        public Builder clearStringValue() {
            copyOnWrite();
            Value.access$800((Value) this.instance);
            return this;
        }

        public Builder clearStructValue() {
            copyOnWrite();
            Value.access$1400((Value) this.instance);
            return this;
        }

        @Override // com.google.protobuf.ValueOrBuilder
        public boolean getBoolValue() {
            return ((Value) this.instance).getBoolValue();
        }

        @Override // com.google.protobuf.ValueOrBuilder
        public KindCase getKindCase() {
            return ((Value) this.instance).getKindCase();
        }

        @Override // com.google.protobuf.ValueOrBuilder
        public ListValue getListValue() {
            return ((Value) this.instance).getListValue();
        }

        @Override // com.google.protobuf.ValueOrBuilder
        public NullValue getNullValue() {
            return ((Value) this.instance).getNullValue();
        }

        @Override // com.google.protobuf.ValueOrBuilder
        public int getNullValueValue() {
            return ((Value) this.instance).getNullValueValue();
        }

        @Override // com.google.protobuf.ValueOrBuilder
        public double getNumberValue() {
            return ((Value) this.instance).getNumberValue();
        }

        @Override // com.google.protobuf.ValueOrBuilder
        public String getStringValue() {
            return ((Value) this.instance).getStringValue();
        }

        @Override // com.google.protobuf.ValueOrBuilder
        public ByteString getStringValueBytes() {
            return ((Value) this.instance).getStringValueBytes();
        }

        @Override // com.google.protobuf.ValueOrBuilder
        public Struct getStructValue() {
            return ((Value) this.instance).getStructValue();
        }

        @Override // com.google.protobuf.ValueOrBuilder
        public boolean hasBoolValue() {
            return ((Value) this.instance).hasBoolValue();
        }

        @Override // com.google.protobuf.ValueOrBuilder
        public boolean hasListValue() {
            return ((Value) this.instance).hasListValue();
        }

        @Override // com.google.protobuf.ValueOrBuilder
        public boolean hasNullValue() {
            return ((Value) this.instance).hasNullValue();
        }

        @Override // com.google.protobuf.ValueOrBuilder
        public boolean hasNumberValue() {
            return ((Value) this.instance).hasNumberValue();
        }

        @Override // com.google.protobuf.ValueOrBuilder
        public boolean hasStringValue() {
            return ((Value) this.instance).hasStringValue();
        }

        @Override // com.google.protobuf.ValueOrBuilder
        public boolean hasStructValue() {
            return ((Value) this.instance).hasStructValue();
        }

        public Builder mergeListValue(ListValue listValue) {
            copyOnWrite();
            Value.access$1600((Value) this.instance, listValue);
            return this;
        }

        public Builder mergeStructValue(Struct struct) {
            copyOnWrite();
            Value.access$1300((Value) this.instance, struct);
            return this;
        }

        public Builder setBoolValue(boolean z2) {
            copyOnWrite();
            Value.access$1000((Value) this.instance, z2);
            return this;
        }

        public Builder setListValue(ListValue listValue) {
            copyOnWrite();
            Value.access$1500((Value) this.instance, listValue);
            return this;
        }

        public Builder setNullValue(NullValue nullValue) {
            copyOnWrite();
            Value.access$300((Value) this.instance, nullValue);
            return this;
        }

        public Builder setNullValueValue(int i) {
            copyOnWrite();
            Value.access$200((Value) this.instance, i);
            return this;
        }

        public Builder setNumberValue(double d) {
            copyOnWrite();
            Value.access$500((Value) this.instance, d);
            return this;
        }

        public Builder setStringValue(String str) {
            copyOnWrite();
            Value.access$700((Value) this.instance, str);
            return this;
        }

        public Builder setStringValueBytes(ByteString byteString) {
            copyOnWrite();
            Value.access$900((Value) this.instance, byteString);
            return this;
        }

        public Builder setStructValue(Struct struct) {
            copyOnWrite();
            Value.access$1200((Value) this.instance, struct);
            return this;
        }

        private Builder() {
            super(Value.access$000());
        }

        public Builder setListValue(ListValue.Builder builder) {
            copyOnWrite();
            Value.access$1500((Value) this.instance, builder.build());
            return this;
        }

        public Builder setStructValue(Struct.Builder builder) {
            copyOnWrite();
            Value.access$1200((Value) this.instance, builder.build());
            return this;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public enum KindCase {
        NULL_VALUE(1),
        NUMBER_VALUE(2),
        STRING_VALUE(3),
        BOOL_VALUE(4),
        STRUCT_VALUE(5),
        LIST_VALUE(6),
        KIND_NOT_SET(0);

        private final int value;

        KindCase(int i) {
            this.value = i;
        }

        public static KindCase forNumber(int i) {
            switch (i) {
                case 0:
                    return KIND_NOT_SET;
                case 1:
                    return NULL_VALUE;
                case 2:
                    return NUMBER_VALUE;
                case 3:
                    return STRING_VALUE;
                case 4:
                    return BOOL_VALUE;
                case 5:
                    return STRUCT_VALUE;
                case 6:
                    return LIST_VALUE;
                default:
                    return null;
            }
        }

        public int getNumber() {
            return this.value;
        }

        @Deprecated
        public static KindCase valueOf(int i) {
            return forNumber(i);
        }
    }

    static {
        Value value = new Value();
        DEFAULT_INSTANCE = value;
        GeneratedMessageLite.registerDefaultInstance(Value.class, value);
    }

    private Value() {
    }

    public static /* synthetic */ Value access$000() {
        return DEFAULT_INSTANCE;
    }

    public static /* synthetic */ void access$100(Value value) {
        value.clearKind();
    }

    public static /* synthetic */ void access$1000(Value value, boolean z2) {
        value.setBoolValue(z2);
    }

    public static /* synthetic */ void access$1100(Value value) {
        value.clearBoolValue();
    }

    public static /* synthetic */ void access$1200(Value value, Struct struct) {
        value.setStructValue(struct);
    }

    public static /* synthetic */ void access$1300(Value value, Struct struct) {
        value.mergeStructValue(struct);
    }

    public static /* synthetic */ void access$1400(Value value) {
        value.clearStructValue();
    }

    public static /* synthetic */ void access$1500(Value value, ListValue listValue) {
        value.setListValue(listValue);
    }

    public static /* synthetic */ void access$1600(Value value, ListValue listValue) {
        value.mergeListValue(listValue);
    }

    public static /* synthetic */ void access$1700(Value value) {
        value.clearListValue();
    }

    public static /* synthetic */ void access$200(Value value, int i) {
        value.setNullValueValue(i);
    }

    public static /* synthetic */ void access$300(Value value, NullValue nullValue) {
        value.setNullValue(nullValue);
    }

    public static /* synthetic */ void access$400(Value value) {
        value.clearNullValue();
    }

    public static /* synthetic */ void access$500(Value value, double d) {
        value.setNumberValue(d);
    }

    public static /* synthetic */ void access$600(Value value) {
        value.clearNumberValue();
    }

    public static /* synthetic */ void access$700(Value value, String str) {
        value.setStringValue(str);
    }

    public static /* synthetic */ void access$800(Value value) {
        value.clearStringValue();
    }

    public static /* synthetic */ void access$900(Value value, ByteString byteString) {
        value.setStringValueBytes(byteString);
    }

    private void clearBoolValue() {
        if (this.kindCase_ == 4) {
            this.kindCase_ = 0;
            this.kind_ = null;
        }
    }

    private void clearKind() {
        this.kindCase_ = 0;
        this.kind_ = null;
    }

    private void clearListValue() {
        if (this.kindCase_ == 6) {
            this.kindCase_ = 0;
            this.kind_ = null;
        }
    }

    private void clearNullValue() {
        if (this.kindCase_ == 1) {
            this.kindCase_ = 0;
            this.kind_ = null;
        }
    }

    private void clearNumberValue() {
        if (this.kindCase_ == 2) {
            this.kindCase_ = 0;
            this.kind_ = null;
        }
    }

    private void clearStringValue() {
        if (this.kindCase_ == 3) {
            this.kindCase_ = 0;
            this.kind_ = null;
        }
    }

    private void clearStructValue() {
        if (this.kindCase_ == 5) {
            this.kindCase_ = 0;
            this.kind_ = null;
        }
    }

    public static Value getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeListValue(ListValue listValue) {
        listValue.getClass();
        if (this.kindCase_ != 6 || this.kind_ == ListValue.getDefaultInstance()) {
            this.kind_ = listValue;
        } else {
            this.kind_ = ListValue.newBuilder((ListValue) this.kind_).mergeFrom(listValue).buildPartial();
        }
        this.kindCase_ = 6;
    }

    private void mergeStructValue(Struct struct) {
        struct.getClass();
        if (this.kindCase_ != 5 || this.kind_ == Struct.getDefaultInstance()) {
            this.kind_ = struct;
        } else {
            this.kind_ = Struct.newBuilder((Struct) this.kind_).mergeFrom(struct).buildPartial();
        }
        this.kindCase_ = 5;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Value parseDelimitedFrom(InputStream inputStream) {
        return (Value) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Value parseFrom(ByteBuffer byteBuffer) {
        return (Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Value> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setBoolValue(boolean z2) {
        this.kindCase_ = 4;
        this.kind_ = Boolean.valueOf(z2);
    }

    private void setListValue(ListValue listValue) {
        listValue.getClass();
        this.kind_ = listValue;
        this.kindCase_ = 6;
    }

    private void setNullValue(NullValue nullValue) {
        this.kind_ = Integer.valueOf(nullValue.getNumber());
        this.kindCase_ = 1;
    }

    private void setNullValueValue(int i) {
        this.kindCase_ = 1;
        this.kind_ = Integer.valueOf(i);
    }

    private void setNumberValue(double d) {
        this.kindCase_ = 2;
        this.kind_ = Double.valueOf(d);
    }

    private void setStringValue(String str) {
        str.getClass();
        this.kindCase_ = 3;
        this.kind_ = str;
    }

    private void setStringValueBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.kind_ = byteString.toStringUtf8();
        this.kindCase_ = 3;
    }

    private void setStructValue(Struct struct) {
        struct.getClass();
        this.kind_ = struct;
        this.kindCase_ = 5;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (C49351.f42908xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new Value();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0001\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001?\u0000\u00023\u0000\u0003Ȼ\u0000\u0004:\u0000\u0005<\u0000\u0006<\u0000", new Object[]{"kind_", "kindCase_", Struct.class, ListValue.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Value> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (Value.class) {
                    try {
                        defaultInstanceBasedParser = PARSER;
                        if (defaultInstanceBasedParser == null) {
                            defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                            PARSER = defaultInstanceBasedParser;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return defaultInstanceBasedParser;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // com.google.protobuf.ValueOrBuilder
    public boolean getBoolValue() {
        if (this.kindCase_ == 4) {
            return ((Boolean) this.kind_).booleanValue();
        }
        return false;
    }

    @Override // com.google.protobuf.ValueOrBuilder
    public KindCase getKindCase() {
        return KindCase.forNumber(this.kindCase_);
    }

    @Override // com.google.protobuf.ValueOrBuilder
    public ListValue getListValue() {
        return this.kindCase_ == 6 ? (ListValue) this.kind_ : ListValue.getDefaultInstance();
    }

    @Override // com.google.protobuf.ValueOrBuilder
    public NullValue getNullValue() {
        if (this.kindCase_ != 1) {
            return NullValue.NULL_VALUE;
        }
        NullValue nullValueForNumber = NullValue.forNumber(((Integer) this.kind_).intValue());
        return nullValueForNumber == null ? NullValue.UNRECOGNIZED : nullValueForNumber;
    }

    @Override // com.google.protobuf.ValueOrBuilder
    public int getNullValueValue() {
        if (this.kindCase_ == 1) {
            return ((Integer) this.kind_).intValue();
        }
        return 0;
    }

    @Override // com.google.protobuf.ValueOrBuilder
    public double getNumberValue() {
        if (this.kindCase_ == 2) {
            return ((Double) this.kind_).doubleValue();
        }
        return 0.0d;
    }

    @Override // com.google.protobuf.ValueOrBuilder
    public String getStringValue() {
        return this.kindCase_ == 3 ? (String) this.kind_ : "";
    }

    @Override // com.google.protobuf.ValueOrBuilder
    public ByteString getStringValueBytes() {
        return ByteString.copyFromUtf8(this.kindCase_ == 3 ? (String) this.kind_ : "");
    }

    @Override // com.google.protobuf.ValueOrBuilder
    public Struct getStructValue() {
        return this.kindCase_ == 5 ? (Struct) this.kind_ : Struct.getDefaultInstance();
    }

    @Override // com.google.protobuf.ValueOrBuilder
    public boolean hasBoolValue() {
        return this.kindCase_ == 4;
    }

    @Override // com.google.protobuf.ValueOrBuilder
    public boolean hasListValue() {
        return this.kindCase_ == 6;
    }

    @Override // com.google.protobuf.ValueOrBuilder
    public boolean hasNullValue() {
        return this.kindCase_ == 1;
    }

    @Override // com.google.protobuf.ValueOrBuilder
    public boolean hasNumberValue() {
        return this.kindCase_ == 2;
    }

    @Override // com.google.protobuf.ValueOrBuilder
    public boolean hasStringValue() {
        return this.kindCase_ == 3;
    }

    @Override // com.google.protobuf.ValueOrBuilder
    public boolean hasStructValue() {
        return this.kindCase_ == 5;
    }

    public static Builder newBuilder(Value value) {
        return DEFAULT_INSTANCE.createBuilder(value);
    }

    public static Value parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Value) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Value parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Value parseFrom(ByteString byteString) {
        return (Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Value parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Value parseFrom(byte[] bArr) {
        return (Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Value parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Value parseFrom(InputStream inputStream) {
        return (Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Value parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Value parseFrom(CodedInputStream codedInputStream) {
        return (Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Value parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
