package flash.kline.p031v1;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.MapEntryLite;
import com.google.protobuf.MapFieldLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.WireFormat;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class FlashProto {

    /* JADX INFO: renamed from: flash.kline.v1.FlashProto$1 */
    /* JADX INFO: compiled from: Proguard */
    public static /* synthetic */ class C50681 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f43542xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f43542xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f43542xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f43542xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f43542xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f43542xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f43542xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f43542xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class BaseMessage extends GeneratedMessageLite<BaseMessage, Builder> implements BaseMessageOrBuilder {
        public static final int ACTION_FIELD_NUMBER = 1;
        public static final int DATA_FIELD_NUMBER = 2;
        private static final BaseMessage DEFAULT_INSTANCE;
        private static volatile Parser<BaseMessage> PARSER = null;
        public static final int TIME_FIELD_NUMBER = 3;
        private long action_;
        private ByteString data_ = ByteString.EMPTY;
        private long time_;

        /* JADX INFO: compiled from: Proguard */
        public static final class Builder extends GeneratedMessageLite.Builder<BaseMessage, Builder> implements BaseMessageOrBuilder {
            public /* synthetic */ Builder(C50681 c50681) {
                this();
            }

            public Builder clearAction() {
                copyOnWrite();
                BaseMessage.access$200((BaseMessage) this.instance);
                return this;
            }

            public Builder clearData() {
                copyOnWrite();
                BaseMessage.access$400((BaseMessage) this.instance);
                return this;
            }

            public Builder clearTime() {
                copyOnWrite();
                BaseMessage.access$600((BaseMessage) this.instance);
                return this;
            }

            @Override // flash.kline.v1.FlashProto.BaseMessageOrBuilder
            public long getAction() {
                return ((BaseMessage) this.instance).getAction();
            }

            @Override // flash.kline.v1.FlashProto.BaseMessageOrBuilder
            public ByteString getData() {
                return ((BaseMessage) this.instance).getData();
            }

            @Override // flash.kline.v1.FlashProto.BaseMessageOrBuilder
            public long getTime() {
                return ((BaseMessage) this.instance).getTime();
            }

            public Builder setAction(long j) {
                copyOnWrite();
                BaseMessage.access$100((BaseMessage) this.instance, j);
                return this;
            }

            public Builder setData(ByteString byteString) {
                copyOnWrite();
                BaseMessage.access$300((BaseMessage) this.instance, byteString);
                return this;
            }

            public Builder setTime(long j) {
                copyOnWrite();
                BaseMessage.access$500((BaseMessage) this.instance, j);
                return this;
            }

            private Builder() {
                super(BaseMessage.access$000());
            }
        }

        static {
            BaseMessage baseMessage = new BaseMessage();
            DEFAULT_INSTANCE = baseMessage;
            GeneratedMessageLite.registerDefaultInstance(BaseMessage.class, baseMessage);
        }

        private BaseMessage() {
        }

        public static /* synthetic */ BaseMessage access$000() {
            return DEFAULT_INSTANCE;
        }

        public static /* synthetic */ void access$100(BaseMessage baseMessage, long j) {
            baseMessage.setAction(j);
        }

        public static /* synthetic */ void access$200(BaseMessage baseMessage) {
            baseMessage.clearAction();
        }

        public static /* synthetic */ void access$300(BaseMessage baseMessage, ByteString byteString) {
            baseMessage.setData(byteString);
        }

        public static /* synthetic */ void access$400(BaseMessage baseMessage) {
            baseMessage.clearData();
        }

        public static /* synthetic */ void access$500(BaseMessage baseMessage, long j) {
            baseMessage.setTime(j);
        }

        public static /* synthetic */ void access$600(BaseMessage baseMessage) {
            baseMessage.clearTime();
        }

        private void clearAction() {
            this.action_ = 0L;
        }

        private void clearData() {
            this.data_ = getDefaultInstance().getData();
        }

        private void clearTime() {
            this.time_ = 0L;
        }

        public static BaseMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static BaseMessage parseDelimitedFrom(InputStream inputStream) {
            return (BaseMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static BaseMessage parseFrom(ByteBuffer byteBuffer) {
            return (BaseMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<BaseMessage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setAction(long j) {
            this.action_ = j;
        }

        private void setData(ByteString byteString) {
            byteString.getClass();
            this.data_ = byteString;
        }

        private void setTime(long j) {
            this.time_ = j;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (C50681.f43542xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new BaseMessage();
                case 2:
                    return new Builder(null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0002\u0002\n\u0003\u0002", new Object[]{"action_", "data_", "time_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<BaseMessage> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (BaseMessage.class) {
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

        @Override // flash.kline.v1.FlashProto.BaseMessageOrBuilder
        public long getAction() {
            return this.action_;
        }

        @Override // flash.kline.v1.FlashProto.BaseMessageOrBuilder
        public ByteString getData() {
            return this.data_;
        }

        @Override // flash.kline.v1.FlashProto.BaseMessageOrBuilder
        public long getTime() {
            return this.time_;
        }

        public static Builder newBuilder(BaseMessage baseMessage) {
            return DEFAULT_INSTANCE.createBuilder(baseMessage);
        }

        public static BaseMessage parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (BaseMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static BaseMessage parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (BaseMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static BaseMessage parseFrom(ByteString byteString) {
            return (BaseMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static BaseMessage parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (BaseMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static BaseMessage parseFrom(byte[] bArr) {
            return (BaseMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static BaseMessage parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (BaseMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static BaseMessage parseFrom(InputStream inputStream) {
            return (BaseMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static BaseMessage parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (BaseMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static BaseMessage parseFrom(CodedInputStream codedInputStream) {
            return (BaseMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static BaseMessage parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (BaseMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public interface BaseMessageOrBuilder extends MessageLiteOrBuilder {
        long getAction();

        ByteString getData();

        long getTime();
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class CancelSubscribe extends GeneratedMessageLite<CancelSubscribe, Builder> implements CancelSubscribeOrBuilder {
        private static final CancelSubscribe DEFAULT_INSTANCE;
        private static volatile Parser<CancelSubscribe> PARSER = null;
        public static final int SYMBOL_FIELD_NUMBER = 2;
        public static final int TYPE_FIELD_NUMBER = 1;
        private String symbol_ = "";
        private long type_;

        /* JADX INFO: compiled from: Proguard */
        public static final class Builder extends GeneratedMessageLite.Builder<CancelSubscribe, Builder> implements CancelSubscribeOrBuilder {
            public /* synthetic */ Builder(C50681 c50681) {
                this();
            }

            public Builder clearSymbol() {
                copyOnWrite();
                CancelSubscribe.access$12300((CancelSubscribe) this.instance);
                return this;
            }

            public Builder clearType() {
                copyOnWrite();
                CancelSubscribe.access$12100((CancelSubscribe) this.instance);
                return this;
            }

            @Override // flash.kline.v1.FlashProto.CancelSubscribeOrBuilder
            public String getSymbol() {
                return ((CancelSubscribe) this.instance).getSymbol();
            }

            @Override // flash.kline.v1.FlashProto.CancelSubscribeOrBuilder
            public ByteString getSymbolBytes() {
                return ((CancelSubscribe) this.instance).getSymbolBytes();
            }

            @Override // flash.kline.v1.FlashProto.CancelSubscribeOrBuilder
            public long getType() {
                return ((CancelSubscribe) this.instance).getType();
            }

            public Builder setSymbol(String str) {
                copyOnWrite();
                CancelSubscribe.access$12200((CancelSubscribe) this.instance, str);
                return this;
            }

            public Builder setSymbolBytes(ByteString byteString) {
                copyOnWrite();
                CancelSubscribe.access$12400((CancelSubscribe) this.instance, byteString);
                return this;
            }

            public Builder setType(long j) {
                copyOnWrite();
                CancelSubscribe.access$12000((CancelSubscribe) this.instance, j);
                return this;
            }

            private Builder() {
                super(CancelSubscribe.access$11900());
            }
        }

        static {
            CancelSubscribe cancelSubscribe = new CancelSubscribe();
            DEFAULT_INSTANCE = cancelSubscribe;
            GeneratedMessageLite.registerDefaultInstance(CancelSubscribe.class, cancelSubscribe);
        }

        private CancelSubscribe() {
        }

        public static /* synthetic */ CancelSubscribe access$11900() {
            return DEFAULT_INSTANCE;
        }

        public static /* synthetic */ void access$12000(CancelSubscribe cancelSubscribe, long j) {
            cancelSubscribe.setType(j);
        }

        public static /* synthetic */ void access$12100(CancelSubscribe cancelSubscribe) {
            cancelSubscribe.clearType();
        }

        public static /* synthetic */ void access$12200(CancelSubscribe cancelSubscribe, String str) {
            cancelSubscribe.setSymbol(str);
        }

        public static /* synthetic */ void access$12300(CancelSubscribe cancelSubscribe) {
            cancelSubscribe.clearSymbol();
        }

        public static /* synthetic */ void access$12400(CancelSubscribe cancelSubscribe, ByteString byteString) {
            cancelSubscribe.setSymbolBytes(byteString);
        }

        private void clearSymbol() {
            this.symbol_ = getDefaultInstance().getSymbol();
        }

        private void clearType() {
            this.type_ = 0L;
        }

        public static CancelSubscribe getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static CancelSubscribe parseDelimitedFrom(InputStream inputStream) {
            return (CancelSubscribe) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CancelSubscribe parseFrom(ByteBuffer byteBuffer) {
            return (CancelSubscribe) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<CancelSubscribe> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setSymbol(String str) {
            str.getClass();
            this.symbol_ = str;
        }

        private void setSymbolBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.symbol_ = byteString.toStringUtf8();
        }

        private void setType(long j) {
            this.type_ = j;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (C50681.f43542xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new CancelSubscribe();
                case 2:
                    return new Builder(null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002Ȉ", new Object[]{"type_", "symbol_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<CancelSubscribe> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (CancelSubscribe.class) {
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

        @Override // flash.kline.v1.FlashProto.CancelSubscribeOrBuilder
        public String getSymbol() {
            return this.symbol_;
        }

        @Override // flash.kline.v1.FlashProto.CancelSubscribeOrBuilder
        public ByteString getSymbolBytes() {
            return ByteString.copyFromUtf8(this.symbol_);
        }

        @Override // flash.kline.v1.FlashProto.CancelSubscribeOrBuilder
        public long getType() {
            return this.type_;
        }

        public static Builder newBuilder(CancelSubscribe cancelSubscribe) {
            return DEFAULT_INSTANCE.createBuilder(cancelSubscribe);
        }

        public static CancelSubscribe parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CancelSubscribe) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static CancelSubscribe parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (CancelSubscribe) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static CancelSubscribe parseFrom(ByteString byteString) {
            return (CancelSubscribe) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static CancelSubscribe parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (CancelSubscribe) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static CancelSubscribe parseFrom(byte[] bArr) {
            return (CancelSubscribe) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static CancelSubscribe parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (CancelSubscribe) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static CancelSubscribe parseFrom(InputStream inputStream) {
            return (CancelSubscribe) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CancelSubscribe parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CancelSubscribe) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static CancelSubscribe parseFrom(CodedInputStream codedInputStream) {
            return (CancelSubscribe) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static CancelSubscribe parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CancelSubscribe) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public interface CancelSubscribeOrBuilder extends MessageLiteOrBuilder {
        String getSymbol();

        ByteString getSymbolBytes();

        long getType();
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class DepthInfo extends GeneratedMessageLite<DepthInfo, Builder> implements DepthInfoOrBuilder {
        private static final DepthInfo DEFAULT_INSTANCE;
        private static volatile Parser<DepthInfo> PARSER = null;
        public static final int PRICE_FIELD_NUMBER = 2;
        public static final int VOLUME_FIELD_NUMBER = 1;
        private double price_;
        private double volume_;

        /* JADX INFO: compiled from: Proguard */
        public static final class Builder extends GeneratedMessageLite.Builder<DepthInfo, Builder> implements DepthInfoOrBuilder {
            public /* synthetic */ Builder(C50681 c50681) {
                this();
            }

            public Builder clearPrice() {
                copyOnWrite();
                DepthInfo.access$14000((DepthInfo) this.instance);
                return this;
            }

            public Builder clearVolume() {
                copyOnWrite();
                DepthInfo.access$13800((DepthInfo) this.instance);
                return this;
            }

            @Override // flash.kline.v1.FlashProto.DepthInfoOrBuilder
            public double getPrice() {
                return ((DepthInfo) this.instance).getPrice();
            }

            @Override // flash.kline.v1.FlashProto.DepthInfoOrBuilder
            public double getVolume() {
                return ((DepthInfo) this.instance).getVolume();
            }

            public Builder setPrice(double d) {
                copyOnWrite();
                DepthInfo.access$13900((DepthInfo) this.instance, d);
                return this;
            }

            public Builder setVolume(double d) {
                copyOnWrite();
                DepthInfo.access$13700((DepthInfo) this.instance, d);
                return this;
            }

            private Builder() {
                super(DepthInfo.access$13600());
            }
        }

        static {
            DepthInfo depthInfo = new DepthInfo();
            DEFAULT_INSTANCE = depthInfo;
            GeneratedMessageLite.registerDefaultInstance(DepthInfo.class, depthInfo);
        }

        private DepthInfo() {
        }

        public static /* synthetic */ DepthInfo access$13600() {
            return DEFAULT_INSTANCE;
        }

        public static /* synthetic */ void access$13700(DepthInfo depthInfo, double d) {
            depthInfo.setVolume(d);
        }

        public static /* synthetic */ void access$13800(DepthInfo depthInfo) {
            depthInfo.clearVolume();
        }

        public static /* synthetic */ void access$13900(DepthInfo depthInfo, double d) {
            depthInfo.setPrice(d);
        }

        public static /* synthetic */ void access$14000(DepthInfo depthInfo) {
            depthInfo.clearPrice();
        }

        private void clearPrice() {
            this.price_ = 0.0d;
        }

        private void clearVolume() {
            this.volume_ = 0.0d;
        }

        public static DepthInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static DepthInfo parseDelimitedFrom(InputStream inputStream) {
            return (DepthInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static DepthInfo parseFrom(ByteBuffer byteBuffer) {
            return (DepthInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<DepthInfo> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setPrice(double d) {
            this.price_ = d;
        }

        private void setVolume(double d) {
            this.volume_ = d;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (C50681.f43542xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new DepthInfo();
                case 2:
                    return new Builder(null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0000\u0002\u0000", new Object[]{"volume_", "price_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<DepthInfo> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (DepthInfo.class) {
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

        @Override // flash.kline.v1.FlashProto.DepthInfoOrBuilder
        public double getPrice() {
            return this.price_;
        }

        @Override // flash.kline.v1.FlashProto.DepthInfoOrBuilder
        public double getVolume() {
            return this.volume_;
        }

        public static Builder newBuilder(DepthInfo depthInfo) {
            return DEFAULT_INSTANCE.createBuilder(depthInfo);
        }

        public static DepthInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DepthInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static DepthInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (DepthInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static DepthInfo parseFrom(ByteString byteString) {
            return (DepthInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static DepthInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (DepthInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static DepthInfo parseFrom(byte[] bArr) {
            return (DepthInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static DepthInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (DepthInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static DepthInfo parseFrom(InputStream inputStream) {
            return (DepthInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static DepthInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DepthInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static DepthInfo parseFrom(CodedInputStream codedInputStream) {
            return (DepthInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static DepthInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DepthInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public interface DepthInfoOrBuilder extends MessageLiteOrBuilder {
        double getPrice();

        double getVolume();
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class HeartBeat extends GeneratedMessageLite<HeartBeat, Builder> implements HeartBeatOrBuilder {
        private static final HeartBeat DEFAULT_INSTANCE;
        private static volatile Parser<HeartBeat> PARSER = null;
        public static final int TIME_FIELD_NUMBER = 1;
        private long time_;

        /* JADX INFO: compiled from: Proguard */
        public static final class Builder extends GeneratedMessageLite.Builder<HeartBeat, Builder> implements HeartBeatOrBuilder {
            public /* synthetic */ Builder(C50681 c50681) {
                this();
            }

            public Builder clearTime() {
                copyOnWrite();
                HeartBeat.access$11700((HeartBeat) this.instance);
                return this;
            }

            @Override // flash.kline.v1.FlashProto.HeartBeatOrBuilder
            public long getTime() {
                return ((HeartBeat) this.instance).getTime();
            }

            public Builder setTime(long j) {
                copyOnWrite();
                HeartBeat.access$11600((HeartBeat) this.instance, j);
                return this;
            }

            private Builder() {
                super(HeartBeat.access$11500());
            }
        }

        static {
            HeartBeat heartBeat = new HeartBeat();
            DEFAULT_INSTANCE = heartBeat;
            GeneratedMessageLite.registerDefaultInstance(HeartBeat.class, heartBeat);
        }

        private HeartBeat() {
        }

        public static /* synthetic */ HeartBeat access$11500() {
            return DEFAULT_INSTANCE;
        }

        public static /* synthetic */ void access$11600(HeartBeat heartBeat, long j) {
            heartBeat.setTime(j);
        }

        public static /* synthetic */ void access$11700(HeartBeat heartBeat) {
            heartBeat.clearTime();
        }

        private void clearTime() {
            this.time_ = 0L;
        }

        public static HeartBeat getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static HeartBeat parseDelimitedFrom(InputStream inputStream) {
            return (HeartBeat) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static HeartBeat parseFrom(ByteBuffer byteBuffer) {
            return (HeartBeat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<HeartBeat> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setTime(long j) {
            this.time_ = j;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (C50681.f43542xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new HeartBeat();
                case 2:
                    return new Builder(null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0002", new Object[]{"time_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<HeartBeat> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (HeartBeat.class) {
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

        @Override // flash.kline.v1.FlashProto.HeartBeatOrBuilder
        public long getTime() {
            return this.time_;
        }

        public static Builder newBuilder(HeartBeat heartBeat) {
            return DEFAULT_INSTANCE.createBuilder(heartBeat);
        }

        public static HeartBeat parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (HeartBeat) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static HeartBeat parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (HeartBeat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static HeartBeat parseFrom(ByteString byteString) {
            return (HeartBeat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static HeartBeat parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (HeartBeat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static HeartBeat parseFrom(byte[] bArr) {
            return (HeartBeat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static HeartBeat parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (HeartBeat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static HeartBeat parseFrom(InputStream inputStream) {
            return (HeartBeat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static HeartBeat parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (HeartBeat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static HeartBeat parseFrom(CodedInputStream codedInputStream) {
            return (HeartBeat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static HeartBeat parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (HeartBeat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public interface HeartBeatOrBuilder extends MessageLiteOrBuilder {
        long getTime();
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class KlineInfo extends GeneratedMessageLite<KlineInfo, Builder> implements KlineInfoOrBuilder {
        public static final int CLOSE_FIELD_NUMBER = 2;
        private static final KlineInfo DEFAULT_INSTANCE;
        public static final int ENDTIME_FIELD_NUMBER = 7;
        public static final int HIGH_FIELD_NUMBER = 3;
        public static final int LOW_FIELD_NUMBER = 4;
        public static final int OPEN_FIELD_NUMBER = 1;
        private static volatile Parser<KlineInfo> PARSER = null;
        public static final int STARTTIME_FIELD_NUMBER = 6;
        public static final int VOLUME_FIELD_NUMBER = 5;
        private double close_;
        private long endTime_;
        private double high_;
        private double low_;
        private double open_;
        private long startTime_;
        private double volume_;

        /* JADX INFO: compiled from: Proguard */
        public static final class Builder extends GeneratedMessageLite.Builder<KlineInfo, Builder> implements KlineInfoOrBuilder {
            public /* synthetic */ Builder(C50681 c50681) {
                this();
            }

            public Builder clearClose() {
                copyOnWrite();
                KlineInfo.access$5900((KlineInfo) this.instance);
                return this;
            }

            public Builder clearEndTime() {
                copyOnWrite();
                KlineInfo.access$6900((KlineInfo) this.instance);
                return this;
            }

            public Builder clearHigh() {
                copyOnWrite();
                KlineInfo.access$6100((KlineInfo) this.instance);
                return this;
            }

            public Builder clearLow() {
                copyOnWrite();
                KlineInfo.access$6300((KlineInfo) this.instance);
                return this;
            }

            public Builder clearOpen() {
                copyOnWrite();
                KlineInfo.access$5700((KlineInfo) this.instance);
                return this;
            }

            public Builder clearStartTime() {
                copyOnWrite();
                KlineInfo.access$6700((KlineInfo) this.instance);
                return this;
            }

            public Builder clearVolume() {
                copyOnWrite();
                KlineInfo.access$6500((KlineInfo) this.instance);
                return this;
            }

            @Override // flash.kline.v1.FlashProto.KlineInfoOrBuilder
            public double getClose() {
                return ((KlineInfo) this.instance).getClose();
            }

            @Override // flash.kline.v1.FlashProto.KlineInfoOrBuilder
            public long getEndTime() {
                return ((KlineInfo) this.instance).getEndTime();
            }

            @Override // flash.kline.v1.FlashProto.KlineInfoOrBuilder
            public double getHigh() {
                return ((KlineInfo) this.instance).getHigh();
            }

            @Override // flash.kline.v1.FlashProto.KlineInfoOrBuilder
            public double getLow() {
                return ((KlineInfo) this.instance).getLow();
            }

            @Override // flash.kline.v1.FlashProto.KlineInfoOrBuilder
            public double getOpen() {
                return ((KlineInfo) this.instance).getOpen();
            }

            @Override // flash.kline.v1.FlashProto.KlineInfoOrBuilder
            public long getStartTime() {
                return ((KlineInfo) this.instance).getStartTime();
            }

            @Override // flash.kline.v1.FlashProto.KlineInfoOrBuilder
            public double getVolume() {
                return ((KlineInfo) this.instance).getVolume();
            }

            public Builder setClose(double d) {
                copyOnWrite();
                KlineInfo.access$5800((KlineInfo) this.instance, d);
                return this;
            }

            public Builder setEndTime(long j) {
                copyOnWrite();
                KlineInfo.access$6800((KlineInfo) this.instance, j);
                return this;
            }

            public Builder setHigh(double d) {
                copyOnWrite();
                KlineInfo.access$6000((KlineInfo) this.instance, d);
                return this;
            }

            public Builder setLow(double d) {
                copyOnWrite();
                KlineInfo.access$6200((KlineInfo) this.instance, d);
                return this;
            }

            public Builder setOpen(double d) {
                copyOnWrite();
                KlineInfo.access$5600((KlineInfo) this.instance, d);
                return this;
            }

            public Builder setStartTime(long j) {
                copyOnWrite();
                KlineInfo.access$6600((KlineInfo) this.instance, j);
                return this;
            }

            public Builder setVolume(double d) {
                copyOnWrite();
                KlineInfo.access$6400((KlineInfo) this.instance, d);
                return this;
            }

            private Builder() {
                super(KlineInfo.access$5500());
            }
        }

        static {
            KlineInfo klineInfo = new KlineInfo();
            DEFAULT_INSTANCE = klineInfo;
            GeneratedMessageLite.registerDefaultInstance(KlineInfo.class, klineInfo);
        }

        private KlineInfo() {
        }

        public static /* synthetic */ KlineInfo access$5500() {
            return DEFAULT_INSTANCE;
        }

        public static /* synthetic */ void access$5600(KlineInfo klineInfo, double d) {
            klineInfo.setOpen(d);
        }

        public static /* synthetic */ void access$5700(KlineInfo klineInfo) {
            klineInfo.clearOpen();
        }

        public static /* synthetic */ void access$5800(KlineInfo klineInfo, double d) {
            klineInfo.setClose(d);
        }

        public static /* synthetic */ void access$5900(KlineInfo klineInfo) {
            klineInfo.clearClose();
        }

        public static /* synthetic */ void access$6000(KlineInfo klineInfo, double d) {
            klineInfo.setHigh(d);
        }

        public static /* synthetic */ void access$6100(KlineInfo klineInfo) {
            klineInfo.clearHigh();
        }

        public static /* synthetic */ void access$6200(KlineInfo klineInfo, double d) {
            klineInfo.setLow(d);
        }

        public static /* synthetic */ void access$6300(KlineInfo klineInfo) {
            klineInfo.clearLow();
        }

        public static /* synthetic */ void access$6400(KlineInfo klineInfo, double d) {
            klineInfo.setVolume(d);
        }

        public static /* synthetic */ void access$6500(KlineInfo klineInfo) {
            klineInfo.clearVolume();
        }

        public static /* synthetic */ void access$6600(KlineInfo klineInfo, long j) {
            klineInfo.setStartTime(j);
        }

        public static /* synthetic */ void access$6700(KlineInfo klineInfo) {
            klineInfo.clearStartTime();
        }

        public static /* synthetic */ void access$6800(KlineInfo klineInfo, long j) {
            klineInfo.setEndTime(j);
        }

        public static /* synthetic */ void access$6900(KlineInfo klineInfo) {
            klineInfo.clearEndTime();
        }

        private void clearClose() {
            this.close_ = 0.0d;
        }

        private void clearEndTime() {
            this.endTime_ = 0L;
        }

        private void clearHigh() {
            this.high_ = 0.0d;
        }

        private void clearLow() {
            this.low_ = 0.0d;
        }

        private void clearOpen() {
            this.open_ = 0.0d;
        }

        private void clearStartTime() {
            this.startTime_ = 0L;
        }

        private void clearVolume() {
            this.volume_ = 0.0d;
        }

        public static KlineInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static KlineInfo parseDelimitedFrom(InputStream inputStream) {
            return (KlineInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static KlineInfo parseFrom(ByteBuffer byteBuffer) {
            return (KlineInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<KlineInfo> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setClose(double d) {
            this.close_ = d;
        }

        private void setEndTime(long j) {
            this.endTime_ = j;
        }

        private void setHigh(double d) {
            this.high_ = d;
        }

        private void setLow(double d) {
            this.low_ = d;
        }

        private void setOpen(double d) {
            this.open_ = d;
        }

        private void setStartTime(long j) {
            this.startTime_ = j;
        }

        private void setVolume(double d) {
            this.volume_ = d;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (C50681.f43542xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new KlineInfo();
                case 2:
                    return new Builder(null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001\u0000\u0002\u0000\u0003\u0000\u0004\u0000\u0005\u0000\u0006\u0002\u0007\u0002", new Object[]{"open_", "close_", "high_", "low_", "volume_", "startTime_", "endTime_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<KlineInfo> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (KlineInfo.class) {
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

        @Override // flash.kline.v1.FlashProto.KlineInfoOrBuilder
        public double getClose() {
            return this.close_;
        }

        @Override // flash.kline.v1.FlashProto.KlineInfoOrBuilder
        public long getEndTime() {
            return this.endTime_;
        }

        @Override // flash.kline.v1.FlashProto.KlineInfoOrBuilder
        public double getHigh() {
            return this.high_;
        }

        @Override // flash.kline.v1.FlashProto.KlineInfoOrBuilder
        public double getLow() {
            return this.low_;
        }

        @Override // flash.kline.v1.FlashProto.KlineInfoOrBuilder
        public double getOpen() {
            return this.open_;
        }

        @Override // flash.kline.v1.FlashProto.KlineInfoOrBuilder
        public long getStartTime() {
            return this.startTime_;
        }

        @Override // flash.kline.v1.FlashProto.KlineInfoOrBuilder
        public double getVolume() {
            return this.volume_;
        }

        public static Builder newBuilder(KlineInfo klineInfo) {
            return DEFAULT_INSTANCE.createBuilder(klineInfo);
        }

        public static KlineInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (KlineInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static KlineInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (KlineInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static KlineInfo parseFrom(ByteString byteString) {
            return (KlineInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static KlineInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (KlineInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static KlineInfo parseFrom(byte[] bArr) {
            return (KlineInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static KlineInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (KlineInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static KlineInfo parseFrom(InputStream inputStream) {
            return (KlineInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static KlineInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (KlineInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static KlineInfo parseFrom(CodedInputStream codedInputStream) {
            return (KlineInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static KlineInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (KlineInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public interface KlineInfoOrBuilder extends MessageLiteOrBuilder {
        double getClose();

        long getEndTime();

        double getHigh();

        double getLow();

        double getOpen();

        long getStartTime();

        double getVolume();
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class ListKlineInfo extends GeneratedMessageLite<ListKlineInfo, Builder> implements ListKlineInfoOrBuilder {
        private static final ListKlineInfo DEFAULT_INSTANCE;
        public static final int INFO_FIELD_NUMBER = 1;
        private static volatile Parser<ListKlineInfo> PARSER;
        private Internal.ProtobufList<KlineInfo> info_ = GeneratedMessageLite.emptyProtobufList();

        /* JADX INFO: compiled from: Proguard */
        public static final class Builder extends GeneratedMessageLite.Builder<ListKlineInfo, Builder> implements ListKlineInfoOrBuilder {
            public /* synthetic */ Builder(C50681 c50681) {
                this();
            }

            public Builder addAllInfo(Iterable<? extends KlineInfo> iterable) {
                copyOnWrite();
                ListKlineInfo.access$17200((ListKlineInfo) this.instance, iterable);
                return this;
            }

            public Builder addInfo(KlineInfo klineInfo) {
                copyOnWrite();
                ListKlineInfo.access$17000((ListKlineInfo) this.instance, klineInfo);
                return this;
            }

            public Builder clearInfo() {
                copyOnWrite();
                ListKlineInfo.access$17300((ListKlineInfo) this.instance);
                return this;
            }

            @Override // flash.kline.v1.FlashProto.ListKlineInfoOrBuilder
            public KlineInfo getInfo(int i) {
                return ((ListKlineInfo) this.instance).getInfo(i);
            }

            @Override // flash.kline.v1.FlashProto.ListKlineInfoOrBuilder
            public int getInfoCount() {
                return ((ListKlineInfo) this.instance).getInfoCount();
            }

            @Override // flash.kline.v1.FlashProto.ListKlineInfoOrBuilder
            public List<KlineInfo> getInfoList() {
                return Collections.unmodifiableList(((ListKlineInfo) this.instance).getInfoList());
            }

            public Builder removeInfo(int i) {
                copyOnWrite();
                ListKlineInfo.access$17400((ListKlineInfo) this.instance, i);
                return this;
            }

            public Builder setInfo(int i, KlineInfo klineInfo) {
                copyOnWrite();
                ListKlineInfo.access$16900((ListKlineInfo) this.instance, i, klineInfo);
                return this;
            }

            private Builder() {
                super(ListKlineInfo.access$16800());
            }

            public Builder addInfo(int i, KlineInfo klineInfo) {
                copyOnWrite();
                ListKlineInfo.access$17100((ListKlineInfo) this.instance, i, klineInfo);
                return this;
            }

            public Builder setInfo(int i, KlineInfo.Builder builder) {
                copyOnWrite();
                ListKlineInfo.access$16900((ListKlineInfo) this.instance, i, builder.build());
                return this;
            }

            public Builder addInfo(KlineInfo.Builder builder) {
                copyOnWrite();
                ListKlineInfo.access$17000((ListKlineInfo) this.instance, builder.build());
                return this;
            }

            public Builder addInfo(int i, KlineInfo.Builder builder) {
                copyOnWrite();
                ListKlineInfo.access$17100((ListKlineInfo) this.instance, i, builder.build());
                return this;
            }
        }

        static {
            ListKlineInfo listKlineInfo = new ListKlineInfo();
            DEFAULT_INSTANCE = listKlineInfo;
            GeneratedMessageLite.registerDefaultInstance(ListKlineInfo.class, listKlineInfo);
        }

        private ListKlineInfo() {
        }

        public static /* synthetic */ ListKlineInfo access$16800() {
            return DEFAULT_INSTANCE;
        }

        public static /* synthetic */ void access$16900(ListKlineInfo listKlineInfo, int i, KlineInfo klineInfo) {
            listKlineInfo.setInfo(i, klineInfo);
        }

        public static /* synthetic */ void access$17000(ListKlineInfo listKlineInfo, KlineInfo klineInfo) {
            listKlineInfo.addInfo(klineInfo);
        }

        public static /* synthetic */ void access$17100(ListKlineInfo listKlineInfo, int i, KlineInfo klineInfo) {
            listKlineInfo.addInfo(i, klineInfo);
        }

        public static /* synthetic */ void access$17200(ListKlineInfo listKlineInfo, Iterable iterable) {
            listKlineInfo.addAllInfo(iterable);
        }

        public static /* synthetic */ void access$17300(ListKlineInfo listKlineInfo) {
            listKlineInfo.clearInfo();
        }

        public static /* synthetic */ void access$17400(ListKlineInfo listKlineInfo, int i) {
            listKlineInfo.removeInfo(i);
        }

        private void addAllInfo(Iterable<? extends KlineInfo> iterable) {
            ensureInfoIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.info_);
        }

        private void addInfo(KlineInfo klineInfo) {
            klineInfo.getClass();
            ensureInfoIsMutable();
            this.info_.add(klineInfo);
        }

        private void clearInfo() {
            this.info_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void ensureInfoIsMutable() {
            Internal.ProtobufList<KlineInfo> protobufList = this.info_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.info_ = GeneratedMessageLite.mutableCopy(protobufList);
        }

        public static ListKlineInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static ListKlineInfo parseDelimitedFrom(InputStream inputStream) {
            return (ListKlineInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ListKlineInfo parseFrom(ByteBuffer byteBuffer) {
            return (ListKlineInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<ListKlineInfo> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void removeInfo(int i) {
            ensureInfoIsMutable();
            this.info_.remove(i);
        }

        private void setInfo(int i, KlineInfo klineInfo) {
            klineInfo.getClass();
            ensureInfoIsMutable();
            this.info_.set(i, klineInfo);
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (C50681.f43542xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new ListKlineInfo();
                case 2:
                    return new Builder(null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"info_", KlineInfo.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<ListKlineInfo> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (ListKlineInfo.class) {
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

        @Override // flash.kline.v1.FlashProto.ListKlineInfoOrBuilder
        public KlineInfo getInfo(int i) {
            return this.info_.get(i);
        }

        @Override // flash.kline.v1.FlashProto.ListKlineInfoOrBuilder
        public int getInfoCount() {
            return this.info_.size();
        }

        @Override // flash.kline.v1.FlashProto.ListKlineInfoOrBuilder
        public List<KlineInfo> getInfoList() {
            return this.info_;
        }

        public KlineInfoOrBuilder getInfoOrBuilder(int i) {
            return this.info_.get(i);
        }

        public List<? extends KlineInfoOrBuilder> getInfoOrBuilderList() {
            return this.info_;
        }

        public static Builder newBuilder(ListKlineInfo listKlineInfo) {
            return DEFAULT_INSTANCE.createBuilder(listKlineInfo);
        }

        public static ListKlineInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ListKlineInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ListKlineInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (ListKlineInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static ListKlineInfo parseFrom(ByteString byteString) {
            return (ListKlineInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        private void addInfo(int i, KlineInfo klineInfo) {
            klineInfo.getClass();
            ensureInfoIsMutable();
            this.info_.add(i, klineInfo);
        }

        public static ListKlineInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (ListKlineInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static ListKlineInfo parseFrom(byte[] bArr) {
            return (ListKlineInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ListKlineInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (ListKlineInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static ListKlineInfo parseFrom(InputStream inputStream) {
            return (ListKlineInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ListKlineInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ListKlineInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ListKlineInfo parseFrom(CodedInputStream codedInputStream) {
            return (ListKlineInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static ListKlineInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ListKlineInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public interface ListKlineInfoOrBuilder extends MessageLiteOrBuilder {
        KlineInfo getInfo(int i);

        int getInfoCount();

        List<KlineInfo> getInfoList();
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class RecDepthInfo extends GeneratedMessageLite<RecDepthInfo, Builder> implements RecDepthInfoOrBuilder {
        public static final int BUY_FIELD_NUMBER = 1;
        private static final RecDepthInfo DEFAULT_INSTANCE;
        private static volatile Parser<RecDepthInfo> PARSER = null;
        public static final int SELL_FIELD_NUMBER = 2;
        private Internal.ProtobufList<DepthInfo> buy_ = GeneratedMessageLite.emptyProtobufList();
        private Internal.ProtobufList<DepthInfo> sell_ = GeneratedMessageLite.emptyProtobufList();

        /* JADX INFO: compiled from: Proguard */
        public static final class Builder extends GeneratedMessageLite.Builder<RecDepthInfo, Builder> implements RecDepthInfoOrBuilder {
            public /* synthetic */ Builder(C50681 c50681) {
                this();
            }

            public Builder addAllBuy(Iterable<? extends DepthInfo> iterable) {
                copyOnWrite();
                RecDepthInfo.access$14600((RecDepthInfo) this.instance, iterable);
                return this;
            }

            public Builder addAllSell(Iterable<? extends DepthInfo> iterable) {
                copyOnWrite();
                RecDepthInfo.access$15200((RecDepthInfo) this.instance, iterable);
                return this;
            }

            public Builder addBuy(DepthInfo depthInfo) {
                copyOnWrite();
                RecDepthInfo.access$14400((RecDepthInfo) this.instance, depthInfo);
                return this;
            }

            public Builder addSell(DepthInfo depthInfo) {
                copyOnWrite();
                RecDepthInfo.access$15000((RecDepthInfo) this.instance, depthInfo);
                return this;
            }

            public Builder clearBuy() {
                copyOnWrite();
                RecDepthInfo.access$14700((RecDepthInfo) this.instance);
                return this;
            }

            public Builder clearSell() {
                copyOnWrite();
                RecDepthInfo.access$15300((RecDepthInfo) this.instance);
                return this;
            }

            @Override // flash.kline.v1.FlashProto.RecDepthInfoOrBuilder
            public DepthInfo getBuy(int i) {
                return ((RecDepthInfo) this.instance).getBuy(i);
            }

            @Override // flash.kline.v1.FlashProto.RecDepthInfoOrBuilder
            public int getBuyCount() {
                return ((RecDepthInfo) this.instance).getBuyCount();
            }

            @Override // flash.kline.v1.FlashProto.RecDepthInfoOrBuilder
            public List<DepthInfo> getBuyList() {
                return Collections.unmodifiableList(((RecDepthInfo) this.instance).getBuyList());
            }

            @Override // flash.kline.v1.FlashProto.RecDepthInfoOrBuilder
            public DepthInfo getSell(int i) {
                return ((RecDepthInfo) this.instance).getSell(i);
            }

            @Override // flash.kline.v1.FlashProto.RecDepthInfoOrBuilder
            public int getSellCount() {
                return ((RecDepthInfo) this.instance).getSellCount();
            }

            @Override // flash.kline.v1.FlashProto.RecDepthInfoOrBuilder
            public List<DepthInfo> getSellList() {
                return Collections.unmodifiableList(((RecDepthInfo) this.instance).getSellList());
            }

            public Builder removeBuy(int i) {
                copyOnWrite();
                RecDepthInfo.access$14800((RecDepthInfo) this.instance, i);
                return this;
            }

            public Builder removeSell(int i) {
                copyOnWrite();
                RecDepthInfo.access$15400((RecDepthInfo) this.instance, i);
                return this;
            }

            public Builder setBuy(int i, DepthInfo depthInfo) {
                copyOnWrite();
                RecDepthInfo.access$14300((RecDepthInfo) this.instance, i, depthInfo);
                return this;
            }

            public Builder setSell(int i, DepthInfo depthInfo) {
                copyOnWrite();
                RecDepthInfo.access$14900((RecDepthInfo) this.instance, i, depthInfo);
                return this;
            }

            private Builder() {
                super(RecDepthInfo.access$14200());
            }

            public Builder addBuy(int i, DepthInfo depthInfo) {
                copyOnWrite();
                RecDepthInfo.access$14500((RecDepthInfo) this.instance, i, depthInfo);
                return this;
            }

            public Builder addSell(int i, DepthInfo depthInfo) {
                copyOnWrite();
                RecDepthInfo.access$15100((RecDepthInfo) this.instance, i, depthInfo);
                return this;
            }

            public Builder setBuy(int i, DepthInfo.Builder builder) {
                copyOnWrite();
                RecDepthInfo.access$14300((RecDepthInfo) this.instance, i, builder.build());
                return this;
            }

            public Builder setSell(int i, DepthInfo.Builder builder) {
                copyOnWrite();
                RecDepthInfo.access$14900((RecDepthInfo) this.instance, i, builder.build());
                return this;
            }

            public Builder addBuy(DepthInfo.Builder builder) {
                copyOnWrite();
                RecDepthInfo.access$14400((RecDepthInfo) this.instance, builder.build());
                return this;
            }

            public Builder addSell(DepthInfo.Builder builder) {
                copyOnWrite();
                RecDepthInfo.access$15000((RecDepthInfo) this.instance, builder.build());
                return this;
            }

            public Builder addBuy(int i, DepthInfo.Builder builder) {
                copyOnWrite();
                RecDepthInfo.access$14500((RecDepthInfo) this.instance, i, builder.build());
                return this;
            }

            public Builder addSell(int i, DepthInfo.Builder builder) {
                copyOnWrite();
                RecDepthInfo.access$15100((RecDepthInfo) this.instance, i, builder.build());
                return this;
            }
        }

        static {
            RecDepthInfo recDepthInfo = new RecDepthInfo();
            DEFAULT_INSTANCE = recDepthInfo;
            GeneratedMessageLite.registerDefaultInstance(RecDepthInfo.class, recDepthInfo);
        }

        private RecDepthInfo() {
        }

        public static /* synthetic */ RecDepthInfo access$14200() {
            return DEFAULT_INSTANCE;
        }

        public static /* synthetic */ void access$14300(RecDepthInfo recDepthInfo, int i, DepthInfo depthInfo) {
            recDepthInfo.setBuy(i, depthInfo);
        }

        public static /* synthetic */ void access$14400(RecDepthInfo recDepthInfo, DepthInfo depthInfo) {
            recDepthInfo.addBuy(depthInfo);
        }

        public static /* synthetic */ void access$14500(RecDepthInfo recDepthInfo, int i, DepthInfo depthInfo) {
            recDepthInfo.addBuy(i, depthInfo);
        }

        public static /* synthetic */ void access$14600(RecDepthInfo recDepthInfo, Iterable iterable) {
            recDepthInfo.addAllBuy(iterable);
        }

        public static /* synthetic */ void access$14700(RecDepthInfo recDepthInfo) {
            recDepthInfo.clearBuy();
        }

        public static /* synthetic */ void access$14800(RecDepthInfo recDepthInfo, int i) {
            recDepthInfo.removeBuy(i);
        }

        public static /* synthetic */ void access$14900(RecDepthInfo recDepthInfo, int i, DepthInfo depthInfo) {
            recDepthInfo.setSell(i, depthInfo);
        }

        public static /* synthetic */ void access$15000(RecDepthInfo recDepthInfo, DepthInfo depthInfo) {
            recDepthInfo.addSell(depthInfo);
        }

        public static /* synthetic */ void access$15100(RecDepthInfo recDepthInfo, int i, DepthInfo depthInfo) {
            recDepthInfo.addSell(i, depthInfo);
        }

        public static /* synthetic */ void access$15200(RecDepthInfo recDepthInfo, Iterable iterable) {
            recDepthInfo.addAllSell(iterable);
        }

        public static /* synthetic */ void access$15300(RecDepthInfo recDepthInfo) {
            recDepthInfo.clearSell();
        }

        public static /* synthetic */ void access$15400(RecDepthInfo recDepthInfo, int i) {
            recDepthInfo.removeSell(i);
        }

        private void addAllBuy(Iterable<? extends DepthInfo> iterable) {
            ensureBuyIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.buy_);
        }

        private void addAllSell(Iterable<? extends DepthInfo> iterable) {
            ensureSellIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.sell_);
        }

        private void addBuy(DepthInfo depthInfo) {
            depthInfo.getClass();
            ensureBuyIsMutable();
            this.buy_.add(depthInfo);
        }

        private void addSell(DepthInfo depthInfo) {
            depthInfo.getClass();
            ensureSellIsMutable();
            this.sell_.add(depthInfo);
        }

        private void clearBuy() {
            this.buy_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void clearSell() {
            this.sell_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void ensureBuyIsMutable() {
            Internal.ProtobufList<DepthInfo> protobufList = this.buy_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.buy_ = GeneratedMessageLite.mutableCopy(protobufList);
        }

        private void ensureSellIsMutable() {
            Internal.ProtobufList<DepthInfo> protobufList = this.sell_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.sell_ = GeneratedMessageLite.mutableCopy(protobufList);
        }

        public static RecDepthInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static RecDepthInfo parseDelimitedFrom(InputStream inputStream) {
            return (RecDepthInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static RecDepthInfo parseFrom(ByteBuffer byteBuffer) {
            return (RecDepthInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<RecDepthInfo> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void removeBuy(int i) {
            ensureBuyIsMutable();
            this.buy_.remove(i);
        }

        private void removeSell(int i) {
            ensureSellIsMutable();
            this.sell_.remove(i);
        }

        private void setBuy(int i, DepthInfo depthInfo) {
            depthInfo.getClass();
            ensureBuyIsMutable();
            this.buy_.set(i, depthInfo);
        }

        private void setSell(int i, DepthInfo depthInfo) {
            depthInfo.getClass();
            ensureSellIsMutable();
            this.sell_.set(i, depthInfo);
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (C50681.f43542xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new RecDepthInfo();
                case 2:
                    return new Builder(null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002\u001b", new Object[]{"buy_", DepthInfo.class, "sell_", DepthInfo.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<RecDepthInfo> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (RecDepthInfo.class) {
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

        @Override // flash.kline.v1.FlashProto.RecDepthInfoOrBuilder
        public DepthInfo getBuy(int i) {
            return this.buy_.get(i);
        }

        @Override // flash.kline.v1.FlashProto.RecDepthInfoOrBuilder
        public int getBuyCount() {
            return this.buy_.size();
        }

        @Override // flash.kline.v1.FlashProto.RecDepthInfoOrBuilder
        public List<DepthInfo> getBuyList() {
            return this.buy_;
        }

        public DepthInfoOrBuilder getBuyOrBuilder(int i) {
            return this.buy_.get(i);
        }

        public List<? extends DepthInfoOrBuilder> getBuyOrBuilderList() {
            return this.buy_;
        }

        @Override // flash.kline.v1.FlashProto.RecDepthInfoOrBuilder
        public DepthInfo getSell(int i) {
            return this.sell_.get(i);
        }

        @Override // flash.kline.v1.FlashProto.RecDepthInfoOrBuilder
        public int getSellCount() {
            return this.sell_.size();
        }

        @Override // flash.kline.v1.FlashProto.RecDepthInfoOrBuilder
        public List<DepthInfo> getSellList() {
            return this.sell_;
        }

        public DepthInfoOrBuilder getSellOrBuilder(int i) {
            return this.sell_.get(i);
        }

        public List<? extends DepthInfoOrBuilder> getSellOrBuilderList() {
            return this.sell_;
        }

        public static Builder newBuilder(RecDepthInfo recDepthInfo) {
            return DEFAULT_INSTANCE.createBuilder(recDepthInfo);
        }

        public static RecDepthInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (RecDepthInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static RecDepthInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (RecDepthInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static RecDepthInfo parseFrom(ByteString byteString) {
            return (RecDepthInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        private void addBuy(int i, DepthInfo depthInfo) {
            depthInfo.getClass();
            ensureBuyIsMutable();
            this.buy_.add(i, depthInfo);
        }

        private void addSell(int i, DepthInfo depthInfo) {
            depthInfo.getClass();
            ensureSellIsMutable();
            this.sell_.add(i, depthInfo);
        }

        public static RecDepthInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (RecDepthInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static RecDepthInfo parseFrom(byte[] bArr) {
            return (RecDepthInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static RecDepthInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (RecDepthInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static RecDepthInfo parseFrom(InputStream inputStream) {
            return (RecDepthInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static RecDepthInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (RecDepthInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static RecDepthInfo parseFrom(CodedInputStream codedInputStream) {
            return (RecDepthInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static RecDepthInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (RecDepthInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public interface RecDepthInfoOrBuilder extends MessageLiteOrBuilder {
        DepthInfo getBuy(int i);

        int getBuyCount();

        List<DepthInfo> getBuyList();

        DepthInfo getSell(int i);

        int getSellCount();

        List<DepthInfo> getSellList();
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class RecKlineData extends GeneratedMessageLite<RecKlineData, Builder> implements RecKlineDataOrBuilder {
        private static final RecKlineData DEFAULT_INSTANCE;
        public static final int KLINE_INFOS_FIELD_NUMBER = 2;
        private static volatile Parser<RecKlineData> PARSER = null;
        public static final int SYMBOL_FIELD_NUMBER = 3;
        public static final int TIME_FIELD_NUMBER = 1;
        private Internal.ProtobufList<KlineInfo> klineInfos_ = GeneratedMessageLite.emptyProtobufList();
        private String symbol_ = "";
        private long time_;

        /* JADX INFO: compiled from: Proguard */
        public static final class Builder extends GeneratedMessageLite.Builder<RecKlineData, Builder> implements RecKlineDataOrBuilder {
            public /* synthetic */ Builder(C50681 c50681) {
                this();
            }

            public Builder addAllKlineInfos(Iterable<? extends KlineInfo> iterable) {
                copyOnWrite();
                RecKlineData.access$7700((RecKlineData) this.instance, iterable);
                return this;
            }

            public Builder addKlineInfos(KlineInfo klineInfo) {
                copyOnWrite();
                RecKlineData.access$7500((RecKlineData) this.instance, klineInfo);
                return this;
            }

            public Builder clearKlineInfos() {
                copyOnWrite();
                RecKlineData.access$7800((RecKlineData) this.instance);
                return this;
            }

            public Builder clearSymbol() {
                copyOnWrite();
                RecKlineData.access$8100((RecKlineData) this.instance);
                return this;
            }

            public Builder clearTime() {
                copyOnWrite();
                RecKlineData.access$7300((RecKlineData) this.instance);
                return this;
            }

            @Override // flash.kline.v1.FlashProto.RecKlineDataOrBuilder
            public KlineInfo getKlineInfos(int i) {
                return ((RecKlineData) this.instance).getKlineInfos(i);
            }

            @Override // flash.kline.v1.FlashProto.RecKlineDataOrBuilder
            public int getKlineInfosCount() {
                return ((RecKlineData) this.instance).getKlineInfosCount();
            }

            @Override // flash.kline.v1.FlashProto.RecKlineDataOrBuilder
            public List<KlineInfo> getKlineInfosList() {
                return Collections.unmodifiableList(((RecKlineData) this.instance).getKlineInfosList());
            }

            @Override // flash.kline.v1.FlashProto.RecKlineDataOrBuilder
            public String getSymbol() {
                return ((RecKlineData) this.instance).getSymbol();
            }

            @Override // flash.kline.v1.FlashProto.RecKlineDataOrBuilder
            public ByteString getSymbolBytes() {
                return ((RecKlineData) this.instance).getSymbolBytes();
            }

            @Override // flash.kline.v1.FlashProto.RecKlineDataOrBuilder
            public long getTime() {
                return ((RecKlineData) this.instance).getTime();
            }

            public Builder removeKlineInfos(int i) {
                copyOnWrite();
                RecKlineData.access$7900((RecKlineData) this.instance, i);
                return this;
            }

            public Builder setKlineInfos(int i, KlineInfo klineInfo) {
                copyOnWrite();
                RecKlineData.access$7400((RecKlineData) this.instance, i, klineInfo);
                return this;
            }

            public Builder setSymbol(String str) {
                copyOnWrite();
                RecKlineData.access$8000((RecKlineData) this.instance, str);
                return this;
            }

            public Builder setSymbolBytes(ByteString byteString) {
                copyOnWrite();
                RecKlineData.access$8200((RecKlineData) this.instance, byteString);
                return this;
            }

            public Builder setTime(long j) {
                copyOnWrite();
                RecKlineData.access$7200((RecKlineData) this.instance, j);
                return this;
            }

            private Builder() {
                super(RecKlineData.access$7100());
            }

            public Builder addKlineInfos(int i, KlineInfo klineInfo) {
                copyOnWrite();
                RecKlineData.access$7600((RecKlineData) this.instance, i, klineInfo);
                return this;
            }

            public Builder setKlineInfos(int i, KlineInfo.Builder builder) {
                copyOnWrite();
                RecKlineData.access$7400((RecKlineData) this.instance, i, builder.build());
                return this;
            }

            public Builder addKlineInfos(KlineInfo.Builder builder) {
                copyOnWrite();
                RecKlineData.access$7500((RecKlineData) this.instance, builder.build());
                return this;
            }

            public Builder addKlineInfos(int i, KlineInfo.Builder builder) {
                copyOnWrite();
                RecKlineData.access$7600((RecKlineData) this.instance, i, builder.build());
                return this;
            }
        }

        static {
            RecKlineData recKlineData = new RecKlineData();
            DEFAULT_INSTANCE = recKlineData;
            GeneratedMessageLite.registerDefaultInstance(RecKlineData.class, recKlineData);
        }

        private RecKlineData() {
        }

        public static /* synthetic */ RecKlineData access$7100() {
            return DEFAULT_INSTANCE;
        }

        public static /* synthetic */ void access$7200(RecKlineData recKlineData, long j) {
            recKlineData.setTime(j);
        }

        public static /* synthetic */ void access$7300(RecKlineData recKlineData) {
            recKlineData.clearTime();
        }

        public static /* synthetic */ void access$7400(RecKlineData recKlineData, int i, KlineInfo klineInfo) {
            recKlineData.setKlineInfos(i, klineInfo);
        }

        public static /* synthetic */ void access$7500(RecKlineData recKlineData, KlineInfo klineInfo) {
            recKlineData.addKlineInfos(klineInfo);
        }

        public static /* synthetic */ void access$7600(RecKlineData recKlineData, int i, KlineInfo klineInfo) {
            recKlineData.addKlineInfos(i, klineInfo);
        }

        public static /* synthetic */ void access$7700(RecKlineData recKlineData, Iterable iterable) {
            recKlineData.addAllKlineInfos(iterable);
        }

        public static /* synthetic */ void access$7800(RecKlineData recKlineData) {
            recKlineData.clearKlineInfos();
        }

        public static /* synthetic */ void access$7900(RecKlineData recKlineData, int i) {
            recKlineData.removeKlineInfos(i);
        }

        public static /* synthetic */ void access$8000(RecKlineData recKlineData, String str) {
            recKlineData.setSymbol(str);
        }

        public static /* synthetic */ void access$8100(RecKlineData recKlineData) {
            recKlineData.clearSymbol();
        }

        public static /* synthetic */ void access$8200(RecKlineData recKlineData, ByteString byteString) {
            recKlineData.setSymbolBytes(byteString);
        }

        private void addAllKlineInfos(Iterable<? extends KlineInfo> iterable) {
            ensureKlineInfosIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.klineInfos_);
        }

        private void addKlineInfos(KlineInfo klineInfo) {
            klineInfo.getClass();
            ensureKlineInfosIsMutable();
            this.klineInfos_.add(klineInfo);
        }

        private void clearKlineInfos() {
            this.klineInfos_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void clearSymbol() {
            this.symbol_ = getDefaultInstance().getSymbol();
        }

        private void clearTime() {
            this.time_ = 0L;
        }

        private void ensureKlineInfosIsMutable() {
            Internal.ProtobufList<KlineInfo> protobufList = this.klineInfos_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.klineInfos_ = GeneratedMessageLite.mutableCopy(protobufList);
        }

        public static RecKlineData getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static RecKlineData parseDelimitedFrom(InputStream inputStream) {
            return (RecKlineData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static RecKlineData parseFrom(ByteBuffer byteBuffer) {
            return (RecKlineData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<RecKlineData> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void removeKlineInfos(int i) {
            ensureKlineInfosIsMutable();
            this.klineInfos_.remove(i);
        }

        private void setKlineInfos(int i, KlineInfo klineInfo) {
            klineInfo.getClass();
            ensureKlineInfosIsMutable();
            this.klineInfos_.set(i, klineInfo);
        }

        private void setSymbol(String str) {
            str.getClass();
            this.symbol_ = str;
        }

        private void setSymbolBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.symbol_ = byteString.toStringUtf8();
        }

        private void setTime(long j) {
            this.time_ = j;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (C50681.f43542xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new RecKlineData();
                case 2:
                    return new Builder(null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u0002\u0002\u001b\u0003Ȉ", new Object[]{"time_", "klineInfos_", KlineInfo.class, "symbol_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<RecKlineData> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (RecKlineData.class) {
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

        @Override // flash.kline.v1.FlashProto.RecKlineDataOrBuilder
        public KlineInfo getKlineInfos(int i) {
            return this.klineInfos_.get(i);
        }

        @Override // flash.kline.v1.FlashProto.RecKlineDataOrBuilder
        public int getKlineInfosCount() {
            return this.klineInfos_.size();
        }

        @Override // flash.kline.v1.FlashProto.RecKlineDataOrBuilder
        public List<KlineInfo> getKlineInfosList() {
            return this.klineInfos_;
        }

        public KlineInfoOrBuilder getKlineInfosOrBuilder(int i) {
            return this.klineInfos_.get(i);
        }

        public List<? extends KlineInfoOrBuilder> getKlineInfosOrBuilderList() {
            return this.klineInfos_;
        }

        @Override // flash.kline.v1.FlashProto.RecKlineDataOrBuilder
        public String getSymbol() {
            return this.symbol_;
        }

        @Override // flash.kline.v1.FlashProto.RecKlineDataOrBuilder
        public ByteString getSymbolBytes() {
            return ByteString.copyFromUtf8(this.symbol_);
        }

        @Override // flash.kline.v1.FlashProto.RecKlineDataOrBuilder
        public long getTime() {
            return this.time_;
        }

        public static Builder newBuilder(RecKlineData recKlineData) {
            return DEFAULT_INSTANCE.createBuilder(recKlineData);
        }

        public static RecKlineData parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (RecKlineData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static RecKlineData parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (RecKlineData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static RecKlineData parseFrom(ByteString byteString) {
            return (RecKlineData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        private void addKlineInfos(int i, KlineInfo klineInfo) {
            klineInfo.getClass();
            ensureKlineInfosIsMutable();
            this.klineInfos_.add(i, klineInfo);
        }

        public static RecKlineData parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (RecKlineData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static RecKlineData parseFrom(byte[] bArr) {
            return (RecKlineData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static RecKlineData parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (RecKlineData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static RecKlineData parseFrom(InputStream inputStream) {
            return (RecKlineData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static RecKlineData parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (RecKlineData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static RecKlineData parseFrom(CodedInputStream codedInputStream) {
            return (RecKlineData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static RecKlineData parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (RecKlineData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public interface RecKlineDataOrBuilder extends MessageLiteOrBuilder {
        KlineInfo getKlineInfos(int i);

        int getKlineInfosCount();

        List<KlineInfo> getKlineInfosList();

        String getSymbol();

        ByteString getSymbolBytes();

        long getTime();
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class RecTickerData extends GeneratedMessageLite<RecTickerData, Builder> implements RecTickerDataOrBuilder {
        private static final RecTickerData DEFAULT_INSTANCE;
        private static volatile Parser<RecTickerData> PARSER = null;
        public static final int TICKER_INFOS_FIELD_NUMBER = 2;
        public static final int TIME_FIELD_NUMBER = 1;
        private Internal.ProtobufList<TickerInfo> tickerInfos_ = GeneratedMessageLite.emptyProtobufList();
        private long time_;

        /* JADX INFO: compiled from: Proguard */
        public static final class Builder extends GeneratedMessageLite.Builder<RecTickerData, Builder> implements RecTickerDataOrBuilder {
            public /* synthetic */ Builder(C50681 c50681) {
                this();
            }

            public Builder addAllTickerInfos(Iterable<? extends TickerInfo> iterable) {
                copyOnWrite();
                RecTickerData.access$3800((RecTickerData) this.instance, iterable);
                return this;
            }

            public Builder addTickerInfos(TickerInfo tickerInfo) {
                copyOnWrite();
                RecTickerData.access$3600((RecTickerData) this.instance, tickerInfo);
                return this;
            }

            public Builder clearTickerInfos() {
                copyOnWrite();
                RecTickerData.access$3900((RecTickerData) this.instance);
                return this;
            }

            public Builder clearTime() {
                copyOnWrite();
                RecTickerData.access$3400((RecTickerData) this.instance);
                return this;
            }

            @Override // flash.kline.v1.FlashProto.RecTickerDataOrBuilder
            public TickerInfo getTickerInfos(int i) {
                return ((RecTickerData) this.instance).getTickerInfos(i);
            }

            @Override // flash.kline.v1.FlashProto.RecTickerDataOrBuilder
            public int getTickerInfosCount() {
                return ((RecTickerData) this.instance).getTickerInfosCount();
            }

            @Override // flash.kline.v1.FlashProto.RecTickerDataOrBuilder
            public List<TickerInfo> getTickerInfosList() {
                return Collections.unmodifiableList(((RecTickerData) this.instance).getTickerInfosList());
            }

            @Override // flash.kline.v1.FlashProto.RecTickerDataOrBuilder
            public long getTime() {
                return ((RecTickerData) this.instance).getTime();
            }

            public Builder removeTickerInfos(int i) {
                copyOnWrite();
                RecTickerData.access$4000((RecTickerData) this.instance, i);
                return this;
            }

            public Builder setTickerInfos(int i, TickerInfo tickerInfo) {
                copyOnWrite();
                RecTickerData.access$3500((RecTickerData) this.instance, i, tickerInfo);
                return this;
            }

            public Builder setTime(long j) {
                copyOnWrite();
                RecTickerData.access$3300((RecTickerData) this.instance, j);
                return this;
            }

            private Builder() {
                super(RecTickerData.access$3200());
            }

            public Builder addTickerInfos(int i, TickerInfo tickerInfo) {
                copyOnWrite();
                RecTickerData.access$3700((RecTickerData) this.instance, i, tickerInfo);
                return this;
            }

            public Builder setTickerInfos(int i, TickerInfo.Builder builder) {
                copyOnWrite();
                RecTickerData.access$3500((RecTickerData) this.instance, i, builder.build());
                return this;
            }

            public Builder addTickerInfos(TickerInfo.Builder builder) {
                copyOnWrite();
                RecTickerData.access$3600((RecTickerData) this.instance, builder.build());
                return this;
            }

            public Builder addTickerInfos(int i, TickerInfo.Builder builder) {
                copyOnWrite();
                RecTickerData.access$3700((RecTickerData) this.instance, i, builder.build());
                return this;
            }
        }

        static {
            RecTickerData recTickerData = new RecTickerData();
            DEFAULT_INSTANCE = recTickerData;
            GeneratedMessageLite.registerDefaultInstance(RecTickerData.class, recTickerData);
        }

        private RecTickerData() {
        }

        public static /* synthetic */ RecTickerData access$3200() {
            return DEFAULT_INSTANCE;
        }

        public static /* synthetic */ void access$3300(RecTickerData recTickerData, long j) {
            recTickerData.setTime(j);
        }

        public static /* synthetic */ void access$3400(RecTickerData recTickerData) {
            recTickerData.clearTime();
        }

        public static /* synthetic */ void access$3500(RecTickerData recTickerData, int i, TickerInfo tickerInfo) {
            recTickerData.setTickerInfos(i, tickerInfo);
        }

        public static /* synthetic */ void access$3600(RecTickerData recTickerData, TickerInfo tickerInfo) {
            recTickerData.addTickerInfos(tickerInfo);
        }

        public static /* synthetic */ void access$3700(RecTickerData recTickerData, int i, TickerInfo tickerInfo) {
            recTickerData.addTickerInfos(i, tickerInfo);
        }

        public static /* synthetic */ void access$3800(RecTickerData recTickerData, Iterable iterable) {
            recTickerData.addAllTickerInfos(iterable);
        }

        public static /* synthetic */ void access$3900(RecTickerData recTickerData) {
            recTickerData.clearTickerInfos();
        }

        public static /* synthetic */ void access$4000(RecTickerData recTickerData, int i) {
            recTickerData.removeTickerInfos(i);
        }

        private void addAllTickerInfos(Iterable<? extends TickerInfo> iterable) {
            ensureTickerInfosIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.tickerInfos_);
        }

        private void addTickerInfos(TickerInfo tickerInfo) {
            tickerInfo.getClass();
            ensureTickerInfosIsMutable();
            this.tickerInfos_.add(tickerInfo);
        }

        private void clearTickerInfos() {
            this.tickerInfos_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void clearTime() {
            this.time_ = 0L;
        }

        private void ensureTickerInfosIsMutable() {
            Internal.ProtobufList<TickerInfo> protobufList = this.tickerInfos_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.tickerInfos_ = GeneratedMessageLite.mutableCopy(protobufList);
        }

        public static RecTickerData getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static RecTickerData parseDelimitedFrom(InputStream inputStream) {
            return (RecTickerData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static RecTickerData parseFrom(ByteBuffer byteBuffer) {
            return (RecTickerData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<RecTickerData> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void removeTickerInfos(int i) {
            ensureTickerInfosIsMutable();
            this.tickerInfos_.remove(i);
        }

        private void setTickerInfos(int i, TickerInfo tickerInfo) {
            tickerInfo.getClass();
            ensureTickerInfosIsMutable();
            this.tickerInfos_.set(i, tickerInfo);
        }

        private void setTime(long j) {
            this.time_ = j;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (C50681.f43542xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new RecTickerData();
                case 2:
                    return new Builder(null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u0002\u0002\u001b", new Object[]{"time_", "tickerInfos_", TickerInfo.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<RecTickerData> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (RecTickerData.class) {
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

        @Override // flash.kline.v1.FlashProto.RecTickerDataOrBuilder
        public TickerInfo getTickerInfos(int i) {
            return this.tickerInfos_.get(i);
        }

        @Override // flash.kline.v1.FlashProto.RecTickerDataOrBuilder
        public int getTickerInfosCount() {
            return this.tickerInfos_.size();
        }

        @Override // flash.kline.v1.FlashProto.RecTickerDataOrBuilder
        public List<TickerInfo> getTickerInfosList() {
            return this.tickerInfos_;
        }

        public TickerInfoOrBuilder getTickerInfosOrBuilder(int i) {
            return this.tickerInfos_.get(i);
        }

        public List<? extends TickerInfoOrBuilder> getTickerInfosOrBuilderList() {
            return this.tickerInfos_;
        }

        @Override // flash.kline.v1.FlashProto.RecTickerDataOrBuilder
        public long getTime() {
            return this.time_;
        }

        public static Builder newBuilder(RecTickerData recTickerData) {
            return DEFAULT_INSTANCE.createBuilder(recTickerData);
        }

        public static RecTickerData parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (RecTickerData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static RecTickerData parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (RecTickerData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static RecTickerData parseFrom(ByteString byteString) {
            return (RecTickerData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        private void addTickerInfos(int i, TickerInfo tickerInfo) {
            tickerInfo.getClass();
            ensureTickerInfosIsMutable();
            this.tickerInfos_.add(i, tickerInfo);
        }

        public static RecTickerData parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (RecTickerData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static RecTickerData parseFrom(byte[] bArr) {
            return (RecTickerData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static RecTickerData parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (RecTickerData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static RecTickerData parseFrom(InputStream inputStream) {
            return (RecTickerData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static RecTickerData parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (RecTickerData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static RecTickerData parseFrom(CodedInputStream codedInputStream) {
            return (RecTickerData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static RecTickerData parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (RecTickerData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public interface RecTickerDataOrBuilder extends MessageLiteOrBuilder {
        TickerInfo getTickerInfos(int i);

        int getTickerInfosCount();

        List<TickerInfo> getTickerInfosList();

        long getTime();
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class RecTimeData extends GeneratedMessageLite<RecTimeData, Builder> implements RecTimeDataOrBuilder {
        private static final RecTimeData DEFAULT_INSTANCE;
        public static final int LISTS_FIELD_NUMBER = 2;
        private static volatile Parser<RecTimeData> PARSER = null;
        public static final int SYMBOL_FIELD_NUMBER = 3;
        public static final int TIME_FIELD_NUMBER = 1;
        private Internal.ProtobufList<TimeData> lists_ = GeneratedMessageLite.emptyProtobufList();
        private String symbol_ = "";
        private long time_;

        /* JADX INFO: compiled from: Proguard */
        public static final class Builder extends GeneratedMessageLite.Builder<RecTimeData, Builder> implements RecTimeDataOrBuilder {
            public /* synthetic */ Builder(C50681 c50681) {
                this();
            }

            public Builder addAllLists(Iterable<? extends TimeData> iterable) {
                copyOnWrite();
                RecTimeData.access$10800((RecTimeData) this.instance, iterable);
                return this;
            }

            public Builder addLists(TimeData timeData) {
                copyOnWrite();
                RecTimeData.access$10600((RecTimeData) this.instance, timeData);
                return this;
            }

            public Builder clearLists() {
                copyOnWrite();
                RecTimeData.access$10900((RecTimeData) this.instance);
                return this;
            }

            public Builder clearSymbol() {
                copyOnWrite();
                RecTimeData.access$11200((RecTimeData) this.instance);
                return this;
            }

            public Builder clearTime() {
                copyOnWrite();
                RecTimeData.access$10400((RecTimeData) this.instance);
                return this;
            }

            @Override // flash.kline.v1.FlashProto.RecTimeDataOrBuilder
            public TimeData getLists(int i) {
                return ((RecTimeData) this.instance).getLists(i);
            }

            @Override // flash.kline.v1.FlashProto.RecTimeDataOrBuilder
            public int getListsCount() {
                return ((RecTimeData) this.instance).getListsCount();
            }

            @Override // flash.kline.v1.FlashProto.RecTimeDataOrBuilder
            public List<TimeData> getListsList() {
                return Collections.unmodifiableList(((RecTimeData) this.instance).getListsList());
            }

            @Override // flash.kline.v1.FlashProto.RecTimeDataOrBuilder
            public String getSymbol() {
                return ((RecTimeData) this.instance).getSymbol();
            }

            @Override // flash.kline.v1.FlashProto.RecTimeDataOrBuilder
            public ByteString getSymbolBytes() {
                return ((RecTimeData) this.instance).getSymbolBytes();
            }

            @Override // flash.kline.v1.FlashProto.RecTimeDataOrBuilder
            public long getTime() {
                return ((RecTimeData) this.instance).getTime();
            }

            public Builder removeLists(int i) {
                copyOnWrite();
                RecTimeData.access$11000((RecTimeData) this.instance, i);
                return this;
            }

            public Builder setLists(int i, TimeData timeData) {
                copyOnWrite();
                RecTimeData.access$10500((RecTimeData) this.instance, i, timeData);
                return this;
            }

            public Builder setSymbol(String str) {
                copyOnWrite();
                RecTimeData.access$11100((RecTimeData) this.instance, str);
                return this;
            }

            public Builder setSymbolBytes(ByteString byteString) {
                copyOnWrite();
                RecTimeData.access$11300((RecTimeData) this.instance, byteString);
                return this;
            }

            public Builder setTime(long j) {
                copyOnWrite();
                RecTimeData.access$10300((RecTimeData) this.instance, j);
                return this;
            }

            private Builder() {
                super(RecTimeData.access$10200());
            }

            public Builder addLists(int i, TimeData timeData) {
                copyOnWrite();
                RecTimeData.access$10700((RecTimeData) this.instance, i, timeData);
                return this;
            }

            public Builder setLists(int i, TimeData.Builder builder) {
                copyOnWrite();
                RecTimeData.access$10500((RecTimeData) this.instance, i, builder.build());
                return this;
            }

            public Builder addLists(TimeData.Builder builder) {
                copyOnWrite();
                RecTimeData.access$10600((RecTimeData) this.instance, builder.build());
                return this;
            }

            public Builder addLists(int i, TimeData.Builder builder) {
                copyOnWrite();
                RecTimeData.access$10700((RecTimeData) this.instance, i, builder.build());
                return this;
            }
        }

        static {
            RecTimeData recTimeData = new RecTimeData();
            DEFAULT_INSTANCE = recTimeData;
            GeneratedMessageLite.registerDefaultInstance(RecTimeData.class, recTimeData);
        }

        private RecTimeData() {
        }

        public static /* synthetic */ RecTimeData access$10200() {
            return DEFAULT_INSTANCE;
        }

        public static /* synthetic */ void access$10300(RecTimeData recTimeData, long j) {
            recTimeData.setTime(j);
        }

        public static /* synthetic */ void access$10400(RecTimeData recTimeData) {
            recTimeData.clearTime();
        }

        public static /* synthetic */ void access$10500(RecTimeData recTimeData, int i, TimeData timeData) {
            recTimeData.setLists(i, timeData);
        }

        public static /* synthetic */ void access$10600(RecTimeData recTimeData, TimeData timeData) {
            recTimeData.addLists(timeData);
        }

        public static /* synthetic */ void access$10700(RecTimeData recTimeData, int i, TimeData timeData) {
            recTimeData.addLists(i, timeData);
        }

        public static /* synthetic */ void access$10800(RecTimeData recTimeData, Iterable iterable) {
            recTimeData.addAllLists(iterable);
        }

        public static /* synthetic */ void access$10900(RecTimeData recTimeData) {
            recTimeData.clearLists();
        }

        public static /* synthetic */ void access$11000(RecTimeData recTimeData, int i) {
            recTimeData.removeLists(i);
        }

        public static /* synthetic */ void access$11100(RecTimeData recTimeData, String str) {
            recTimeData.setSymbol(str);
        }

        public static /* synthetic */ void access$11200(RecTimeData recTimeData) {
            recTimeData.clearSymbol();
        }

        public static /* synthetic */ void access$11300(RecTimeData recTimeData, ByteString byteString) {
            recTimeData.setSymbolBytes(byteString);
        }

        private void addAllLists(Iterable<? extends TimeData> iterable) {
            ensureListsIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.lists_);
        }

        private void addLists(TimeData timeData) {
            timeData.getClass();
            ensureListsIsMutable();
            this.lists_.add(timeData);
        }

        private void clearLists() {
            this.lists_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void clearSymbol() {
            this.symbol_ = getDefaultInstance().getSymbol();
        }

        private void clearTime() {
            this.time_ = 0L;
        }

        private void ensureListsIsMutable() {
            Internal.ProtobufList<TimeData> protobufList = this.lists_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.lists_ = GeneratedMessageLite.mutableCopy(protobufList);
        }

        public static RecTimeData getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static RecTimeData parseDelimitedFrom(InputStream inputStream) {
            return (RecTimeData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static RecTimeData parseFrom(ByteBuffer byteBuffer) {
            return (RecTimeData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<RecTimeData> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void removeLists(int i) {
            ensureListsIsMutable();
            this.lists_.remove(i);
        }

        private void setLists(int i, TimeData timeData) {
            timeData.getClass();
            ensureListsIsMutable();
            this.lists_.set(i, timeData);
        }

        private void setSymbol(String str) {
            str.getClass();
            this.symbol_ = str;
        }

        private void setSymbolBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.symbol_ = byteString.toStringUtf8();
        }

        private void setTime(long j) {
            this.time_ = j;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (C50681.f43542xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new RecTimeData();
                case 2:
                    return new Builder(null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u0002\u0002\u001b\u0003Ȉ", new Object[]{"time_", "lists_", TimeData.class, "symbol_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<RecTimeData> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (RecTimeData.class) {
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

        @Override // flash.kline.v1.FlashProto.RecTimeDataOrBuilder
        public TimeData getLists(int i) {
            return this.lists_.get(i);
        }

        @Override // flash.kline.v1.FlashProto.RecTimeDataOrBuilder
        public int getListsCount() {
            return this.lists_.size();
        }

        @Override // flash.kline.v1.FlashProto.RecTimeDataOrBuilder
        public List<TimeData> getListsList() {
            return this.lists_;
        }

        public TimeDataOrBuilder getListsOrBuilder(int i) {
            return this.lists_.get(i);
        }

        public List<? extends TimeDataOrBuilder> getListsOrBuilderList() {
            return this.lists_;
        }

        @Override // flash.kline.v1.FlashProto.RecTimeDataOrBuilder
        public String getSymbol() {
            return this.symbol_;
        }

        @Override // flash.kline.v1.FlashProto.RecTimeDataOrBuilder
        public ByteString getSymbolBytes() {
            return ByteString.copyFromUtf8(this.symbol_);
        }

        @Override // flash.kline.v1.FlashProto.RecTimeDataOrBuilder
        public long getTime() {
            return this.time_;
        }

        public static Builder newBuilder(RecTimeData recTimeData) {
            return DEFAULT_INSTANCE.createBuilder(recTimeData);
        }

        public static RecTimeData parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (RecTimeData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static RecTimeData parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (RecTimeData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static RecTimeData parseFrom(ByteString byteString) {
            return (RecTimeData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        private void addLists(int i, TimeData timeData) {
            timeData.getClass();
            ensureListsIsMutable();
            this.lists_.add(i, timeData);
        }

        public static RecTimeData parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (RecTimeData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static RecTimeData parseFrom(byte[] bArr) {
            return (RecTimeData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static RecTimeData parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (RecTimeData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static RecTimeData parseFrom(InputStream inputStream) {
            return (RecTimeData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static RecTimeData parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (RecTimeData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static RecTimeData parseFrom(CodedInputStream codedInputStream) {
            return (RecTimeData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static RecTimeData parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (RecTimeData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public interface RecTimeDataOrBuilder extends MessageLiteOrBuilder {
        TimeData getLists(int i);

        int getListsCount();

        List<TimeData> getListsList();

        String getSymbol();

        ByteString getSymbolBytes();

        long getTime();
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class SendSubscribeDepth extends GeneratedMessageLite<SendSubscribeDepth, Builder> implements SendSubscribeDepthOrBuilder {
        private static final SendSubscribeDepth DEFAULT_INSTANCE;
        private static volatile Parser<SendSubscribeDepth> PARSER = null;
        public static final int PLATFORM_FIELD_NUMBER = 2;
        public static final int SYMBOL_FIELD_NUMBER = 1;
        public static final int USERID_FIELD_NUMBER = 3;
        private long userId_;
        private String symbol_ = "";
        private String platform_ = "";

        /* JADX INFO: compiled from: Proguard */
        public static final class Builder extends GeneratedMessageLite.Builder<SendSubscribeDepth, Builder> implements SendSubscribeDepthOrBuilder {
            public /* synthetic */ Builder(C50681 c50681) {
                this();
            }

            public Builder clearPlatform() {
                copyOnWrite();
                SendSubscribeDepth.access$13100((SendSubscribeDepth) this.instance);
                return this;
            }

            public Builder clearSymbol() {
                copyOnWrite();
                SendSubscribeDepth.access$12800((SendSubscribeDepth) this.instance);
                return this;
            }

            public Builder clearUserId() {
                copyOnWrite();
                SendSubscribeDepth.access$13400((SendSubscribeDepth) this.instance);
                return this;
            }

            @Override // flash.kline.v1.FlashProto.SendSubscribeDepthOrBuilder
            public String getPlatform() {
                return ((SendSubscribeDepth) this.instance).getPlatform();
            }

            @Override // flash.kline.v1.FlashProto.SendSubscribeDepthOrBuilder
            public ByteString getPlatformBytes() {
                return ((SendSubscribeDepth) this.instance).getPlatformBytes();
            }

            @Override // flash.kline.v1.FlashProto.SendSubscribeDepthOrBuilder
            public String getSymbol() {
                return ((SendSubscribeDepth) this.instance).getSymbol();
            }

            @Override // flash.kline.v1.FlashProto.SendSubscribeDepthOrBuilder
            public ByteString getSymbolBytes() {
                return ((SendSubscribeDepth) this.instance).getSymbolBytes();
            }

            @Override // flash.kline.v1.FlashProto.SendSubscribeDepthOrBuilder
            public long getUserId() {
                return ((SendSubscribeDepth) this.instance).getUserId();
            }

            public Builder setPlatform(String str) {
                copyOnWrite();
                SendSubscribeDepth.access$13000((SendSubscribeDepth) this.instance, str);
                return this;
            }

            public Builder setPlatformBytes(ByteString byteString) {
                copyOnWrite();
                SendSubscribeDepth.access$13200((SendSubscribeDepth) this.instance, byteString);
                return this;
            }

            public Builder setSymbol(String str) {
                copyOnWrite();
                SendSubscribeDepth.access$12700((SendSubscribeDepth) this.instance, str);
                return this;
            }

            public Builder setSymbolBytes(ByteString byteString) {
                copyOnWrite();
                SendSubscribeDepth.access$12900((SendSubscribeDepth) this.instance, byteString);
                return this;
            }

            public Builder setUserId(long j) {
                copyOnWrite();
                SendSubscribeDepth.access$13300((SendSubscribeDepth) this.instance, j);
                return this;
            }

            private Builder() {
                super(SendSubscribeDepth.access$12600());
            }
        }

        static {
            SendSubscribeDepth sendSubscribeDepth = new SendSubscribeDepth();
            DEFAULT_INSTANCE = sendSubscribeDepth;
            GeneratedMessageLite.registerDefaultInstance(SendSubscribeDepth.class, sendSubscribeDepth);
        }

        private SendSubscribeDepth() {
        }

        public static /* synthetic */ SendSubscribeDepth access$12600() {
            return DEFAULT_INSTANCE;
        }

        public static /* synthetic */ void access$12700(SendSubscribeDepth sendSubscribeDepth, String str) {
            sendSubscribeDepth.setSymbol(str);
        }

        public static /* synthetic */ void access$12800(SendSubscribeDepth sendSubscribeDepth) {
            sendSubscribeDepth.clearSymbol();
        }

        public static /* synthetic */ void access$12900(SendSubscribeDepth sendSubscribeDepth, ByteString byteString) {
            sendSubscribeDepth.setSymbolBytes(byteString);
        }

        public static /* synthetic */ void access$13000(SendSubscribeDepth sendSubscribeDepth, String str) {
            sendSubscribeDepth.setPlatform(str);
        }

        public static /* synthetic */ void access$13100(SendSubscribeDepth sendSubscribeDepth) {
            sendSubscribeDepth.clearPlatform();
        }

        public static /* synthetic */ void access$13200(SendSubscribeDepth sendSubscribeDepth, ByteString byteString) {
            sendSubscribeDepth.setPlatformBytes(byteString);
        }

        public static /* synthetic */ void access$13300(SendSubscribeDepth sendSubscribeDepth, long j) {
            sendSubscribeDepth.setUserId(j);
        }

        public static /* synthetic */ void access$13400(SendSubscribeDepth sendSubscribeDepth) {
            sendSubscribeDepth.clearUserId();
        }

        private void clearPlatform() {
            this.platform_ = getDefaultInstance().getPlatform();
        }

        private void clearSymbol() {
            this.symbol_ = getDefaultInstance().getSymbol();
        }

        private void clearUserId() {
            this.userId_ = 0L;
        }

        public static SendSubscribeDepth getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static SendSubscribeDepth parseDelimitedFrom(InputStream inputStream) {
            return (SendSubscribeDepth) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SendSubscribeDepth parseFrom(ByteBuffer byteBuffer) {
            return (SendSubscribeDepth) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<SendSubscribeDepth> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setPlatform(String str) {
            str.getClass();
            this.platform_ = str;
        }

        private void setPlatformBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.platform_ = byteString.toStringUtf8();
        }

        private void setSymbol(String str) {
            str.getClass();
            this.symbol_ = str;
        }

        private void setSymbolBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.symbol_ = byteString.toStringUtf8();
        }

        private void setUserId(long j) {
            this.userId_ = j;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (C50681.f43542xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new SendSubscribeDepth();
                case 2:
                    return new Builder(null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u0002", new Object[]{"symbol_", "platform_", "userId_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<SendSubscribeDepth> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (SendSubscribeDepth.class) {
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

        @Override // flash.kline.v1.FlashProto.SendSubscribeDepthOrBuilder
        public String getPlatform() {
            return this.platform_;
        }

        @Override // flash.kline.v1.FlashProto.SendSubscribeDepthOrBuilder
        public ByteString getPlatformBytes() {
            return ByteString.copyFromUtf8(this.platform_);
        }

        @Override // flash.kline.v1.FlashProto.SendSubscribeDepthOrBuilder
        public String getSymbol() {
            return this.symbol_;
        }

        @Override // flash.kline.v1.FlashProto.SendSubscribeDepthOrBuilder
        public ByteString getSymbolBytes() {
            return ByteString.copyFromUtf8(this.symbol_);
        }

        @Override // flash.kline.v1.FlashProto.SendSubscribeDepthOrBuilder
        public long getUserId() {
            return this.userId_;
        }

        public static Builder newBuilder(SendSubscribeDepth sendSubscribeDepth) {
            return DEFAULT_INSTANCE.createBuilder(sendSubscribeDepth);
        }

        public static SendSubscribeDepth parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SendSubscribeDepth) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static SendSubscribeDepth parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (SendSubscribeDepth) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static SendSubscribeDepth parseFrom(ByteString byteString) {
            return (SendSubscribeDepth) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static SendSubscribeDepth parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (SendSubscribeDepth) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static SendSubscribeDepth parseFrom(byte[] bArr) {
            return (SendSubscribeDepth) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static SendSubscribeDepth parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (SendSubscribeDepth) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static SendSubscribeDepth parseFrom(InputStream inputStream) {
            return (SendSubscribeDepth) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SendSubscribeDepth parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SendSubscribeDepth) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static SendSubscribeDepth parseFrom(CodedInputStream codedInputStream) {
            return (SendSubscribeDepth) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static SendSubscribeDepth parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SendSubscribeDepth) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public interface SendSubscribeDepthOrBuilder extends MessageLiteOrBuilder {
        String getPlatform();

        ByteString getPlatformBytes();

        String getSymbol();

        ByteString getSymbolBytes();

        long getUserId();
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class SendSubscribeInfo extends GeneratedMessageLite<SendSubscribeInfo, Builder> implements SendSubscribeInfoOrBuilder {
        private static final SendSubscribeInfo DEFAULT_INSTANCE;
        private static volatile Parser<SendSubscribeInfo> PARSER = null;
        public static final int PERIOD_FIELD_NUMBER = 2;
        public static final int PLATFORM_FIELD_NUMBER = 3;
        public static final int SYMBOL_FIELD_NUMBER = 1;
        public static final int USERID_FIELD_NUMBER = 4;
        private long userId_;
        private String symbol_ = "";
        private String period_ = "";
        private String platform_ = "";

        /* JADX INFO: compiled from: Proguard */
        public static final class Builder extends GeneratedMessageLite.Builder<SendSubscribeInfo, Builder> implements SendSubscribeInfoOrBuilder {
            public /* synthetic */ Builder(C50681 c50681) {
                this();
            }

            public Builder clearPeriod() {
                copyOnWrite();
                SendSubscribeInfo.access$4700((SendSubscribeInfo) this.instance);
                return this;
            }

            public Builder clearPlatform() {
                copyOnWrite();
                SendSubscribeInfo.access$5000((SendSubscribeInfo) this.instance);
                return this;
            }

            public Builder clearSymbol() {
                copyOnWrite();
                SendSubscribeInfo.access$4400((SendSubscribeInfo) this.instance);
                return this;
            }

            public Builder clearUserId() {
                copyOnWrite();
                SendSubscribeInfo.access$5300((SendSubscribeInfo) this.instance);
                return this;
            }

            @Override // flash.kline.v1.FlashProto.SendSubscribeInfoOrBuilder
            public String getPeriod() {
                return ((SendSubscribeInfo) this.instance).getPeriod();
            }

            @Override // flash.kline.v1.FlashProto.SendSubscribeInfoOrBuilder
            public ByteString getPeriodBytes() {
                return ((SendSubscribeInfo) this.instance).getPeriodBytes();
            }

            @Override // flash.kline.v1.FlashProto.SendSubscribeInfoOrBuilder
            public String getPlatform() {
                return ((SendSubscribeInfo) this.instance).getPlatform();
            }

            @Override // flash.kline.v1.FlashProto.SendSubscribeInfoOrBuilder
            public ByteString getPlatformBytes() {
                return ((SendSubscribeInfo) this.instance).getPlatformBytes();
            }

            @Override // flash.kline.v1.FlashProto.SendSubscribeInfoOrBuilder
            public String getSymbol() {
                return ((SendSubscribeInfo) this.instance).getSymbol();
            }

            @Override // flash.kline.v1.FlashProto.SendSubscribeInfoOrBuilder
            public ByteString getSymbolBytes() {
                return ((SendSubscribeInfo) this.instance).getSymbolBytes();
            }

            @Override // flash.kline.v1.FlashProto.SendSubscribeInfoOrBuilder
            public long getUserId() {
                return ((SendSubscribeInfo) this.instance).getUserId();
            }

            public Builder setPeriod(String str) {
                copyOnWrite();
                SendSubscribeInfo.access$4600((SendSubscribeInfo) this.instance, str);
                return this;
            }

            public Builder setPeriodBytes(ByteString byteString) {
                copyOnWrite();
                SendSubscribeInfo.access$4800((SendSubscribeInfo) this.instance, byteString);
                return this;
            }

            public Builder setPlatform(String str) {
                copyOnWrite();
                SendSubscribeInfo.access$4900((SendSubscribeInfo) this.instance, str);
                return this;
            }

            public Builder setPlatformBytes(ByteString byteString) {
                copyOnWrite();
                SendSubscribeInfo.access$5100((SendSubscribeInfo) this.instance, byteString);
                return this;
            }

            public Builder setSymbol(String str) {
                copyOnWrite();
                SendSubscribeInfo.access$4300((SendSubscribeInfo) this.instance, str);
                return this;
            }

            public Builder setSymbolBytes(ByteString byteString) {
                copyOnWrite();
                SendSubscribeInfo.access$4500((SendSubscribeInfo) this.instance, byteString);
                return this;
            }

            public Builder setUserId(long j) {
                copyOnWrite();
                SendSubscribeInfo.access$5200((SendSubscribeInfo) this.instance, j);
                return this;
            }

            private Builder() {
                super(SendSubscribeInfo.access$4200());
            }
        }

        static {
            SendSubscribeInfo sendSubscribeInfo = new SendSubscribeInfo();
            DEFAULT_INSTANCE = sendSubscribeInfo;
            GeneratedMessageLite.registerDefaultInstance(SendSubscribeInfo.class, sendSubscribeInfo);
        }

        private SendSubscribeInfo() {
        }

        public static /* synthetic */ SendSubscribeInfo access$4200() {
            return DEFAULT_INSTANCE;
        }

        public static /* synthetic */ void access$4300(SendSubscribeInfo sendSubscribeInfo, String str) {
            sendSubscribeInfo.setSymbol(str);
        }

        public static /* synthetic */ void access$4400(SendSubscribeInfo sendSubscribeInfo) {
            sendSubscribeInfo.clearSymbol();
        }

        public static /* synthetic */ void access$4500(SendSubscribeInfo sendSubscribeInfo, ByteString byteString) {
            sendSubscribeInfo.setSymbolBytes(byteString);
        }

        public static /* synthetic */ void access$4600(SendSubscribeInfo sendSubscribeInfo, String str) {
            sendSubscribeInfo.setPeriod(str);
        }

        public static /* synthetic */ void access$4700(SendSubscribeInfo sendSubscribeInfo) {
            sendSubscribeInfo.clearPeriod();
        }

        public static /* synthetic */ void access$4800(SendSubscribeInfo sendSubscribeInfo, ByteString byteString) {
            sendSubscribeInfo.setPeriodBytes(byteString);
        }

        public static /* synthetic */ void access$4900(SendSubscribeInfo sendSubscribeInfo, String str) {
            sendSubscribeInfo.setPlatform(str);
        }

        public static /* synthetic */ void access$5000(SendSubscribeInfo sendSubscribeInfo) {
            sendSubscribeInfo.clearPlatform();
        }

        public static /* synthetic */ void access$5100(SendSubscribeInfo sendSubscribeInfo, ByteString byteString) {
            sendSubscribeInfo.setPlatformBytes(byteString);
        }

        public static /* synthetic */ void access$5200(SendSubscribeInfo sendSubscribeInfo, long j) {
            sendSubscribeInfo.setUserId(j);
        }

        public static /* synthetic */ void access$5300(SendSubscribeInfo sendSubscribeInfo) {
            sendSubscribeInfo.clearUserId();
        }

        private void clearPeriod() {
            this.period_ = getDefaultInstance().getPeriod();
        }

        private void clearPlatform() {
            this.platform_ = getDefaultInstance().getPlatform();
        }

        private void clearSymbol() {
            this.symbol_ = getDefaultInstance().getSymbol();
        }

        private void clearUserId() {
            this.userId_ = 0L;
        }

        public static SendSubscribeInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static SendSubscribeInfo parseDelimitedFrom(InputStream inputStream) {
            return (SendSubscribeInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SendSubscribeInfo parseFrom(ByteBuffer byteBuffer) {
            return (SendSubscribeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<SendSubscribeInfo> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setPeriod(String str) {
            str.getClass();
            this.period_ = str;
        }

        private void setPeriodBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.period_ = byteString.toStringUtf8();
        }

        private void setPlatform(String str) {
            str.getClass();
            this.platform_ = str;
        }

        private void setPlatformBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.platform_ = byteString.toStringUtf8();
        }

        private void setSymbol(String str) {
            str.getClass();
            this.symbol_ = str;
        }

        private void setSymbolBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.symbol_ = byteString.toStringUtf8();
        }

        private void setUserId(long j) {
            this.userId_ = j;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (C50681.f43542xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new SendSubscribeInfo();
                case 2:
                    return new Builder(null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004\u0002", new Object[]{"symbol_", "period_", "platform_", "userId_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<SendSubscribeInfo> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (SendSubscribeInfo.class) {
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

        @Override // flash.kline.v1.FlashProto.SendSubscribeInfoOrBuilder
        public String getPeriod() {
            return this.period_;
        }

        @Override // flash.kline.v1.FlashProto.SendSubscribeInfoOrBuilder
        public ByteString getPeriodBytes() {
            return ByteString.copyFromUtf8(this.period_);
        }

        @Override // flash.kline.v1.FlashProto.SendSubscribeInfoOrBuilder
        public String getPlatform() {
            return this.platform_;
        }

        @Override // flash.kline.v1.FlashProto.SendSubscribeInfoOrBuilder
        public ByteString getPlatformBytes() {
            return ByteString.copyFromUtf8(this.platform_);
        }

        @Override // flash.kline.v1.FlashProto.SendSubscribeInfoOrBuilder
        public String getSymbol() {
            return this.symbol_;
        }

        @Override // flash.kline.v1.FlashProto.SendSubscribeInfoOrBuilder
        public ByteString getSymbolBytes() {
            return ByteString.copyFromUtf8(this.symbol_);
        }

        @Override // flash.kline.v1.FlashProto.SendSubscribeInfoOrBuilder
        public long getUserId() {
            return this.userId_;
        }

        public static Builder newBuilder(SendSubscribeInfo sendSubscribeInfo) {
            return DEFAULT_INSTANCE.createBuilder(sendSubscribeInfo);
        }

        public static SendSubscribeInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SendSubscribeInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static SendSubscribeInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (SendSubscribeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static SendSubscribeInfo parseFrom(ByteString byteString) {
            return (SendSubscribeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static SendSubscribeInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (SendSubscribeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static SendSubscribeInfo parseFrom(byte[] bArr) {
            return (SendSubscribeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static SendSubscribeInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (SendSubscribeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static SendSubscribeInfo parseFrom(InputStream inputStream) {
            return (SendSubscribeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SendSubscribeInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SendSubscribeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static SendSubscribeInfo parseFrom(CodedInputStream codedInputStream) {
            return (SendSubscribeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static SendSubscribeInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SendSubscribeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public interface SendSubscribeInfoOrBuilder extends MessageLiteOrBuilder {
        String getPeriod();

        ByteString getPeriodBytes();

        String getPlatform();

        ByteString getPlatformBytes();

        String getSymbol();

        ByteString getSymbolBytes();

        long getUserId();
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class SendSubscribeRealTime extends GeneratedMessageLite<SendSubscribeRealTime, Builder> implements SendSubscribeRealTimeOrBuilder {
        private static final SendSubscribeRealTime DEFAULT_INSTANCE;
        public static final int LIMIT_FIELD_NUMBER = 4;
        private static volatile Parser<SendSubscribeRealTime> PARSER = null;
        public static final int PLATFORM_FIELD_NUMBER = 2;
        public static final int SYMBOL_FIELD_NUMBER = 1;
        public static final int USERID_FIELD_NUMBER = 3;
        private long limit_;
        private long userId_;
        private String symbol_ = "";
        private String platform_ = "";

        /* JADX INFO: compiled from: Proguard */
        public static final class Builder extends GeneratedMessageLite.Builder<SendSubscribeRealTime, Builder> implements SendSubscribeRealTimeOrBuilder {
            public /* synthetic */ Builder(C50681 c50681) {
                this();
            }

            public Builder clearLimit() {
                copyOnWrite();
                SendSubscribeRealTime.access$9400((SendSubscribeRealTime) this.instance);
                return this;
            }

            public Builder clearPlatform() {
                copyOnWrite();
                SendSubscribeRealTime.access$8900((SendSubscribeRealTime) this.instance);
                return this;
            }

            public Builder clearSymbol() {
                copyOnWrite();
                SendSubscribeRealTime.access$8600((SendSubscribeRealTime) this.instance);
                return this;
            }

            public Builder clearUserId() {
                copyOnWrite();
                SendSubscribeRealTime.access$9200((SendSubscribeRealTime) this.instance);
                return this;
            }

            @Override // flash.kline.v1.FlashProto.SendSubscribeRealTimeOrBuilder
            public long getLimit() {
                return ((SendSubscribeRealTime) this.instance).getLimit();
            }

            @Override // flash.kline.v1.FlashProto.SendSubscribeRealTimeOrBuilder
            public String getPlatform() {
                return ((SendSubscribeRealTime) this.instance).getPlatform();
            }

            @Override // flash.kline.v1.FlashProto.SendSubscribeRealTimeOrBuilder
            public ByteString getPlatformBytes() {
                return ((SendSubscribeRealTime) this.instance).getPlatformBytes();
            }

            @Override // flash.kline.v1.FlashProto.SendSubscribeRealTimeOrBuilder
            public String getSymbol() {
                return ((SendSubscribeRealTime) this.instance).getSymbol();
            }

            @Override // flash.kline.v1.FlashProto.SendSubscribeRealTimeOrBuilder
            public ByteString getSymbolBytes() {
                return ((SendSubscribeRealTime) this.instance).getSymbolBytes();
            }

            @Override // flash.kline.v1.FlashProto.SendSubscribeRealTimeOrBuilder
            public long getUserId() {
                return ((SendSubscribeRealTime) this.instance).getUserId();
            }

            public Builder setLimit(long j) {
                copyOnWrite();
                SendSubscribeRealTime.access$9300((SendSubscribeRealTime) this.instance, j);
                return this;
            }

            public Builder setPlatform(String str) {
                copyOnWrite();
                SendSubscribeRealTime.access$8800((SendSubscribeRealTime) this.instance, str);
                return this;
            }

            public Builder setPlatformBytes(ByteString byteString) {
                copyOnWrite();
                SendSubscribeRealTime.access$9000((SendSubscribeRealTime) this.instance, byteString);
                return this;
            }

            public Builder setSymbol(String str) {
                copyOnWrite();
                SendSubscribeRealTime.access$8500((SendSubscribeRealTime) this.instance, str);
                return this;
            }

            public Builder setSymbolBytes(ByteString byteString) {
                copyOnWrite();
                SendSubscribeRealTime.access$8700((SendSubscribeRealTime) this.instance, byteString);
                return this;
            }

            public Builder setUserId(long j) {
                copyOnWrite();
                SendSubscribeRealTime.access$9100((SendSubscribeRealTime) this.instance, j);
                return this;
            }

            private Builder() {
                super(SendSubscribeRealTime.access$8400());
            }
        }

        static {
            SendSubscribeRealTime sendSubscribeRealTime = new SendSubscribeRealTime();
            DEFAULT_INSTANCE = sendSubscribeRealTime;
            GeneratedMessageLite.registerDefaultInstance(SendSubscribeRealTime.class, sendSubscribeRealTime);
        }

        private SendSubscribeRealTime() {
        }

        public static /* synthetic */ SendSubscribeRealTime access$8400() {
            return DEFAULT_INSTANCE;
        }

        public static /* synthetic */ void access$8500(SendSubscribeRealTime sendSubscribeRealTime, String str) {
            sendSubscribeRealTime.setSymbol(str);
        }

        public static /* synthetic */ void access$8600(SendSubscribeRealTime sendSubscribeRealTime) {
            sendSubscribeRealTime.clearSymbol();
        }

        public static /* synthetic */ void access$8700(SendSubscribeRealTime sendSubscribeRealTime, ByteString byteString) {
            sendSubscribeRealTime.setSymbolBytes(byteString);
        }

        public static /* synthetic */ void access$8800(SendSubscribeRealTime sendSubscribeRealTime, String str) {
            sendSubscribeRealTime.setPlatform(str);
        }

        public static /* synthetic */ void access$8900(SendSubscribeRealTime sendSubscribeRealTime) {
            sendSubscribeRealTime.clearPlatform();
        }

        public static /* synthetic */ void access$9000(SendSubscribeRealTime sendSubscribeRealTime, ByteString byteString) {
            sendSubscribeRealTime.setPlatformBytes(byteString);
        }

        public static /* synthetic */ void access$9100(SendSubscribeRealTime sendSubscribeRealTime, long j) {
            sendSubscribeRealTime.setUserId(j);
        }

        public static /* synthetic */ void access$9200(SendSubscribeRealTime sendSubscribeRealTime) {
            sendSubscribeRealTime.clearUserId();
        }

        public static /* synthetic */ void access$9300(SendSubscribeRealTime sendSubscribeRealTime, long j) {
            sendSubscribeRealTime.setLimit(j);
        }

        public static /* synthetic */ void access$9400(SendSubscribeRealTime sendSubscribeRealTime) {
            sendSubscribeRealTime.clearLimit();
        }

        private void clearLimit() {
            this.limit_ = 0L;
        }

        private void clearPlatform() {
            this.platform_ = getDefaultInstance().getPlatform();
        }

        private void clearSymbol() {
            this.symbol_ = getDefaultInstance().getSymbol();
        }

        private void clearUserId() {
            this.userId_ = 0L;
        }

        public static SendSubscribeRealTime getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static SendSubscribeRealTime parseDelimitedFrom(InputStream inputStream) {
            return (SendSubscribeRealTime) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SendSubscribeRealTime parseFrom(ByteBuffer byteBuffer) {
            return (SendSubscribeRealTime) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<SendSubscribeRealTime> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setLimit(long j) {
            this.limit_ = j;
        }

        private void setPlatform(String str) {
            str.getClass();
            this.platform_ = str;
        }

        private void setPlatformBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.platform_ = byteString.toStringUtf8();
        }

        private void setSymbol(String str) {
            str.getClass();
            this.symbol_ = str;
        }

        private void setSymbolBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.symbol_ = byteString.toStringUtf8();
        }

        private void setUserId(long j) {
            this.userId_ = j;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (C50681.f43542xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new SendSubscribeRealTime();
                case 2:
                    return new Builder(null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u0002\u0004\u0002", new Object[]{"symbol_", "platform_", "userId_", "limit_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<SendSubscribeRealTime> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (SendSubscribeRealTime.class) {
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

        @Override // flash.kline.v1.FlashProto.SendSubscribeRealTimeOrBuilder
        public long getLimit() {
            return this.limit_;
        }

        @Override // flash.kline.v1.FlashProto.SendSubscribeRealTimeOrBuilder
        public String getPlatform() {
            return this.platform_;
        }

        @Override // flash.kline.v1.FlashProto.SendSubscribeRealTimeOrBuilder
        public ByteString getPlatformBytes() {
            return ByteString.copyFromUtf8(this.platform_);
        }

        @Override // flash.kline.v1.FlashProto.SendSubscribeRealTimeOrBuilder
        public String getSymbol() {
            return this.symbol_;
        }

        @Override // flash.kline.v1.FlashProto.SendSubscribeRealTimeOrBuilder
        public ByteString getSymbolBytes() {
            return ByteString.copyFromUtf8(this.symbol_);
        }

        @Override // flash.kline.v1.FlashProto.SendSubscribeRealTimeOrBuilder
        public long getUserId() {
            return this.userId_;
        }

        public static Builder newBuilder(SendSubscribeRealTime sendSubscribeRealTime) {
            return DEFAULT_INSTANCE.createBuilder(sendSubscribeRealTime);
        }

        public static SendSubscribeRealTime parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SendSubscribeRealTime) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static SendSubscribeRealTime parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (SendSubscribeRealTime) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static SendSubscribeRealTime parseFrom(ByteString byteString) {
            return (SendSubscribeRealTime) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static SendSubscribeRealTime parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (SendSubscribeRealTime) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static SendSubscribeRealTime parseFrom(byte[] bArr) {
            return (SendSubscribeRealTime) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static SendSubscribeRealTime parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (SendSubscribeRealTime) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static SendSubscribeRealTime parseFrom(InputStream inputStream) {
            return (SendSubscribeRealTime) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SendSubscribeRealTime parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SendSubscribeRealTime) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static SendSubscribeRealTime parseFrom(CodedInputStream codedInputStream) {
            return (SendSubscribeRealTime) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static SendSubscribeRealTime parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SendSubscribeRealTime) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public interface SendSubscribeRealTimeOrBuilder extends MessageLiteOrBuilder {
        long getLimit();

        String getPlatform();

        ByteString getPlatformBytes();

        String getSymbol();

        ByteString getSymbolBytes();

        long getUserId();
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class SendSubscribeTicker extends GeneratedMessageLite<SendSubscribeTicker, Builder> implements SendSubscribeTickerOrBuilder {
        private static final SendSubscribeTicker DEFAULT_INSTANCE;
        private static volatile Parser<SendSubscribeTicker> PARSER = null;
        public static final int PLATFORM_FIELD_NUMBER = 1;
        public static final int USERID_FIELD_NUMBER = 2;
        private String platform_ = "";
        private long userId_;

        /* JADX INFO: compiled from: Proguard */
        public static final class Builder extends GeneratedMessageLite.Builder<SendSubscribeTicker, Builder> implements SendSubscribeTickerOrBuilder {
            public /* synthetic */ Builder(C50681 c50681) {
                this();
            }

            public Builder clearPlatform() {
                copyOnWrite();
                SendSubscribeTicker.access$1000((SendSubscribeTicker) this.instance);
                return this;
            }

            public Builder clearUserId() {
                copyOnWrite();
                SendSubscribeTicker.access$1300((SendSubscribeTicker) this.instance);
                return this;
            }

            @Override // flash.kline.v1.FlashProto.SendSubscribeTickerOrBuilder
            public String getPlatform() {
                return ((SendSubscribeTicker) this.instance).getPlatform();
            }

            @Override // flash.kline.v1.FlashProto.SendSubscribeTickerOrBuilder
            public ByteString getPlatformBytes() {
                return ((SendSubscribeTicker) this.instance).getPlatformBytes();
            }

            @Override // flash.kline.v1.FlashProto.SendSubscribeTickerOrBuilder
            public long getUserId() {
                return ((SendSubscribeTicker) this.instance).getUserId();
            }

            public Builder setPlatform(String str) {
                copyOnWrite();
                SendSubscribeTicker.access$900((SendSubscribeTicker) this.instance, str);
                return this;
            }

            public Builder setPlatformBytes(ByteString byteString) {
                copyOnWrite();
                SendSubscribeTicker.access$1100((SendSubscribeTicker) this.instance, byteString);
                return this;
            }

            public Builder setUserId(long j) {
                copyOnWrite();
                SendSubscribeTicker.access$1200((SendSubscribeTicker) this.instance, j);
                return this;
            }

            private Builder() {
                super(SendSubscribeTicker.access$800());
            }
        }

        static {
            SendSubscribeTicker sendSubscribeTicker = new SendSubscribeTicker();
            DEFAULT_INSTANCE = sendSubscribeTicker;
            GeneratedMessageLite.registerDefaultInstance(SendSubscribeTicker.class, sendSubscribeTicker);
        }

        private SendSubscribeTicker() {
        }

        public static /* synthetic */ void access$1000(SendSubscribeTicker sendSubscribeTicker) {
            sendSubscribeTicker.clearPlatform();
        }

        public static /* synthetic */ void access$1100(SendSubscribeTicker sendSubscribeTicker, ByteString byteString) {
            sendSubscribeTicker.setPlatformBytes(byteString);
        }

        public static /* synthetic */ void access$1200(SendSubscribeTicker sendSubscribeTicker, long j) {
            sendSubscribeTicker.setUserId(j);
        }

        public static /* synthetic */ void access$1300(SendSubscribeTicker sendSubscribeTicker) {
            sendSubscribeTicker.clearUserId();
        }

        public static /* synthetic */ SendSubscribeTicker access$800() {
            return DEFAULT_INSTANCE;
        }

        public static /* synthetic */ void access$900(SendSubscribeTicker sendSubscribeTicker, String str) {
            sendSubscribeTicker.setPlatform(str);
        }

        private void clearPlatform() {
            this.platform_ = getDefaultInstance().getPlatform();
        }

        private void clearUserId() {
            this.userId_ = 0L;
        }

        public static SendSubscribeTicker getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static SendSubscribeTicker parseDelimitedFrom(InputStream inputStream) {
            return (SendSubscribeTicker) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SendSubscribeTicker parseFrom(ByteBuffer byteBuffer) {
            return (SendSubscribeTicker) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<SendSubscribeTicker> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setPlatform(String str) {
            str.getClass();
            this.platform_ = str;
        }

        private void setPlatformBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.platform_ = byteString.toStringUtf8();
        }

        private void setUserId(long j) {
            this.userId_ = j;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (C50681.f43542xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new SendSubscribeTicker();
                case 2:
                    return new Builder(null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\u0002", new Object[]{"platform_", "userId_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<SendSubscribeTicker> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (SendSubscribeTicker.class) {
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

        @Override // flash.kline.v1.FlashProto.SendSubscribeTickerOrBuilder
        public String getPlatform() {
            return this.platform_;
        }

        @Override // flash.kline.v1.FlashProto.SendSubscribeTickerOrBuilder
        public ByteString getPlatformBytes() {
            return ByteString.copyFromUtf8(this.platform_);
        }

        @Override // flash.kline.v1.FlashProto.SendSubscribeTickerOrBuilder
        public long getUserId() {
            return this.userId_;
        }

        public static Builder newBuilder(SendSubscribeTicker sendSubscribeTicker) {
            return DEFAULT_INSTANCE.createBuilder(sendSubscribeTicker);
        }

        public static SendSubscribeTicker parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SendSubscribeTicker) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static SendSubscribeTicker parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (SendSubscribeTicker) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static SendSubscribeTicker parseFrom(ByteString byteString) {
            return (SendSubscribeTicker) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static SendSubscribeTicker parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (SendSubscribeTicker) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static SendSubscribeTicker parseFrom(byte[] bArr) {
            return (SendSubscribeTicker) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static SendSubscribeTicker parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (SendSubscribeTicker) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static SendSubscribeTicker parseFrom(InputStream inputStream) {
            return (SendSubscribeTicker) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SendSubscribeTicker parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SendSubscribeTicker) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static SendSubscribeTicker parseFrom(CodedInputStream codedInputStream) {
            return (SendSubscribeTicker) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static SendSubscribeTicker parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SendSubscribeTicker) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public interface SendSubscribeTickerOrBuilder extends MessageLiteOrBuilder {
        String getPlatform();

        ByteString getPlatformBytes();

        long getUserId();
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class TickerInfo extends GeneratedMessageLite<TickerInfo, Builder> implements TickerInfoOrBuilder {
        public static final int CHANGE_FIELD_NUMBER = 3;
        private static final TickerInfo DEFAULT_INSTANCE;
        public static final int DIFF_FIELD_NUMBER = 7;
        public static final int HIGH_FIELD_NUMBER = 4;
        public static final int LOW_FIELD_NUMBER = 5;
        private static volatile Parser<TickerInfo> PARSER = null;
        public static final int PRICE_FIELD_NUMBER = 2;
        public static final int SYMBOL_FIELD_NUMBER = 1;
        public static final int VOLUME_FIELD_NUMBER = 6;
        private double change_;
        private double diff_;
        private double high_;
        private double low_;
        private double price_;
        private String symbol_ = "";
        private double volume_;

        /* JADX INFO: compiled from: Proguard */
        public static final class Builder extends GeneratedMessageLite.Builder<TickerInfo, Builder> implements TickerInfoOrBuilder {
            public /* synthetic */ Builder(C50681 c50681) {
                this();
            }

            public Builder clearChange() {
                copyOnWrite();
                TickerInfo.access$2200((TickerInfo) this.instance);
                return this;
            }

            public Builder clearDiff() {
                copyOnWrite();
                TickerInfo.access$3000((TickerInfo) this.instance);
                return this;
            }

            public Builder clearHigh() {
                copyOnWrite();
                TickerInfo.access$2400((TickerInfo) this.instance);
                return this;
            }

            public Builder clearLow() {
                copyOnWrite();
                TickerInfo.access$2600((TickerInfo) this.instance);
                return this;
            }

            public Builder clearPrice() {
                copyOnWrite();
                TickerInfo.access$2000((TickerInfo) this.instance);
                return this;
            }

            public Builder clearSymbol() {
                copyOnWrite();
                TickerInfo.access$1700((TickerInfo) this.instance);
                return this;
            }

            public Builder clearVolume() {
                copyOnWrite();
                TickerInfo.access$2800((TickerInfo) this.instance);
                return this;
            }

            @Override // flash.kline.v1.FlashProto.TickerInfoOrBuilder
            public double getChange() {
                return ((TickerInfo) this.instance).getChange();
            }

            @Override // flash.kline.v1.FlashProto.TickerInfoOrBuilder
            public double getDiff() {
                return ((TickerInfo) this.instance).getDiff();
            }

            @Override // flash.kline.v1.FlashProto.TickerInfoOrBuilder
            public double getHigh() {
                return ((TickerInfo) this.instance).getHigh();
            }

            @Override // flash.kline.v1.FlashProto.TickerInfoOrBuilder
            public double getLow() {
                return ((TickerInfo) this.instance).getLow();
            }

            @Override // flash.kline.v1.FlashProto.TickerInfoOrBuilder
            public double getPrice() {
                return ((TickerInfo) this.instance).getPrice();
            }

            @Override // flash.kline.v1.FlashProto.TickerInfoOrBuilder
            public String getSymbol() {
                return ((TickerInfo) this.instance).getSymbol();
            }

            @Override // flash.kline.v1.FlashProto.TickerInfoOrBuilder
            public ByteString getSymbolBytes() {
                return ((TickerInfo) this.instance).getSymbolBytes();
            }

            @Override // flash.kline.v1.FlashProto.TickerInfoOrBuilder
            public double getVolume() {
                return ((TickerInfo) this.instance).getVolume();
            }

            public Builder setChange(double d) {
                copyOnWrite();
                TickerInfo.access$2100((TickerInfo) this.instance, d);
                return this;
            }

            public Builder setDiff(double d) {
                copyOnWrite();
                TickerInfo.access$2900((TickerInfo) this.instance, d);
                return this;
            }

            public Builder setHigh(double d) {
                copyOnWrite();
                TickerInfo.access$2300((TickerInfo) this.instance, d);
                return this;
            }

            public Builder setLow(double d) {
                copyOnWrite();
                TickerInfo.access$2500((TickerInfo) this.instance, d);
                return this;
            }

            public Builder setPrice(double d) {
                copyOnWrite();
                TickerInfo.access$1900((TickerInfo) this.instance, d);
                return this;
            }

            public Builder setSymbol(String str) {
                copyOnWrite();
                TickerInfo.access$1600((TickerInfo) this.instance, str);
                return this;
            }

            public Builder setSymbolBytes(ByteString byteString) {
                copyOnWrite();
                TickerInfo.access$1800((TickerInfo) this.instance, byteString);
                return this;
            }

            public Builder setVolume(double d) {
                copyOnWrite();
                TickerInfo.access$2700((TickerInfo) this.instance, d);
                return this;
            }

            private Builder() {
                super(TickerInfo.access$1500());
            }
        }

        static {
            TickerInfo tickerInfo = new TickerInfo();
            DEFAULT_INSTANCE = tickerInfo;
            GeneratedMessageLite.registerDefaultInstance(TickerInfo.class, tickerInfo);
        }

        private TickerInfo() {
        }

        public static /* synthetic */ TickerInfo access$1500() {
            return DEFAULT_INSTANCE;
        }

        public static /* synthetic */ void access$1600(TickerInfo tickerInfo, String str) {
            tickerInfo.setSymbol(str);
        }

        public static /* synthetic */ void access$1700(TickerInfo tickerInfo) {
            tickerInfo.clearSymbol();
        }

        public static /* synthetic */ void access$1800(TickerInfo tickerInfo, ByteString byteString) {
            tickerInfo.setSymbolBytes(byteString);
        }

        public static /* synthetic */ void access$1900(TickerInfo tickerInfo, double d) {
            tickerInfo.setPrice(d);
        }

        public static /* synthetic */ void access$2000(TickerInfo tickerInfo) {
            tickerInfo.clearPrice();
        }

        public static /* synthetic */ void access$2100(TickerInfo tickerInfo, double d) {
            tickerInfo.setChange(d);
        }

        public static /* synthetic */ void access$2200(TickerInfo tickerInfo) {
            tickerInfo.clearChange();
        }

        public static /* synthetic */ void access$2300(TickerInfo tickerInfo, double d) {
            tickerInfo.setHigh(d);
        }

        public static /* synthetic */ void access$2400(TickerInfo tickerInfo) {
            tickerInfo.clearHigh();
        }

        public static /* synthetic */ void access$2500(TickerInfo tickerInfo, double d) {
            tickerInfo.setLow(d);
        }

        public static /* synthetic */ void access$2600(TickerInfo tickerInfo) {
            tickerInfo.clearLow();
        }

        public static /* synthetic */ void access$2700(TickerInfo tickerInfo, double d) {
            tickerInfo.setVolume(d);
        }

        public static /* synthetic */ void access$2800(TickerInfo tickerInfo) {
            tickerInfo.clearVolume();
        }

        public static /* synthetic */ void access$2900(TickerInfo tickerInfo, double d) {
            tickerInfo.setDiff(d);
        }

        public static /* synthetic */ void access$3000(TickerInfo tickerInfo) {
            tickerInfo.clearDiff();
        }

        private void clearChange() {
            this.change_ = 0.0d;
        }

        private void clearDiff() {
            this.diff_ = 0.0d;
        }

        private void clearHigh() {
            this.high_ = 0.0d;
        }

        private void clearLow() {
            this.low_ = 0.0d;
        }

        private void clearPrice() {
            this.price_ = 0.0d;
        }

        private void clearSymbol() {
            this.symbol_ = getDefaultInstance().getSymbol();
        }

        private void clearVolume() {
            this.volume_ = 0.0d;
        }

        public static TickerInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static TickerInfo parseDelimitedFrom(InputStream inputStream) {
            return (TickerInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TickerInfo parseFrom(ByteBuffer byteBuffer) {
            return (TickerInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<TickerInfo> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setChange(double d) {
            this.change_ = d;
        }

        private void setDiff(double d) {
            this.diff_ = d;
        }

        private void setHigh(double d) {
            this.high_ = d;
        }

        private void setLow(double d) {
            this.low_ = d;
        }

        private void setPrice(double d) {
            this.price_ = d;
        }

        private void setSymbol(String str) {
            str.getClass();
            this.symbol_ = str;
        }

        private void setSymbolBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.symbol_ = byteString.toStringUtf8();
        }

        private void setVolume(double d) {
            this.volume_ = d;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (C50681.f43542xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new TickerInfo();
                case 2:
                    return new Builder(null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001Ȉ\u0002\u0000\u0003\u0000\u0004\u0000\u0005\u0000\u0006\u0000\u0007\u0000", new Object[]{"symbol_", "price_", "change_", "high_", "low_", "volume_", "diff_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<TickerInfo> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (TickerInfo.class) {
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

        @Override // flash.kline.v1.FlashProto.TickerInfoOrBuilder
        public double getChange() {
            return this.change_;
        }

        @Override // flash.kline.v1.FlashProto.TickerInfoOrBuilder
        public double getDiff() {
            return this.diff_;
        }

        @Override // flash.kline.v1.FlashProto.TickerInfoOrBuilder
        public double getHigh() {
            return this.high_;
        }

        @Override // flash.kline.v1.FlashProto.TickerInfoOrBuilder
        public double getLow() {
            return this.low_;
        }

        @Override // flash.kline.v1.FlashProto.TickerInfoOrBuilder
        public double getPrice() {
            return this.price_;
        }

        @Override // flash.kline.v1.FlashProto.TickerInfoOrBuilder
        public String getSymbol() {
            return this.symbol_;
        }

        @Override // flash.kline.v1.FlashProto.TickerInfoOrBuilder
        public ByteString getSymbolBytes() {
            return ByteString.copyFromUtf8(this.symbol_);
        }

        @Override // flash.kline.v1.FlashProto.TickerInfoOrBuilder
        public double getVolume() {
            return this.volume_;
        }

        public static Builder newBuilder(TickerInfo tickerInfo) {
            return DEFAULT_INSTANCE.createBuilder(tickerInfo);
        }

        public static TickerInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (TickerInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static TickerInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (TickerInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static TickerInfo parseFrom(ByteString byteString) {
            return (TickerInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static TickerInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (TickerInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static TickerInfo parseFrom(byte[] bArr) {
            return (TickerInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static TickerInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (TickerInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static TickerInfo parseFrom(InputStream inputStream) {
            return (TickerInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TickerInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (TickerInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static TickerInfo parseFrom(CodedInputStream codedInputStream) {
            return (TickerInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static TickerInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (TickerInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public interface TickerInfoOrBuilder extends MessageLiteOrBuilder {
        double getChange();

        double getDiff();

        double getHigh();

        double getLow();

        double getPrice();

        String getSymbol();

        ByteString getSymbolBytes();

        double getVolume();
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class TimeData extends GeneratedMessageLite<TimeData, Builder> implements TimeDataOrBuilder {
        private static final TimeData DEFAULT_INSTANCE;
        private static volatile Parser<TimeData> PARSER = null;
        public static final int PRICE_FIELD_NUMBER = 2;
        public static final int TIME_FIELD_NUMBER = 1;
        private double price_;
        private long time_;

        /* JADX INFO: compiled from: Proguard */
        public static final class Builder extends GeneratedMessageLite.Builder<TimeData, Builder> implements TimeDataOrBuilder {
            public /* synthetic */ Builder(C50681 c50681) {
                this();
            }

            public Builder clearPrice() {
                copyOnWrite();
                TimeData.access$10000((TimeData) this.instance);
                return this;
            }

            public Builder clearTime() {
                copyOnWrite();
                TimeData.access$9800((TimeData) this.instance);
                return this;
            }

            @Override // flash.kline.v1.FlashProto.TimeDataOrBuilder
            public double getPrice() {
                return ((TimeData) this.instance).getPrice();
            }

            @Override // flash.kline.v1.FlashProto.TimeDataOrBuilder
            public long getTime() {
                return ((TimeData) this.instance).getTime();
            }

            public Builder setPrice(double d) {
                copyOnWrite();
                TimeData.access$9900((TimeData) this.instance, d);
                return this;
            }

            public Builder setTime(long j) {
                copyOnWrite();
                TimeData.access$9700((TimeData) this.instance, j);
                return this;
            }

            private Builder() {
                super(TimeData.access$9600());
            }
        }

        static {
            TimeData timeData = new TimeData();
            DEFAULT_INSTANCE = timeData;
            GeneratedMessageLite.registerDefaultInstance(TimeData.class, timeData);
        }

        private TimeData() {
        }

        public static /* synthetic */ void access$10000(TimeData timeData) {
            timeData.clearPrice();
        }

        public static /* synthetic */ TimeData access$9600() {
            return DEFAULT_INSTANCE;
        }

        public static /* synthetic */ void access$9700(TimeData timeData, long j) {
            timeData.setTime(j);
        }

        public static /* synthetic */ void access$9800(TimeData timeData) {
            timeData.clearTime();
        }

        public static /* synthetic */ void access$9900(TimeData timeData, double d) {
            timeData.setPrice(d);
        }

        private void clearPrice() {
            this.price_ = 0.0d;
        }

        private void clearTime() {
            this.time_ = 0L;
        }

        public static TimeData getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static TimeData parseDelimitedFrom(InputStream inputStream) {
            return (TimeData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TimeData parseFrom(ByteBuffer byteBuffer) {
            return (TimeData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<TimeData> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setPrice(double d) {
            this.price_ = d;
        }

        private void setTime(long j) {
            this.time_ = j;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (C50681.f43542xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new TimeData();
                case 2:
                    return new Builder(null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0000", new Object[]{"time_", "price_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<TimeData> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (TimeData.class) {
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

        @Override // flash.kline.v1.FlashProto.TimeDataOrBuilder
        public double getPrice() {
            return this.price_;
        }

        @Override // flash.kline.v1.FlashProto.TimeDataOrBuilder
        public long getTime() {
            return this.time_;
        }

        public static Builder newBuilder(TimeData timeData) {
            return DEFAULT_INSTANCE.createBuilder(timeData);
        }

        public static TimeData parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (TimeData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static TimeData parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (TimeData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static TimeData parseFrom(ByteString byteString) {
            return (TimeData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static TimeData parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (TimeData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static TimeData parseFrom(byte[] bArr) {
            return (TimeData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static TimeData parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (TimeData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static TimeData parseFrom(InputStream inputStream) {
            return (TimeData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TimeData parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (TimeData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static TimeData parseFrom(CodedInputStream codedInputStream) {
            return (TimeData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static TimeData parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (TimeData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public interface TimeDataOrBuilder extends MessageLiteOrBuilder {
        double getPrice();

        long getTime();
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class WeeklyTrendReply extends GeneratedMessageLite<WeeklyTrendReply, Builder> implements WeeklyTrendReplyOrBuilder {
        private static final WeeklyTrendReply DEFAULT_INSTANCE;
        public static final int LIST_FIELD_NUMBER = 1;
        private static volatile Parser<WeeklyTrendReply> PARSER;
        private MapFieldLite<String, ListKlineInfo> list_ = MapFieldLite.emptyMapField();

        /* JADX INFO: compiled from: Proguard */
        public static final class Builder extends GeneratedMessageLite.Builder<WeeklyTrendReply, Builder> implements WeeklyTrendReplyOrBuilder {
            public /* synthetic */ Builder(C50681 c50681) {
                this();
            }

            public Builder clearList() {
                copyOnWrite();
                WeeklyTrendReply.access$17700((WeeklyTrendReply) this.instance).clear();
                return this;
            }

            @Override // flash.kline.v1.FlashProto.WeeklyTrendReplyOrBuilder
            public boolean containsList(String str) {
                str.getClass();
                return ((WeeklyTrendReply) this.instance).getListMap().containsKey(str);
            }

            @Override // flash.kline.v1.FlashProto.WeeklyTrendReplyOrBuilder
            @Deprecated
            public Map<String, ListKlineInfo> getList() {
                return getListMap();
            }

            @Override // flash.kline.v1.FlashProto.WeeklyTrendReplyOrBuilder
            public int getListCount() {
                return ((WeeklyTrendReply) this.instance).getListMap().size();
            }

            @Override // flash.kline.v1.FlashProto.WeeklyTrendReplyOrBuilder
            public Map<String, ListKlineInfo> getListMap() {
                return Collections.unmodifiableMap(((WeeklyTrendReply) this.instance).getListMap());
            }

            @Override // flash.kline.v1.FlashProto.WeeklyTrendReplyOrBuilder
            public ListKlineInfo getListOrDefault(String str, ListKlineInfo listKlineInfo) {
                str.getClass();
                Map<String, ListKlineInfo> listMap = ((WeeklyTrendReply) this.instance).getListMap();
                return listMap.containsKey(str) ? listMap.get(str) : listKlineInfo;
            }

            @Override // flash.kline.v1.FlashProto.WeeklyTrendReplyOrBuilder
            public ListKlineInfo getListOrThrow(String str) {
                str.getClass();
                Map<String, ListKlineInfo> listMap = ((WeeklyTrendReply) this.instance).getListMap();
                if (listMap.containsKey(str)) {
                    return listMap.get(str);
                }
                throw new IllegalArgumentException();
            }

            public Builder putAllList(Map<String, ListKlineInfo> map) {
                copyOnWrite();
                WeeklyTrendReply.access$17700((WeeklyTrendReply) this.instance).putAll(map);
                return this;
            }

            public Builder putList(String str, ListKlineInfo listKlineInfo) {
                str.getClass();
                listKlineInfo.getClass();
                copyOnWrite();
                WeeklyTrendReply.access$17700((WeeklyTrendReply) this.instance).put(str, listKlineInfo);
                return this;
            }

            public Builder removeList(String str) {
                str.getClass();
                copyOnWrite();
                WeeklyTrendReply.access$17700((WeeklyTrendReply) this.instance).remove(str);
                return this;
            }

            private Builder() {
                super(WeeklyTrendReply.access$17600());
            }
        }

        /* JADX INFO: compiled from: Proguard */
        public static final class ListDefaultEntryHolder {
            static final MapEntryLite<String, ListKlineInfo> defaultEntry = MapEntryLite.newDefaultInstance(WireFormat.FieldType.STRING, "", WireFormat.FieldType.MESSAGE, ListKlineInfo.getDefaultInstance());

            private ListDefaultEntryHolder() {
            }
        }

        static {
            WeeklyTrendReply weeklyTrendReply = new WeeklyTrendReply();
            DEFAULT_INSTANCE = weeklyTrendReply;
            GeneratedMessageLite.registerDefaultInstance(WeeklyTrendReply.class, weeklyTrendReply);
        }

        private WeeklyTrendReply() {
        }

        public static /* synthetic */ WeeklyTrendReply access$17600() {
            return DEFAULT_INSTANCE;
        }

        public static /* synthetic */ Map access$17700(WeeklyTrendReply weeklyTrendReply) {
            return weeklyTrendReply.getMutableListMap();
        }

        public static WeeklyTrendReply getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private Map<String, ListKlineInfo> getMutableListMap() {
            return internalGetMutableList();
        }

        private MapFieldLite<String, ListKlineInfo> internalGetList() {
            return this.list_;
        }

        private MapFieldLite<String, ListKlineInfo> internalGetMutableList() {
            if (!this.list_.isMutable()) {
                this.list_ = this.list_.mutableCopy();
            }
            return this.list_;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static WeeklyTrendReply parseDelimitedFrom(InputStream inputStream) {
            return (WeeklyTrendReply) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static WeeklyTrendReply parseFrom(ByteBuffer byteBuffer) {
            return (WeeklyTrendReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<WeeklyTrendReply> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        @Override // flash.kline.v1.FlashProto.WeeklyTrendReplyOrBuilder
        public boolean containsList(String str) {
            str.getClass();
            return internalGetList().containsKey(str);
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (C50681.f43542xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new WeeklyTrendReply();
                case 2:
                    return new Builder(null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"list_", ListDefaultEntryHolder.defaultEntry});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<WeeklyTrendReply> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (WeeklyTrendReply.class) {
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

        @Override // flash.kline.v1.FlashProto.WeeklyTrendReplyOrBuilder
        @Deprecated
        public Map<String, ListKlineInfo> getList() {
            return getListMap();
        }

        @Override // flash.kline.v1.FlashProto.WeeklyTrendReplyOrBuilder
        public int getListCount() {
            return internalGetList().size();
        }

        @Override // flash.kline.v1.FlashProto.WeeklyTrendReplyOrBuilder
        public Map<String, ListKlineInfo> getListMap() {
            return Collections.unmodifiableMap(internalGetList());
        }

        @Override // flash.kline.v1.FlashProto.WeeklyTrendReplyOrBuilder
        public ListKlineInfo getListOrDefault(String str, ListKlineInfo listKlineInfo) {
            str.getClass();
            MapFieldLite<String, ListKlineInfo> mapFieldLiteInternalGetList = internalGetList();
            return mapFieldLiteInternalGetList.containsKey(str) ? mapFieldLiteInternalGetList.get(str) : listKlineInfo;
        }

        @Override // flash.kline.v1.FlashProto.WeeklyTrendReplyOrBuilder
        public ListKlineInfo getListOrThrow(String str) {
            str.getClass();
            MapFieldLite<String, ListKlineInfo> mapFieldLiteInternalGetList = internalGetList();
            if (mapFieldLiteInternalGetList.containsKey(str)) {
                return mapFieldLiteInternalGetList.get(str);
            }
            throw new IllegalArgumentException();
        }

        public static Builder newBuilder(WeeklyTrendReply weeklyTrendReply) {
            return DEFAULT_INSTANCE.createBuilder(weeklyTrendReply);
        }

        public static WeeklyTrendReply parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (WeeklyTrendReply) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static WeeklyTrendReply parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (WeeklyTrendReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static WeeklyTrendReply parseFrom(ByteString byteString) {
            return (WeeklyTrendReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static WeeklyTrendReply parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (WeeklyTrendReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static WeeklyTrendReply parseFrom(byte[] bArr) {
            return (WeeklyTrendReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static WeeklyTrendReply parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (WeeklyTrendReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static WeeklyTrendReply parseFrom(InputStream inputStream) {
            return (WeeklyTrendReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static WeeklyTrendReply parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (WeeklyTrendReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static WeeklyTrendReply parseFrom(CodedInputStream codedInputStream) {
            return (WeeklyTrendReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static WeeklyTrendReply parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (WeeklyTrendReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public interface WeeklyTrendReplyOrBuilder extends MessageLiteOrBuilder {
        boolean containsList(String str);

        @Deprecated
        Map<String, ListKlineInfo> getList();

        int getListCount();

        Map<String, ListKlineInfo> getListMap();

        ListKlineInfo getListOrDefault(String str, ListKlineInfo listKlineInfo);

        ListKlineInfo getListOrThrow(String str);
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class WeeklyTrendRequest extends GeneratedMessageLite<WeeklyTrendRequest, Builder> implements WeeklyTrendRequestOrBuilder {
        public static final int COUNT_FIELD_NUMBER = 2;
        private static final WeeklyTrendRequest DEFAULT_INSTANCE;
        private static volatile Parser<WeeklyTrendRequest> PARSER = null;
        public static final int PERIOD_FIELD_NUMBER = 3;
        public static final int SYMBOLS_FIELD_NUMBER = 1;
        private long count_;
        private Internal.ProtobufList<String> symbols_ = GeneratedMessageLite.emptyProtobufList();
        private String period_ = "";

        /* JADX INFO: compiled from: Proguard */
        public static final class Builder extends GeneratedMessageLite.Builder<WeeklyTrendRequest, Builder> implements WeeklyTrendRequestOrBuilder {
            public /* synthetic */ Builder(C50681 c50681) {
                this();
            }

            public Builder addAllSymbols(Iterable<String> iterable) {
                copyOnWrite();
                WeeklyTrendRequest.access$15900((WeeklyTrendRequest) this.instance, iterable);
                return this;
            }

            public Builder addSymbols(String str) {
                copyOnWrite();
                WeeklyTrendRequest.access$15800((WeeklyTrendRequest) this.instance, str);
                return this;
            }

            public Builder addSymbolsBytes(ByteString byteString) {
                copyOnWrite();
                WeeklyTrendRequest.access$16100((WeeklyTrendRequest) this.instance, byteString);
                return this;
            }

            public Builder clearCount() {
                copyOnWrite();
                WeeklyTrendRequest.access$16300((WeeklyTrendRequest) this.instance);
                return this;
            }

            public Builder clearPeriod() {
                copyOnWrite();
                WeeklyTrendRequest.access$16500((WeeklyTrendRequest) this.instance);
                return this;
            }

            public Builder clearSymbols() {
                copyOnWrite();
                WeeklyTrendRequest.access$16000((WeeklyTrendRequest) this.instance);
                return this;
            }

            @Override // flash.kline.v1.FlashProto.WeeklyTrendRequestOrBuilder
            public long getCount() {
                return ((WeeklyTrendRequest) this.instance).getCount();
            }

            @Override // flash.kline.v1.FlashProto.WeeklyTrendRequestOrBuilder
            public String getPeriod() {
                return ((WeeklyTrendRequest) this.instance).getPeriod();
            }

            @Override // flash.kline.v1.FlashProto.WeeklyTrendRequestOrBuilder
            public ByteString getPeriodBytes() {
                return ((WeeklyTrendRequest) this.instance).getPeriodBytes();
            }

            @Override // flash.kline.v1.FlashProto.WeeklyTrendRequestOrBuilder
            public String getSymbols(int i) {
                return ((WeeklyTrendRequest) this.instance).getSymbols(i);
            }

            @Override // flash.kline.v1.FlashProto.WeeklyTrendRequestOrBuilder
            public ByteString getSymbolsBytes(int i) {
                return ((WeeklyTrendRequest) this.instance).getSymbolsBytes(i);
            }

            @Override // flash.kline.v1.FlashProto.WeeklyTrendRequestOrBuilder
            public int getSymbolsCount() {
                return ((WeeklyTrendRequest) this.instance).getSymbolsCount();
            }

            @Override // flash.kline.v1.FlashProto.WeeklyTrendRequestOrBuilder
            public List<String> getSymbolsList() {
                return Collections.unmodifiableList(((WeeklyTrendRequest) this.instance).getSymbolsList());
            }

            public Builder setCount(long j) {
                copyOnWrite();
                WeeklyTrendRequest.access$16200((WeeklyTrendRequest) this.instance, j);
                return this;
            }

            public Builder setPeriod(String str) {
                copyOnWrite();
                WeeklyTrendRequest.access$16400((WeeklyTrendRequest) this.instance, str);
                return this;
            }

            public Builder setPeriodBytes(ByteString byteString) {
                copyOnWrite();
                WeeklyTrendRequest.access$16600((WeeklyTrendRequest) this.instance, byteString);
                return this;
            }

            public Builder setSymbols(int i, String str) {
                copyOnWrite();
                WeeklyTrendRequest.access$15700((WeeklyTrendRequest) this.instance, i, str);
                return this;
            }

            private Builder() {
                super(WeeklyTrendRequest.access$15600());
            }
        }

        static {
            WeeklyTrendRequest weeklyTrendRequest = new WeeklyTrendRequest();
            DEFAULT_INSTANCE = weeklyTrendRequest;
            GeneratedMessageLite.registerDefaultInstance(WeeklyTrendRequest.class, weeklyTrendRequest);
        }

        private WeeklyTrendRequest() {
        }

        public static /* synthetic */ WeeklyTrendRequest access$15600() {
            return DEFAULT_INSTANCE;
        }

        public static /* synthetic */ void access$15700(WeeklyTrendRequest weeklyTrendRequest, int i, String str) {
            weeklyTrendRequest.setSymbols(i, str);
        }

        public static /* synthetic */ void access$15800(WeeklyTrendRequest weeklyTrendRequest, String str) {
            weeklyTrendRequest.addSymbols(str);
        }

        public static /* synthetic */ void access$15900(WeeklyTrendRequest weeklyTrendRequest, Iterable iterable) {
            weeklyTrendRequest.addAllSymbols(iterable);
        }

        public static /* synthetic */ void access$16000(WeeklyTrendRequest weeklyTrendRequest) {
            weeklyTrendRequest.clearSymbols();
        }

        public static /* synthetic */ void access$16100(WeeklyTrendRequest weeklyTrendRequest, ByteString byteString) {
            weeklyTrendRequest.addSymbolsBytes(byteString);
        }

        public static /* synthetic */ void access$16200(WeeklyTrendRequest weeklyTrendRequest, long j) {
            weeklyTrendRequest.setCount(j);
        }

        public static /* synthetic */ void access$16300(WeeklyTrendRequest weeklyTrendRequest) {
            weeklyTrendRequest.clearCount();
        }

        public static /* synthetic */ void access$16400(WeeklyTrendRequest weeklyTrendRequest, String str) {
            weeklyTrendRequest.setPeriod(str);
        }

        public static /* synthetic */ void access$16500(WeeklyTrendRequest weeklyTrendRequest) {
            weeklyTrendRequest.clearPeriod();
        }

        public static /* synthetic */ void access$16600(WeeklyTrendRequest weeklyTrendRequest, ByteString byteString) {
            weeklyTrendRequest.setPeriodBytes(byteString);
        }

        private void addAllSymbols(Iterable<String> iterable) {
            ensureSymbolsIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.symbols_);
        }

        private void addSymbols(String str) {
            str.getClass();
            ensureSymbolsIsMutable();
            this.symbols_.add(str);
        }

        private void addSymbolsBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            ensureSymbolsIsMutable();
            this.symbols_.add(byteString.toStringUtf8());
        }

        private void clearCount() {
            this.count_ = 0L;
        }

        private void clearPeriod() {
            this.period_ = getDefaultInstance().getPeriod();
        }

        private void clearSymbols() {
            this.symbols_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void ensureSymbolsIsMutable() {
            Internal.ProtobufList<String> protobufList = this.symbols_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.symbols_ = GeneratedMessageLite.mutableCopy(protobufList);
        }

        public static WeeklyTrendRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static WeeklyTrendRequest parseDelimitedFrom(InputStream inputStream) {
            return (WeeklyTrendRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static WeeklyTrendRequest parseFrom(ByteBuffer byteBuffer) {
            return (WeeklyTrendRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<WeeklyTrendRequest> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setCount(long j) {
            this.count_ = j;
        }

        private void setPeriod(String str) {
            str.getClass();
            this.period_ = str;
        }

        private void setPeriodBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.period_ = byteString.toStringUtf8();
        }

        private void setSymbols(int i, String str) {
            str.getClass();
            ensureSymbolsIsMutable();
            this.symbols_.set(i, str);
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (C50681.f43542xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new WeeklyTrendRequest();
                case 2:
                    return new Builder(null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ț\u0002\u0002\u0003Ȉ", new Object[]{"symbols_", "count_", "period_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<WeeklyTrendRequest> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (WeeklyTrendRequest.class) {
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

        @Override // flash.kline.v1.FlashProto.WeeklyTrendRequestOrBuilder
        public long getCount() {
            return this.count_;
        }

        @Override // flash.kline.v1.FlashProto.WeeklyTrendRequestOrBuilder
        public String getPeriod() {
            return this.period_;
        }

        @Override // flash.kline.v1.FlashProto.WeeklyTrendRequestOrBuilder
        public ByteString getPeriodBytes() {
            return ByteString.copyFromUtf8(this.period_);
        }

        @Override // flash.kline.v1.FlashProto.WeeklyTrendRequestOrBuilder
        public String getSymbols(int i) {
            return this.symbols_.get(i);
        }

        @Override // flash.kline.v1.FlashProto.WeeklyTrendRequestOrBuilder
        public ByteString getSymbolsBytes(int i) {
            return ByteString.copyFromUtf8(this.symbols_.get(i));
        }

        @Override // flash.kline.v1.FlashProto.WeeklyTrendRequestOrBuilder
        public int getSymbolsCount() {
            return this.symbols_.size();
        }

        @Override // flash.kline.v1.FlashProto.WeeklyTrendRequestOrBuilder
        public List<String> getSymbolsList() {
            return this.symbols_;
        }

        public static Builder newBuilder(WeeklyTrendRequest weeklyTrendRequest) {
            return DEFAULT_INSTANCE.createBuilder(weeklyTrendRequest);
        }

        public static WeeklyTrendRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (WeeklyTrendRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static WeeklyTrendRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (WeeklyTrendRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static WeeklyTrendRequest parseFrom(ByteString byteString) {
            return (WeeklyTrendRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static WeeklyTrendRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (WeeklyTrendRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static WeeklyTrendRequest parseFrom(byte[] bArr) {
            return (WeeklyTrendRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static WeeklyTrendRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (WeeklyTrendRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static WeeklyTrendRequest parseFrom(InputStream inputStream) {
            return (WeeklyTrendRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static WeeklyTrendRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (WeeklyTrendRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static WeeklyTrendRequest parseFrom(CodedInputStream codedInputStream) {
            return (WeeklyTrendRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static WeeklyTrendRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (WeeklyTrendRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public interface WeeklyTrendRequestOrBuilder extends MessageLiteOrBuilder {
        long getCount();

        String getPeriod();

        ByteString getPeriodBytes();

        String getSymbols(int i);

        ByteString getSymbolsBytes(int i);

        int getSymbolsCount();

        List<String> getSymbolsList();
    }

    /* JADX INFO: compiled from: Proguard */
    public enum action implements Internal.EnumLite {
        ACTION_UNSPECIFIED(0),
        ACTION_SUB_SCRIBE_SPOT_TICKER(ACTION_SUB_SCRIBE_SPOT_TICKER_VALUE),
        ACTION_SUBSCRIBE_SPOT_KLINE(ACTION_SUBSCRIBE_SPOT_KLINE_VALUE),
        ACTION_SUBSCRIBE_SPOT_TIMES(ACTION_SUBSCRIBE_SPOT_TIMES_VALUE),
        ACTION_SUBSCRIBE_SPOT_DEPTH(ACTION_SUBSCRIBE_SPOT_DEPTH_VALUE),
        ACTION_SUBSCRIBE_FUTURE_TICKER(ACTION_SUBSCRIBE_FUTURE_TICKER_VALUE),
        ACTION_SUBSCRIBE_FUTURE_KLINE(ACTION_SUBSCRIBE_FUTURE_KLINE_VALUE),
        ACTION_SUBSCRIBE_FUTURE_TIMES(ACTION_SUBSCRIBE_FUTURE_TIMES_VALUE),
        ACTION_SUBSCRIBE_FUTURE_DEPTH(ACTION_SUBSCRIBE_FUTURE_DEPTH_VALUE),
        ACTION_UPDATE_SPOT_TICKER(ACTION_UPDATE_SPOT_TICKER_VALUE),
        ACTION_UPDATE_SPOT_KLINE(ACTION_UPDATE_SPOT_KLINE_VALUE),
        ACTION_UPDATE_SPOT_TIMES(ACTION_UPDATE_SPOT_TIMES_VALUE),
        ACTION_UPDATE_SPOT_DEPTH(ACTION_UPDATE_SPOT_DEPTH_VALUE),
        ACTION_UPDATE_FUTURE_TICKER(ACTION_UPDATE_FUTURE_TICKER_VALUE),
        ACTION_UPDATE_FUTURE_KLINE(ACTION_UPDATE_FUTURE_KLINE_VALUE),
        ACTION_UPDATE_FUTURE_TIMES(ACTION_UPDATE_FUTURE_TIMES_VALUE),
        ACTION_UPDATE_FUTURE_DEPTH(ACTION_UPDATE_FUTURE_DEPTH_VALUE),
        ACTION_SUBSCRIBE_CANCEL(ACTION_SUBSCRIBE_CANCEL_VALUE),
        UNRECOGNIZED(-1);

        public static final int ACTION_SUBSCRIBE_CANCEL_VALUE = 10005;
        public static final int ACTION_SUBSCRIBE_FUTURE_DEPTH_VALUE = 10010;
        public static final int ACTION_SUBSCRIBE_FUTURE_KLINE_VALUE = 10003;
        public static final int ACTION_SUBSCRIBE_FUTURE_TICKER_VALUE = 10006;
        public static final int ACTION_SUBSCRIBE_FUTURE_TIMES_VALUE = 10008;
        public static final int ACTION_SUBSCRIBE_SPOT_DEPTH_VALUE = 10007;
        public static final int ACTION_SUBSCRIBE_SPOT_KLINE_VALUE = 10002;
        public static final int ACTION_SUBSCRIBE_SPOT_TIMES_VALUE = 10004;
        public static final int ACTION_SUB_SCRIBE_SPOT_TICKER_VALUE = 10001;
        public static final int ACTION_UNSPECIFIED_VALUE = 0;
        public static final int ACTION_UPDATE_FUTURE_DEPTH_VALUE = 20010;
        public static final int ACTION_UPDATE_FUTURE_KLINE_VALUE = 20003;
        public static final int ACTION_UPDATE_FUTURE_TICKER_VALUE = 20006;
        public static final int ACTION_UPDATE_FUTURE_TIMES_VALUE = 20008;
        public static final int ACTION_UPDATE_SPOT_DEPTH_VALUE = 20007;
        public static final int ACTION_UPDATE_SPOT_KLINE_VALUE = 20002;
        public static final int ACTION_UPDATE_SPOT_TICKER_VALUE = 20001;
        public static final int ACTION_UPDATE_SPOT_TIMES_VALUE = 20004;
        private static final Internal.EnumLiteMap<action> internalValueMap = new C50691();
        private final int value;

        /* JADX INFO: renamed from: flash.kline.v1.FlashProto$action$1 */
        /* JADX INFO: compiled from: Proguard */
        public class C50691 implements Internal.EnumLiteMap<action> {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public /* bridge */ /* synthetic */ Internal.EnumLite findValueByNumber(int i) {
                return findValueByNumber(i);
            }

            @Override // com.google.protobuf.Internal.EnumLiteMap
            public action findValueByNumber(int i) {
                return action.forNumber(i);
            }
        }

        /* JADX INFO: compiled from: Proguard */
        public static final class actionVerifier implements Internal.EnumVerifier {
            static final Internal.EnumVerifier INSTANCE = new actionVerifier();

            private actionVerifier() {
            }

            @Override // com.google.protobuf.Internal.EnumVerifier
            public boolean isInRange(int i) {
                return action.forNumber(i) != null;
            }
        }

        action(int i) {
            this.value = i;
        }

        public static action forNumber(int i) {
            if (i == 0) {
                return ACTION_UNSPECIFIED;
            }
            if (i == 10010) {
                return ACTION_SUBSCRIBE_FUTURE_DEPTH;
            }
            if (i == 20010) {
                return ACTION_UPDATE_FUTURE_DEPTH;
            }
            switch (i) {
                case ACTION_SUB_SCRIBE_SPOT_TICKER_VALUE:
                    return ACTION_SUB_SCRIBE_SPOT_TICKER;
                case ACTION_SUBSCRIBE_SPOT_KLINE_VALUE:
                    return ACTION_SUBSCRIBE_SPOT_KLINE;
                case ACTION_SUBSCRIBE_FUTURE_KLINE_VALUE:
                    return ACTION_SUBSCRIBE_FUTURE_KLINE;
                case ACTION_SUBSCRIBE_SPOT_TIMES_VALUE:
                    return ACTION_SUBSCRIBE_SPOT_TIMES;
                case ACTION_SUBSCRIBE_CANCEL_VALUE:
                    return ACTION_SUBSCRIBE_CANCEL;
                case ACTION_SUBSCRIBE_FUTURE_TICKER_VALUE:
                    return ACTION_SUBSCRIBE_FUTURE_TICKER;
                case ACTION_SUBSCRIBE_SPOT_DEPTH_VALUE:
                    return ACTION_SUBSCRIBE_SPOT_DEPTH;
                case ACTION_SUBSCRIBE_FUTURE_TIMES_VALUE:
                    return ACTION_SUBSCRIBE_FUTURE_TIMES;
                default:
                    switch (i) {
                        case ACTION_UPDATE_SPOT_TICKER_VALUE:
                            return ACTION_UPDATE_SPOT_TICKER;
                        case ACTION_UPDATE_SPOT_KLINE_VALUE:
                            return ACTION_UPDATE_SPOT_KLINE;
                        case ACTION_UPDATE_FUTURE_KLINE_VALUE:
                            return ACTION_UPDATE_FUTURE_KLINE;
                        case ACTION_UPDATE_SPOT_TIMES_VALUE:
                            return ACTION_UPDATE_SPOT_TIMES;
                        default:
                            switch (i) {
                                case ACTION_UPDATE_FUTURE_TICKER_VALUE:
                                    return ACTION_UPDATE_FUTURE_TICKER;
                                case ACTION_UPDATE_SPOT_DEPTH_VALUE:
                                    return ACTION_UPDATE_SPOT_DEPTH;
                                case ACTION_UPDATE_FUTURE_TIMES_VALUE:
                                    return ACTION_UPDATE_FUTURE_TIMES;
                                default:
                                    return null;
                            }
                    }
            }
        }

        public static Internal.EnumLiteMap<action> internalGetValueMap() {
            return internalValueMap;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return actionVerifier.INSTANCE;
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @Deprecated
        public static action valueOf(int i) {
            return forNumber(i);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public enum cancelType implements Internal.EnumLite {
        CANCEL_TYPE_UNSPECIFIED(0),
        CANCEL_TYPE_SPOT_TICKER(1),
        CANCEL_TYPE_SPOT_KLINE(2),
        CANCEL_TYPE_FUTURE_KLINE(3),
        CANCEL_TYPE_FUTURE_TICKER(4),
        CANCEL_TYPE_SPOT_DEPTH(5),
        CANCEL_TYPE_SPOT_TIMES(6),
        CANCEL_TYPE_FUTURE_TIMES(7),
        CANCEL_TYPE_FUTURE_DEPTH(8),
        UNRECOGNIZED(-1);

        public static final int CANCEL_TYPE_FUTURE_DEPTH_VALUE = 8;
        public static final int CANCEL_TYPE_FUTURE_KLINE_VALUE = 3;
        public static final int CANCEL_TYPE_FUTURE_TICKER_VALUE = 4;
        public static final int CANCEL_TYPE_FUTURE_TIMES_VALUE = 7;
        public static final int CANCEL_TYPE_SPOT_DEPTH_VALUE = 5;
        public static final int CANCEL_TYPE_SPOT_KLINE_VALUE = 2;
        public static final int CANCEL_TYPE_SPOT_TICKER_VALUE = 1;
        public static final int CANCEL_TYPE_SPOT_TIMES_VALUE = 6;
        public static final int CANCEL_TYPE_UNSPECIFIED_VALUE = 0;
        private static final Internal.EnumLiteMap<cancelType> internalValueMap = new C50701();
        private final int value;

        /* JADX INFO: renamed from: flash.kline.v1.FlashProto$cancelType$1 */
        /* JADX INFO: compiled from: Proguard */
        public class C50701 implements Internal.EnumLiteMap<cancelType> {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public /* bridge */ /* synthetic */ Internal.EnumLite findValueByNumber(int i) {
                return findValueByNumber(i);
            }

            @Override // com.google.protobuf.Internal.EnumLiteMap
            public cancelType findValueByNumber(int i) {
                return cancelType.forNumber(i);
            }
        }

        /* JADX INFO: compiled from: Proguard */
        public static final class cancelTypeVerifier implements Internal.EnumVerifier {
            static final Internal.EnumVerifier INSTANCE = new cancelTypeVerifier();

            private cancelTypeVerifier() {
            }

            @Override // com.google.protobuf.Internal.EnumVerifier
            public boolean isInRange(int i) {
                return cancelType.forNumber(i) != null;
            }
        }

        cancelType(int i) {
            this.value = i;
        }

        public static cancelType forNumber(int i) {
            switch (i) {
                case 0:
                    return CANCEL_TYPE_UNSPECIFIED;
                case 1:
                    return CANCEL_TYPE_SPOT_TICKER;
                case 2:
                    return CANCEL_TYPE_SPOT_KLINE;
                case 3:
                    return CANCEL_TYPE_FUTURE_KLINE;
                case 4:
                    return CANCEL_TYPE_FUTURE_TICKER;
                case 5:
                    return CANCEL_TYPE_SPOT_DEPTH;
                case 6:
                    return CANCEL_TYPE_SPOT_TIMES;
                case 7:
                    return CANCEL_TYPE_FUTURE_TIMES;
                case 8:
                    return CANCEL_TYPE_FUTURE_DEPTH;
                default:
                    return null;
            }
        }

        public static Internal.EnumLiteMap<cancelType> internalGetValueMap() {
            return internalValueMap;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return cancelTypeVerifier.INSTANCE;
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @Deprecated
        public static cancelType valueOf(int i) {
            return forNumber(i);
        }
    }

    private FlashProto() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }
}
