package com.google.protobuf;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.Option;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class Field extends GeneratedMessageLite<Field, Builder> implements FieldOrBuilder {
    public static final int CARDINALITY_FIELD_NUMBER = 2;
    private static final Field DEFAULT_INSTANCE;
    public static final int DEFAULT_VALUE_FIELD_NUMBER = 11;
    public static final int JSON_NAME_FIELD_NUMBER = 10;
    public static final int KIND_FIELD_NUMBER = 1;
    public static final int NAME_FIELD_NUMBER = 4;
    public static final int NUMBER_FIELD_NUMBER = 3;
    public static final int ONEOF_INDEX_FIELD_NUMBER = 7;
    public static final int OPTIONS_FIELD_NUMBER = 9;
    public static final int PACKED_FIELD_NUMBER = 8;
    private static volatile Parser<Field> PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 6;
    private int cardinality_;
    private int kind_;
    private int number_;
    private int oneofIndex_;
    private boolean packed_;
    private String name_ = "";
    private String typeUrl_ = "";
    private Internal.ProtobufList<Option> options_ = GeneratedMessageLite.emptyProtobufList();
    private String jsonName_ = "";
    private String defaultValue_ = "";

    /* JADX INFO: renamed from: com.google.protobuf.Field$1 */
    /* JADX INFO: compiled from: Proguard */
    public static /* synthetic */ class C48931 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f42890xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f42890xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f42890xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f42890xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f42890xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f42890xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f42890xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f42890xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class Builder extends GeneratedMessageLite.Builder<Field, Builder> implements FieldOrBuilder {
        public /* synthetic */ Builder(C48931 c48931) {
            this();
        }

        public Builder addAllOptions(Iterable<? extends Option> iterable) {
            copyOnWrite();
            Field.access$2200((Field) this.instance, iterable);
            return this;
        }

        public Builder addOptions(Option option) {
            copyOnWrite();
            Field.access$2000((Field) this.instance, option);
            return this;
        }

        public Builder clearCardinality() {
            copyOnWrite();
            Field.access$600((Field) this.instance);
            return this;
        }

        public Builder clearDefaultValue() {
            copyOnWrite();
            Field.access$2900((Field) this.instance);
            return this;
        }

        public Builder clearJsonName() {
            copyOnWrite();
            Field.access$2600((Field) this.instance);
            return this;
        }

        public Builder clearKind() {
            copyOnWrite();
            Field.access$300((Field) this.instance);
            return this;
        }

        public Builder clearName() {
            copyOnWrite();
            Field.access$1000((Field) this.instance);
            return this;
        }

        public Builder clearNumber() {
            copyOnWrite();
            Field.access$800((Field) this.instance);
            return this;
        }

        public Builder clearOneofIndex() {
            copyOnWrite();
            Field.access$1600((Field) this.instance);
            return this;
        }

        public Builder clearOptions() {
            copyOnWrite();
            Field.access$2300((Field) this.instance);
            return this;
        }

        public Builder clearPacked() {
            copyOnWrite();
            Field.access$1800((Field) this.instance);
            return this;
        }

        public Builder clearTypeUrl() {
            copyOnWrite();
            Field.access$1300((Field) this.instance);
            return this;
        }

        @Override // com.google.protobuf.FieldOrBuilder
        public Cardinality getCardinality() {
            return ((Field) this.instance).getCardinality();
        }

        @Override // com.google.protobuf.FieldOrBuilder
        public int getCardinalityValue() {
            return ((Field) this.instance).getCardinalityValue();
        }

        @Override // com.google.protobuf.FieldOrBuilder
        public String getDefaultValue() {
            return ((Field) this.instance).getDefaultValue();
        }

        @Override // com.google.protobuf.FieldOrBuilder
        public ByteString getDefaultValueBytes() {
            return ((Field) this.instance).getDefaultValueBytes();
        }

        @Override // com.google.protobuf.FieldOrBuilder
        public String getJsonName() {
            return ((Field) this.instance).getJsonName();
        }

        @Override // com.google.protobuf.FieldOrBuilder
        public ByteString getJsonNameBytes() {
            return ((Field) this.instance).getJsonNameBytes();
        }

        @Override // com.google.protobuf.FieldOrBuilder
        public Kind getKind() {
            return ((Field) this.instance).getKind();
        }

        @Override // com.google.protobuf.FieldOrBuilder
        public int getKindValue() {
            return ((Field) this.instance).getKindValue();
        }

        @Override // com.google.protobuf.FieldOrBuilder
        public String getName() {
            return ((Field) this.instance).getName();
        }

        @Override // com.google.protobuf.FieldOrBuilder
        public ByteString getNameBytes() {
            return ((Field) this.instance).getNameBytes();
        }

        @Override // com.google.protobuf.FieldOrBuilder
        public int getNumber() {
            return ((Field) this.instance).getNumber();
        }

        @Override // com.google.protobuf.FieldOrBuilder
        public int getOneofIndex() {
            return ((Field) this.instance).getOneofIndex();
        }

        @Override // com.google.protobuf.FieldOrBuilder
        public Option getOptions(int i) {
            return ((Field) this.instance).getOptions(i);
        }

        @Override // com.google.protobuf.FieldOrBuilder
        public int getOptionsCount() {
            return ((Field) this.instance).getOptionsCount();
        }

        @Override // com.google.protobuf.FieldOrBuilder
        public List<Option> getOptionsList() {
            return Collections.unmodifiableList(((Field) this.instance).getOptionsList());
        }

        @Override // com.google.protobuf.FieldOrBuilder
        public boolean getPacked() {
            return ((Field) this.instance).getPacked();
        }

        @Override // com.google.protobuf.FieldOrBuilder
        public String getTypeUrl() {
            return ((Field) this.instance).getTypeUrl();
        }

        @Override // com.google.protobuf.FieldOrBuilder
        public ByteString getTypeUrlBytes() {
            return ((Field) this.instance).getTypeUrlBytes();
        }

        public Builder removeOptions(int i) {
            copyOnWrite();
            Field.access$2400((Field) this.instance, i);
            return this;
        }

        public Builder setCardinality(Cardinality cardinality) {
            copyOnWrite();
            Field.access$500((Field) this.instance, cardinality);
            return this;
        }

        public Builder setCardinalityValue(int i) {
            copyOnWrite();
            Field.access$400((Field) this.instance, i);
            return this;
        }

        public Builder setDefaultValue(String str) {
            copyOnWrite();
            Field.access$2800((Field) this.instance, str);
            return this;
        }

        public Builder setDefaultValueBytes(ByteString byteString) {
            copyOnWrite();
            Field.access$3000((Field) this.instance, byteString);
            return this;
        }

        public Builder setJsonName(String str) {
            copyOnWrite();
            Field.access$2500((Field) this.instance, str);
            return this;
        }

        public Builder setJsonNameBytes(ByteString byteString) {
            copyOnWrite();
            Field.access$2700((Field) this.instance, byteString);
            return this;
        }

        public Builder setKind(Kind kind) {
            copyOnWrite();
            Field.access$200((Field) this.instance, kind);
            return this;
        }

        public Builder setKindValue(int i) {
            copyOnWrite();
            Field.access$100((Field) this.instance, i);
            return this;
        }

        public Builder setName(String str) {
            copyOnWrite();
            Field.access$900((Field) this.instance, str);
            return this;
        }

        public Builder setNameBytes(ByteString byteString) {
            copyOnWrite();
            Field.access$1100((Field) this.instance, byteString);
            return this;
        }

        public Builder setNumber(int i) {
            copyOnWrite();
            Field.access$700((Field) this.instance, i);
            return this;
        }

        public Builder setOneofIndex(int i) {
            copyOnWrite();
            Field.access$1500((Field) this.instance, i);
            return this;
        }

        public Builder setOptions(int i, Option option) {
            copyOnWrite();
            Field.access$1900((Field) this.instance, i, option);
            return this;
        }

        public Builder setPacked(boolean z2) {
            copyOnWrite();
            Field.access$1700((Field) this.instance, z2);
            return this;
        }

        public Builder setTypeUrl(String str) {
            copyOnWrite();
            Field.access$1200((Field) this.instance, str);
            return this;
        }

        public Builder setTypeUrlBytes(ByteString byteString) {
            copyOnWrite();
            Field.access$1400((Field) this.instance, byteString);
            return this;
        }

        private Builder() {
            super(Field.access$000());
        }

        public Builder addOptions(int i, Option option) {
            copyOnWrite();
            Field.access$2100((Field) this.instance, i, option);
            return this;
        }

        public Builder setOptions(int i, Option.Builder builder) {
            copyOnWrite();
            Field.access$1900((Field) this.instance, i, builder.build());
            return this;
        }

        public Builder addOptions(Option.Builder builder) {
            copyOnWrite();
            Field.access$2000((Field) this.instance, builder.build());
            return this;
        }

        public Builder addOptions(int i, Option.Builder builder) {
            copyOnWrite();
            Field.access$2100((Field) this.instance, i, builder.build());
            return this;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public enum Cardinality implements Internal.EnumLite {
        CARDINALITY_UNKNOWN(0),
        CARDINALITY_OPTIONAL(1),
        CARDINALITY_REQUIRED(2),
        CARDINALITY_REPEATED(3),
        UNRECOGNIZED(-1);

        public static final int CARDINALITY_OPTIONAL_VALUE = 1;
        public static final int CARDINALITY_REPEATED_VALUE = 3;
        public static final int CARDINALITY_REQUIRED_VALUE = 2;
        public static final int CARDINALITY_UNKNOWN_VALUE = 0;
        private static final Internal.EnumLiteMap<Cardinality> internalValueMap = new C48941();
        private final int value;

        /* JADX INFO: renamed from: com.google.protobuf.Field$Cardinality$1 */
        /* JADX INFO: compiled from: Proguard */
        public class C48941 implements Internal.EnumLiteMap<Cardinality> {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public /* bridge */ /* synthetic */ Internal.EnumLite findValueByNumber(int i) {
                return findValueByNumber(i);
            }

            @Override // com.google.protobuf.Internal.EnumLiteMap
            public Cardinality findValueByNumber(int i) {
                return Cardinality.forNumber(i);
            }
        }

        /* JADX INFO: compiled from: Proguard */
        public static final class CardinalityVerifier implements Internal.EnumVerifier {
            static final Internal.EnumVerifier INSTANCE = new CardinalityVerifier();

            private CardinalityVerifier() {
            }

            @Override // com.google.protobuf.Internal.EnumVerifier
            public boolean isInRange(int i) {
                return Cardinality.forNumber(i) != null;
            }
        }

        Cardinality(int i) {
            this.value = i;
        }

        public static Cardinality forNumber(int i) {
            if (i == 0) {
                return CARDINALITY_UNKNOWN;
            }
            if (i == 1) {
                return CARDINALITY_OPTIONAL;
            }
            if (i == 2) {
                return CARDINALITY_REQUIRED;
            }
            if (i != 3) {
                return null;
            }
            return CARDINALITY_REPEATED;
        }

        public static Internal.EnumLiteMap<Cardinality> internalGetValueMap() {
            return internalValueMap;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return CardinalityVerifier.INSTANCE;
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @Deprecated
        public static Cardinality valueOf(int i) {
            return forNumber(i);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public enum Kind implements Internal.EnumLite {
        TYPE_UNKNOWN(0),
        TYPE_DOUBLE(1),
        TYPE_FLOAT(2),
        TYPE_INT64(3),
        TYPE_UINT64(4),
        TYPE_INT32(5),
        TYPE_FIXED64(6),
        TYPE_FIXED32(7),
        TYPE_BOOL(8),
        TYPE_STRING(9),
        TYPE_GROUP(10),
        TYPE_MESSAGE(11),
        TYPE_BYTES(12),
        TYPE_UINT32(13),
        TYPE_ENUM(14),
        TYPE_SFIXED32(15),
        TYPE_SFIXED64(16),
        TYPE_SINT32(17),
        TYPE_SINT64(18),
        UNRECOGNIZED(-1);

        public static final int TYPE_BOOL_VALUE = 8;
        public static final int TYPE_BYTES_VALUE = 12;
        public static final int TYPE_DOUBLE_VALUE = 1;
        public static final int TYPE_ENUM_VALUE = 14;
        public static final int TYPE_FIXED32_VALUE = 7;
        public static final int TYPE_FIXED64_VALUE = 6;
        public static final int TYPE_FLOAT_VALUE = 2;
        public static final int TYPE_GROUP_VALUE = 10;
        public static final int TYPE_INT32_VALUE = 5;
        public static final int TYPE_INT64_VALUE = 3;
        public static final int TYPE_MESSAGE_VALUE = 11;
        public static final int TYPE_SFIXED32_VALUE = 15;
        public static final int TYPE_SFIXED64_VALUE = 16;
        public static final int TYPE_SINT32_VALUE = 17;
        public static final int TYPE_SINT64_VALUE = 18;
        public static final int TYPE_STRING_VALUE = 9;
        public static final int TYPE_UINT32_VALUE = 13;
        public static final int TYPE_UINT64_VALUE = 4;
        public static final int TYPE_UNKNOWN_VALUE = 0;
        private static final Internal.EnumLiteMap<Kind> internalValueMap = new C48951();
        private final int value;

        /* JADX INFO: renamed from: com.google.protobuf.Field$Kind$1 */
        /* JADX INFO: compiled from: Proguard */
        public class C48951 implements Internal.EnumLiteMap<Kind> {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public /* bridge */ /* synthetic */ Internal.EnumLite findValueByNumber(int i) {
                return findValueByNumber(i);
            }

            @Override // com.google.protobuf.Internal.EnumLiteMap
            public Kind findValueByNumber(int i) {
                return Kind.forNumber(i);
            }
        }

        /* JADX INFO: compiled from: Proguard */
        public static final class KindVerifier implements Internal.EnumVerifier {
            static final Internal.EnumVerifier INSTANCE = new KindVerifier();

            private KindVerifier() {
            }

            @Override // com.google.protobuf.Internal.EnumVerifier
            public boolean isInRange(int i) {
                return Kind.forNumber(i) != null;
            }
        }

        Kind(int i) {
            this.value = i;
        }

        public static Kind forNumber(int i) {
            switch (i) {
                case 0:
                    return TYPE_UNKNOWN;
                case 1:
                    return TYPE_DOUBLE;
                case 2:
                    return TYPE_FLOAT;
                case 3:
                    return TYPE_INT64;
                case 4:
                    return TYPE_UINT64;
                case 5:
                    return TYPE_INT32;
                case 6:
                    return TYPE_FIXED64;
                case 7:
                    return TYPE_FIXED32;
                case 8:
                    return TYPE_BOOL;
                case 9:
                    return TYPE_STRING;
                case 10:
                    return TYPE_GROUP;
                case 11:
                    return TYPE_MESSAGE;
                case TYPE_BYTES_VALUE:
                    return TYPE_BYTES;
                case 13:
                    return TYPE_UINT32;
                case 14:
                    return TYPE_ENUM;
                case 15:
                    return TYPE_SFIXED32;
                case 16:
                    return TYPE_SFIXED64;
                case 17:
                    return TYPE_SINT32;
                case 18:
                    return TYPE_SINT64;
                default:
                    return null;
            }
        }

        public static Internal.EnumLiteMap<Kind> internalGetValueMap() {
            return internalValueMap;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return KindVerifier.INSTANCE;
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @Deprecated
        public static Kind valueOf(int i) {
            return forNumber(i);
        }
    }

    static {
        Field field = new Field();
        DEFAULT_INSTANCE = field;
        GeneratedMessageLite.registerDefaultInstance(Field.class, field);
    }

    private Field() {
    }

    public static /* synthetic */ Field access$000() {
        return DEFAULT_INSTANCE;
    }

    public static /* synthetic */ void access$100(Field field, int i) {
        field.setKindValue(i);
    }

    public static /* synthetic */ void access$1000(Field field) {
        field.clearName();
    }

    public static /* synthetic */ void access$1100(Field field, ByteString byteString) {
        field.setNameBytes(byteString);
    }

    public static /* synthetic */ void access$1200(Field field, String str) {
        field.setTypeUrl(str);
    }

    public static /* synthetic */ void access$1300(Field field) {
        field.clearTypeUrl();
    }

    public static /* synthetic */ void access$1400(Field field, ByteString byteString) {
        field.setTypeUrlBytes(byteString);
    }

    public static /* synthetic */ void access$1500(Field field, int i) {
        field.setOneofIndex(i);
    }

    public static /* synthetic */ void access$1600(Field field) {
        field.clearOneofIndex();
    }

    public static /* synthetic */ void access$1700(Field field, boolean z2) {
        field.setPacked(z2);
    }

    public static /* synthetic */ void access$1800(Field field) {
        field.clearPacked();
    }

    public static /* synthetic */ void access$1900(Field field, int i, Option option) {
        field.setOptions(i, option);
    }

    public static /* synthetic */ void access$200(Field field, Kind kind) {
        field.setKind(kind);
    }

    public static /* synthetic */ void access$2000(Field field, Option option) {
        field.addOptions(option);
    }

    public static /* synthetic */ void access$2100(Field field, int i, Option option) {
        field.addOptions(i, option);
    }

    public static /* synthetic */ void access$2200(Field field, Iterable iterable) {
        field.addAllOptions(iterable);
    }

    public static /* synthetic */ void access$2300(Field field) {
        field.clearOptions();
    }

    public static /* synthetic */ void access$2400(Field field, int i) {
        field.removeOptions(i);
    }

    public static /* synthetic */ void access$2500(Field field, String str) {
        field.setJsonName(str);
    }

    public static /* synthetic */ void access$2600(Field field) {
        field.clearJsonName();
    }

    public static /* synthetic */ void access$2700(Field field, ByteString byteString) {
        field.setJsonNameBytes(byteString);
    }

    public static /* synthetic */ void access$2800(Field field, String str) {
        field.setDefaultValue(str);
    }

    public static /* synthetic */ void access$2900(Field field) {
        field.clearDefaultValue();
    }

    public static /* synthetic */ void access$300(Field field) {
        field.clearKind();
    }

    public static /* synthetic */ void access$3000(Field field, ByteString byteString) {
        field.setDefaultValueBytes(byteString);
    }

    public static /* synthetic */ void access$400(Field field, int i) {
        field.setCardinalityValue(i);
    }

    public static /* synthetic */ void access$500(Field field, Cardinality cardinality) {
        field.setCardinality(cardinality);
    }

    public static /* synthetic */ void access$600(Field field) {
        field.clearCardinality();
    }

    public static /* synthetic */ void access$700(Field field, int i) {
        field.setNumber(i);
    }

    public static /* synthetic */ void access$800(Field field) {
        field.clearNumber();
    }

    public static /* synthetic */ void access$900(Field field, String str) {
        field.setName(str);
    }

    private void addAllOptions(Iterable<? extends Option> iterable) {
        ensureOptionsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.options_);
    }

    private void addOptions(Option option) {
        option.getClass();
        ensureOptionsIsMutable();
        this.options_.add(option);
    }

    private void clearCardinality() {
        this.cardinality_ = 0;
    }

    private void clearDefaultValue() {
        this.defaultValue_ = getDefaultInstance().getDefaultValue();
    }

    private void clearJsonName() {
        this.jsonName_ = getDefaultInstance().getJsonName();
    }

    private void clearKind() {
        this.kind_ = 0;
    }

    private void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    private void clearNumber() {
        this.number_ = 0;
    }

    private void clearOneofIndex() {
        this.oneofIndex_ = 0;
    }

    private void clearOptions() {
        this.options_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void clearPacked() {
        this.packed_ = false;
    }

    private void clearTypeUrl() {
        this.typeUrl_ = getDefaultInstance().getTypeUrl();
    }

    private void ensureOptionsIsMutable() {
        Internal.ProtobufList<Option> protobufList = this.options_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.options_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static Field getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Field parseDelimitedFrom(InputStream inputStream) {
        return (Field) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Field parseFrom(ByteBuffer byteBuffer) {
        return (Field) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Field> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removeOptions(int i) {
        ensureOptionsIsMutable();
        this.options_.remove(i);
    }

    private void setCardinality(Cardinality cardinality) {
        this.cardinality_ = cardinality.getNumber();
    }

    private void setCardinalityValue(int i) {
        this.cardinality_ = i;
    }

    private void setDefaultValue(String str) {
        str.getClass();
        this.defaultValue_ = str;
    }

    private void setDefaultValueBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.defaultValue_ = byteString.toStringUtf8();
    }

    private void setJsonName(String str) {
        str.getClass();
        this.jsonName_ = str;
    }

    private void setJsonNameBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.jsonName_ = byteString.toStringUtf8();
    }

    private void setKind(Kind kind) {
        this.kind_ = kind.getNumber();
    }

    private void setKindValue(int i) {
        this.kind_ = i;
    }

    private void setName(String str) {
        str.getClass();
        this.name_ = str;
    }

    private void setNameBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.name_ = byteString.toStringUtf8();
    }

    private void setNumber(int i) {
        this.number_ = i;
    }

    private void setOneofIndex(int i) {
        this.oneofIndex_ = i;
    }

    private void setOptions(int i, Option option) {
        option.getClass();
        ensureOptionsIsMutable();
        this.options_.set(i, option);
    }

    private void setPacked(boolean z2) {
        this.packed_ = z2;
    }

    private void setTypeUrl(String str) {
        str.getClass();
        this.typeUrl_ = str;
    }

    private void setTypeUrlBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.typeUrl_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (C48931.f42890xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new Field();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0000\u0000\u0001\u000b\n\u0000\u0001\u0000\u0001\f\u0002\f\u0003\u0004\u0004Ȉ\u0006Ȉ\u0007\u0004\b\u0007\t\u001b\nȈ\u000bȈ", new Object[]{"kind_", "cardinality_", "number_", "name_", "typeUrl_", "oneofIndex_", "packed_", "options_", Option.class, "jsonName_", "defaultValue_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Field> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (Field.class) {
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

    @Override // com.google.protobuf.FieldOrBuilder
    public Cardinality getCardinality() {
        Cardinality cardinalityForNumber = Cardinality.forNumber(this.cardinality_);
        return cardinalityForNumber == null ? Cardinality.UNRECOGNIZED : cardinalityForNumber;
    }

    @Override // com.google.protobuf.FieldOrBuilder
    public int getCardinalityValue() {
        return this.cardinality_;
    }

    @Override // com.google.protobuf.FieldOrBuilder
    public String getDefaultValue() {
        return this.defaultValue_;
    }

    @Override // com.google.protobuf.FieldOrBuilder
    public ByteString getDefaultValueBytes() {
        return ByteString.copyFromUtf8(this.defaultValue_);
    }

    @Override // com.google.protobuf.FieldOrBuilder
    public String getJsonName() {
        return this.jsonName_;
    }

    @Override // com.google.protobuf.FieldOrBuilder
    public ByteString getJsonNameBytes() {
        return ByteString.copyFromUtf8(this.jsonName_);
    }

    @Override // com.google.protobuf.FieldOrBuilder
    public Kind getKind() {
        Kind kindForNumber = Kind.forNumber(this.kind_);
        return kindForNumber == null ? Kind.UNRECOGNIZED : kindForNumber;
    }

    @Override // com.google.protobuf.FieldOrBuilder
    public int getKindValue() {
        return this.kind_;
    }

    @Override // com.google.protobuf.FieldOrBuilder
    public String getName() {
        return this.name_;
    }

    @Override // com.google.protobuf.FieldOrBuilder
    public ByteString getNameBytes() {
        return ByteString.copyFromUtf8(this.name_);
    }

    @Override // com.google.protobuf.FieldOrBuilder
    public int getNumber() {
        return this.number_;
    }

    @Override // com.google.protobuf.FieldOrBuilder
    public int getOneofIndex() {
        return this.oneofIndex_;
    }

    @Override // com.google.protobuf.FieldOrBuilder
    public Option getOptions(int i) {
        return this.options_.get(i);
    }

    @Override // com.google.protobuf.FieldOrBuilder
    public int getOptionsCount() {
        return this.options_.size();
    }

    @Override // com.google.protobuf.FieldOrBuilder
    public List<Option> getOptionsList() {
        return this.options_;
    }

    public OptionOrBuilder getOptionsOrBuilder(int i) {
        return this.options_.get(i);
    }

    public List<? extends OptionOrBuilder> getOptionsOrBuilderList() {
        return this.options_;
    }

    @Override // com.google.protobuf.FieldOrBuilder
    public boolean getPacked() {
        return this.packed_;
    }

    @Override // com.google.protobuf.FieldOrBuilder
    public String getTypeUrl() {
        return this.typeUrl_;
    }

    @Override // com.google.protobuf.FieldOrBuilder
    public ByteString getTypeUrlBytes() {
        return ByteString.copyFromUtf8(this.typeUrl_);
    }

    public static Builder newBuilder(Field field) {
        return DEFAULT_INSTANCE.createBuilder(field);
    }

    public static Field parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Field) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Field parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Field) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Field parseFrom(ByteString byteString) {
        return (Field) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    private void addOptions(int i, Option option) {
        option.getClass();
        ensureOptionsIsMutable();
        this.options_.add(i, option);
    }

    public static Field parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Field) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Field parseFrom(byte[] bArr) {
        return (Field) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Field parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (Field) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Field parseFrom(InputStream inputStream) {
        return (Field) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Field parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Field) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Field parseFrom(CodedInputStream codedInputStream) {
        return (Field) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Field parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Field) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
