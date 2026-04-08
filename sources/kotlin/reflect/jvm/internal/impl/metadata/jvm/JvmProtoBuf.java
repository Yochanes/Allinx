package kotlin.reflect.jvm.internal.impl.metadata.jvm;

import com.engagelab.privates.common.observer.MTObservable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractParser;
import kotlin.reflect.jvm.internal.impl.protobuf.ByteString;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.Internal;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder;
import kotlin.reflect.jvm.internal.impl.protobuf.Parser;
import kotlin.reflect.jvm.internal.impl.protobuf.WireFormat;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class JvmProtoBuf {

    /* JADX INFO: renamed from: a */
    public static final GeneratedMessageLite.GeneratedExtension f53917a;

    /* JADX INFO: renamed from: b */
    public static final GeneratedMessageLite.GeneratedExtension f53918b;

    /* JADX INFO: renamed from: c */
    public static final GeneratedMessageLite.GeneratedExtension f53919c;

    /* JADX INFO: renamed from: d */
    public static final GeneratedMessageLite.GeneratedExtension f53920d;

    /* JADX INFO: renamed from: e */
    public static final GeneratedMessageLite.GeneratedExtension f53921e;

    /* JADX INFO: renamed from: f */
    public static final GeneratedMessageLite.GeneratedExtension f53922f;

    /* JADX INFO: renamed from: g */
    public static final GeneratedMessageLite.GeneratedExtension f53923g;

    /* JADX INFO: renamed from: h */
    public static final GeneratedMessageLite.GeneratedExtension f53924h;

    /* JADX INFO: renamed from: i */
    public static final GeneratedMessageLite.GeneratedExtension f53925i;

    /* JADX INFO: renamed from: j */
    public static final GeneratedMessageLite.GeneratedExtension f53926j;

    /* JADX INFO: renamed from: k */
    public static final GeneratedMessageLite.GeneratedExtension f53927k;

    /* JADX INFO: renamed from: l */
    public static final GeneratedMessageLite.GeneratedExtension f53928l;

    /* JADX INFO: renamed from: m */
    public static final GeneratedMessageLite.GeneratedExtension f53929m;

    /* JADX INFO: renamed from: n */
    public static final GeneratedMessageLite.GeneratedExtension f53930n;

    /* JADX INFO: compiled from: Proguard */
    public interface JvmFieldSignatureOrBuilder extends MessageLiteOrBuilder {
    }

    /* JADX INFO: compiled from: Proguard */
    public interface JvmMethodSignatureOrBuilder extends MessageLiteOrBuilder {
    }

    /* JADX INFO: compiled from: Proguard */
    public interface JvmPropertySignatureOrBuilder extends MessageLiteOrBuilder {
    }

    /* JADX INFO: compiled from: Proguard */
    public interface StringTableTypesOrBuilder extends MessageLiteOrBuilder {
    }

    static {
        ProtoBuf.Constructor constructor = ProtoBuf.Constructor.f53456n;
        JvmMethodSignature jvmMethodSignature = JvmMethodSignature.f53942i;
        WireFormat.FieldType fieldType = WireFormat.FieldType.f54180r;
        f53917a = GeneratedMessageLite.m19696c(constructor, jvmMethodSignature, jvmMethodSignature, 100, fieldType, JvmMethodSignature.class);
        ProtoBuf.Function function = ProtoBuf.Function.f53538z;
        f53918b = GeneratedMessageLite.m19696c(function, jvmMethodSignature, jvmMethodSignature, 100, fieldType, JvmMethodSignature.class);
        WireFormat.FieldType fieldType2 = WireFormat.FieldType.f54174i;
        f53919c = GeneratedMessageLite.m19696c(function, 0, null, MTObservable.WHAT_OBSERVER, fieldType2, Integer.class);
        ProtoBuf.Property property = ProtoBuf.Property.f53610z;
        JvmPropertySignature jvmPropertySignature = JvmPropertySignature.f53953o;
        f53920d = GeneratedMessageLite.m19696c(property, jvmPropertySignature, jvmPropertySignature, 100, fieldType, JvmPropertySignature.class);
        f53921e = GeneratedMessageLite.m19696c(property, 0, null, MTObservable.WHAT_OBSERVER, fieldType2, Integer.class);
        ProtoBuf.Type type = ProtoBuf.Type.f53679y;
        ProtoBuf.Annotation annotation = ProtoBuf.Annotation.f53322i;
        f53922f = GeneratedMessageLite.m19695b(type, annotation, 100, fieldType, ProtoBuf.Annotation.class);
        f53923g = GeneratedMessageLite.m19696c(type, Boolean.FALSE, null, MTObservable.WHAT_OBSERVER, WireFormat.FieldType.f54177o, Boolean.class);
        f53924h = GeneratedMessageLite.m19695b(ProtoBuf.TypeParameter.f53758r, annotation, 100, fieldType, ProtoBuf.Annotation.class);
        ProtoBuf.Class r7 = ProtoBuf.Class.f53388O;
        f53925i = GeneratedMessageLite.m19696c(r7, 0, null, MTObservable.WHAT_OBSERVER, fieldType2, Integer.class);
        f53926j = GeneratedMessageLite.m19695b(r7, property, 102, fieldType, ProtoBuf.Property.class);
        f53927k = GeneratedMessageLite.m19696c(r7, 0, null, 103, fieldType2, Integer.class);
        f53928l = GeneratedMessageLite.m19696c(r7, 0, null, 104, fieldType2, Integer.class);
        ProtoBuf.Package r72 = ProtoBuf.Package.f53577p;
        f53929m = GeneratedMessageLite.m19696c(r72, 0, null, MTObservable.WHAT_OBSERVER, fieldType2, Integer.class);
        f53930n = GeneratedMessageLite.m19695b(r72, property, 102, fieldType, ProtoBuf.Property.class);
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class JvmFieldSignature extends GeneratedMessageLite implements JvmFieldSignatureOrBuilder {

        /* JADX INFO: renamed from: i */
        public static final JvmFieldSignature f53931i;

        /* JADX INFO: renamed from: j */
        public static final Parser f53932j = new C61471();

        /* JADX INFO: renamed from: a */
        public final ByteString f53933a;

        /* JADX INFO: renamed from: b */
        public int f53934b;

        /* JADX INFO: renamed from: c */
        public int f53935c;

        /* JADX INFO: renamed from: d */
        public int f53936d;

        /* JADX INFO: renamed from: f */
        public byte f53937f;

        /* JADX INFO: renamed from: g */
        public int f53938g;

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmFieldSignature$1 */
        /* JADX INFO: compiled from: Proguard */
        public static class C61471 extends AbstractParser<JvmFieldSignature> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            /* JADX INFO: renamed from: a */
            public final Object mo19417a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new JvmFieldSignature(codedInputStream);
            }
        }

        /* JADX INFO: compiled from: Proguard */
        public static final class Builder extends GeneratedMessageLite.Builder<JvmFieldSignature, Builder> implements JvmFieldSignatureOrBuilder {

            /* JADX INFO: renamed from: b */
            public int f53939b;

            /* JADX INFO: renamed from: c */
            public int f53940c;

            /* JADX INFO: renamed from: d */
            public int f53941d;

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: b */
            public final AbstractMessageLite.Builder mo19418b() {
                Builder builder = new Builder();
                builder.m19544h(m19543f());
                return builder;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public final MessageLite build() {
                JvmFieldSignature jvmFieldSignatureM19543f = m19543f();
                jvmFieldSignatureM19543f.isInitialized();
                return jvmFieldSignatureM19543f;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: c */
            public final /* bridge */ /* synthetic */ AbstractMessageLite.Builder mo19419c(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                m19545i(codedInputStream, extensionRegistryLite);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            public final Object clone() {
                Builder builder = new Builder();
                builder.m19544h(m19543f());
                return builder;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* JADX INFO: renamed from: d */
            public final GeneratedMessageLite.Builder mo19420d() {
                Builder builder = new Builder();
                builder.m19544h(m19543f());
                return builder;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* JADX INFO: renamed from: e */
            public final /* bridge */ /* synthetic */ GeneratedMessageLite.Builder mo19421e(GeneratedMessageLite generatedMessageLite) {
                m19544h((JvmFieldSignature) generatedMessageLite);
                return this;
            }

            /* JADX INFO: renamed from: f */
            public final JvmFieldSignature m19543f() {
                JvmFieldSignature jvmFieldSignature = new JvmFieldSignature(this);
                int i = this.f53939b;
                int i2 = (i & 1) != 1 ? 0 : 1;
                jvmFieldSignature.f53935c = this.f53940c;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                jvmFieldSignature.f53936d = this.f53941d;
                jvmFieldSignature.f53934b = i2;
                return jvmFieldSignature;
            }

            /* JADX INFO: renamed from: h */
            public final void m19544h(JvmFieldSignature jvmFieldSignature) {
                if (jvmFieldSignature == JvmFieldSignature.f53931i) {
                    return;
                }
                int i = jvmFieldSignature.f53934b;
                if ((i & 1) == 1) {
                    int i2 = jvmFieldSignature.f53935c;
                    this.f53939b = 1 | this.f53939b;
                    this.f53940c = i2;
                }
                if ((i & 2) == 2) {
                    int i3 = jvmFieldSignature.f53936d;
                    this.f53939b = 2 | this.f53939b;
                    this.f53941d = i3;
                }
                this.f54106a = this.f54106a.m19625c(jvmFieldSignature.f53933a);
            }

            /* JADX WARN: Removed duplicated region for block: B:14:0x001d  */
            /* JADX INFO: renamed from: i */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void m19545i(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                JvmFieldSignature jvmFieldSignature = null;
                try {
                    try {
                        ((C61471) JvmFieldSignature.f53932j).getClass();
                        m19544h(new JvmFieldSignature(codedInputStream));
                    } catch (InvalidProtocolBufferException e) {
                        JvmFieldSignature jvmFieldSignature2 = (JvmFieldSignature) e.f54121a;
                        try {
                            throw e;
                        } catch (Throwable th) {
                            th = th;
                            jvmFieldSignature = jvmFieldSignature2;
                            if (jvmFieldSignature != null) {
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (jvmFieldSignature != null) {
                        m19544h(jvmFieldSignature);
                    }
                    throw th;
                }
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* JADX INFO: renamed from: n */
            public final /* bridge */ /* synthetic */ MessageLite.Builder mo19425n(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                m19545i(codedInputStream, extensionRegistryLite);
                return this;
            }
        }

        static {
            JvmFieldSignature jvmFieldSignature = new JvmFieldSignature();
            f53931i = jvmFieldSignature;
            jvmFieldSignature.f53935c = 0;
            jvmFieldSignature.f53936d = 0;
        }

        public JvmFieldSignature() {
            this.f53937f = (byte) -1;
            this.f53938g = -1;
            this.f53933a = ByteString.f54075a;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        /* JADX INFO: renamed from: a */
        public final void mo19416a(CodedOutputStream codedOutputStream) {
            getSerializedSize();
            if ((this.f53934b & 1) == 1) {
                codedOutputStream.m19670m(1, this.f53935c);
            }
            if ((this.f53934b & 2) == 2) {
                codedOutputStream.m19670m(2, this.f53936d);
            }
            codedOutputStream.m19675r(this.f53933a);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final int getSerializedSize() {
            int i = this.f53938g;
            if (i != -1) {
                return i;
            }
            int iM19659b = (this.f53934b & 1) == 1 ? CodedOutputStream.m19659b(1, this.f53935c) : 0;
            if ((this.f53934b & 2) == 2) {
                iM19659b += CodedOutputStream.m19659b(2, this.f53936d);
            }
            int size = this.f53933a.size() + iM19659b;
            this.f53938g = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            if (this.f53937f == 1) {
                return true;
            }
            this.f53937f = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final MessageLite.Builder newBuilderForType() {
            return new Builder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final MessageLite.Builder toBuilder() {
            Builder builder = new Builder();
            builder.m19544h(this);
            return builder;
        }

        public JvmFieldSignature(Builder builder) {
            this.f53937f = (byte) -1;
            this.f53938g = -1;
            this.f53933a = builder.f54106a;
        }

        public JvmFieldSignature(CodedInputStream codedInputStream) {
            this.f53937f = (byte) -1;
            this.f53938g = -1;
            boolean z2 = false;
            this.f53935c = 0;
            this.f53936d = 0;
            ByteString.Output output = new ByteString.Output();
            CodedOutputStream codedOutputStreamM19666j = CodedOutputStream.m19666j(output, 1);
            while (!z2) {
                try {
                    try {
                        int iM19652n = codedInputStream.m19652n();
                        if (iM19652n != 0) {
                            if (iM19652n == 8) {
                                this.f53934b |= 1;
                                this.f53935c = codedInputStream.m19649k();
                            } else if (iM19652n != 16) {
                                if (!codedInputStream.m19655q(iM19652n, codedOutputStreamM19666j)) {
                                }
                            } else {
                                this.f53934b |= 2;
                                this.f53936d = codedInputStream.m19649k();
                            }
                        }
                        z2 = true;
                    } catch (Throwable th) {
                        try {
                            codedOutputStreamM19666j.m19667i();
                        } catch (IOException unused) {
                        } catch (Throwable th2) {
                            throw th2;
                        }
                        throw th;
                    }
                } catch (InvalidProtocolBufferException e) {
                    e.f54121a = this;
                    throw e;
                } catch (IOException e2) {
                    InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e2.getMessage());
                    invalidProtocolBufferException.f54121a = this;
                    throw invalidProtocolBufferException;
                }
            }
            try {
                codedOutputStreamM19666j.m19667i();
            } catch (IOException unused2) {
            } finally {
                this.f53933a = output.m19638d();
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class JvmMethodSignature extends GeneratedMessageLite implements JvmMethodSignatureOrBuilder {

        /* JADX INFO: renamed from: i */
        public static final JvmMethodSignature f53942i;

        /* JADX INFO: renamed from: j */
        public static final Parser f53943j = new C61481();

        /* JADX INFO: renamed from: a */
        public final ByteString f53944a;

        /* JADX INFO: renamed from: b */
        public int f53945b;

        /* JADX INFO: renamed from: c */
        public int f53946c;

        /* JADX INFO: renamed from: d */
        public int f53947d;

        /* JADX INFO: renamed from: f */
        public byte f53948f;

        /* JADX INFO: renamed from: g */
        public int f53949g;

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmMethodSignature$1 */
        /* JADX INFO: compiled from: Proguard */
        public static class C61481 extends AbstractParser<JvmMethodSignature> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            /* JADX INFO: renamed from: a */
            public final Object mo19417a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new JvmMethodSignature(codedInputStream);
            }
        }

        /* JADX INFO: compiled from: Proguard */
        public static final class Builder extends GeneratedMessageLite.Builder<JvmMethodSignature, Builder> implements JvmMethodSignatureOrBuilder {

            /* JADX INFO: renamed from: b */
            public int f53950b;

            /* JADX INFO: renamed from: c */
            public int f53951c;

            /* JADX INFO: renamed from: d */
            public int f53952d;

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: b */
            public final AbstractMessageLite.Builder mo19418b() {
                Builder builder = new Builder();
                builder.m19548h(m19547f());
                return builder;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public final MessageLite build() {
                JvmMethodSignature jvmMethodSignatureM19547f = m19547f();
                jvmMethodSignatureM19547f.isInitialized();
                return jvmMethodSignatureM19547f;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: c */
            public final /* bridge */ /* synthetic */ AbstractMessageLite.Builder mo19419c(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                m19549i(codedInputStream, extensionRegistryLite);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            public final Object clone() {
                Builder builder = new Builder();
                builder.m19548h(m19547f());
                return builder;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* JADX INFO: renamed from: d */
            public final GeneratedMessageLite.Builder mo19420d() {
                Builder builder = new Builder();
                builder.m19548h(m19547f());
                return builder;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* JADX INFO: renamed from: e */
            public final /* bridge */ /* synthetic */ GeneratedMessageLite.Builder mo19421e(GeneratedMessageLite generatedMessageLite) {
                m19548h((JvmMethodSignature) generatedMessageLite);
                return this;
            }

            /* JADX INFO: renamed from: f */
            public final JvmMethodSignature m19547f() {
                JvmMethodSignature jvmMethodSignature = new JvmMethodSignature(this);
                int i = this.f53950b;
                int i2 = (i & 1) != 1 ? 0 : 1;
                jvmMethodSignature.f53946c = this.f53951c;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                jvmMethodSignature.f53947d = this.f53952d;
                jvmMethodSignature.f53945b = i2;
                return jvmMethodSignature;
            }

            /* JADX INFO: renamed from: h */
            public final void m19548h(JvmMethodSignature jvmMethodSignature) {
                if (jvmMethodSignature == JvmMethodSignature.f53942i) {
                    return;
                }
                int i = jvmMethodSignature.f53945b;
                if ((i & 1) == 1) {
                    int i2 = jvmMethodSignature.f53946c;
                    this.f53950b = 1 | this.f53950b;
                    this.f53951c = i2;
                }
                if ((i & 2) == 2) {
                    int i3 = jvmMethodSignature.f53947d;
                    this.f53950b = 2 | this.f53950b;
                    this.f53952d = i3;
                }
                this.f54106a = this.f54106a.m19625c(jvmMethodSignature.f53944a);
            }

            /* JADX WARN: Removed duplicated region for block: B:14:0x001d  */
            /* JADX INFO: renamed from: i */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void m19549i(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                JvmMethodSignature jvmMethodSignature = null;
                try {
                    try {
                        ((C61481) JvmMethodSignature.f53943j).getClass();
                        m19548h(new JvmMethodSignature(codedInputStream));
                    } catch (InvalidProtocolBufferException e) {
                        JvmMethodSignature jvmMethodSignature2 = (JvmMethodSignature) e.f54121a;
                        try {
                            throw e;
                        } catch (Throwable th) {
                            th = th;
                            jvmMethodSignature = jvmMethodSignature2;
                            if (jvmMethodSignature != null) {
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (jvmMethodSignature != null) {
                        m19548h(jvmMethodSignature);
                    }
                    throw th;
                }
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* JADX INFO: renamed from: n */
            public final /* bridge */ /* synthetic */ MessageLite.Builder mo19425n(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                m19549i(codedInputStream, extensionRegistryLite);
                return this;
            }
        }

        static {
            JvmMethodSignature jvmMethodSignature = new JvmMethodSignature();
            f53942i = jvmMethodSignature;
            jvmMethodSignature.f53946c = 0;
            jvmMethodSignature.f53947d = 0;
        }

        public JvmMethodSignature() {
            this.f53948f = (byte) -1;
            this.f53949g = -1;
            this.f53944a = ByteString.f54075a;
        }

        /* JADX INFO: renamed from: d */
        public static Builder m19546d(JvmMethodSignature jvmMethodSignature) {
            Builder builder = new Builder();
            builder.m19548h(jvmMethodSignature);
            return builder;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        /* JADX INFO: renamed from: a */
        public final void mo19416a(CodedOutputStream codedOutputStream) {
            getSerializedSize();
            if ((this.f53945b & 1) == 1) {
                codedOutputStream.m19670m(1, this.f53946c);
            }
            if ((this.f53945b & 2) == 2) {
                codedOutputStream.m19670m(2, this.f53947d);
            }
            codedOutputStream.m19675r(this.f53944a);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final int getSerializedSize() {
            int i = this.f53949g;
            if (i != -1) {
                return i;
            }
            int iM19659b = (this.f53945b & 1) == 1 ? CodedOutputStream.m19659b(1, this.f53946c) : 0;
            if ((this.f53945b & 2) == 2) {
                iM19659b += CodedOutputStream.m19659b(2, this.f53947d);
            }
            int size = this.f53944a.size() + iM19659b;
            this.f53949g = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            if (this.f53948f == 1) {
                return true;
            }
            this.f53948f = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final MessageLite.Builder newBuilderForType() {
            return new Builder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final MessageLite.Builder toBuilder() {
            return m19546d(this);
        }

        public JvmMethodSignature(Builder builder) {
            this.f53948f = (byte) -1;
            this.f53949g = -1;
            this.f53944a = builder.f54106a;
        }

        public JvmMethodSignature(CodedInputStream codedInputStream) {
            this.f53948f = (byte) -1;
            this.f53949g = -1;
            boolean z2 = false;
            this.f53946c = 0;
            this.f53947d = 0;
            ByteString.Output output = new ByteString.Output();
            CodedOutputStream codedOutputStreamM19666j = CodedOutputStream.m19666j(output, 1);
            while (!z2) {
                try {
                    try {
                        int iM19652n = codedInputStream.m19652n();
                        if (iM19652n != 0) {
                            if (iM19652n == 8) {
                                this.f53945b |= 1;
                                this.f53946c = codedInputStream.m19649k();
                            } else if (iM19652n != 16) {
                                if (!codedInputStream.m19655q(iM19652n, codedOutputStreamM19666j)) {
                                }
                            } else {
                                this.f53945b |= 2;
                                this.f53947d = codedInputStream.m19649k();
                            }
                        }
                        z2 = true;
                    } catch (Throwable th) {
                        try {
                            codedOutputStreamM19666j.m19667i();
                        } catch (IOException unused) {
                        } catch (Throwable th2) {
                            throw th2;
                        }
                        throw th;
                    }
                } catch (InvalidProtocolBufferException e) {
                    e.f54121a = this;
                    throw e;
                } catch (IOException e2) {
                    InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e2.getMessage());
                    invalidProtocolBufferException.f54121a = this;
                    throw invalidProtocolBufferException;
                }
            }
            try {
                codedOutputStreamM19666j.m19667i();
            } catch (IOException unused2) {
            } finally {
                this.f53944a = output.m19638d();
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class JvmPropertySignature extends GeneratedMessageLite implements JvmPropertySignatureOrBuilder {

        /* JADX INFO: renamed from: o */
        public static final JvmPropertySignature f53953o;

        /* JADX INFO: renamed from: p */
        public static final Parser f53954p = new C61491();

        /* JADX INFO: renamed from: a */
        public final ByteString f53955a;

        /* JADX INFO: renamed from: b */
        public int f53956b;

        /* JADX INFO: renamed from: c */
        public JvmFieldSignature f53957c;

        /* JADX INFO: renamed from: d */
        public JvmMethodSignature f53958d;

        /* JADX INFO: renamed from: f */
        public JvmMethodSignature f53959f;

        /* JADX INFO: renamed from: g */
        public JvmMethodSignature f53960g;

        /* JADX INFO: renamed from: i */
        public JvmMethodSignature f53961i;

        /* JADX INFO: renamed from: j */
        public byte f53962j;

        /* JADX INFO: renamed from: n */
        public int f53963n;

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmPropertySignature$1 */
        /* JADX INFO: compiled from: Proguard */
        public static class C61491 extends AbstractParser<JvmPropertySignature> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            /* JADX INFO: renamed from: a */
            public final Object mo19417a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new JvmPropertySignature(codedInputStream, extensionRegistryLite);
            }
        }

        /* JADX INFO: compiled from: Proguard */
        public static final class Builder extends GeneratedMessageLite.Builder<JvmPropertySignature, Builder> implements JvmPropertySignatureOrBuilder {

            /* JADX INFO: renamed from: b */
            public int f53964b;

            /* JADX INFO: renamed from: c */
            public JvmFieldSignature f53965c;

            /* JADX INFO: renamed from: d */
            public JvmMethodSignature f53966d;

            /* JADX INFO: renamed from: f */
            public JvmMethodSignature f53967f;

            /* JADX INFO: renamed from: g */
            public JvmMethodSignature f53968g;

            /* JADX INFO: renamed from: i */
            public JvmMethodSignature f53969i;

            /* JADX INFO: renamed from: h */
            public static Builder m19550h() {
                Builder builder = new Builder();
                builder.f53965c = JvmFieldSignature.f53931i;
                JvmMethodSignature jvmMethodSignature = JvmMethodSignature.f53942i;
                builder.f53966d = jvmMethodSignature;
                builder.f53967f = jvmMethodSignature;
                builder.f53968g = jvmMethodSignature;
                builder.f53969i = jvmMethodSignature;
                return builder;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: b */
            public final AbstractMessageLite.Builder mo19418b() {
                Builder builderM19550h = m19550h();
                builderM19550h.m19552i(m19551f());
                return builderM19550h;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public final MessageLite build() {
                JvmPropertySignature jvmPropertySignatureM19551f = m19551f();
                jvmPropertySignatureM19551f.isInitialized();
                return jvmPropertySignatureM19551f;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: c */
            public final /* bridge */ /* synthetic */ AbstractMessageLite.Builder mo19419c(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                m19553j(codedInputStream, extensionRegistryLite);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            public final Object clone() {
                Builder builderM19550h = m19550h();
                builderM19550h.m19552i(m19551f());
                return builderM19550h;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* JADX INFO: renamed from: d */
            public final GeneratedMessageLite.Builder mo19420d() {
                Builder builderM19550h = m19550h();
                builderM19550h.m19552i(m19551f());
                return builderM19550h;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* JADX INFO: renamed from: e */
            public final /* bridge */ /* synthetic */ GeneratedMessageLite.Builder mo19421e(GeneratedMessageLite generatedMessageLite) {
                m19552i((JvmPropertySignature) generatedMessageLite);
                return this;
            }

            /* JADX INFO: renamed from: f */
            public final JvmPropertySignature m19551f() {
                JvmPropertySignature jvmPropertySignature = new JvmPropertySignature(this);
                int i = this.f53964b;
                int i2 = (i & 1) != 1 ? 0 : 1;
                jvmPropertySignature.f53957c = this.f53965c;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                jvmPropertySignature.f53958d = this.f53966d;
                if ((i & 4) == 4) {
                    i2 |= 4;
                }
                jvmPropertySignature.f53959f = this.f53967f;
                if ((i & 8) == 8) {
                    i2 |= 8;
                }
                jvmPropertySignature.f53960g = this.f53968g;
                if ((i & 16) == 16) {
                    i2 |= 16;
                }
                jvmPropertySignature.f53961i = this.f53969i;
                jvmPropertySignature.f53956b = i2;
                return jvmPropertySignature;
            }

            /* JADX INFO: renamed from: i */
            public final void m19552i(JvmPropertySignature jvmPropertySignature) {
                JvmMethodSignature jvmMethodSignature;
                JvmMethodSignature jvmMethodSignature2;
                JvmMethodSignature jvmMethodSignature3;
                JvmMethodSignature jvmMethodSignature4;
                JvmFieldSignature jvmFieldSignature;
                if (jvmPropertySignature == JvmPropertySignature.f53953o) {
                    return;
                }
                if ((jvmPropertySignature.f53956b & 1) == 1) {
                    JvmFieldSignature jvmFieldSignature2 = jvmPropertySignature.f53957c;
                    if ((this.f53964b & 1) != 1 || (jvmFieldSignature = this.f53965c) == JvmFieldSignature.f53931i) {
                        this.f53965c = jvmFieldSignature2;
                    } else {
                        JvmFieldSignature.Builder builder = new JvmFieldSignature.Builder();
                        builder.m19544h(jvmFieldSignature);
                        builder.m19544h(jvmFieldSignature2);
                        this.f53965c = builder.m19543f();
                    }
                    this.f53964b |= 1;
                }
                if ((jvmPropertySignature.f53956b & 2) == 2) {
                    JvmMethodSignature jvmMethodSignature5 = jvmPropertySignature.f53958d;
                    if ((this.f53964b & 2) != 2 || (jvmMethodSignature4 = this.f53966d) == JvmMethodSignature.f53942i) {
                        this.f53966d = jvmMethodSignature5;
                    } else {
                        JvmMethodSignature.Builder builderM19546d = JvmMethodSignature.m19546d(jvmMethodSignature4);
                        builderM19546d.m19548h(jvmMethodSignature5);
                        this.f53966d = builderM19546d.m19547f();
                    }
                    this.f53964b |= 2;
                }
                if ((jvmPropertySignature.f53956b & 4) == 4) {
                    JvmMethodSignature jvmMethodSignature6 = jvmPropertySignature.f53959f;
                    if ((this.f53964b & 4) != 4 || (jvmMethodSignature3 = this.f53967f) == JvmMethodSignature.f53942i) {
                        this.f53967f = jvmMethodSignature6;
                    } else {
                        JvmMethodSignature.Builder builderM19546d2 = JvmMethodSignature.m19546d(jvmMethodSignature3);
                        builderM19546d2.m19548h(jvmMethodSignature6);
                        this.f53967f = builderM19546d2.m19547f();
                    }
                    this.f53964b |= 4;
                }
                if ((jvmPropertySignature.f53956b & 8) == 8) {
                    JvmMethodSignature jvmMethodSignature7 = jvmPropertySignature.f53960g;
                    if ((this.f53964b & 8) != 8 || (jvmMethodSignature2 = this.f53968g) == JvmMethodSignature.f53942i) {
                        this.f53968g = jvmMethodSignature7;
                    } else {
                        JvmMethodSignature.Builder builderM19546d3 = JvmMethodSignature.m19546d(jvmMethodSignature2);
                        builderM19546d3.m19548h(jvmMethodSignature7);
                        this.f53968g = builderM19546d3.m19547f();
                    }
                    this.f53964b |= 8;
                }
                if ((jvmPropertySignature.f53956b & 16) == 16) {
                    JvmMethodSignature jvmMethodSignature8 = jvmPropertySignature.f53961i;
                    if ((this.f53964b & 16) != 16 || (jvmMethodSignature = this.f53969i) == JvmMethodSignature.f53942i) {
                        this.f53969i = jvmMethodSignature8;
                    } else {
                        JvmMethodSignature.Builder builderM19546d4 = JvmMethodSignature.m19546d(jvmMethodSignature);
                        builderM19546d4.m19548h(jvmMethodSignature8);
                        this.f53969i = builderM19546d4.m19547f();
                    }
                    this.f53964b |= 16;
                }
                this.f54106a = this.f54106a.m19625c(jvmPropertySignature.f53955a);
            }

            /* JADX WARN: Removed duplicated region for block: B:14:0x001d  */
            /* JADX INFO: renamed from: j */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void m19553j(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                JvmPropertySignature jvmPropertySignature = null;
                try {
                    try {
                        ((C61491) JvmPropertySignature.f53954p).getClass();
                        m19552i(new JvmPropertySignature(codedInputStream, extensionRegistryLite));
                    } catch (InvalidProtocolBufferException e) {
                        JvmPropertySignature jvmPropertySignature2 = (JvmPropertySignature) e.f54121a;
                        try {
                            throw e;
                        } catch (Throwable th) {
                            th = th;
                            jvmPropertySignature = jvmPropertySignature2;
                            if (jvmPropertySignature != null) {
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (jvmPropertySignature != null) {
                        m19552i(jvmPropertySignature);
                    }
                    throw th;
                }
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* JADX INFO: renamed from: n */
            public final /* bridge */ /* synthetic */ MessageLite.Builder mo19425n(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                m19553j(codedInputStream, extensionRegistryLite);
                return this;
            }
        }

        static {
            JvmPropertySignature jvmPropertySignature = new JvmPropertySignature();
            f53953o = jvmPropertySignature;
            jvmPropertySignature.f53957c = JvmFieldSignature.f53931i;
            JvmMethodSignature jvmMethodSignature = JvmMethodSignature.f53942i;
            jvmPropertySignature.f53958d = jvmMethodSignature;
            jvmPropertySignature.f53959f = jvmMethodSignature;
            jvmPropertySignature.f53960g = jvmMethodSignature;
            jvmPropertySignature.f53961i = jvmMethodSignature;
        }

        public JvmPropertySignature() {
            this.f53962j = (byte) -1;
            this.f53963n = -1;
            this.f53955a = ByteString.f54075a;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        /* JADX INFO: renamed from: a */
        public final void mo19416a(CodedOutputStream codedOutputStream) {
            getSerializedSize();
            if ((this.f53956b & 1) == 1) {
                codedOutputStream.m19672o(1, this.f53957c);
            }
            if ((this.f53956b & 2) == 2) {
                codedOutputStream.m19672o(2, this.f53958d);
            }
            if ((this.f53956b & 4) == 4) {
                codedOutputStream.m19672o(3, this.f53959f);
            }
            if ((this.f53956b & 8) == 8) {
                codedOutputStream.m19672o(4, this.f53960g);
            }
            if ((this.f53956b & 16) == 16) {
                codedOutputStream.m19672o(5, this.f53961i);
            }
            codedOutputStream.m19675r(this.f53955a);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final int getSerializedSize() {
            int i = this.f53963n;
            if (i != -1) {
                return i;
            }
            int iM19661d = (this.f53956b & 1) == 1 ? CodedOutputStream.m19661d(1, this.f53957c) : 0;
            if ((this.f53956b & 2) == 2) {
                iM19661d += CodedOutputStream.m19661d(2, this.f53958d);
            }
            if ((this.f53956b & 4) == 4) {
                iM19661d += CodedOutputStream.m19661d(3, this.f53959f);
            }
            if ((this.f53956b & 8) == 8) {
                iM19661d += CodedOutputStream.m19661d(4, this.f53960g);
            }
            if ((this.f53956b & 16) == 16) {
                iM19661d += CodedOutputStream.m19661d(5, this.f53961i);
            }
            int size = this.f53955a.size() + iM19661d;
            this.f53963n = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            if (this.f53962j == 1) {
                return true;
            }
            this.f53962j = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final MessageLite.Builder newBuilderForType() {
            return Builder.m19550h();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final MessageLite.Builder toBuilder() {
            Builder builderM19550h = Builder.m19550h();
            builderM19550h.m19552i(this);
            return builderM19550h;
        }

        public JvmPropertySignature(Builder builder) {
            this.f53962j = (byte) -1;
            this.f53963n = -1;
            this.f53955a = builder.f54106a;
        }

        public JvmPropertySignature(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            this.f53962j = (byte) -1;
            this.f53963n = -1;
            this.f53957c = JvmFieldSignature.f53931i;
            JvmMethodSignature jvmMethodSignature = JvmMethodSignature.f53942i;
            this.f53958d = jvmMethodSignature;
            this.f53959f = jvmMethodSignature;
            this.f53960g = jvmMethodSignature;
            this.f53961i = jvmMethodSignature;
            ByteString.Output output = new ByteString.Output();
            CodedOutputStream codedOutputStreamM19666j = CodedOutputStream.m19666j(output, 1);
            boolean z2 = false;
            while (!z2) {
                try {
                    try {
                        int iM19652n = codedInputStream.m19652n();
                        if (iM19652n != 0) {
                            JvmMethodSignature.Builder builderM19546d = null;
                            JvmFieldSignature.Builder builder = null;
                            JvmMethodSignature.Builder builderM19546d2 = null;
                            JvmMethodSignature.Builder builderM19546d3 = null;
                            JvmMethodSignature.Builder builderM19546d4 = null;
                            if (iM19652n == 10) {
                                if ((this.f53956b & 1) == 1) {
                                    JvmFieldSignature jvmFieldSignature = this.f53957c;
                                    jvmFieldSignature.getClass();
                                    builder = new JvmFieldSignature.Builder();
                                    builder.m19544h(jvmFieldSignature);
                                }
                                JvmFieldSignature jvmFieldSignature2 = (JvmFieldSignature) codedInputStream.m19645g(JvmFieldSignature.f53932j, extensionRegistryLite);
                                this.f53957c = jvmFieldSignature2;
                                if (builder != null) {
                                    builder.m19544h(jvmFieldSignature2);
                                    this.f53957c = builder.m19543f();
                                }
                                this.f53956b |= 1;
                            } else if (iM19652n == 18) {
                                if ((this.f53956b & 2) == 2) {
                                    JvmMethodSignature jvmMethodSignature2 = this.f53958d;
                                    jvmMethodSignature2.getClass();
                                    builderM19546d2 = JvmMethodSignature.m19546d(jvmMethodSignature2);
                                }
                                JvmMethodSignature jvmMethodSignature3 = (JvmMethodSignature) codedInputStream.m19645g(JvmMethodSignature.f53943j, extensionRegistryLite);
                                this.f53958d = jvmMethodSignature3;
                                if (builderM19546d2 != null) {
                                    builderM19546d2.m19548h(jvmMethodSignature3);
                                    this.f53958d = builderM19546d2.m19547f();
                                }
                                this.f53956b |= 2;
                            } else if (iM19652n == 26) {
                                if ((this.f53956b & 4) == 4) {
                                    JvmMethodSignature jvmMethodSignature4 = this.f53959f;
                                    jvmMethodSignature4.getClass();
                                    builderM19546d3 = JvmMethodSignature.m19546d(jvmMethodSignature4);
                                }
                                JvmMethodSignature jvmMethodSignature5 = (JvmMethodSignature) codedInputStream.m19645g(JvmMethodSignature.f53943j, extensionRegistryLite);
                                this.f53959f = jvmMethodSignature5;
                                if (builderM19546d3 != null) {
                                    builderM19546d3.m19548h(jvmMethodSignature5);
                                    this.f53959f = builderM19546d3.m19547f();
                                }
                                this.f53956b |= 4;
                            } else if (iM19652n == 34) {
                                if ((this.f53956b & 8) == 8) {
                                    JvmMethodSignature jvmMethodSignature6 = this.f53960g;
                                    jvmMethodSignature6.getClass();
                                    builderM19546d4 = JvmMethodSignature.m19546d(jvmMethodSignature6);
                                }
                                JvmMethodSignature jvmMethodSignature7 = (JvmMethodSignature) codedInputStream.m19645g(JvmMethodSignature.f53943j, extensionRegistryLite);
                                this.f53960g = jvmMethodSignature7;
                                if (builderM19546d4 != null) {
                                    builderM19546d4.m19548h(jvmMethodSignature7);
                                    this.f53960g = builderM19546d4.m19547f();
                                }
                                this.f53956b |= 8;
                            } else if (iM19652n != 42) {
                                if (!codedInputStream.m19655q(iM19652n, codedOutputStreamM19666j)) {
                                }
                            } else {
                                if ((this.f53956b & 16) == 16) {
                                    JvmMethodSignature jvmMethodSignature8 = this.f53961i;
                                    jvmMethodSignature8.getClass();
                                    builderM19546d = JvmMethodSignature.m19546d(jvmMethodSignature8);
                                }
                                JvmMethodSignature jvmMethodSignature9 = (JvmMethodSignature) codedInputStream.m19645g(JvmMethodSignature.f53943j, extensionRegistryLite);
                                this.f53961i = jvmMethodSignature9;
                                if (builderM19546d != null) {
                                    builderM19546d.m19548h(jvmMethodSignature9);
                                    this.f53961i = builderM19546d.m19547f();
                                }
                                this.f53956b |= 16;
                            }
                        }
                        z2 = true;
                    } catch (InvalidProtocolBufferException e) {
                        e.f54121a = this;
                        throw e;
                    } catch (IOException e2) {
                        InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e2.getMessage());
                        invalidProtocolBufferException.f54121a = this;
                        throw invalidProtocolBufferException;
                    }
                } catch (Throwable th) {
                    try {
                        codedOutputStreamM19666j.m19667i();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        throw th2;
                    }
                    throw th;
                }
            }
            try {
                codedOutputStreamM19666j.m19667i();
            } catch (IOException unused2) {
            } finally {
                this.f53955a = output.m19638d();
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class StringTableTypes extends GeneratedMessageLite implements StringTableTypesOrBuilder {

        /* JADX INFO: renamed from: i */
        public static final StringTableTypes f53970i;

        /* JADX INFO: renamed from: j */
        public static final Parser f53971j = new C61501();

        /* JADX INFO: renamed from: a */
        public final ByteString f53972a;

        /* JADX INFO: renamed from: b */
        public List f53973b;

        /* JADX INFO: renamed from: c */
        public List f53974c;

        /* JADX INFO: renamed from: d */
        public int f53975d;

        /* JADX INFO: renamed from: f */
        public byte f53976f;

        /* JADX INFO: renamed from: g */
        public int f53977g;

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$StringTableTypes$1 */
        /* JADX INFO: compiled from: Proguard */
        public static class C61501 extends AbstractParser<StringTableTypes> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            /* JADX INFO: renamed from: a */
            public final Object mo19417a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new StringTableTypes(codedInputStream, extensionRegistryLite);
            }
        }

        /* JADX INFO: compiled from: Proguard */
        public static final class Builder extends GeneratedMessageLite.Builder<StringTableTypes, Builder> implements StringTableTypesOrBuilder {

            /* JADX INFO: renamed from: b */
            public int f53978b;

            /* JADX INFO: renamed from: c */
            public List f53979c;

            /* JADX INFO: renamed from: d */
            public List f53980d;

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: b */
            public final AbstractMessageLite.Builder mo19418b() {
                Builder builder = new Builder();
                List list = Collections.EMPTY_LIST;
                builder.f53979c = list;
                builder.f53980d = list;
                builder.m19555h(m19554f());
                return builder;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public final MessageLite build() {
                StringTableTypes stringTableTypesM19554f = m19554f();
                stringTableTypesM19554f.isInitialized();
                return stringTableTypesM19554f;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: c */
            public final /* bridge */ /* synthetic */ AbstractMessageLite.Builder mo19419c(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                m19556i(codedInputStream, extensionRegistryLite);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            public final Object clone() {
                Builder builder = new Builder();
                List list = Collections.EMPTY_LIST;
                builder.f53979c = list;
                builder.f53980d = list;
                builder.m19555h(m19554f());
                return builder;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* JADX INFO: renamed from: d */
            public final GeneratedMessageLite.Builder mo19420d() {
                Builder builder = new Builder();
                List list = Collections.EMPTY_LIST;
                builder.f53979c = list;
                builder.f53980d = list;
                builder.m19555h(m19554f());
                return builder;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* JADX INFO: renamed from: e */
            public final /* bridge */ /* synthetic */ GeneratedMessageLite.Builder mo19421e(GeneratedMessageLite generatedMessageLite) {
                m19555h((StringTableTypes) generatedMessageLite);
                return this;
            }

            /* JADX INFO: renamed from: f */
            public final StringTableTypes m19554f() {
                StringTableTypes stringTableTypes = new StringTableTypes(this);
                if ((this.f53978b & 1) == 1) {
                    this.f53979c = Collections.unmodifiableList(this.f53979c);
                    this.f53978b &= -2;
                }
                stringTableTypes.f53973b = this.f53979c;
                if ((this.f53978b & 2) == 2) {
                    this.f53980d = Collections.unmodifiableList(this.f53980d);
                    this.f53978b &= -3;
                }
                stringTableTypes.f53974c = this.f53980d;
                return stringTableTypes;
            }

            /* JADX INFO: renamed from: h */
            public final void m19555h(StringTableTypes stringTableTypes) {
                if (stringTableTypes == StringTableTypes.f53970i) {
                    return;
                }
                if (!stringTableTypes.f53973b.isEmpty()) {
                    if (this.f53979c.isEmpty()) {
                        this.f53979c = stringTableTypes.f53973b;
                        this.f53978b &= -2;
                    } else {
                        if ((this.f53978b & 1) != 1) {
                            this.f53979c = new ArrayList(this.f53979c);
                            this.f53978b |= 1;
                        }
                        this.f53979c.addAll(stringTableTypes.f53973b);
                    }
                }
                if (!stringTableTypes.f53974c.isEmpty()) {
                    if (this.f53980d.isEmpty()) {
                        this.f53980d = stringTableTypes.f53974c;
                        this.f53978b &= -3;
                    } else {
                        if ((this.f53978b & 2) != 2) {
                            this.f53980d = new ArrayList(this.f53980d);
                            this.f53978b |= 2;
                        }
                        this.f53980d.addAll(stringTableTypes.f53974c);
                    }
                }
                this.f54106a = this.f54106a.m19625c(stringTableTypes.f53972a);
            }

            /* JADX WARN: Removed duplicated region for block: B:14:0x001d  */
            /* JADX INFO: renamed from: i */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void m19556i(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                StringTableTypes stringTableTypes = null;
                try {
                    try {
                        ((C61501) StringTableTypes.f53971j).getClass();
                        m19555h(new StringTableTypes(codedInputStream, extensionRegistryLite));
                    } catch (InvalidProtocolBufferException e) {
                        StringTableTypes stringTableTypes2 = (StringTableTypes) e.f54121a;
                        try {
                            throw e;
                        } catch (Throwable th) {
                            th = th;
                            stringTableTypes = stringTableTypes2;
                            if (stringTableTypes != null) {
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (stringTableTypes != null) {
                        m19555h(stringTableTypes);
                    }
                    throw th;
                }
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* JADX INFO: renamed from: n */
            public final /* bridge */ /* synthetic */ MessageLite.Builder mo19425n(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                m19556i(codedInputStream, extensionRegistryLite);
                return this;
            }
        }

        /* JADX INFO: compiled from: Proguard */
        public interface RecordOrBuilder extends MessageLiteOrBuilder {
        }

        static {
            StringTableTypes stringTableTypes = new StringTableTypes();
            f53970i = stringTableTypes;
            List list = Collections.EMPTY_LIST;
            stringTableTypes.f53973b = list;
            stringTableTypes.f53974c = list;
        }

        public StringTableTypes() {
            this.f53975d = -1;
            this.f53976f = (byte) -1;
            this.f53977g = -1;
            this.f53972a = ByteString.f54075a;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        /* JADX INFO: renamed from: a */
        public final void mo19416a(CodedOutputStream codedOutputStream) {
            getSerializedSize();
            for (int i = 0; i < this.f53973b.size(); i++) {
                codedOutputStream.m19672o(1, (MessageLite) this.f53973b.get(i));
            }
            if (this.f53974c.size() > 0) {
                codedOutputStream.m19679v(42);
                codedOutputStream.m19679v(this.f53975d);
            }
            for (int i2 = 0; i2 < this.f53974c.size(); i2++) {
                codedOutputStream.m19671n(((Integer) this.f53974c.get(i2)).intValue());
            }
            codedOutputStream.m19675r(this.f53972a);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final int getSerializedSize() {
            int i = this.f53977g;
            if (i != -1) {
                return i;
            }
            int iM19661d = 0;
            for (int i2 = 0; i2 < this.f53973b.size(); i2++) {
                iM19661d += CodedOutputStream.m19661d(1, (MessageLite) this.f53973b.get(i2));
            }
            int iM19660c = 0;
            for (int i3 = 0; i3 < this.f53974c.size(); i3++) {
                iM19660c += CodedOutputStream.m19660c(((Integer) this.f53974c.get(i3)).intValue());
            }
            int iM19660c2 = iM19661d + iM19660c;
            if (!this.f53974c.isEmpty()) {
                iM19660c2 = iM19660c2 + 1 + CodedOutputStream.m19660c(iM19660c);
            }
            this.f53975d = iM19660c;
            int size = this.f53972a.size() + iM19660c2;
            this.f53977g = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            if (this.f53976f == 1) {
                return true;
            }
            this.f53976f = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final MessageLite.Builder newBuilderForType() {
            Builder builder = new Builder();
            List list = Collections.EMPTY_LIST;
            builder.f53979c = list;
            builder.f53980d = list;
            return builder;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final MessageLite.Builder toBuilder() {
            Builder builder = new Builder();
            List list = Collections.EMPTY_LIST;
            builder.f53979c = list;
            builder.f53980d = list;
            builder.m19555h(this);
            return builder;
        }

        /* JADX INFO: compiled from: Proguard */
        public static final class Record extends GeneratedMessageLite implements RecordOrBuilder {

            /* JADX INFO: renamed from: r */
            public static final Record f53981r;

            /* JADX INFO: renamed from: s */
            public static final Parser f53982s = new C61511();

            /* JADX INFO: renamed from: a */
            public final ByteString f53983a;

            /* JADX INFO: renamed from: b */
            public int f53984b;

            /* JADX INFO: renamed from: c */
            public int f53985c;

            /* JADX INFO: renamed from: d */
            public int f53986d;

            /* JADX INFO: renamed from: f */
            public Object f53987f;

            /* JADX INFO: renamed from: g */
            public Operation f53988g;

            /* JADX INFO: renamed from: i */
            public List f53989i;

            /* JADX INFO: renamed from: j */
            public int f53990j;

            /* JADX INFO: renamed from: n */
            public List f53991n;

            /* JADX INFO: renamed from: o */
            public int f53992o;

            /* JADX INFO: renamed from: p */
            public byte f53993p;

            /* JADX INFO: renamed from: q */
            public int f53994q;

            /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$StringTableTypes$Record$1 */
            /* JADX INFO: compiled from: Proguard */
            public static class C61511 extends AbstractParser<Record> {
                @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
                /* JADX INFO: renamed from: a */
                public final Object mo19417a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                    return new Record(codedInputStream);
                }
            }

            /* JADX INFO: compiled from: Proguard */
            public static final class Builder extends GeneratedMessageLite.Builder<Record, Builder> implements RecordOrBuilder {

                /* JADX INFO: renamed from: b */
                public int f53995b;

                /* JADX INFO: renamed from: c */
                public int f53996c;

                /* JADX INFO: renamed from: d */
                public int f53997d;

                /* JADX INFO: renamed from: f */
                public Object f53998f;

                /* JADX INFO: renamed from: g */
                public Operation f53999g;

                /* JADX INFO: renamed from: i */
                public List f54000i;

                /* JADX INFO: renamed from: j */
                public List f54001j;

                /* JADX INFO: renamed from: h */
                public static Builder m19557h() {
                    Builder builder = new Builder();
                    builder.f53996c = 1;
                    builder.f53998f = "";
                    builder.f53999g = Operation.NONE;
                    List list = Collections.EMPTY_LIST;
                    builder.f54000i = list;
                    builder.f54001j = list;
                    return builder;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
                /* JADX INFO: renamed from: b */
                public final AbstractMessageLite.Builder mo19418b() {
                    Builder builderM19557h = m19557h();
                    builderM19557h.m19559i(m19558f());
                    return builderM19557h;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
                public final MessageLite build() {
                    Record recordM19558f = m19558f();
                    recordM19558f.isInitialized();
                    return recordM19558f;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
                /* JADX INFO: renamed from: c */
                public final /* bridge */ /* synthetic */ AbstractMessageLite.Builder mo19419c(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                    m19560j(codedInputStream, extensionRegistryLite);
                    return this;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
                public final Object clone() {
                    Builder builderM19557h = m19557h();
                    builderM19557h.m19559i(m19558f());
                    return builderM19557h;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
                /* JADX INFO: renamed from: d */
                public final GeneratedMessageLite.Builder mo19420d() {
                    Builder builderM19557h = m19557h();
                    builderM19557h.m19559i(m19558f());
                    return builderM19557h;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
                /* JADX INFO: renamed from: e */
                public final /* bridge */ /* synthetic */ GeneratedMessageLite.Builder mo19421e(GeneratedMessageLite generatedMessageLite) {
                    m19559i((Record) generatedMessageLite);
                    return this;
                }

                /* JADX INFO: renamed from: f */
                public final Record m19558f() {
                    Record record = new Record(this);
                    int i = this.f53995b;
                    int i2 = (i & 1) != 1 ? 0 : 1;
                    record.f53985c = this.f53996c;
                    if ((i & 2) == 2) {
                        i2 |= 2;
                    }
                    record.f53986d = this.f53997d;
                    if ((i & 4) == 4) {
                        i2 |= 4;
                    }
                    record.f53987f = this.f53998f;
                    if ((i & 8) == 8) {
                        i2 |= 8;
                    }
                    record.f53988g = this.f53999g;
                    if ((i & 16) == 16) {
                        this.f54000i = Collections.unmodifiableList(this.f54000i);
                        this.f53995b &= -17;
                    }
                    record.f53989i = this.f54000i;
                    if ((this.f53995b & 32) == 32) {
                        this.f54001j = Collections.unmodifiableList(this.f54001j);
                        this.f53995b &= -33;
                    }
                    record.f53991n = this.f54001j;
                    record.f53984b = i2;
                    return record;
                }

                /* JADX INFO: renamed from: i */
                public final void m19559i(Record record) {
                    if (record == Record.f53981r) {
                        return;
                    }
                    int i = record.f53984b;
                    if ((i & 1) == 1) {
                        int i2 = record.f53985c;
                        this.f53995b = 1 | this.f53995b;
                        this.f53996c = i2;
                    }
                    if ((i & 2) == 2) {
                        int i3 = record.f53986d;
                        this.f53995b = 2 | this.f53995b;
                        this.f53997d = i3;
                    }
                    if ((i & 4) == 4) {
                        this.f53995b |= 4;
                        this.f53998f = record.f53987f;
                    }
                    if ((i & 8) == 8) {
                        Operation operation = record.f53988g;
                        operation.getClass();
                        this.f53995b = 8 | this.f53995b;
                        this.f53999g = operation;
                    }
                    if (!record.f53989i.isEmpty()) {
                        if (this.f54000i.isEmpty()) {
                            this.f54000i = record.f53989i;
                            this.f53995b &= -17;
                        } else {
                            if ((this.f53995b & 16) != 16) {
                                this.f54000i = new ArrayList(this.f54000i);
                                this.f53995b |= 16;
                            }
                            this.f54000i.addAll(record.f53989i);
                        }
                    }
                    if (!record.f53991n.isEmpty()) {
                        if (this.f54001j.isEmpty()) {
                            this.f54001j = record.f53991n;
                            this.f53995b &= -33;
                        } else {
                            if ((this.f53995b & 32) != 32) {
                                this.f54001j = new ArrayList(this.f54001j);
                                this.f53995b |= 32;
                            }
                            this.f54001j.addAll(record.f53991n);
                        }
                    }
                    this.f54106a = this.f54106a.m19625c(record.f53983a);
                }

                /* JADX WARN: Removed duplicated region for block: B:14:0x001d  */
                /* JADX INFO: renamed from: j */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void m19560j(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                    Record record = null;
                    try {
                        try {
                            ((C61511) Record.f53982s).getClass();
                            m19559i(new Record(codedInputStream));
                        } catch (InvalidProtocolBufferException e) {
                            Record record2 = (Record) e.f54121a;
                            try {
                                throw e;
                            } catch (Throwable th) {
                                th = th;
                                record = record2;
                                if (record != null) {
                                }
                                throw th;
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        if (record != null) {
                            m19559i(record);
                        }
                        throw th;
                    }
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
                /* JADX INFO: renamed from: n */
                public final /* bridge */ /* synthetic */ MessageLite.Builder mo19425n(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                    m19560j(codedInputStream, extensionRegistryLite);
                    return this;
                }
            }

            /* JADX INFO: compiled from: Proguard */
            public enum Operation implements Internal.EnumLite {
                NONE(0),
                INTERNAL_TO_CLASS_ID(1),
                DESC_TO_CLASS_ID(2);


                /* JADX INFO: renamed from: a */
                public final int f54006a;

                /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$StringTableTypes$Record$Operation$1 */
                /* JADX INFO: compiled from: Proguard */
                public static class C61521 implements Internal.EnumLiteMap<Operation> {
                }

                Operation(int i) {
                    this.f54006a = i;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
                public final int getNumber() {
                    return this.f54006a;
                }
            }

            static {
                Record record = new Record();
                f53981r = record;
                record.f53985c = 1;
                record.f53986d = 0;
                record.f53987f = "";
                record.f53988g = Operation.NONE;
                List list = Collections.EMPTY_LIST;
                record.f53989i = list;
                record.f53991n = list;
            }

            public Record() {
                this.f53990j = -1;
                this.f53992o = -1;
                this.f53993p = (byte) -1;
                this.f53994q = -1;
                this.f53983a = ByteString.f54075a;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            /* JADX INFO: renamed from: a */
            public final void mo19416a(CodedOutputStream codedOutputStream) {
                ByteString byteStringM19623d;
                getSerializedSize();
                if ((this.f53984b & 1) == 1) {
                    codedOutputStream.m19670m(1, this.f53985c);
                }
                if ((this.f53984b & 2) == 2) {
                    codedOutputStream.m19670m(2, this.f53986d);
                }
                if ((this.f53984b & 8) == 8) {
                    codedOutputStream.m19669l(3, this.f53988g.f54006a);
                }
                if (this.f53989i.size() > 0) {
                    codedOutputStream.m19679v(34);
                    codedOutputStream.m19679v(this.f53990j);
                }
                for (int i = 0; i < this.f53989i.size(); i++) {
                    codedOutputStream.m19671n(((Integer) this.f53989i.get(i)).intValue());
                }
                if (this.f53991n.size() > 0) {
                    codedOutputStream.m19679v(42);
                    codedOutputStream.m19679v(this.f53992o);
                }
                for (int i2 = 0; i2 < this.f53991n.size(); i2++) {
                    codedOutputStream.m19671n(((Integer) this.f53991n.get(i2)).intValue());
                }
                if ((this.f53984b & 4) == 4) {
                    Object obj = this.f53987f;
                    if (obj instanceof String) {
                        byteStringM19623d = ByteString.m19623d((String) obj);
                        this.f53987f = byteStringM19623d;
                    } else {
                        byteStringM19623d = (ByteString) obj;
                    }
                    codedOutputStream.m19681x(6, 2);
                    codedOutputStream.m19679v(byteStringM19623d.size());
                    codedOutputStream.m19675r(byteStringM19623d);
                }
                codedOutputStream.m19675r(this.f53983a);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public final int getSerializedSize() {
                ByteString byteStringM19623d;
                int i = this.f53994q;
                if (i != -1) {
                    return i;
                }
                int iM19659b = (this.f53984b & 1) == 1 ? CodedOutputStream.m19659b(1, this.f53985c) : 0;
                if ((this.f53984b & 2) == 2) {
                    iM19659b += CodedOutputStream.m19659b(2, this.f53986d);
                }
                if ((this.f53984b & 8) == 8) {
                    iM19659b += CodedOutputStream.m19658a(3, this.f53988g.f54006a);
                }
                int iM19660c = 0;
                for (int i2 = 0; i2 < this.f53989i.size(); i2++) {
                    iM19660c += CodedOutputStream.m19660c(((Integer) this.f53989i.get(i2)).intValue());
                }
                int iM19660c2 = iM19659b + iM19660c;
                if (!this.f53989i.isEmpty()) {
                    iM19660c2 = iM19660c2 + 1 + CodedOutputStream.m19660c(iM19660c);
                }
                this.f53990j = iM19660c;
                int iM19660c3 = 0;
                for (int i3 = 0; i3 < this.f53991n.size(); i3++) {
                    iM19660c3 += CodedOutputStream.m19660c(((Integer) this.f53991n.get(i3)).intValue());
                }
                int size = iM19660c2 + iM19660c3;
                if (!this.f53991n.isEmpty()) {
                    size = size + 1 + CodedOutputStream.m19660c(iM19660c3);
                }
                this.f53992o = iM19660c3;
                if ((this.f53984b & 4) == 4) {
                    Object obj = this.f53987f;
                    if (obj instanceof String) {
                        byteStringM19623d = ByteString.m19623d((String) obj);
                        this.f53987f = byteStringM19623d;
                    } else {
                        byteStringM19623d = (ByteString) obj;
                    }
                    size += byteStringM19623d.size() + CodedOutputStream.m19663f(byteStringM19623d.size()) + CodedOutputStream.m19665h(6);
                }
                int size2 = this.f53983a.size() + size;
                this.f53994q = size2;
                return size2;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (this.f53993p == 1) {
                    return true;
                }
                this.f53993p = (byte) 1;
                return true;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public final MessageLite.Builder newBuilderForType() {
                return Builder.m19557h();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public final MessageLite.Builder toBuilder() {
                Builder builderM19557h = Builder.m19557h();
                builderM19557h.m19559i(this);
                return builderM19557h;
            }

            public Record(Builder builder) {
                this.f53990j = -1;
                this.f53992o = -1;
                this.f53993p = (byte) -1;
                this.f53994q = -1;
                this.f53983a = builder.f54106a;
            }

            public Record(CodedInputStream codedInputStream) {
                Operation operation;
                this.f53990j = -1;
                this.f53992o = -1;
                this.f53993p = (byte) -1;
                this.f53994q = -1;
                this.f53985c = 1;
                boolean z2 = false;
                this.f53986d = 0;
                this.f53987f = "";
                Operation operation2 = Operation.NONE;
                this.f53988g = operation2;
                List list = Collections.EMPTY_LIST;
                this.f53989i = list;
                this.f53991n = list;
                ByteString.Output output = new ByteString.Output();
                CodedOutputStream codedOutputStreamM19666j = CodedOutputStream.m19666j(output, 1);
                int i = 0;
                while (!z2) {
                    try {
                        try {
                            try {
                                int iM19652n = codedInputStream.m19652n();
                                if (iM19652n != 0) {
                                    if (iM19652n == 8) {
                                        this.f53984b |= 1;
                                        this.f53985c = codedInputStream.m19649k();
                                    } else if (iM19652n == 16) {
                                        this.f53984b |= 2;
                                        this.f53986d = codedInputStream.m19649k();
                                    } else if (iM19652n == 24) {
                                        int iM19649k = codedInputStream.m19649k();
                                        if (iM19649k == 0) {
                                            operation = operation2;
                                        } else if (iM19649k != 1) {
                                            operation = iM19649k != 2 ? null : Operation.DESC_TO_CLASS_ID;
                                        } else {
                                            operation = Operation.INTERNAL_TO_CLASS_ID;
                                        }
                                        if (operation == null) {
                                            codedOutputStreamM19666j.m19679v(iM19652n);
                                            codedOutputStreamM19666j.m19679v(iM19649k);
                                        } else {
                                            this.f53984b |= 8;
                                            this.f53988g = operation;
                                        }
                                    } else if (iM19652n == 32) {
                                        if ((i & 16) != 16) {
                                            this.f53989i = new ArrayList();
                                            i |= 16;
                                        }
                                        this.f53989i.add(Integer.valueOf(codedInputStream.m19649k()));
                                    } else if (iM19652n == 34) {
                                        int iM19642d = codedInputStream.m19642d(codedInputStream.m19649k());
                                        if ((i & 16) != 16 && codedInputStream.m19640b() > 0) {
                                            this.f53989i = new ArrayList();
                                            i |= 16;
                                        }
                                        while (codedInputStream.m19640b() > 0) {
                                            this.f53989i.add(Integer.valueOf(codedInputStream.m19649k()));
                                        }
                                        codedInputStream.m19641c(iM19642d);
                                    } else if (iM19652n == 40) {
                                        if ((i & 32) != 32) {
                                            this.f53991n = new ArrayList();
                                            i |= 32;
                                        }
                                        this.f53991n.add(Integer.valueOf(codedInputStream.m19649k()));
                                    } else if (iM19652n == 42) {
                                        int iM19642d2 = codedInputStream.m19642d(codedInputStream.m19649k());
                                        if ((i & 32) != 32 && codedInputStream.m19640b() > 0) {
                                            this.f53991n = new ArrayList();
                                            i |= 32;
                                        }
                                        while (codedInputStream.m19640b() > 0) {
                                            this.f53991n.add(Integer.valueOf(codedInputStream.m19649k()));
                                        }
                                        codedInputStream.m19641c(iM19642d2);
                                    } else if (iM19652n != 50) {
                                        if (!codedInputStream.m19655q(iM19652n, codedOutputStreamM19666j)) {
                                        }
                                    } else {
                                        ByteString byteStringM19643e = codedInputStream.m19643e();
                                        this.f53984b |= 4;
                                        this.f53987f = byteStringM19643e;
                                    }
                                }
                                z2 = true;
                            } catch (InvalidProtocolBufferException e) {
                                e.f54121a = this;
                                throw e;
                            }
                        } catch (IOException e2) {
                            InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e2.getMessage());
                            invalidProtocolBufferException.f54121a = this;
                            throw invalidProtocolBufferException;
                        }
                    } catch (Throwable th) {
                        if ((i & 16) == 16) {
                            this.f53989i = Collections.unmodifiableList(this.f53989i);
                        }
                        if ((i & 32) == 32) {
                            this.f53991n = Collections.unmodifiableList(this.f53991n);
                        }
                        try {
                            codedOutputStreamM19666j.m19667i();
                        } catch (IOException unused) {
                        } catch (Throwable th2) {
                            throw th2;
                        }
                        throw th;
                    }
                }
                if ((i & 16) == 16) {
                    this.f53989i = Collections.unmodifiableList(this.f53989i);
                }
                if ((i & 32) == 32) {
                    this.f53991n = Collections.unmodifiableList(this.f53991n);
                }
                try {
                    codedOutputStreamM19666j.m19667i();
                } catch (IOException unused2) {
                } finally {
                    this.f53983a = output.m19638d();
                }
            }
        }

        public StringTableTypes(Builder builder) {
            this.f53975d = -1;
            this.f53976f = (byte) -1;
            this.f53977g = -1;
            this.f53972a = builder.f54106a;
        }

        public StringTableTypes(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            this.f53975d = -1;
            this.f53976f = (byte) -1;
            this.f53977g = -1;
            List list = Collections.EMPTY_LIST;
            this.f53973b = list;
            this.f53974c = list;
            ByteString.Output output = new ByteString.Output();
            CodedOutputStream codedOutputStreamM19666j = CodedOutputStream.m19666j(output, 1);
            boolean z2 = false;
            int i = 0;
            while (!z2) {
                try {
                    try {
                        int iM19652n = codedInputStream.m19652n();
                        if (iM19652n != 0) {
                            if (iM19652n == 10) {
                                if ((i & 1) != 1) {
                                    this.f53973b = new ArrayList();
                                    i |= 1;
                                }
                                this.f53973b.add(codedInputStream.m19645g(Record.f53982s, extensionRegistryLite));
                            } else if (iM19652n == 40) {
                                if ((i & 2) != 2) {
                                    this.f53974c = new ArrayList();
                                    i |= 2;
                                }
                                this.f53974c.add(Integer.valueOf(codedInputStream.m19649k()));
                            } else if (iM19652n != 42) {
                                if (!codedInputStream.m19655q(iM19652n, codedOutputStreamM19666j)) {
                                }
                            } else {
                                int iM19642d = codedInputStream.m19642d(codedInputStream.m19649k());
                                if ((i & 2) != 2 && codedInputStream.m19640b() > 0) {
                                    this.f53974c = new ArrayList();
                                    i |= 2;
                                }
                                while (codedInputStream.m19640b() > 0) {
                                    this.f53974c.add(Integer.valueOf(codedInputStream.m19649k()));
                                }
                                codedInputStream.m19641c(iM19642d);
                            }
                        }
                        z2 = true;
                    } catch (InvalidProtocolBufferException e) {
                        e.f54121a = this;
                        throw e;
                    } catch (IOException e2) {
                        InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e2.getMessage());
                        invalidProtocolBufferException.f54121a = this;
                        throw invalidProtocolBufferException;
                    }
                } catch (Throwable th) {
                    if ((i & 1) == 1) {
                        this.f53973b = Collections.unmodifiableList(this.f53973b);
                    }
                    if ((i & 2) == 2) {
                        this.f53974c = Collections.unmodifiableList(this.f53974c);
                    }
                    try {
                        codedOutputStreamM19666j.m19667i();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        throw th2;
                    }
                    throw th;
                }
            }
            if ((i & 1) == 1) {
                this.f53973b = Collections.unmodifiableList(this.f53973b);
            }
            if ((i & 2) == 2) {
                this.f53974c = Collections.unmodifiableList(this.f53974c);
            }
            try {
                codedOutputStreamM19666j.m19667i();
            } catch (IOException unused2) {
            } finally {
                this.f53972a = output.m19638d();
            }
        }
    }
}
