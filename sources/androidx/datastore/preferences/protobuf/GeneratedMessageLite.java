package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.AbstractMessageLite;
import androidx.datastore.preferences.protobuf.FieldSet;
import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import androidx.datastore.preferences.protobuf.GeneratedMessageLite.Builder;
import androidx.datastore.preferences.protobuf.Internal;
import androidx.datastore.preferences.protobuf.WireFormat;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public abstract class GeneratedMessageLite<MessageType extends GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends Builder<MessageType, BuilderType>> extends AbstractMessageLite<MessageType, BuilderType> {
    private static Map<Object, GeneratedMessageLite<?, ?>> defaultInstanceMap = new ConcurrentHashMap();
    protected int memoizedSerializedSize;
    protected UnknownFieldSetLite unknownFields;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.GeneratedMessageLite$1 */
    /* JADX INFO: compiled from: Proguard */
    public static /* synthetic */ class C15681 {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f23988a;

        static {
            int[] iArr = new int[WireFormat.JavaType.values().length];
            f23988a = iArr;
            try {
                iArr[WireFormat.JavaType.MESSAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23988a[WireFormat.JavaType.ENUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static abstract class Builder<MessageType extends GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends Builder<MessageType, BuilderType>> extends AbstractMessageLite.Builder<MessageType, BuilderType> {

        /* JADX INFO: renamed from: a */
        public final GeneratedMessageLite f23989a;

        /* JADX INFO: renamed from: b */
        public GeneratedMessageLite f23990b;

        /* JADX INFO: renamed from: c */
        public boolean f23991c = false;

        public Builder(GeneratedMessageLite generatedMessageLite) {
            this.f23989a = generatedMessageLite;
            this.f23990b = (GeneratedMessageLite) generatedMessageLite.mo8264h(MethodToInvoke.f23995d);
        }

        /* JADX INFO: renamed from: h */
        public static void m8510h(GeneratedMessageLite generatedMessageLite, GeneratedMessageLite generatedMessageLite2) {
            Protobuf protobuf = Protobuf.f24078c;
            protobuf.getClass();
            protobuf.m8582a(generatedMessageLite.getClass()).mo8562c(generatedMessageLite, generatedMessageLite2);
        }

        @Override // androidx.datastore.preferences.protobuf.MessageLite.Builder
        public /* bridge */ /* synthetic */ MessageLite buildPartial() {
            return mo8512e();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractMessageLite.Builder
        /* JADX INFO: renamed from: c */
        public final Builder mo8300c() {
            Builder builder = (Builder) this.f23989a.mo8264h(MethodToInvoke.f23996f);
            GeneratedMessageLite generatedMessageLiteMo8512e = mo8512e();
            builder.mo8513f();
            m8510h(builder.f23990b, generatedMessageLiteMo8512e);
            return builder;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractMessageLite.Builder
        public final Object clone() {
            Builder builder = (Builder) this.f23989a.mo8264h(MethodToInvoke.f23996f);
            GeneratedMessageLite generatedMessageLiteMo8512e = mo8512e();
            builder.mo8513f();
            m8510h(builder.f23990b, generatedMessageLiteMo8512e);
            return builder;
        }

        /* JADX INFO: renamed from: d */
        public final GeneratedMessageLite m8511d() {
            GeneratedMessageLite generatedMessageLiteMo8512e = mo8512e();
            if (generatedMessageLiteMo8512e.m8509l()) {
                return generatedMessageLiteMo8512e;
            }
            throw new UninitializedMessageException();
        }

        /* JADX INFO: renamed from: e */
        public GeneratedMessageLite mo8512e() {
            if (this.f23991c) {
                return this.f23990b;
            }
            GeneratedMessageLite generatedMessageLite = this.f23990b;
            generatedMessageLite.getClass();
            Protobuf protobuf = Protobuf.f24078c;
            protobuf.getClass();
            protobuf.m8582a(generatedMessageLite.getClass()).makeImmutable(generatedMessageLite);
            this.f23991c = true;
            return this.f23990b;
        }

        /* JADX INFO: renamed from: f */
        public void mo8513f() {
            if (this.f23991c) {
                GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) this.f23990b.mo8264h(MethodToInvoke.f23995d);
                m8510h(generatedMessageLite, this.f23990b);
                this.f23990b = generatedMessageLite;
                this.f23991c = false;
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static class DefaultInstanceBasedParser<T extends GeneratedMessageLite<T, ?>> extends AbstractParser<T> {
    }

    /* JADX INFO: compiled from: Proguard */
    public static abstract class ExtendableBuilder<MessageType extends ExtendableMessage<MessageType, BuilderType>, BuilderType extends ExtendableBuilder<MessageType, BuilderType>> extends Builder<MessageType, BuilderType> implements ExtendableMessageOrBuilder<MessageType, BuilderType> {
        @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite.Builder, androidx.datastore.preferences.protobuf.MessageLite.Builder
        public final MessageLite buildPartial() {
            if (this.f23991c) {
                return (ExtendableMessage) this.f23990b;
            }
            ((ExtendableMessage) this.f23990b).extensions.m8497h();
            return (ExtendableMessage) super.mo8512e();
        }

        @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite.Builder
        /* JADX INFO: renamed from: e */
        public final GeneratedMessageLite mo8512e() {
            if (this.f23991c) {
                return (ExtendableMessage) this.f23990b;
            }
            ((ExtendableMessage) this.f23990b).extensions.m8497h();
            return (ExtendableMessage) super.mo8512e();
        }

        @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite.Builder
        /* JADX INFO: renamed from: f */
        public final void mo8513f() {
            if (this.f23991c) {
                super.mo8513f();
                ExtendableMessage extendableMessage = (ExtendableMessage) this.f23990b;
                extendableMessage.extensions = extendableMessage.extensions.m8494a();
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static abstract class ExtendableMessage<MessageType extends ExtendableMessage<MessageType, BuilderType>, BuilderType extends ExtendableBuilder<MessageType, BuilderType>> extends GeneratedMessageLite<MessageType, BuilderType> implements ExtendableMessageOrBuilder<MessageType, BuilderType> {
        protected FieldSet<ExtensionDescriptor> extensions;

        /* JADX INFO: compiled from: Proguard */
        public class ExtensionWriter {
        }

        @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite, androidx.datastore.preferences.protobuf.MessageLiteOrBuilder
        /* JADX INFO: renamed from: a */
        public final GeneratedMessageLite mo8507a() {
            return (GeneratedMessageLite) mo8264h(MethodToInvoke.f23997g);
        }

        @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite, androidx.datastore.preferences.protobuf.MessageLite
        public final Builder newBuilderForType() {
            return (Builder) mo8264h(MethodToInvoke.f23996f);
        }

        @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite, androidx.datastore.preferences.protobuf.MessageLite
        public final Builder toBuilder() {
            Builder builder = (Builder) mo8264h(MethodToInvoke.f23996f);
            builder.mo8513f();
            Builder.m8510h(builder.f23990b, this);
            return builder;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public interface ExtendableMessageOrBuilder<MessageType extends ExtendableMessage<MessageType, BuilderType>, BuilderType extends ExtendableBuilder<MessageType, BuilderType>> extends MessageLiteOrBuilder {
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class ExtensionDescriptor implements FieldSet.FieldDescriptorLite<ExtensionDescriptor> {
        @Override // java.lang.Comparable
        public final int compareTo(Object obj) {
            ((ExtensionDescriptor) obj).getClass();
            return 0;
        }

        @Override // androidx.datastore.preferences.protobuf.FieldSet.FieldDescriptorLite
        public final WireFormat.JavaType getLiteJavaType() {
            throw null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static class GeneratedExtension<ContainingType extends MessageLite, Type> extends ExtensionLite<ContainingType, Type> {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: Proguard */
    public static final class MethodToInvoke {

        /* JADX INFO: renamed from: a */
        public static final MethodToInvoke f23992a;

        /* JADX INFO: renamed from: b */
        public static final MethodToInvoke f23993b;

        /* JADX INFO: renamed from: c */
        public static final MethodToInvoke f23994c;

        /* JADX INFO: renamed from: d */
        public static final MethodToInvoke f23995d;

        /* JADX INFO: renamed from: f */
        public static final MethodToInvoke f23996f;

        /* JADX INFO: renamed from: g */
        public static final MethodToInvoke f23997g;

        /* JADX INFO: renamed from: i */
        public static final /* synthetic */ MethodToInvoke[] f23998i;

        static {
            MethodToInvoke methodToInvoke = new MethodToInvoke("GET_MEMOIZED_IS_INITIALIZED", 0);
            f23992a = methodToInvoke;
            MethodToInvoke methodToInvoke2 = new MethodToInvoke("SET_MEMOIZED_IS_INITIALIZED", 1);
            f23993b = methodToInvoke2;
            MethodToInvoke methodToInvoke3 = new MethodToInvoke("BUILD_MESSAGE_INFO", 2);
            f23994c = methodToInvoke3;
            MethodToInvoke methodToInvoke4 = new MethodToInvoke("NEW_MUTABLE_INSTANCE", 3);
            f23995d = methodToInvoke4;
            MethodToInvoke methodToInvoke5 = new MethodToInvoke("NEW_BUILDER", 4);
            f23996f = methodToInvoke5;
            MethodToInvoke methodToInvoke6 = new MethodToInvoke("GET_DEFAULT_INSTANCE", 5);
            f23997g = methodToInvoke6;
            f23998i = new MethodToInvoke[]{methodToInvoke, methodToInvoke2, methodToInvoke3, methodToInvoke4, methodToInvoke5, methodToInvoke6, new MethodToInvoke("GET_PARSER", 6)};
        }

        public static MethodToInvoke valueOf(String str) {
            return (MethodToInvoke) java.lang.Enum.valueOf(MethodToInvoke.class, str);
        }

        public static MethodToInvoke[] values() {
            return (MethodToInvoke[]) f23998i.clone();
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class SerializedForm implements Serializable {
    }

    public GeneratedMessageLite() {
        this.memoizedHashCode = 0;
        this.unknownFields = UnknownFieldSetLite.f24143f;
        this.memoizedSerializedSize = -1;
    }

    /* JADX INFO: renamed from: i */
    public static Internal.ProtobufList m8501i() {
        return ProtobufArrayList.f24081d;
    }

    /* JADX INFO: renamed from: j */
    public static GeneratedMessageLite m8502j(Class cls) {
        GeneratedMessageLite<?, ?> generatedMessageLite = defaultInstanceMap.get(cls);
        if (generatedMessageLite == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                generatedMessageLite = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (generatedMessageLite != null) {
            return generatedMessageLite;
        }
        GeneratedMessageLite<?, ?> generatedMessageLite2 = (GeneratedMessageLite) ((GeneratedMessageLite) UnsafeUtil.m8662a(cls)).mo8264h(MethodToInvoke.f23997g);
        if (generatedMessageLite2 == null) {
            throw new IllegalStateException();
        }
        defaultInstanceMap.put(cls, generatedMessageLite2);
        return generatedMessageLite2;
    }

    /* JADX INFO: renamed from: k */
    public static Object m8503k(java.lang.reflect.Method method, MessageLite messageLite, Object... objArr) {
        try {
            return method.invoke(messageLite, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    /* JADX INFO: renamed from: m */
    public static Object m8504m(GeneratedMessageLite generatedMessageLite, String str, Object[] objArr) {
        return new RawMessageInfo(generatedMessageLite, str, objArr);
    }

    /* JADX INFO: renamed from: n */
    public static GeneratedMessageLite m8505n(GeneratedMessageLite generatedMessageLite, CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        GeneratedMessageLite generatedMessageLite2 = (GeneratedMessageLite) generatedMessageLite.mo8264h(MethodToInvoke.f23995d);
        try {
            Protobuf protobuf = Protobuf.f24078c;
            protobuf.getClass();
            Schema schemaM8582a = protobuf.m8582a(generatedMessageLite2.getClass());
            CodedInputStreamReader codedInputStreamReader = codedInputStream.f23870b;
            if (codedInputStreamReader == null) {
                codedInputStreamReader = new CodedInputStreamReader(codedInputStream);
            }
            schemaM8582a.mo8560a(generatedMessageLite2, codedInputStreamReader, extensionRegistryLite);
            schemaM8582a.makeImmutable(generatedMessageLite2);
            return generatedMessageLite2;
        } catch (IOException e) {
            if (e.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e.getCause());
            }
            throw new InvalidProtocolBufferException(e.getMessage());
        } catch (RuntimeException e2) {
            if (e2.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e2.getCause());
            }
            throw e2;
        }
    }

    /* JADX INFO: renamed from: o */
    public static void m8506o(Class cls, GeneratedMessageLite generatedMessageLite) {
        defaultInstanceMap.put(cls, generatedMessageLite);
    }

    @Override // androidx.datastore.preferences.protobuf.MessageLiteOrBuilder
    /* JADX INFO: renamed from: a */
    public GeneratedMessageLite mo8507a() {
        return (GeneratedMessageLite) mo8264h(MethodToInvoke.f23997g);
    }

    @Override // androidx.datastore.preferences.protobuf.MessageLite
    /* JADX INFO: renamed from: b */
    public final void mo8508b(CodedOutputStream codedOutputStream) {
        Protobuf protobuf = Protobuf.f24078c;
        protobuf.getClass();
        Schema schemaM8582a = protobuf.m8582a(getClass());
        CodedOutputStreamWriter codedOutputStreamWriter = codedOutputStream.f23903a;
        if (codedOutputStreamWriter == null) {
            codedOutputStreamWriter = new CodedOutputStreamWriter(codedOutputStream);
        }
        schemaM8582a.mo8564e(this, codedOutputStreamWriter);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractMessageLite
    /* JADX INFO: renamed from: d */
    public final int mo8296d() {
        return this.memoizedSerializedSize;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!((GeneratedMessageLite) mo8264h(MethodToInvoke.f23997g)).getClass().isInstance(obj)) {
            return false;
        }
        Protobuf protobuf = Protobuf.f24078c;
        protobuf.getClass();
        return protobuf.m8582a(getClass()).mo8565f(this, (GeneratedMessageLite) obj);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractMessageLite
    /* JADX INFO: renamed from: f */
    public final void mo8298f(int i) {
        this.memoizedSerializedSize = i;
    }

    @Override // androidx.datastore.preferences.protobuf.MessageLite
    public final int getSerializedSize() {
        if (this.memoizedSerializedSize == -1) {
            Protobuf protobuf = Protobuf.f24078c;
            protobuf.getClass();
            this.memoizedSerializedSize = protobuf.m8582a(getClass()).mo8561b(this);
        }
        return this.memoizedSerializedSize;
    }

    /* JADX INFO: renamed from: h */
    public abstract Object mo8264h(MethodToInvoke methodToInvoke);

    public final int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        Protobuf protobuf = Protobuf.f24078c;
        protobuf.getClass();
        int iMo8563d = protobuf.m8582a(getClass()).mo8563d(this);
        this.memoizedHashCode = iMo8563d;
        return iMo8563d;
    }

    /* JADX INFO: renamed from: l */
    public final boolean m8509l() {
        byte bByteValue = ((Byte) mo8264h(MethodToInvoke.f23992a)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        Protobuf protobuf = Protobuf.f24078c;
        protobuf.getClass();
        boolean zIsInitialized = protobuf.m8582a(getClass()).isInitialized(this);
        mo8264h(MethodToInvoke.f23993b);
        return zIsInitialized;
    }

    @Override // androidx.datastore.preferences.protobuf.MessageLite
    public Builder newBuilderForType() {
        return (Builder) mo8264h(MethodToInvoke.f23996f);
    }

    @Override // androidx.datastore.preferences.protobuf.MessageLite
    public Builder toBuilder() {
        Builder builder = (Builder) mo8264h(MethodToInvoke.f23996f);
        builder.mo8513f();
        Builder.m8510h(builder.f23990b, this);
        return builder;
    }

    public final String toString() {
        StringBuilder sbM21r = AbstractC0000a.m21r("# ", super.toString());
        MessageLiteToString.m8541c(this, sbM21r, 0);
        return sbM21r.toString();
    }
}
