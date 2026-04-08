package kotlin.reflect.jvm.internal.impl.metadata;

import androidx.compose.animation.AbstractC0455a;
import com.google.android.gms.common.ConnectionResult;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.zxing.aztec.encoder.Encoder;
import com.google.zxing.pdf417.PDF417Common;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractParser;
import kotlin.reflect.jvm.internal.impl.protobuf.ByteString;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.Internal;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.LazyStringArrayList;
import kotlin.reflect.jvm.internal.impl.protobuf.LazyStringList;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder;
import kotlin.reflect.jvm.internal.impl.protobuf.Parser;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ProtoBuf {

    /* JADX INFO: compiled from: Proguard */
    public interface AnnotationOrBuilder extends MessageLiteOrBuilder {
    }

    /* JADX INFO: compiled from: Proguard */
    public interface ClassOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder {
    }

    /* JADX INFO: compiled from: Proguard */
    public interface ConstructorOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder {
    }

    /* JADX INFO: compiled from: Proguard */
    public interface ContractOrBuilder extends MessageLiteOrBuilder {
    }

    /* JADX INFO: compiled from: Proguard */
    public interface EffectOrBuilder extends MessageLiteOrBuilder {
    }

    /* JADX INFO: compiled from: Proguard */
    public interface EnumEntryOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder {
    }

    /* JADX INFO: compiled from: Proguard */
    public interface ExpressionOrBuilder extends MessageLiteOrBuilder {
    }

    /* JADX INFO: compiled from: Proguard */
    public interface FunctionOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder {
    }

    /* JADX INFO: compiled from: Proguard */
    public enum MemberKind implements Internal.EnumLite {
        /* JADX INFO: Fake field, exist only in values array */
        DECLARATION(0),
        /* JADX INFO: Fake field, exist only in values array */
        FAKE_OVERRIDE(1),
        /* JADX INFO: Fake field, exist only in values array */
        DELEGATION(2),
        /* JADX INFO: Fake field, exist only in values array */
        SYNTHESIZED(3);


        /* JADX INFO: renamed from: a */
        public final int f53574a;

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$MemberKind$1 */
        /* JADX INFO: compiled from: Proguard */
        public static class C61231 implements Internal.EnumLiteMap<MemberKind> {
        }

        MemberKind(int i) {
            this.f53574a = i;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
        public final int getNumber() {
            return this.f53574a;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public enum Modality implements Internal.EnumLite {
        /* JADX INFO: Fake field, exist only in values array */
        FINAL(0),
        /* JADX INFO: Fake field, exist only in values array */
        OPEN(1),
        /* JADX INFO: Fake field, exist only in values array */
        ABSTRACT(2),
        /* JADX INFO: Fake field, exist only in values array */
        SEALED(3);


        /* JADX INFO: renamed from: a */
        public final int f53576a;

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Modality$1 */
        /* JADX INFO: compiled from: Proguard */
        public static class C61241 implements Internal.EnumLiteMap<Modality> {
        }

        Modality(int i) {
            this.f53576a = i;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
        public final int getNumber() {
            return this.f53576a;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public interface PackageFragmentOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder {
    }

    /* JADX INFO: compiled from: Proguard */
    public interface PackageOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder {
    }

    /* JADX INFO: compiled from: Proguard */
    public interface PropertyOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder {
    }

    /* JADX INFO: compiled from: Proguard */
    public interface QualifiedNameTableOrBuilder extends MessageLiteOrBuilder {
    }

    /* JADX INFO: compiled from: Proguard */
    public interface StringTableOrBuilder extends MessageLiteOrBuilder {
    }

    /* JADX INFO: compiled from: Proguard */
    public interface TypeAliasOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder {
    }

    /* JADX INFO: compiled from: Proguard */
    public interface TypeOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder {
    }

    /* JADX INFO: compiled from: Proguard */
    public interface TypeParameterOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder {
    }

    /* JADX INFO: compiled from: Proguard */
    public interface TypeTableOrBuilder extends MessageLiteOrBuilder {
    }

    /* JADX INFO: compiled from: Proguard */
    public interface ValueParameterOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder {
    }

    /* JADX INFO: compiled from: Proguard */
    public interface VersionRequirementOrBuilder extends MessageLiteOrBuilder {
    }

    /* JADX INFO: compiled from: Proguard */
    public interface VersionRequirementTableOrBuilder extends MessageLiteOrBuilder {
    }

    /* JADX INFO: compiled from: Proguard */
    public enum Visibility implements Internal.EnumLite {
        /* JADX INFO: Fake field, exist only in values array */
        INTERNAL(0),
        /* JADX INFO: Fake field, exist only in values array */
        PRIVATE(1),
        /* JADX INFO: Fake field, exist only in values array */
        PROTECTED(2),
        /* JADX INFO: Fake field, exist only in values array */
        PUBLIC(3),
        /* JADX INFO: Fake field, exist only in values array */
        PRIVATE_TO_THIS(4),
        /* JADX INFO: Fake field, exist only in values array */
        LOCAL(5);


        /* JADX INFO: renamed from: a */
        public final int f53851a;

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Visibility$1 */
        /* JADX INFO: compiled from: Proguard */
        public static class C61441 implements Internal.EnumLiteMap<Visibility> {
        }

        Visibility(int i) {
            this.f53851a = i;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
        public final int getNumber() {
            return this.f53851a;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class Annotation extends GeneratedMessageLite implements AnnotationOrBuilder {

        /* JADX INFO: renamed from: i */
        public static final Annotation f53322i;

        /* JADX INFO: renamed from: j */
        public static final Parser f53323j = new C61081();

        /* JADX INFO: renamed from: a */
        public final ByteString f53324a;

        /* JADX INFO: renamed from: b */
        public int f53325b;

        /* JADX INFO: renamed from: c */
        public int f53326c;

        /* JADX INFO: renamed from: d */
        public List f53327d;

        /* JADX INFO: renamed from: f */
        public byte f53328f;

        /* JADX INFO: renamed from: g */
        public int f53329g;

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$1 */
        /* JADX INFO: compiled from: Proguard */
        public static class C61081 extends AbstractParser<Annotation> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            /* JADX INFO: renamed from: a */
            public final Object mo19417a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new Annotation(codedInputStream, extensionRegistryLite);
            }
        }

        /* JADX INFO: compiled from: Proguard */
        public interface ArgumentOrBuilder extends MessageLiteOrBuilder {
        }

        /* JADX INFO: compiled from: Proguard */
        public static final class Builder extends GeneratedMessageLite.Builder<Annotation, Builder> implements AnnotationOrBuilder {

            /* JADX INFO: renamed from: b */
            public int f53385b;

            /* JADX INFO: renamed from: c */
            public int f53386c;

            /* JADX INFO: renamed from: d */
            public List f53387d;

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: b */
            public final AbstractMessageLite.Builder mo19418b() {
                Builder builder = new Builder();
                builder.f53387d = Collections.EMPTY_LIST;
                builder.m19433h(m19432f());
                return builder;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public final MessageLite build() {
                Annotation annotationM19432f = m19432f();
                if (annotationM19432f.isInitialized()) {
                    return annotationM19432f;
                }
                throw new UninitializedMessageException();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: c */
            public final /* bridge */ /* synthetic */ AbstractMessageLite.Builder mo19419c(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                m19434i(codedInputStream, extensionRegistryLite);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            public final Object clone() {
                Builder builder = new Builder();
                builder.f53387d = Collections.EMPTY_LIST;
                builder.m19433h(m19432f());
                return builder;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* JADX INFO: renamed from: d */
            public final GeneratedMessageLite.Builder mo19420d() {
                Builder builder = new Builder();
                builder.f53387d = Collections.EMPTY_LIST;
                builder.m19433h(m19432f());
                return builder;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* JADX INFO: renamed from: e */
            public final /* bridge */ /* synthetic */ GeneratedMessageLite.Builder mo19421e(GeneratedMessageLite generatedMessageLite) {
                m19433h((Annotation) generatedMessageLite);
                return this;
            }

            /* JADX INFO: renamed from: f */
            public final Annotation m19432f() {
                Annotation annotation = new Annotation(this);
                int i = this.f53385b;
                int i2 = (i & 1) != 1 ? 0 : 1;
                annotation.f53326c = this.f53386c;
                if ((i & 2) == 2) {
                    this.f53387d = Collections.unmodifiableList(this.f53387d);
                    this.f53385b &= -3;
                }
                annotation.f53327d = this.f53387d;
                annotation.f53325b = i2;
                return annotation;
            }

            /* JADX INFO: renamed from: h */
            public final void m19433h(Annotation annotation) {
                if (annotation == Annotation.f53322i) {
                    return;
                }
                if ((annotation.f53325b & 1) == 1) {
                    int i = annotation.f53326c;
                    this.f53385b = 1 | this.f53385b;
                    this.f53386c = i;
                }
                if (!annotation.f53327d.isEmpty()) {
                    if (this.f53387d.isEmpty()) {
                        this.f53387d = annotation.f53327d;
                        this.f53385b &= -3;
                    } else {
                        if ((this.f53385b & 2) != 2) {
                            this.f53387d = new ArrayList(this.f53387d);
                            this.f53385b |= 2;
                        }
                        this.f53387d.addAll(annotation.f53327d);
                    }
                }
                this.f54106a = this.f54106a.m19625c(annotation.f53324a);
            }

            /* JADX WARN: Removed duplicated region for block: B:14:0x001b  */
            /* JADX INFO: renamed from: i */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void m19434i(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                Annotation annotation = null;
                try {
                    try {
                        m19433h((Annotation) ((C61081) Annotation.f53323j).mo19417a(codedInputStream, extensionRegistryLite));
                    } catch (InvalidProtocolBufferException e) {
                        Annotation annotation2 = (Annotation) e.f54121a;
                        try {
                            throw e;
                        } catch (Throwable th) {
                            th = th;
                            annotation = annotation2;
                            if (annotation != null) {
                                m19433h(annotation);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (annotation != null) {
                    }
                    throw th;
                }
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* JADX INFO: renamed from: n */
            public final /* bridge */ /* synthetic */ MessageLite.Builder mo19425n(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                m19434i(codedInputStream, extensionRegistryLite);
                return this;
            }
        }

        static {
            Annotation annotation = new Annotation();
            f53322i = annotation;
            annotation.f53326c = 0;
            annotation.f53327d = Collections.EMPTY_LIST;
        }

        public Annotation() {
            this.f53328f = (byte) -1;
            this.f53329g = -1;
            this.f53324a = ByteString.f54075a;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        /* JADX INFO: renamed from: a */
        public final void mo19416a(CodedOutputStream codedOutputStream) {
            getSerializedSize();
            if ((this.f53325b & 1) == 1) {
                codedOutputStream.m19670m(1, this.f53326c);
            }
            for (int i = 0; i < this.f53327d.size(); i++) {
                codedOutputStream.m19672o(2, (MessageLite) this.f53327d.get(i));
            }
            codedOutputStream.m19675r(this.f53324a);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final int getSerializedSize() {
            int i = this.f53329g;
            if (i != -1) {
                return i;
            }
            int iM19659b = (this.f53325b & 1) == 1 ? CodedOutputStream.m19659b(1, this.f53326c) : 0;
            for (int i2 = 0; i2 < this.f53327d.size(); i2++) {
                iM19659b += CodedOutputStream.m19661d(2, (MessageLite) this.f53327d.get(i2));
            }
            int size = this.f53324a.size() + iM19659b;
            this.f53329g = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b2 = this.f53328f;
            if (b2 == 1) {
                return true;
            }
            if (b2 == 0) {
                return false;
            }
            if ((this.f53325b & 1) != 1) {
                this.f53328f = (byte) 0;
                return false;
            }
            for (int i = 0; i < this.f53327d.size(); i++) {
                if (!((Argument) this.f53327d.get(i)).isInitialized()) {
                    this.f53328f = (byte) 0;
                    return false;
                }
            }
            this.f53328f = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final MessageLite.Builder newBuilderForType() {
            Builder builder = new Builder();
            builder.f53387d = Collections.EMPTY_LIST;
            return builder;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final MessageLite.Builder toBuilder() {
            Builder builder = new Builder();
            builder.f53387d = Collections.EMPTY_LIST;
            builder.m19433h(this);
            return builder;
        }

        /* JADX INFO: compiled from: Proguard */
        public static final class Argument extends GeneratedMessageLite implements ArgumentOrBuilder {

            /* JADX INFO: renamed from: i */
            public static final Argument f53330i;

            /* JADX INFO: renamed from: j */
            public static final Parser f53331j = new C61091();

            /* JADX INFO: renamed from: a */
            public final ByteString f53332a;

            /* JADX INFO: renamed from: b */
            public int f53333b;

            /* JADX INFO: renamed from: c */
            public int f53334c;

            /* JADX INFO: renamed from: d */
            public Value f53335d;

            /* JADX INFO: renamed from: f */
            public byte f53336f;

            /* JADX INFO: renamed from: g */
            public int f53337g;

            /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Argument$1 */
            /* JADX INFO: compiled from: Proguard */
            public static class C61091 extends AbstractParser<Argument> {
                @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
                /* JADX INFO: renamed from: a */
                public final Object mo19417a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                    return new Argument(codedInputStream, extensionRegistryLite);
                }
            }

            /* JADX INFO: compiled from: Proguard */
            public static final class Builder extends GeneratedMessageLite.Builder<Argument, Builder> implements ArgumentOrBuilder {

                /* JADX INFO: renamed from: b */
                public int f53338b;

                /* JADX INFO: renamed from: c */
                public int f53339c;

                /* JADX INFO: renamed from: d */
                public Value f53340d;

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
                /* JADX INFO: renamed from: b */
                public final AbstractMessageLite.Builder mo19418b() {
                    Builder builder = new Builder();
                    builder.f53340d = Value.f53341u;
                    builder.m19423h(m19422f());
                    return builder;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
                public final MessageLite build() {
                    Argument argumentM19422f = m19422f();
                    if (argumentM19422f.isInitialized()) {
                        return argumentM19422f;
                    }
                    throw new UninitializedMessageException();
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
                /* JADX INFO: renamed from: c */
                public final /* bridge */ /* synthetic */ AbstractMessageLite.Builder mo19419c(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                    m19424i(codedInputStream, extensionRegistryLite);
                    return this;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
                public final Object clone() {
                    Builder builder = new Builder();
                    builder.f53340d = Value.f53341u;
                    builder.m19423h(m19422f());
                    return builder;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
                /* JADX INFO: renamed from: d */
                public final GeneratedMessageLite.Builder mo19420d() {
                    Builder builder = new Builder();
                    builder.f53340d = Value.f53341u;
                    builder.m19423h(m19422f());
                    return builder;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
                /* JADX INFO: renamed from: e */
                public final /* bridge */ /* synthetic */ GeneratedMessageLite.Builder mo19421e(GeneratedMessageLite generatedMessageLite) {
                    m19423h((Argument) generatedMessageLite);
                    return this;
                }

                /* JADX INFO: renamed from: f */
                public final Argument m19422f() {
                    Argument argument = new Argument(this);
                    int i = this.f53338b;
                    int i2 = (i & 1) != 1 ? 0 : 1;
                    argument.f53334c = this.f53339c;
                    if ((i & 2) == 2) {
                        i2 |= 2;
                    }
                    argument.f53335d = this.f53340d;
                    argument.f53333b = i2;
                    return argument;
                }

                /* JADX INFO: renamed from: h */
                public final void m19423h(Argument argument) {
                    Value value;
                    if (argument == Argument.f53330i) {
                        return;
                    }
                    int i = argument.f53333b;
                    if ((i & 1) == 1) {
                        int i2 = argument.f53334c;
                        this.f53338b = 1 | this.f53338b;
                        this.f53339c = i2;
                    }
                    if ((i & 2) == 2) {
                        Value value2 = argument.f53335d;
                        if ((this.f53338b & 2) != 2 || (value = this.f53340d) == Value.f53341u) {
                            this.f53340d = value2;
                        } else {
                            Value.Builder builderM19427h = Value.Builder.m19427h();
                            builderM19427h.m19429i(value);
                            builderM19427h.m19429i(value2);
                            this.f53340d = builderM19427h.m19428f();
                        }
                        this.f53338b |= 2;
                    }
                    this.f54106a = this.f54106a.m19625c(argument.f53332a);
                }

                /* JADX WARN: Removed duplicated region for block: B:14:0x001d  */
                /* JADX INFO: renamed from: i */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void m19424i(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                    Argument argument = null;
                    try {
                        try {
                            ((C61091) Argument.f53331j).getClass();
                            m19423h(new Argument(codedInputStream, extensionRegistryLite));
                        } catch (InvalidProtocolBufferException e) {
                            Argument argument2 = (Argument) e.f54121a;
                            try {
                                throw e;
                            } catch (Throwable th) {
                                th = th;
                                argument = argument2;
                                if (argument != null) {
                                }
                                throw th;
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        if (argument != null) {
                            m19423h(argument);
                        }
                        throw th;
                    }
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
                /* JADX INFO: renamed from: n */
                public final /* bridge */ /* synthetic */ MessageLite.Builder mo19425n(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                    m19424i(codedInputStream, extensionRegistryLite);
                    return this;
                }
            }

            /* JADX INFO: compiled from: Proguard */
            public interface ValueOrBuilder extends MessageLiteOrBuilder {
            }

            static {
                Argument argument = new Argument();
                f53330i = argument;
                argument.f53334c = 0;
                argument.f53335d = Value.f53341u;
            }

            public Argument() {
                this.f53336f = (byte) -1;
                this.f53337g = -1;
                this.f53332a = ByteString.f54075a;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            /* JADX INFO: renamed from: a */
            public final void mo19416a(CodedOutputStream codedOutputStream) {
                getSerializedSize();
                if ((this.f53333b & 1) == 1) {
                    codedOutputStream.m19670m(1, this.f53334c);
                }
                if ((this.f53333b & 2) == 2) {
                    codedOutputStream.m19672o(2, this.f53335d);
                }
                codedOutputStream.m19675r(this.f53332a);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public final int getSerializedSize() {
                int i = this.f53337g;
                if (i != -1) {
                    return i;
                }
                int iM19659b = (this.f53333b & 1) == 1 ? CodedOutputStream.m19659b(1, this.f53334c) : 0;
                if ((this.f53333b & 2) == 2) {
                    iM19659b += CodedOutputStream.m19661d(2, this.f53335d);
                }
                int size = this.f53332a.size() + iM19659b;
                this.f53337g = size;
                return size;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                byte b2 = this.f53336f;
                if (b2 == 1) {
                    return true;
                }
                if (b2 == 0) {
                    return false;
                }
                int i = this.f53333b;
                if ((i & 1) != 1) {
                    this.f53336f = (byte) 0;
                    return false;
                }
                if ((i & 2) != 2) {
                    this.f53336f = (byte) 0;
                    return false;
                }
                if (this.f53335d.isInitialized()) {
                    this.f53336f = (byte) 1;
                    return true;
                }
                this.f53336f = (byte) 0;
                return false;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public final MessageLite.Builder newBuilderForType() {
                Builder builder = new Builder();
                builder.f53340d = Value.f53341u;
                return builder;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public final MessageLite.Builder toBuilder() {
                Builder builder = new Builder();
                builder.f53340d = Value.f53341u;
                builder.m19423h(this);
                return builder;
            }

            /* JADX INFO: compiled from: Proguard */
            public static final class Value extends GeneratedMessageLite implements ValueOrBuilder {

                /* JADX INFO: renamed from: u */
                public static final Value f53341u;

                /* JADX INFO: renamed from: v */
                public static final Parser f53342v = new C61101();

                /* JADX INFO: renamed from: a */
                public final ByteString f53343a;

                /* JADX INFO: renamed from: b */
                public int f53344b;

                /* JADX INFO: renamed from: c */
                public Type f53345c;

                /* JADX INFO: renamed from: d */
                public long f53346d;

                /* JADX INFO: renamed from: f */
                public float f53347f;

                /* JADX INFO: renamed from: g */
                public double f53348g;

                /* JADX INFO: renamed from: i */
                public int f53349i;

                /* JADX INFO: renamed from: j */
                public int f53350j;

                /* JADX INFO: renamed from: n */
                public int f53351n;

                /* JADX INFO: renamed from: o */
                public Annotation f53352o;

                /* JADX INFO: renamed from: p */
                public List f53353p;

                /* JADX INFO: renamed from: q */
                public int f53354q;

                /* JADX INFO: renamed from: r */
                public int f53355r;

                /* JADX INFO: renamed from: s */
                public byte f53356s;

                /* JADX INFO: renamed from: t */
                public int f53357t;

                /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Argument$Value$1 */
                /* JADX INFO: compiled from: Proguard */
                public static class C61101 extends AbstractParser<Value> {
                    @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
                    /* JADX INFO: renamed from: a */
                    public final Object mo19417a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                        return new Value(codedInputStream, extensionRegistryLite);
                    }
                }

                /* JADX INFO: compiled from: Proguard */
                public static final class Builder extends GeneratedMessageLite.Builder<Value, Builder> implements ValueOrBuilder {

                    /* JADX INFO: renamed from: b */
                    public int f53358b;

                    /* JADX INFO: renamed from: c */
                    public Type f53359c;

                    /* JADX INFO: renamed from: d */
                    public long f53360d;

                    /* JADX INFO: renamed from: f */
                    public float f53361f;

                    /* JADX INFO: renamed from: g */
                    public double f53362g;

                    /* JADX INFO: renamed from: i */
                    public int f53363i;

                    /* JADX INFO: renamed from: j */
                    public int f53364j;

                    /* JADX INFO: renamed from: n */
                    public int f53365n;

                    /* JADX INFO: renamed from: o */
                    public Annotation f53366o;

                    /* JADX INFO: renamed from: p */
                    public List f53367p;

                    /* JADX INFO: renamed from: q */
                    public int f53368q;

                    /* JADX INFO: renamed from: r */
                    public int f53369r;

                    /* JADX INFO: renamed from: h */
                    public static Builder m19427h() {
                        Builder builder = new Builder();
                        builder.f53359c = Type.BYTE;
                        builder.f53366o = Annotation.f53322i;
                        builder.f53367p = Collections.EMPTY_LIST;
                        return builder;
                    }

                    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
                    /* JADX INFO: renamed from: b */
                    public final AbstractMessageLite.Builder mo19418b() {
                        Builder builderM19427h = m19427h();
                        builderM19427h.m19429i(m19428f());
                        return builderM19427h;
                    }

                    @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
                    public final MessageLite build() {
                        Value valueM19428f = m19428f();
                        if (valueM19428f.isInitialized()) {
                            return valueM19428f;
                        }
                        throw new UninitializedMessageException();
                    }

                    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
                    /* JADX INFO: renamed from: c */
                    public final /* bridge */ /* synthetic */ AbstractMessageLite.Builder mo19419c(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                        m19430j(codedInputStream, extensionRegistryLite);
                        return this;
                    }

                    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
                    public final Object clone() {
                        Builder builderM19427h = m19427h();
                        builderM19427h.m19429i(m19428f());
                        return builderM19427h;
                    }

                    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
                    /* JADX INFO: renamed from: d */
                    public final GeneratedMessageLite.Builder mo19420d() {
                        Builder builderM19427h = m19427h();
                        builderM19427h.m19429i(m19428f());
                        return builderM19427h;
                    }

                    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
                    /* JADX INFO: renamed from: e */
                    public final /* bridge */ /* synthetic */ GeneratedMessageLite.Builder mo19421e(GeneratedMessageLite generatedMessageLite) {
                        m19429i((Value) generatedMessageLite);
                        return this;
                    }

                    /* JADX INFO: renamed from: f */
                    public final Value m19428f() {
                        Value value = new Value(this);
                        int i = this.f53358b;
                        int i2 = (i & 1) != 1 ? 0 : 1;
                        value.f53345c = this.f53359c;
                        if ((i & 2) == 2) {
                            i2 |= 2;
                        }
                        value.f53346d = this.f53360d;
                        if ((i & 4) == 4) {
                            i2 |= 4;
                        }
                        value.f53347f = this.f53361f;
                        if ((i & 8) == 8) {
                            i2 |= 8;
                        }
                        value.f53348g = this.f53362g;
                        if ((i & 16) == 16) {
                            i2 |= 16;
                        }
                        value.f53349i = this.f53363i;
                        if ((i & 32) == 32) {
                            i2 |= 32;
                        }
                        value.f53350j = this.f53364j;
                        if ((i & 64) == 64) {
                            i2 |= 64;
                        }
                        value.f53351n = this.f53365n;
                        if ((i & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) == 128) {
                            i2 |= UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                        }
                        value.f53352o = this.f53366o;
                        if ((i & 256) == 256) {
                            this.f53367p = Collections.unmodifiableList(this.f53367p);
                            this.f53358b &= -257;
                        }
                        value.f53353p = this.f53367p;
                        if ((i & 512) == 512) {
                            i2 |= 256;
                        }
                        value.f53354q = this.f53368q;
                        if ((i & UserMetadata.MAX_ATTRIBUTE_SIZE) == 1024) {
                            i2 |= 512;
                        }
                        value.f53355r = this.f53369r;
                        value.f53344b = i2;
                        return value;
                    }

                    /* JADX INFO: renamed from: i */
                    public final void m19429i(Value value) {
                        Annotation annotation;
                        if (value == Value.f53341u) {
                            return;
                        }
                        if ((value.f53344b & 1) == 1) {
                            Type type = value.f53345c;
                            type.getClass();
                            this.f53358b = 1 | this.f53358b;
                            this.f53359c = type;
                        }
                        int i = value.f53344b;
                        if ((i & 2) == 2) {
                            long j = value.f53346d;
                            this.f53358b |= 2;
                            this.f53360d = j;
                        }
                        if ((i & 4) == 4) {
                            float f = value.f53347f;
                            this.f53358b = 4 | this.f53358b;
                            this.f53361f = f;
                        }
                        if ((i & 8) == 8) {
                            double d = value.f53348g;
                            this.f53358b |= 8;
                            this.f53362g = d;
                        }
                        if ((i & 16) == 16) {
                            int i2 = value.f53349i;
                            this.f53358b = 16 | this.f53358b;
                            this.f53363i = i2;
                        }
                        if ((i & 32) == 32) {
                            int i3 = value.f53350j;
                            this.f53358b = 32 | this.f53358b;
                            this.f53364j = i3;
                        }
                        if ((i & 64) == 64) {
                            int i4 = value.f53351n;
                            this.f53358b = 64 | this.f53358b;
                            this.f53365n = i4;
                        }
                        if ((i & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) == 128) {
                            Annotation annotation2 = value.f53352o;
                            if ((this.f53358b & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 128 || (annotation = this.f53366o) == Annotation.f53322i) {
                                this.f53366o = annotation2;
                            } else {
                                Builder builder = new Builder();
                                builder.f53387d = Collections.EMPTY_LIST;
                                builder.m19433h(annotation);
                                builder.m19433h(annotation2);
                                this.f53366o = builder.m19432f();
                            }
                            this.f53358b |= UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                        }
                        if (!value.f53353p.isEmpty()) {
                            if (this.f53367p.isEmpty()) {
                                this.f53367p = value.f53353p;
                                this.f53358b &= -257;
                            } else {
                                if ((this.f53358b & 256) != 256) {
                                    this.f53367p = new ArrayList(this.f53367p);
                                    this.f53358b |= 256;
                                }
                                this.f53367p.addAll(value.f53353p);
                            }
                        }
                        int i5 = value.f53344b;
                        if ((i5 & 256) == 256) {
                            int i6 = value.f53354q;
                            this.f53358b |= 512;
                            this.f53368q = i6;
                        }
                        if ((i5 & 512) == 512) {
                            int i7 = value.f53355r;
                            this.f53358b |= UserMetadata.MAX_ATTRIBUTE_SIZE;
                            this.f53369r = i7;
                        }
                        this.f54106a = this.f54106a.m19625c(value.f53343a);
                    }

                    /* JADX WARN: Removed duplicated region for block: B:14:0x001d  */
                    /* JADX INFO: renamed from: j */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final void m19430j(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                        Value value = null;
                        try {
                            try {
                                ((C61101) Value.f53342v).getClass();
                                m19429i(new Value(codedInputStream, extensionRegistryLite));
                            } catch (InvalidProtocolBufferException e) {
                                Value value2 = (Value) e.f54121a;
                                try {
                                    throw e;
                                } catch (Throwable th) {
                                    th = th;
                                    value = value2;
                                    if (value != null) {
                                    }
                                    throw th;
                                }
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            if (value != null) {
                                m19429i(value);
                            }
                            throw th;
                        }
                    }

                    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
                    /* JADX INFO: renamed from: n */
                    public final /* bridge */ /* synthetic */ MessageLite.Builder mo19425n(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                        m19430j(codedInputStream, extensionRegistryLite);
                        return this;
                    }
                }

                /* JADX INFO: compiled from: Proguard */
                public enum Type implements Internal.EnumLite {
                    BYTE(0),
                    CHAR(1),
                    SHORT(2),
                    INT(3),
                    LONG(4),
                    FLOAT(5),
                    DOUBLE(6),
                    BOOLEAN(7),
                    STRING(8),
                    CLASS(9),
                    ENUM(10),
                    ANNOTATION(11),
                    ARRAY(12);


                    /* JADX INFO: renamed from: a */
                    public final int f53384a;

                    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Argument$Value$Type$1 */
                    /* JADX INFO: compiled from: Proguard */
                    public static class C61111 implements Internal.EnumLiteMap<Type> {
                    }

                    Type(int i) {
                        this.f53384a = i;
                    }

                    /* JADX INFO: renamed from: a */
                    public static Type m19431a(int i) {
                        switch (i) {
                            case 0:
                                return BYTE;
                            case 1:
                                return CHAR;
                            case 2:
                                return SHORT;
                            case 3:
                                return INT;
                            case 4:
                                return LONG;
                            case 5:
                                return FLOAT;
                            case 6:
                                return DOUBLE;
                            case 7:
                                return BOOLEAN;
                            case 8:
                                return STRING;
                            case 9:
                                return CLASS;
                            case 10:
                                return ENUM;
                            case 11:
                                return ANNOTATION;
                            case TYPE_BYTES_VALUE:
                                return ARRAY;
                            default:
                                return null;
                        }
                    }

                    @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
                    public final int getNumber() {
                        return this.f53384a;
                    }
                }

                static {
                    Value value = new Value();
                    f53341u = value;
                    value.m19426d();
                }

                public Value() {
                    this.f53356s = (byte) -1;
                    this.f53357t = -1;
                    this.f53343a = ByteString.f54075a;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
                /* JADX INFO: renamed from: a */
                public final void mo19416a(CodedOutputStream codedOutputStream) {
                    getSerializedSize();
                    if ((this.f53344b & 1) == 1) {
                        codedOutputStream.m19669l(1, this.f53345c.f53384a);
                    }
                    if ((this.f53344b & 2) == 2) {
                        long j = this.f53346d;
                        codedOutputStream.m19681x(2, 0);
                        codedOutputStream.m19680w((j >> 63) ^ (j << 1));
                    }
                    if ((this.f53344b & 4) == 4) {
                        float f = this.f53347f;
                        codedOutputStream.m19681x(3, 5);
                        codedOutputStream.m19677t(Float.floatToRawIntBits(f));
                    }
                    if ((this.f53344b & 8) == 8) {
                        double d = this.f53348g;
                        codedOutputStream.m19681x(4, 1);
                        codedOutputStream.m19678u(Double.doubleToRawLongBits(d));
                    }
                    if ((this.f53344b & 16) == 16) {
                        codedOutputStream.m19670m(5, this.f53349i);
                    }
                    if ((this.f53344b & 32) == 32) {
                        codedOutputStream.m19670m(6, this.f53350j);
                    }
                    if ((this.f53344b & 64) == 64) {
                        codedOutputStream.m19670m(7, this.f53351n);
                    }
                    if ((this.f53344b & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) == 128) {
                        codedOutputStream.m19672o(8, this.f53352o);
                    }
                    for (int i = 0; i < this.f53353p.size(); i++) {
                        codedOutputStream.m19672o(9, (MessageLite) this.f53353p.get(i));
                    }
                    if ((this.f53344b & 512) == 512) {
                        codedOutputStream.m19670m(10, this.f53355r);
                    }
                    if ((this.f53344b & 256) == 256) {
                        codedOutputStream.m19670m(11, this.f53354q);
                    }
                    codedOutputStream.m19675r(this.f53343a);
                }

                /* JADX INFO: renamed from: d */
                public final void m19426d() {
                    this.f53345c = Type.BYTE;
                    this.f53346d = 0L;
                    this.f53347f = 0.0f;
                    this.f53348g = 0.0d;
                    this.f53349i = 0;
                    this.f53350j = 0;
                    this.f53351n = 0;
                    this.f53352o = Annotation.f53322i;
                    this.f53353p = Collections.EMPTY_LIST;
                    this.f53354q = 0;
                    this.f53355r = 0;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
                public final int getSerializedSize() {
                    int i = this.f53357t;
                    if (i != -1) {
                        return i;
                    }
                    int iM19658a = (this.f53344b & 1) == 1 ? CodedOutputStream.m19658a(1, this.f53345c.f53384a) : 0;
                    if ((this.f53344b & 2) == 2) {
                        long j = this.f53346d;
                        iM19658a += CodedOutputStream.m19664g((j >> 63) ^ (j << 1)) + CodedOutputStream.m19665h(2);
                    }
                    if ((this.f53344b & 4) == 4) {
                        iM19658a += CodedOutputStream.m19665h(3) + 4;
                    }
                    if ((this.f53344b & 8) == 8) {
                        iM19658a += CodedOutputStream.m19665h(4) + 8;
                    }
                    if ((this.f53344b & 16) == 16) {
                        iM19658a += CodedOutputStream.m19659b(5, this.f53349i);
                    }
                    if ((this.f53344b & 32) == 32) {
                        iM19658a += CodedOutputStream.m19659b(6, this.f53350j);
                    }
                    if ((this.f53344b & 64) == 64) {
                        iM19658a += CodedOutputStream.m19659b(7, this.f53351n);
                    }
                    if ((this.f53344b & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) == 128) {
                        iM19658a += CodedOutputStream.m19661d(8, this.f53352o);
                    }
                    for (int i2 = 0; i2 < this.f53353p.size(); i2++) {
                        iM19658a += CodedOutputStream.m19661d(9, (MessageLite) this.f53353p.get(i2));
                    }
                    if ((this.f53344b & 512) == 512) {
                        iM19658a += CodedOutputStream.m19659b(10, this.f53355r);
                    }
                    if ((this.f53344b & 256) == 256) {
                        iM19658a += CodedOutputStream.m19659b(11, this.f53354q);
                    }
                    int size = this.f53343a.size() + iM19658a;
                    this.f53357t = size;
                    return size;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
                public final boolean isInitialized() {
                    byte b2 = this.f53356s;
                    if (b2 == 1) {
                        return true;
                    }
                    if (b2 == 0) {
                        return false;
                    }
                    if ((this.f53344b & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) == 128 && !this.f53352o.isInitialized()) {
                        this.f53356s = (byte) 0;
                        return false;
                    }
                    for (int i = 0; i < this.f53353p.size(); i++) {
                        if (!((Value) this.f53353p.get(i)).isInitialized()) {
                            this.f53356s = (byte) 0;
                            return false;
                        }
                    }
                    this.f53356s = (byte) 1;
                    return true;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
                public final MessageLite.Builder newBuilderForType() {
                    return Builder.m19427h();
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
                public final MessageLite.Builder toBuilder() {
                    Builder builderM19427h = Builder.m19427h();
                    builderM19427h.m19429i(this);
                    return builderM19427h;
                }

                public Value(Builder builder) {
                    this.f53356s = (byte) -1;
                    this.f53357t = -1;
                    this.f53343a = builder.f54106a;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r5v0 */
                /* JADX WARN: Type inference failed for: r5v1 */
                /* JADX WARN: Type inference failed for: r5v2, types: [boolean] */
                public Value(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                    Builder builder;
                    this.f53356s = (byte) -1;
                    this.f53357t = -1;
                    m19426d();
                    ByteString.Output output = new ByteString.Output();
                    CodedOutputStream codedOutputStreamM19666j = CodedOutputStream.m19666j(output, 1);
                    boolean z2 = false;
                    char c2 = 0;
                    while (true) {
                        ?? M19655q = 256;
                        if (!z2) {
                            try {
                                try {
                                    int iM19652n = codedInputStream.m19652n();
                                    switch (iM19652n) {
                                        case 0:
                                            z2 = true;
                                            break;
                                        case 8:
                                            int iM19649k = codedInputStream.m19649k();
                                            Type typeM19431a = Type.m19431a(iM19649k);
                                            if (typeM19431a == null) {
                                                codedOutputStreamM19666j.m19679v(iM19652n);
                                                codedOutputStreamM19666j.m19679v(iM19649k);
                                            } else {
                                                this.f53344b |= 1;
                                                this.f53345c = typeM19431a;
                                            }
                                            break;
                                        case 16:
                                            this.f53344b |= 2;
                                            long jM19650l = codedInputStream.m19650l();
                                            this.f53346d = (-(jM19650l & 1)) ^ (jM19650l >>> 1);
                                            break;
                                        case 29:
                                            this.f53344b |= 4;
                                            this.f53347f = Float.intBitsToFloat(codedInputStream.m19647i());
                                            break;
                                        case Encoder.DEFAULT_EC_PERCENT /* 33 */:
                                            this.f53344b |= 8;
                                            this.f53348g = Double.longBitsToDouble(codedInputStream.m19648j());
                                            break;
                                        case 40:
                                            this.f53344b |= 16;
                                            this.f53349i = codedInputStream.m19649k();
                                            break;
                                        case 48:
                                            this.f53344b |= 32;
                                            this.f53350j = codedInputStream.m19649k();
                                            break;
                                        case 56:
                                            this.f53344b |= 64;
                                            this.f53351n = codedInputStream.m19649k();
                                            break;
                                        case 66:
                                            if ((this.f53344b & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) == 128) {
                                                Annotation annotation = this.f53352o;
                                                annotation.getClass();
                                                builder = new Builder();
                                                builder.f53387d = Collections.EMPTY_LIST;
                                                builder.m19433h(annotation);
                                            } else {
                                                builder = null;
                                            }
                                            Annotation annotation2 = (Annotation) codedInputStream.m19645g(Annotation.f53323j, extensionRegistryLite);
                                            this.f53352o = annotation2;
                                            if (builder != null) {
                                                builder.m19433h(annotation2);
                                                this.f53352o = builder.m19432f();
                                            }
                                            this.f53344b |= UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                                            break;
                                        case 74:
                                            if ((c2 & 256) != 256) {
                                                this.f53353p = new ArrayList();
                                                c2 = 256;
                                            }
                                            this.f53353p.add(codedInputStream.m19645g(f53342v, extensionRegistryLite));
                                            break;
                                        case 80:
                                            this.f53344b |= 512;
                                            this.f53355r = codedInputStream.m19649k();
                                            break;
                                        case 88:
                                            this.f53344b |= 256;
                                            this.f53354q = codedInputStream.m19649k();
                                            break;
                                        default:
                                            M19655q = codedInputStream.m19655q(iM19652n, codedOutputStreamM19666j);
                                            if (M19655q == 0) {
                                                z2 = true;
                                            }
                                            break;
                                    }
                                } catch (InvalidProtocolBufferException e) {
                                    e.f54121a = this;
                                    throw e;
                                } catch (IOException e2) {
                                    InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e2.getMessage());
                                    invalidProtocolBufferException.f54121a = this;
                                    throw invalidProtocolBufferException;
                                }
                            } catch (Throwable th) {
                                if ((c2 & 256) == M19655q) {
                                    this.f53353p = Collections.unmodifiableList(this.f53353p);
                                }
                                try {
                                    codedOutputStreamM19666j.m19667i();
                                } catch (IOException unused) {
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                                throw th;
                            }
                        } else {
                            if ((c2 & 256) == 256) {
                                this.f53353p = Collections.unmodifiableList(this.f53353p);
                            }
                            try {
                                codedOutputStreamM19666j.m19667i();
                                return;
                            } catch (IOException unused2) {
                                return;
                            } finally {
                                this.f53343a = output.m19638d();
                            }
                        }
                    }
                }
            }

            public Argument(Builder builder) {
                this.f53336f = (byte) -1;
                this.f53337g = -1;
                this.f53332a = builder.f54106a;
            }

            public Argument(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                Value.Builder builderM19427h;
                this.f53336f = (byte) -1;
                this.f53337g = -1;
                boolean z2 = false;
                this.f53334c = 0;
                this.f53335d = Value.f53341u;
                ByteString.Output output = new ByteString.Output();
                CodedOutputStream codedOutputStreamM19666j = CodedOutputStream.m19666j(output, 1);
                while (!z2) {
                    try {
                        try {
                            int iM19652n = codedInputStream.m19652n();
                            if (iM19652n != 0) {
                                if (iM19652n == 8) {
                                    this.f53333b |= 1;
                                    this.f53334c = codedInputStream.m19649k();
                                } else if (iM19652n != 18) {
                                    if (!codedInputStream.m19655q(iM19652n, codedOutputStreamM19666j)) {
                                    }
                                } else {
                                    if ((this.f53333b & 2) == 2) {
                                        Value value = this.f53335d;
                                        value.getClass();
                                        builderM19427h = Value.Builder.m19427h();
                                        builderM19427h.m19429i(value);
                                    } else {
                                        builderM19427h = null;
                                    }
                                    Value value2 = (Value) codedInputStream.m19645g(Value.f53342v, extensionRegistryLite);
                                    this.f53335d = value2;
                                    if (builderM19427h != null) {
                                        builderM19427h.m19429i(value2);
                                        this.f53335d = builderM19427h.m19428f();
                                    }
                                    this.f53333b |= 2;
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
                    this.f53332a = output.m19638d();
                }
            }
        }

        public Annotation(Builder builder) {
            this.f53328f = (byte) -1;
            this.f53329g = -1;
            this.f53324a = builder.f54106a;
        }

        public Annotation(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            this.f53328f = (byte) -1;
            this.f53329g = -1;
            boolean z2 = false;
            this.f53326c = 0;
            this.f53327d = Collections.EMPTY_LIST;
            ByteString.Output output = new ByteString.Output();
            CodedOutputStream codedOutputStreamM19666j = CodedOutputStream.m19666j(output, 1);
            char c2 = 0;
            while (!z2) {
                try {
                    try {
                        try {
                            int iM19652n = codedInputStream.m19652n();
                            if (iM19652n != 0) {
                                if (iM19652n == 8) {
                                    this.f53325b |= 1;
                                    this.f53326c = codedInputStream.m19649k();
                                } else if (iM19652n != 18) {
                                    if (!codedInputStream.m19655q(iM19652n, codedOutputStreamM19666j)) {
                                    }
                                } else {
                                    if ((c2 & 2) != 2) {
                                        this.f53327d = new ArrayList();
                                        c2 = 2;
                                    }
                                    this.f53327d.add(codedInputStream.m19645g(Argument.f53331j, extensionRegistryLite));
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
                    if ((c2 & 2) == 2) {
                        this.f53327d = Collections.unmodifiableList(this.f53327d);
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
            if ((c2 & 2) == 2) {
                this.f53327d = Collections.unmodifiableList(this.f53327d);
            }
            try {
                codedOutputStreamM19666j.m19667i();
            } catch (IOException unused2) {
            } finally {
                this.f53324a = output.m19638d();
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class QualifiedNameTable extends GeneratedMessageLite implements QualifiedNameTableOrBuilder {

        /* JADX INFO: renamed from: f */
        public static final QualifiedNameTable f53645f;

        /* JADX INFO: renamed from: g */
        public static final Parser f53646g = new C61281();

        /* JADX INFO: renamed from: a */
        public final ByteString f53647a;

        /* JADX INFO: renamed from: b */
        public List f53648b;

        /* JADX INFO: renamed from: c */
        public byte f53649c;

        /* JADX INFO: renamed from: d */
        public int f53650d;

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$QualifiedNameTable$1 */
        /* JADX INFO: compiled from: Proguard */
        public static class C61281 extends AbstractParser<QualifiedNameTable> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            /* JADX INFO: renamed from: a */
            public final Object mo19417a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new QualifiedNameTable(codedInputStream, extensionRegistryLite);
            }
        }

        /* JADX INFO: compiled from: Proguard */
        public static final class Builder extends GeneratedMessageLite.Builder<QualifiedNameTable, Builder> implements QualifiedNameTableOrBuilder {

            /* JADX INFO: renamed from: b */
            public int f53651b;

            /* JADX INFO: renamed from: c */
            public List f53652c;

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: b */
            public final AbstractMessageLite.Builder mo19418b() {
                Builder builder = new Builder();
                builder.f53652c = Collections.EMPTY_LIST;
                builder.m19477h(m19476f());
                return builder;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public final MessageLite build() {
                QualifiedNameTable qualifiedNameTableM19476f = m19476f();
                if (qualifiedNameTableM19476f.isInitialized()) {
                    return qualifiedNameTableM19476f;
                }
                throw new UninitializedMessageException();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: c */
            public final /* bridge */ /* synthetic */ AbstractMessageLite.Builder mo19419c(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                m19478i(codedInputStream, extensionRegistryLite);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            public final Object clone() {
                Builder builder = new Builder();
                builder.f53652c = Collections.EMPTY_LIST;
                builder.m19477h(m19476f());
                return builder;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* JADX INFO: renamed from: d */
            public final GeneratedMessageLite.Builder mo19420d() {
                Builder builder = new Builder();
                builder.f53652c = Collections.EMPTY_LIST;
                builder.m19477h(m19476f());
                return builder;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* JADX INFO: renamed from: e */
            public final /* bridge */ /* synthetic */ GeneratedMessageLite.Builder mo19421e(GeneratedMessageLite generatedMessageLite) {
                m19477h((QualifiedNameTable) generatedMessageLite);
                return this;
            }

            /* JADX INFO: renamed from: f */
            public final QualifiedNameTable m19476f() {
                QualifiedNameTable qualifiedNameTable = new QualifiedNameTable(this);
                if ((this.f53651b & 1) == 1) {
                    this.f53652c = Collections.unmodifiableList(this.f53652c);
                    this.f53651b &= -2;
                }
                qualifiedNameTable.f53648b = this.f53652c;
                return qualifiedNameTable;
            }

            /* JADX INFO: renamed from: h */
            public final void m19477h(QualifiedNameTable qualifiedNameTable) {
                if (qualifiedNameTable == QualifiedNameTable.f53645f) {
                    return;
                }
                if (!qualifiedNameTable.f53648b.isEmpty()) {
                    if (this.f53652c.isEmpty()) {
                        this.f53652c = qualifiedNameTable.f53648b;
                        this.f53651b &= -2;
                    } else {
                        if ((this.f53651b & 1) != 1) {
                            this.f53652c = new ArrayList(this.f53652c);
                            this.f53651b |= 1;
                        }
                        this.f53652c.addAll(qualifiedNameTable.f53648b);
                    }
                }
                this.f54106a = this.f54106a.m19625c(qualifiedNameTable.f53647a);
            }

            /* JADX WARN: Removed duplicated region for block: B:14:0x001d  */
            /* JADX INFO: renamed from: i */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void m19478i(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                QualifiedNameTable qualifiedNameTable = null;
                try {
                    try {
                        ((C61281) QualifiedNameTable.f53646g).getClass();
                        m19477h(new QualifiedNameTable(codedInputStream, extensionRegistryLite));
                    } catch (InvalidProtocolBufferException e) {
                        QualifiedNameTable qualifiedNameTable2 = (QualifiedNameTable) e.f54121a;
                        try {
                            throw e;
                        } catch (Throwable th) {
                            th = th;
                            qualifiedNameTable = qualifiedNameTable2;
                            if (qualifiedNameTable != null) {
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (qualifiedNameTable != null) {
                        m19477h(qualifiedNameTable);
                    }
                    throw th;
                }
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* JADX INFO: renamed from: n */
            public final /* bridge */ /* synthetic */ MessageLite.Builder mo19425n(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                m19478i(codedInputStream, extensionRegistryLite);
                return this;
            }
        }

        /* JADX INFO: compiled from: Proguard */
        public interface QualifiedNameOrBuilder extends MessageLiteOrBuilder {
        }

        static {
            QualifiedNameTable qualifiedNameTable = new QualifiedNameTable();
            f53645f = qualifiedNameTable;
            qualifiedNameTable.f53648b = Collections.EMPTY_LIST;
        }

        public QualifiedNameTable() {
            this.f53649c = (byte) -1;
            this.f53650d = -1;
            this.f53647a = ByteString.f54075a;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        /* JADX INFO: renamed from: a */
        public final void mo19416a(CodedOutputStream codedOutputStream) {
            getSerializedSize();
            for (int i = 0; i < this.f53648b.size(); i++) {
                codedOutputStream.m19672o(1, (MessageLite) this.f53648b.get(i));
            }
            codedOutputStream.m19675r(this.f53647a);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final int getSerializedSize() {
            int i = this.f53650d;
            if (i != -1) {
                return i;
            }
            int iM19661d = 0;
            for (int i2 = 0; i2 < this.f53648b.size(); i2++) {
                iM19661d += CodedOutputStream.m19661d(1, (MessageLite) this.f53648b.get(i2));
            }
            int size = this.f53647a.size() + iM19661d;
            this.f53650d = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b2 = this.f53649c;
            if (b2 == 1) {
                return true;
            }
            if (b2 == 0) {
                return false;
            }
            for (int i = 0; i < this.f53648b.size(); i++) {
                if (!((QualifiedName) this.f53648b.get(i)).isInitialized()) {
                    this.f53649c = (byte) 0;
                    return false;
                }
            }
            this.f53649c = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final MessageLite.Builder newBuilderForType() {
            Builder builder = new Builder();
            builder.f53652c = Collections.EMPTY_LIST;
            return builder;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final MessageLite.Builder toBuilder() {
            Builder builder = new Builder();
            builder.f53652c = Collections.EMPTY_LIST;
            builder.m19477h(this);
            return builder;
        }

        /* JADX INFO: compiled from: Proguard */
        public static final class QualifiedName extends GeneratedMessageLite implements QualifiedNameOrBuilder {

            /* JADX INFO: renamed from: j */
            public static final QualifiedName f53653j;

            /* JADX INFO: renamed from: n */
            public static final Parser f53654n = new C61291();

            /* JADX INFO: renamed from: a */
            public final ByteString f53655a;

            /* JADX INFO: renamed from: b */
            public int f53656b;

            /* JADX INFO: renamed from: c */
            public int f53657c;

            /* JADX INFO: renamed from: d */
            public int f53658d;

            /* JADX INFO: renamed from: f */
            public Kind f53659f;

            /* JADX INFO: renamed from: g */
            public byte f53660g;

            /* JADX INFO: renamed from: i */
            public int f53661i;

            /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$QualifiedNameTable$QualifiedName$1 */
            /* JADX INFO: compiled from: Proguard */
            public static class C61291 extends AbstractParser<QualifiedName> {
                @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
                /* JADX INFO: renamed from: a */
                public final Object mo19417a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                    return new QualifiedName(codedInputStream);
                }
            }

            /* JADX INFO: compiled from: Proguard */
            public static final class Builder extends GeneratedMessageLite.Builder<QualifiedName, Builder> implements QualifiedNameOrBuilder {

                /* JADX INFO: renamed from: b */
                public int f53662b;

                /* JADX INFO: renamed from: c */
                public int f53663c;

                /* JADX INFO: renamed from: d */
                public int f53664d;

                /* JADX INFO: renamed from: f */
                public Kind f53665f;

                /* JADX INFO: renamed from: h */
                public static Builder m19479h() {
                    Builder builder = new Builder();
                    builder.f53663c = -1;
                    builder.f53665f = Kind.PACKAGE;
                    return builder;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
                /* JADX INFO: renamed from: b */
                public final AbstractMessageLite.Builder mo19418b() {
                    Builder builderM19479h = m19479h();
                    builderM19479h.m19481i(m19480f());
                    return builderM19479h;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
                public final MessageLite build() {
                    QualifiedName qualifiedNameM19480f = m19480f();
                    if (qualifiedNameM19480f.isInitialized()) {
                        return qualifiedNameM19480f;
                    }
                    throw new UninitializedMessageException();
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
                /* JADX INFO: renamed from: c */
                public final /* bridge */ /* synthetic */ AbstractMessageLite.Builder mo19419c(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                    m19482j(codedInputStream, extensionRegistryLite);
                    return this;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
                public final Object clone() {
                    Builder builderM19479h = m19479h();
                    builderM19479h.m19481i(m19480f());
                    return builderM19479h;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
                /* JADX INFO: renamed from: d */
                public final GeneratedMessageLite.Builder mo19420d() {
                    Builder builderM19479h = m19479h();
                    builderM19479h.m19481i(m19480f());
                    return builderM19479h;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
                /* JADX INFO: renamed from: e */
                public final /* bridge */ /* synthetic */ GeneratedMessageLite.Builder mo19421e(GeneratedMessageLite generatedMessageLite) {
                    m19481i((QualifiedName) generatedMessageLite);
                    return this;
                }

                /* JADX INFO: renamed from: f */
                public final QualifiedName m19480f() {
                    QualifiedName qualifiedName = new QualifiedName(this);
                    int i = this.f53662b;
                    int i2 = (i & 1) != 1 ? 0 : 1;
                    qualifiedName.f53657c = this.f53663c;
                    if ((i & 2) == 2) {
                        i2 |= 2;
                    }
                    qualifiedName.f53658d = this.f53664d;
                    if ((i & 4) == 4) {
                        i2 |= 4;
                    }
                    qualifiedName.f53659f = this.f53665f;
                    qualifiedName.f53656b = i2;
                    return qualifiedName;
                }

                /* JADX INFO: renamed from: i */
                public final void m19481i(QualifiedName qualifiedName) {
                    if (qualifiedName == QualifiedName.f53653j) {
                        return;
                    }
                    int i = qualifiedName.f53656b;
                    if ((i & 1) == 1) {
                        int i2 = qualifiedName.f53657c;
                        this.f53662b = 1 | this.f53662b;
                        this.f53663c = i2;
                    }
                    if ((i & 2) == 2) {
                        int i3 = qualifiedName.f53658d;
                        this.f53662b = 2 | this.f53662b;
                        this.f53664d = i3;
                    }
                    if ((i & 4) == 4) {
                        Kind kind = qualifiedName.f53659f;
                        kind.getClass();
                        this.f53662b = 4 | this.f53662b;
                        this.f53665f = kind;
                    }
                    this.f54106a = this.f54106a.m19625c(qualifiedName.f53655a);
                }

                /* JADX WARN: Removed duplicated region for block: B:14:0x001d  */
                /* JADX INFO: renamed from: j */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void m19482j(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                    QualifiedName qualifiedName = null;
                    try {
                        try {
                            ((C61291) QualifiedName.f53654n).getClass();
                            m19481i(new QualifiedName(codedInputStream));
                        } catch (InvalidProtocolBufferException e) {
                            QualifiedName qualifiedName2 = (QualifiedName) e.f54121a;
                            try {
                                throw e;
                            } catch (Throwable th) {
                                th = th;
                                qualifiedName = qualifiedName2;
                                if (qualifiedName != null) {
                                }
                                throw th;
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        if (qualifiedName != null) {
                            m19481i(qualifiedName);
                        }
                        throw th;
                    }
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
                /* JADX INFO: renamed from: n */
                public final /* bridge */ /* synthetic */ MessageLite.Builder mo19425n(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                    m19482j(codedInputStream, extensionRegistryLite);
                    return this;
                }
            }

            /* JADX INFO: compiled from: Proguard */
            public enum Kind implements Internal.EnumLite {
                CLASS(0),
                PACKAGE(1),
                LOCAL(2);


                /* JADX INFO: renamed from: a */
                public final int f53670a;

                /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$QualifiedNameTable$QualifiedName$Kind$1 */
                /* JADX INFO: compiled from: Proguard */
                public static class C61301 implements Internal.EnumLiteMap<Kind> {
                }

                Kind(int i) {
                    this.f53670a = i;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
                public final int getNumber() {
                    return this.f53670a;
                }
            }

            static {
                QualifiedName qualifiedName = new QualifiedName();
                f53653j = qualifiedName;
                qualifiedName.f53657c = -1;
                qualifiedName.f53658d = 0;
                qualifiedName.f53659f = Kind.PACKAGE;
            }

            public QualifiedName() {
                this.f53660g = (byte) -1;
                this.f53661i = -1;
                this.f53655a = ByteString.f54075a;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            /* JADX INFO: renamed from: a */
            public final void mo19416a(CodedOutputStream codedOutputStream) {
                getSerializedSize();
                if ((this.f53656b & 1) == 1) {
                    codedOutputStream.m19670m(1, this.f53657c);
                }
                if ((this.f53656b & 2) == 2) {
                    codedOutputStream.m19670m(2, this.f53658d);
                }
                if ((this.f53656b & 4) == 4) {
                    codedOutputStream.m19669l(3, this.f53659f.f53670a);
                }
                codedOutputStream.m19675r(this.f53655a);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public final int getSerializedSize() {
                int i = this.f53661i;
                if (i != -1) {
                    return i;
                }
                int iM19659b = (this.f53656b & 1) == 1 ? CodedOutputStream.m19659b(1, this.f53657c) : 0;
                if ((this.f53656b & 2) == 2) {
                    iM19659b += CodedOutputStream.m19659b(2, this.f53658d);
                }
                if ((this.f53656b & 4) == 4) {
                    iM19659b += CodedOutputStream.m19658a(3, this.f53659f.f53670a);
                }
                int size = this.f53655a.size() + iM19659b;
                this.f53661i = size;
                return size;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                byte b2 = this.f53660g;
                if (b2 == 1) {
                    return true;
                }
                if (b2 == 0) {
                    return false;
                }
                if ((this.f53656b & 2) == 2) {
                    this.f53660g = (byte) 1;
                    return true;
                }
                this.f53660g = (byte) 0;
                return false;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public final MessageLite.Builder newBuilderForType() {
                return Builder.m19479h();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public final MessageLite.Builder toBuilder() {
                Builder builderM19479h = Builder.m19479h();
                builderM19479h.m19481i(this);
                return builderM19479h;
            }

            public QualifiedName(Builder builder) {
                this.f53660g = (byte) -1;
                this.f53661i = -1;
                this.f53655a = builder.f54106a;
            }

            public QualifiedName(CodedInputStream codedInputStream) {
                Kind kind;
                this.f53660g = (byte) -1;
                this.f53661i = -1;
                this.f53657c = -1;
                boolean z2 = false;
                this.f53658d = 0;
                Kind kind2 = Kind.PACKAGE;
                this.f53659f = kind2;
                ByteString.Output output = new ByteString.Output();
                CodedOutputStream codedOutputStreamM19666j = CodedOutputStream.m19666j(output, 1);
                while (!z2) {
                    try {
                        try {
                            int iM19652n = codedInputStream.m19652n();
                            if (iM19652n != 0) {
                                if (iM19652n == 8) {
                                    this.f53656b |= 1;
                                    this.f53657c = codedInputStream.m19649k();
                                } else if (iM19652n == 16) {
                                    this.f53656b |= 2;
                                    this.f53658d = codedInputStream.m19649k();
                                } else if (iM19652n != 24) {
                                    if (!codedInputStream.m19655q(iM19652n, codedOutputStreamM19666j)) {
                                    }
                                } else {
                                    int iM19649k = codedInputStream.m19649k();
                                    if (iM19649k == 0) {
                                        kind = Kind.CLASS;
                                    } else if (iM19649k != 1) {
                                        kind = iM19649k != 2 ? null : Kind.LOCAL;
                                    } else {
                                        kind = kind2;
                                    }
                                    if (kind == null) {
                                        codedOutputStreamM19666j.m19679v(iM19652n);
                                        codedOutputStreamM19666j.m19679v(iM19649k);
                                    } else {
                                        this.f53656b |= 4;
                                        this.f53659f = kind;
                                    }
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
                    this.f53655a = output.m19638d();
                }
            }
        }

        public QualifiedNameTable(Builder builder) {
            this.f53649c = (byte) -1;
            this.f53650d = -1;
            this.f53647a = builder.f54106a;
        }

        public QualifiedNameTable(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            this.f53649c = (byte) -1;
            this.f53650d = -1;
            this.f53648b = Collections.EMPTY_LIST;
            ByteString.Output output = new ByteString.Output();
            CodedOutputStream codedOutputStreamM19666j = CodedOutputStream.m19666j(output, 1);
            boolean z2 = false;
            boolean z3 = false;
            while (!z2) {
                try {
                    try {
                        int iM19652n = codedInputStream.m19652n();
                        if (iM19652n != 0) {
                            if (iM19652n != 10) {
                                if (!codedInputStream.m19655q(iM19652n, codedOutputStreamM19666j)) {
                                }
                            } else {
                                if (!z3) {
                                    this.f53648b = new ArrayList();
                                    z3 = true;
                                }
                                this.f53648b.add(codedInputStream.m19645g(QualifiedName.f53654n, extensionRegistryLite));
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
                    if (z3) {
                        this.f53648b = Collections.unmodifiableList(this.f53648b);
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
            if (z3) {
                this.f53648b = Collections.unmodifiableList(this.f53648b);
            }
            try {
                codedOutputStreamM19666j.m19667i();
            } catch (IOException unused2) {
            } finally {
                this.f53647a = output.m19638d();
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class Type extends GeneratedMessageLite.ExtendableMessage<Type> implements TypeOrBuilder {

        /* JADX INFO: renamed from: y */
        public static final Type f53679y;

        /* JADX INFO: renamed from: z */
        public static final Parser f53680z = new C61321();

        /* JADX INFO: renamed from: b */
        public final ByteString f53681b;

        /* JADX INFO: renamed from: c */
        public int f53682c;

        /* JADX INFO: renamed from: d */
        public List f53683d;

        /* JADX INFO: renamed from: f */
        public boolean f53684f;

        /* JADX INFO: renamed from: g */
        public int f53685g;

        /* JADX INFO: renamed from: i */
        public Type f53686i;

        /* JADX INFO: renamed from: j */
        public int f53687j;

        /* JADX INFO: renamed from: n */
        public int f53688n;

        /* JADX INFO: renamed from: o */
        public int f53689o;

        /* JADX INFO: renamed from: p */
        public int f53690p;

        /* JADX INFO: renamed from: q */
        public int f53691q;

        /* JADX INFO: renamed from: r */
        public Type f53692r;

        /* JADX INFO: renamed from: s */
        public int f53693s;

        /* JADX INFO: renamed from: t */
        public Type f53694t;

        /* JADX INFO: renamed from: u */
        public int f53695u;

        /* JADX INFO: renamed from: v */
        public int f53696v;

        /* JADX INFO: renamed from: w */
        public byte f53697w;

        /* JADX INFO: renamed from: x */
        public int f53698x;

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type$1 */
        /* JADX INFO: compiled from: Proguard */
        public static class C61321 extends AbstractParser<Type> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            /* JADX INFO: renamed from: a */
            public final Object mo19417a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new Type(codedInputStream, extensionRegistryLite);
            }
        }

        /* JADX INFO: compiled from: Proguard */
        public interface ArgumentOrBuilder extends MessageLiteOrBuilder {
        }

        /* JADX INFO: compiled from: Proguard */
        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<Type, Builder> implements TypeOrBuilder {

            /* JADX INFO: renamed from: d */
            public int f53718d;

            /* JADX INFO: renamed from: f */
            public List f53719f;

            /* JADX INFO: renamed from: g */
            public boolean f53720g;

            /* JADX INFO: renamed from: i */
            public int f53721i;

            /* JADX INFO: renamed from: j */
            public Type f53722j;

            /* JADX INFO: renamed from: n */
            public int f53723n;

            /* JADX INFO: renamed from: o */
            public int f53724o;

            /* JADX INFO: renamed from: p */
            public int f53725p;

            /* JADX INFO: renamed from: q */
            public int f53726q;

            /* JADX INFO: renamed from: r */
            public int f53727r;

            /* JADX INFO: renamed from: s */
            public Type f53728s;

            /* JADX INFO: renamed from: t */
            public int f53729t;

            /* JADX INFO: renamed from: u */
            public Type f53730u;

            /* JADX INFO: renamed from: v */
            public int f53731v;

            /* JADX INFO: renamed from: w */
            public int f53732w;

            /* JADX INFO: renamed from: j */
            public static Builder m19494j() {
                Builder builder = new Builder();
                builder.f53719f = Collections.EMPTY_LIST;
                Type type = Type.f53679y;
                builder.f53722j = type;
                builder.f53728s = type;
                builder.f53730u = type;
                return builder;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: b */
            public final AbstractMessageLite.Builder mo19418b() {
                Builder builderM19494j = m19494j();
                builderM19494j.m19496k(m19495i());
                return builderM19494j;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public final MessageLite build() {
                Type typeM19495i = m19495i();
                if (typeM19495i.isInitialized()) {
                    return typeM19495i;
                }
                throw new UninitializedMessageException();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: c */
            public final /* bridge */ /* synthetic */ AbstractMessageLite.Builder mo19419c(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                m19497l(codedInputStream, extensionRegistryLite);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            public final Object clone() {
                Builder builderM19494j = m19494j();
                builderM19494j.m19496k(m19495i());
                return builderM19494j;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* JADX INFO: renamed from: d */
            public final GeneratedMessageLite.Builder mo19420d() {
                Builder builderM19494j = m19494j();
                builderM19494j.m19496k(m19495i());
                return builderM19494j;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* JADX INFO: renamed from: e */
            public final /* bridge */ /* synthetic */ GeneratedMessageLite.Builder mo19421e(GeneratedMessageLite generatedMessageLite) {
                m19496k((Type) generatedMessageLite);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder
            /* JADX INFO: renamed from: f */
            public final GeneratedMessageLite.ExtendableBuilder mo19437f() {
                Builder builderM19494j = m19494j();
                builderM19494j.m19496k(m19495i());
                return builderM19494j;
            }

            /* JADX INFO: renamed from: i */
            public final Type m19495i() {
                Type type = new Type(this);
                int i = this.f53718d;
                if ((i & 1) == 1) {
                    this.f53719f = Collections.unmodifiableList(this.f53719f);
                    this.f53718d &= -2;
                }
                type.f53683d = this.f53719f;
                int i2 = (i & 2) != 2 ? 0 : 1;
                type.f53684f = this.f53720g;
                if ((i & 4) == 4) {
                    i2 |= 2;
                }
                type.f53685g = this.f53721i;
                if ((i & 8) == 8) {
                    i2 |= 4;
                }
                type.f53686i = this.f53722j;
                if ((i & 16) == 16) {
                    i2 |= 8;
                }
                type.f53687j = this.f53723n;
                if ((i & 32) == 32) {
                    i2 |= 16;
                }
                type.f53688n = this.f53724o;
                if ((i & 64) == 64) {
                    i2 |= 32;
                }
                type.f53689o = this.f53725p;
                if ((i & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) == 128) {
                    i2 |= 64;
                }
                type.f53690p = this.f53726q;
                if ((i & 256) == 256) {
                    i2 |= UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                }
                type.f53691q = this.f53727r;
                if ((i & 512) == 512) {
                    i2 |= 256;
                }
                type.f53692r = this.f53728s;
                if ((i & UserMetadata.MAX_ATTRIBUTE_SIZE) == 1024) {
                    i2 |= 512;
                }
                type.f53693s = this.f53729t;
                if ((i & 2048) == 2048) {
                    i2 |= UserMetadata.MAX_ATTRIBUTE_SIZE;
                }
                type.f53694t = this.f53730u;
                if ((i & 4096) == 4096) {
                    i2 |= 2048;
                }
                type.f53695u = this.f53731v;
                if ((i & UserMetadata.MAX_INTERNAL_KEY_SIZE) == 8192) {
                    i2 |= 4096;
                }
                type.f53696v = this.f53732w;
                type.f53682c = i2;
                return type;
            }

            /* JADX INFO: renamed from: k */
            public final Builder m19496k(Type type) {
                Type type2;
                Type type3;
                Type type4;
                Type type5 = Type.f53679y;
                if (type == type5) {
                    return this;
                }
                if (!type.f53683d.isEmpty()) {
                    if (this.f53719f.isEmpty()) {
                        this.f53719f = type.f53683d;
                        this.f53718d &= -2;
                    } else {
                        if ((this.f53718d & 1) != 1) {
                            this.f53719f = new ArrayList(this.f53719f);
                            this.f53718d |= 1;
                        }
                        this.f53719f.addAll(type.f53683d);
                    }
                }
                int i = type.f53682c;
                if ((i & 1) == 1) {
                    boolean z2 = type.f53684f;
                    this.f53718d |= 2;
                    this.f53720g = z2;
                }
                if ((i & 2) == 2) {
                    int i2 = type.f53685g;
                    this.f53718d |= 4;
                    this.f53721i = i2;
                }
                if ((i & 4) == 4) {
                    Type type6 = type.f53686i;
                    if ((this.f53718d & 8) != 8 || (type4 = this.f53722j) == type5) {
                        this.f53722j = type6;
                    } else {
                        Builder builderM19486p = Type.m19486p(type4);
                        builderM19486p.m19496k(type6);
                        this.f53722j = builderM19486p.m19495i();
                    }
                    this.f53718d |= 8;
                }
                if ((type.f53682c & 8) == 8) {
                    int i3 = type.f53687j;
                    this.f53718d |= 16;
                    this.f53723n = i3;
                }
                if (type.m19487m()) {
                    int i4 = type.f53688n;
                    this.f53718d |= 32;
                    this.f53724o = i4;
                }
                int i5 = type.f53682c;
                if ((i5 & 32) == 32) {
                    int i6 = type.f53689o;
                    this.f53718d |= 64;
                    this.f53725p = i6;
                }
                if ((i5 & 64) == 64) {
                    int i7 = type.f53690p;
                    this.f53718d |= UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                    this.f53726q = i7;
                }
                if ((i5 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) == 128) {
                    int i8 = type.f53691q;
                    this.f53718d |= 256;
                    this.f53727r = i8;
                }
                if ((i5 & 256) == 256) {
                    Type type7 = type.f53692r;
                    if ((this.f53718d & 512) != 512 || (type3 = this.f53728s) == type5) {
                        this.f53728s = type7;
                    } else {
                        Builder builderM19486p2 = Type.m19486p(type3);
                        builderM19486p2.m19496k(type7);
                        this.f53728s = builderM19486p2.m19495i();
                    }
                    this.f53718d |= 512;
                }
                int i9 = type.f53682c;
                if ((i9 & 512) == 512) {
                    int i10 = type.f53693s;
                    this.f53718d |= UserMetadata.MAX_ATTRIBUTE_SIZE;
                    this.f53729t = i10;
                }
                if ((i9 & UserMetadata.MAX_ATTRIBUTE_SIZE) == 1024) {
                    Type type8 = type.f53694t;
                    if ((this.f53718d & 2048) != 2048 || (type2 = this.f53730u) == type5) {
                        this.f53730u = type8;
                    } else {
                        Builder builderM19486p3 = Type.m19486p(type2);
                        builderM19486p3.m19496k(type8);
                        this.f53730u = builderM19486p3.m19495i();
                    }
                    this.f53718d |= 2048;
                }
                int i11 = type.f53682c;
                if ((i11 & 2048) == 2048) {
                    int i12 = type.f53695u;
                    this.f53718d |= 4096;
                    this.f53731v = i12;
                }
                if ((i11 & 4096) == 4096) {
                    int i13 = type.f53696v;
                    this.f53718d |= UserMetadata.MAX_INTERNAL_KEY_SIZE;
                    this.f53732w = i13;
                }
                m19697h(type);
                this.f54106a = this.f54106a.m19625c(type.f53681b);
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:14:0x001d  */
            /* JADX INFO: renamed from: l */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void m19497l(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                Type type = null;
                try {
                    try {
                        ((C61321) Type.f53680z).getClass();
                        m19496k(new Type(codedInputStream, extensionRegistryLite));
                    } catch (InvalidProtocolBufferException e) {
                        Type type2 = (Type) e.f54121a;
                        try {
                            throw e;
                        } catch (Throwable th) {
                            th = th;
                            type = type2;
                            if (type != null) {
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (type != null) {
                        m19496k(type);
                    }
                    throw th;
                }
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* JADX INFO: renamed from: n */
            public final /* bridge */ /* synthetic */ MessageLite.Builder mo19425n(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                m19497l(codedInputStream, extensionRegistryLite);
                return this;
            }
        }

        static {
            Type type = new Type();
            f53679y = type;
            type.m19488o();
        }

        public Type(Builder builder) {
            super(builder);
            this.f53697w = (byte) -1;
            this.f53698x = -1;
            this.f53681b = builder.f54106a;
        }

        /* JADX INFO: renamed from: p */
        public static Builder m19486p(Type type) {
            Builder builderM19494j = Builder.m19494j();
            builderM19494j.m19496k(type);
            return builderM19494j;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        /* JADX INFO: renamed from: a */
        public final void mo19416a(CodedOutputStream codedOutputStream) {
            getSerializedSize();
            GeneratedMessageLite.ExtendableMessage.ExtensionWriter extensionWriter = new GeneratedMessageLite.ExtendableMessage.ExtensionWriter(this);
            if ((this.f53682c & 4096) == 4096) {
                codedOutputStream.m19670m(1, this.f53696v);
            }
            for (int i = 0; i < this.f53683d.size(); i++) {
                codedOutputStream.m19672o(2, (MessageLite) this.f53683d.get(i));
            }
            if ((this.f53682c & 1) == 1) {
                boolean z2 = this.f53684f;
                codedOutputStream.m19681x(3, 0);
                codedOutputStream.m19674q(z2 ? 1 : 0);
            }
            if ((this.f53682c & 2) == 2) {
                codedOutputStream.m19670m(4, this.f53685g);
            }
            if ((this.f53682c & 4) == 4) {
                codedOutputStream.m19672o(5, this.f53686i);
            }
            if ((this.f53682c & 16) == 16) {
                codedOutputStream.m19670m(6, this.f53688n);
            }
            if ((this.f53682c & 32) == 32) {
                codedOutputStream.m19670m(7, this.f53689o);
            }
            if ((this.f53682c & 8) == 8) {
                codedOutputStream.m19670m(8, this.f53687j);
            }
            if ((this.f53682c & 64) == 64) {
                codedOutputStream.m19670m(9, this.f53690p);
            }
            if ((this.f53682c & 256) == 256) {
                codedOutputStream.m19672o(10, this.f53692r);
            }
            if ((this.f53682c & 512) == 512) {
                codedOutputStream.m19670m(11, this.f53693s);
            }
            if ((this.f53682c & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) == 128) {
                codedOutputStream.m19670m(12, this.f53691q);
            }
            if ((this.f53682c & UserMetadata.MAX_ATTRIBUTE_SIZE) == 1024) {
                codedOutputStream.m19672o(13, this.f53694t);
            }
            if ((this.f53682c & 2048) == 2048) {
                codedOutputStream.m19670m(14, this.f53695u);
            }
            extensionWriter.m19707a(200, codedOutputStream);
            codedOutputStream.m19675r(this.f53681b);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final MessageLite getDefaultInstanceForType() {
            return f53679y;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final int getSerializedSize() {
            int i = this.f53698x;
            if (i != -1) {
                return i;
            }
            int iM19659b = (this.f53682c & 4096) == 4096 ? CodedOutputStream.m19659b(1, this.f53696v) : 0;
            for (int i2 = 0; i2 < this.f53683d.size(); i2++) {
                iM19659b += CodedOutputStream.m19661d(2, (MessageLite) this.f53683d.get(i2));
            }
            if ((this.f53682c & 1) == 1) {
                iM19659b += CodedOutputStream.m19665h(3) + 1;
            }
            if ((this.f53682c & 2) == 2) {
                iM19659b += CodedOutputStream.m19659b(4, this.f53685g);
            }
            if ((this.f53682c & 4) == 4) {
                iM19659b += CodedOutputStream.m19661d(5, this.f53686i);
            }
            if ((this.f53682c & 16) == 16) {
                iM19659b += CodedOutputStream.m19659b(6, this.f53688n);
            }
            if ((this.f53682c & 32) == 32) {
                iM19659b += CodedOutputStream.m19659b(7, this.f53689o);
            }
            if ((this.f53682c & 8) == 8) {
                iM19659b += CodedOutputStream.m19659b(8, this.f53687j);
            }
            if ((this.f53682c & 64) == 64) {
                iM19659b += CodedOutputStream.m19659b(9, this.f53690p);
            }
            if ((this.f53682c & 256) == 256) {
                iM19659b += CodedOutputStream.m19661d(10, this.f53692r);
            }
            if ((this.f53682c & 512) == 512) {
                iM19659b += CodedOutputStream.m19659b(11, this.f53693s);
            }
            if ((this.f53682c & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) == 128) {
                iM19659b += CodedOutputStream.m19659b(12, this.f53691q);
            }
            if ((this.f53682c & UserMetadata.MAX_ATTRIBUTE_SIZE) == 1024) {
                iM19659b += CodedOutputStream.m19661d(13, this.f53694t);
            }
            if ((this.f53682c & 2048) == 2048) {
                iM19659b += CodedOutputStream.m19659b(14, this.f53695u);
            }
            int size = this.f53681b.size() + m19699e() + iM19659b;
            this.f53698x = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b2 = this.f53697w;
            if (b2 == 1) {
                return true;
            }
            if (b2 == 0) {
                return false;
            }
            for (int i = 0; i < this.f53683d.size(); i++) {
                if (!((Argument) this.f53683d.get(i)).isInitialized()) {
                    this.f53697w = (byte) 0;
                    return false;
                }
            }
            if ((this.f53682c & 4) == 4 && !this.f53686i.isInitialized()) {
                this.f53697w = (byte) 0;
                return false;
            }
            if ((this.f53682c & 256) == 256 && !this.f53692r.isInitialized()) {
                this.f53697w = (byte) 0;
                return false;
            }
            if ((this.f53682c & UserMetadata.MAX_ATTRIBUTE_SIZE) == 1024 && !this.f53694t.isInitialized()) {
                this.f53697w = (byte) 0;
                return false;
            }
            if (m19698d()) {
                this.f53697w = (byte) 1;
                return true;
            }
            this.f53697w = (byte) 0;
            return false;
        }

        /* JADX INFO: renamed from: m */
        public final boolean m19487m() {
            return (this.f53682c & 16) == 16;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final MessageLite.Builder newBuilderForType() {
            return Builder.m19494j();
        }

        /* JADX INFO: renamed from: o */
        public final void m19488o() {
            this.f53683d = Collections.EMPTY_LIST;
            this.f53684f = false;
            this.f53685g = 0;
            Type type = f53679y;
            this.f53686i = type;
            this.f53687j = 0;
            this.f53688n = 0;
            this.f53689o = 0;
            this.f53690p = 0;
            this.f53691q = 0;
            this.f53692r = type;
            this.f53693s = 0;
            this.f53694t = type;
            this.f53695u = 0;
            this.f53696v = 0;
        }

        /* JADX INFO: renamed from: q */
        public final Builder m19489q() {
            return m19486p(this);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final /* bridge */ /* synthetic */ MessageLite.Builder toBuilder() {
            return m19489q();
        }

        /* JADX INFO: compiled from: Proguard */
        public static final class Argument extends GeneratedMessageLite implements ArgumentOrBuilder {

            /* JADX INFO: renamed from: j */
            public static final Argument f53699j;

            /* JADX INFO: renamed from: n */
            public static final Parser f53700n = new C61331();

            /* JADX INFO: renamed from: a */
            public final ByteString f53701a;

            /* JADX INFO: renamed from: b */
            public int f53702b;

            /* JADX INFO: renamed from: c */
            public Projection f53703c;

            /* JADX INFO: renamed from: d */
            public Type f53704d;

            /* JADX INFO: renamed from: f */
            public int f53705f;

            /* JADX INFO: renamed from: g */
            public byte f53706g;

            /* JADX INFO: renamed from: i */
            public int f53707i;

            /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type$Argument$1 */
            /* JADX INFO: compiled from: Proguard */
            public static class C61331 extends AbstractParser<Argument> {
                @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
                /* JADX INFO: renamed from: a */
                public final Object mo19417a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                    return new Argument(codedInputStream, extensionRegistryLite);
                }
            }

            /* JADX INFO: compiled from: Proguard */
            public static final class Builder extends GeneratedMessageLite.Builder<Argument, Builder> implements ArgumentOrBuilder {

                /* JADX INFO: renamed from: b */
                public int f53708b;

                /* JADX INFO: renamed from: c */
                public Projection f53709c;

                /* JADX INFO: renamed from: d */
                public Type f53710d;

                /* JADX INFO: renamed from: f */
                public int f53711f;

                /* JADX INFO: renamed from: h */
                public static Builder m19490h() {
                    Builder builder = new Builder();
                    builder.f53709c = Projection.INV;
                    builder.f53710d = Type.f53679y;
                    return builder;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
                /* JADX INFO: renamed from: b */
                public final AbstractMessageLite.Builder mo19418b() {
                    Builder builderM19490h = m19490h();
                    builderM19490h.m19492i(m19491f());
                    return builderM19490h;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
                public final MessageLite build() {
                    Argument argumentM19491f = m19491f();
                    if (argumentM19491f.isInitialized()) {
                        return argumentM19491f;
                    }
                    throw new UninitializedMessageException();
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
                /* JADX INFO: renamed from: c */
                public final /* bridge */ /* synthetic */ AbstractMessageLite.Builder mo19419c(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                    m19493j(codedInputStream, extensionRegistryLite);
                    return this;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
                public final Object clone() {
                    Builder builderM19490h = m19490h();
                    builderM19490h.m19492i(m19491f());
                    return builderM19490h;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
                /* JADX INFO: renamed from: d */
                public final GeneratedMessageLite.Builder mo19420d() {
                    Builder builderM19490h = m19490h();
                    builderM19490h.m19492i(m19491f());
                    return builderM19490h;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
                /* JADX INFO: renamed from: e */
                public final /* bridge */ /* synthetic */ GeneratedMessageLite.Builder mo19421e(GeneratedMessageLite generatedMessageLite) {
                    m19492i((Argument) generatedMessageLite);
                    return this;
                }

                /* JADX INFO: renamed from: f */
                public final Argument m19491f() {
                    Argument argument = new Argument(this);
                    int i = this.f53708b;
                    int i2 = (i & 1) != 1 ? 0 : 1;
                    argument.f53703c = this.f53709c;
                    if ((i & 2) == 2) {
                        i2 |= 2;
                    }
                    argument.f53704d = this.f53710d;
                    if ((i & 4) == 4) {
                        i2 |= 4;
                    }
                    argument.f53705f = this.f53711f;
                    argument.f53702b = i2;
                    return argument;
                }

                /* JADX INFO: renamed from: i */
                public final void m19492i(Argument argument) {
                    Type type;
                    if (argument == Argument.f53699j) {
                        return;
                    }
                    if ((argument.f53702b & 1) == 1) {
                        Projection projection = argument.f53703c;
                        projection.getClass();
                        this.f53708b = 1 | this.f53708b;
                        this.f53709c = projection;
                    }
                    if ((argument.f53702b & 2) == 2) {
                        Type type2 = argument.f53704d;
                        if ((this.f53708b & 2) != 2 || (type = this.f53710d) == Type.f53679y) {
                            this.f53710d = type2;
                        } else {
                            Builder builderM19486p = Type.m19486p(type);
                            builderM19486p.m19496k(type2);
                            this.f53710d = builderM19486p.m19495i();
                        }
                        this.f53708b |= 2;
                    }
                    if ((argument.f53702b & 4) == 4) {
                        int i = argument.f53705f;
                        this.f53708b = 4 | this.f53708b;
                        this.f53711f = i;
                    }
                    this.f54106a = this.f54106a.m19625c(argument.f53701a);
                }

                /* JADX WARN: Removed duplicated region for block: B:14:0x001d  */
                /* JADX INFO: renamed from: j */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void m19493j(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                    Argument argument = null;
                    try {
                        try {
                            ((C61331) Argument.f53700n).getClass();
                            m19492i(new Argument(codedInputStream, extensionRegistryLite));
                        } catch (InvalidProtocolBufferException e) {
                            Argument argument2 = (Argument) e.f54121a;
                            try {
                                throw e;
                            } catch (Throwable th) {
                                th = th;
                                argument = argument2;
                                if (argument != null) {
                                }
                                throw th;
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        if (argument != null) {
                            m19492i(argument);
                        }
                        throw th;
                    }
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
                /* JADX INFO: renamed from: n */
                public final /* bridge */ /* synthetic */ MessageLite.Builder mo19425n(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                    m19493j(codedInputStream, extensionRegistryLite);
                    return this;
                }
            }

            /* JADX INFO: compiled from: Proguard */
            public enum Projection implements Internal.EnumLite {
                IN(0),
                OUT(1),
                INV(2),
                STAR(3);


                /* JADX INFO: renamed from: a */
                public final int f53717a;

                /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type$Argument$Projection$1 */
                /* JADX INFO: compiled from: Proguard */
                public static class C61341 implements Internal.EnumLiteMap<Projection> {
                }

                Projection(int i) {
                    this.f53717a = i;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
                public final int getNumber() {
                    return this.f53717a;
                }
            }

            static {
                Argument argument = new Argument();
                f53699j = argument;
                argument.f53703c = Projection.INV;
                argument.f53704d = Type.f53679y;
                argument.f53705f = 0;
            }

            public Argument() {
                this.f53706g = (byte) -1;
                this.f53707i = -1;
                this.f53701a = ByteString.f54075a;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            /* JADX INFO: renamed from: a */
            public final void mo19416a(CodedOutputStream codedOutputStream) {
                getSerializedSize();
                if ((this.f53702b & 1) == 1) {
                    codedOutputStream.m19669l(1, this.f53703c.f53717a);
                }
                if ((this.f53702b & 2) == 2) {
                    codedOutputStream.m19672o(2, this.f53704d);
                }
                if ((this.f53702b & 4) == 4) {
                    codedOutputStream.m19670m(3, this.f53705f);
                }
                codedOutputStream.m19675r(this.f53701a);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public final int getSerializedSize() {
                int i = this.f53707i;
                if (i != -1) {
                    return i;
                }
                int iM19658a = (this.f53702b & 1) == 1 ? CodedOutputStream.m19658a(1, this.f53703c.f53717a) : 0;
                if ((this.f53702b & 2) == 2) {
                    iM19658a += CodedOutputStream.m19661d(2, this.f53704d);
                }
                if ((this.f53702b & 4) == 4) {
                    iM19658a += CodedOutputStream.m19659b(3, this.f53705f);
                }
                int size = this.f53701a.size() + iM19658a;
                this.f53707i = size;
                return size;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                byte b2 = this.f53706g;
                if (b2 == 1) {
                    return true;
                }
                if (b2 == 0) {
                    return false;
                }
                if ((this.f53702b & 2) != 2 || this.f53704d.isInitialized()) {
                    this.f53706g = (byte) 1;
                    return true;
                }
                this.f53706g = (byte) 0;
                return false;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public final MessageLite.Builder newBuilderForType() {
                return Builder.m19490h();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public final MessageLite.Builder toBuilder() {
                Builder builderM19490h = Builder.m19490h();
                builderM19490h.m19492i(this);
                return builderM19490h;
            }

            public Argument(Builder builder) {
                this.f53706g = (byte) -1;
                this.f53707i = -1;
                this.f53701a = builder.f54106a;
            }

            public Argument(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                this.f53706g = (byte) -1;
                this.f53707i = -1;
                Projection projection = Projection.INV;
                this.f53703c = projection;
                this.f53704d = Type.f53679y;
                boolean z2 = false;
                this.f53705f = 0;
                ByteString.Output output = new ByteString.Output();
                CodedOutputStream codedOutputStreamM19666j = CodedOutputStream.m19666j(output, 1);
                while (!z2) {
                    try {
                        try {
                            try {
                                int iM19652n = codedInputStream.m19652n();
                                if (iM19652n != 0) {
                                    Builder builderM19486p = null;
                                    Projection projection2 = null;
                                    if (iM19652n == 8) {
                                        int iM19649k = codedInputStream.m19649k();
                                        if (iM19649k == 0) {
                                            projection2 = Projection.IN;
                                        } else if (iM19649k == 1) {
                                            projection2 = Projection.OUT;
                                        } else if (iM19649k == 2) {
                                            projection2 = projection;
                                        } else if (iM19649k == 3) {
                                            projection2 = Projection.STAR;
                                        }
                                        if (projection2 == null) {
                                            codedOutputStreamM19666j.m19679v(iM19652n);
                                            codedOutputStreamM19666j.m19679v(iM19649k);
                                        } else {
                                            this.f53702b |= 1;
                                            this.f53703c = projection2;
                                        }
                                    } else if (iM19652n == 18) {
                                        if ((this.f53702b & 2) == 2) {
                                            Type type = this.f53704d;
                                            type.getClass();
                                            builderM19486p = Type.m19486p(type);
                                        }
                                        Type type2 = (Type) codedInputStream.m19645g(Type.f53680z, extensionRegistryLite);
                                        this.f53704d = type2;
                                        if (builderM19486p != null) {
                                            builderM19486p.m19496k(type2);
                                            this.f53704d = builderM19486p.m19495i();
                                        }
                                        this.f53702b |= 2;
                                    } else if (iM19652n != 24) {
                                        if (!codedInputStream.m19655q(iM19652n, codedOutputStreamM19666j)) {
                                        }
                                    } else {
                                        this.f53702b |= 4;
                                        this.f53705f = codedInputStream.m19649k();
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
                    this.f53701a = output.m19638d();
                }
            }
        }

        public Type() {
            this.f53697w = (byte) -1;
            this.f53698x = -1;
            this.f53681b = ByteString.f54075a;
        }

        public Type(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            this.f53697w = (byte) -1;
            this.f53698x = -1;
            m19488o();
            ByteString.Output output = new ByteString.Output();
            CodedOutputStream codedOutputStreamM19666j = CodedOutputStream.m19666j(output, 1);
            boolean z2 = false;
            boolean z3 = false;
            while (!z2) {
                try {
                    try {
                        int iM19652n = codedInputStream.m19652n();
                        Parser parser = f53680z;
                        Builder builderM19486p = null;
                        switch (iM19652n) {
                            case 0:
                                break;
                            case 8:
                                this.f53682c |= 4096;
                                this.f53696v = codedInputStream.m19649k();
                                continue;
                            case 18:
                                if (!z3) {
                                    this.f53683d = new ArrayList();
                                    z3 = true;
                                }
                                this.f53683d.add(codedInputStream.m19645g(Argument.f53700n, extensionRegistryLite));
                                continue;
                            case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                                this.f53682c |= 1;
                                this.f53684f = codedInputStream.m19650l() != 0;
                                continue;
                            case 32:
                                this.f53682c |= 2;
                                this.f53685g = codedInputStream.m19649k();
                                continue;
                            case 42:
                                if ((this.f53682c & 4) == 4) {
                                    Type type = this.f53686i;
                                    type.getClass();
                                    builderM19486p = m19486p(type);
                                }
                                Type type2 = (Type) codedInputStream.m19645g(parser, extensionRegistryLite);
                                this.f53686i = type2;
                                if (builderM19486p != null) {
                                    builderM19486p.m19496k(type2);
                                    this.f53686i = builderM19486p.m19495i();
                                }
                                this.f53682c |= 4;
                                continue;
                            case 48:
                                this.f53682c |= 16;
                                this.f53688n = codedInputStream.m19649k();
                                continue;
                            case 56:
                                this.f53682c |= 32;
                                this.f53689o = codedInputStream.m19649k();
                                continue;
                            case UserMetadata.MAX_ATTRIBUTES /* 64 */:
                                this.f53682c |= 8;
                                this.f53687j = codedInputStream.m19649k();
                                continue;
                            case 72:
                                this.f53682c |= 64;
                                this.f53690p = codedInputStream.m19649k();
                                continue;
                            case 82:
                                if ((this.f53682c & 256) == 256) {
                                    Type type3 = this.f53692r;
                                    type3.getClass();
                                    builderM19486p = m19486p(type3);
                                }
                                Type type4 = (Type) codedInputStream.m19645g(parser, extensionRegistryLite);
                                this.f53692r = type4;
                                if (builderM19486p != null) {
                                    builderM19486p.m19496k(type4);
                                    this.f53692r = builderM19486p.m19495i();
                                }
                                this.f53682c |= 256;
                                continue;
                            case 88:
                                this.f53682c |= 512;
                                this.f53693s = codedInputStream.m19649k();
                                continue;
                            case 96:
                                this.f53682c |= UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                                this.f53691q = codedInputStream.m19649k();
                                continue;
                            case 106:
                                if ((this.f53682c & UserMetadata.MAX_ATTRIBUTE_SIZE) == 1024) {
                                    Type type5 = this.f53694t;
                                    type5.getClass();
                                    builderM19486p = m19486p(type5);
                                }
                                Type type6 = (Type) codedInputStream.m19645g(parser, extensionRegistryLite);
                                this.f53694t = type6;
                                if (builderM19486p != null) {
                                    builderM19486p.m19496k(type6);
                                    this.f53694t = builderM19486p.m19495i();
                                }
                                this.f53682c |= UserMetadata.MAX_ATTRIBUTE_SIZE;
                                continue;
                            case 112:
                                this.f53682c |= 2048;
                                this.f53695u = codedInputStream.m19649k();
                                continue;
                            default:
                                if (!m19705k(codedInputStream, codedOutputStreamM19666j, extensionRegistryLite, iM19652n)) {
                                }
                                break;
                        }
                        z2 = true;
                    } catch (Throwable th) {
                        if (z3) {
                            this.f53683d = Collections.unmodifiableList(this.f53683d);
                        }
                        try {
                            codedOutputStreamM19666j.m19667i();
                        } catch (IOException unused) {
                        } catch (Throwable th2) {
                            this.f53681b = output.m19638d();
                            throw th2;
                        }
                        this.f53681b = output.m19638d();
                        m19704j();
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
            if (z3) {
                this.f53683d = Collections.unmodifiableList(this.f53683d);
            }
            try {
                codedOutputStreamM19666j.m19667i();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.f53681b = output.m19638d();
                throw th3;
            }
            this.f53681b = output.m19638d();
            m19704j();
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class Contract extends GeneratedMessageLite implements ContractOrBuilder {

        /* JADX INFO: renamed from: f */
        public static final Contract f53469f;

        /* JADX INFO: renamed from: g */
        public static final Parser f53470g = new C61151();

        /* JADX INFO: renamed from: a */
        public final ByteString f53471a;

        /* JADX INFO: renamed from: b */
        public List f53472b;

        /* JADX INFO: renamed from: c */
        public byte f53473c;

        /* JADX INFO: renamed from: d */
        public int f53474d;

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Contract$1 */
        /* JADX INFO: compiled from: Proguard */
        public static class C61151 extends AbstractParser<Contract> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            /* JADX INFO: renamed from: a */
            public final Object mo19417a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new Contract(codedInputStream, extensionRegistryLite);
            }
        }

        /* JADX INFO: compiled from: Proguard */
        public static final class Builder extends GeneratedMessageLite.Builder<Contract, Builder> implements ContractOrBuilder {

            /* JADX INFO: renamed from: b */
            public int f53475b;

            /* JADX INFO: renamed from: c */
            public List f53476c;

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: b */
            public final AbstractMessageLite.Builder mo19418b() {
                Builder builder = new Builder();
                builder.f53476c = Collections.EMPTY_LIST;
                builder.m19446h(m19445f());
                return builder;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public final MessageLite build() {
                Contract contractM19445f = m19445f();
                if (contractM19445f.isInitialized()) {
                    return contractM19445f;
                }
                throw new UninitializedMessageException();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: c */
            public final /* bridge */ /* synthetic */ AbstractMessageLite.Builder mo19419c(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                m19447i(codedInputStream, extensionRegistryLite);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            public final Object clone() {
                Builder builder = new Builder();
                builder.f53476c = Collections.EMPTY_LIST;
                builder.m19446h(m19445f());
                return builder;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* JADX INFO: renamed from: d */
            public final GeneratedMessageLite.Builder mo19420d() {
                Builder builder = new Builder();
                builder.f53476c = Collections.EMPTY_LIST;
                builder.m19446h(m19445f());
                return builder;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* JADX INFO: renamed from: e */
            public final /* bridge */ /* synthetic */ GeneratedMessageLite.Builder mo19421e(GeneratedMessageLite generatedMessageLite) {
                m19446h((Contract) generatedMessageLite);
                return this;
            }

            /* JADX INFO: renamed from: f */
            public final Contract m19445f() {
                Contract contract = new Contract(this);
                if ((this.f53475b & 1) == 1) {
                    this.f53476c = Collections.unmodifiableList(this.f53476c);
                    this.f53475b &= -2;
                }
                contract.f53472b = this.f53476c;
                return contract;
            }

            /* JADX INFO: renamed from: h */
            public final void m19446h(Contract contract) {
                if (contract == Contract.f53469f) {
                    return;
                }
                if (!contract.f53472b.isEmpty()) {
                    if (this.f53476c.isEmpty()) {
                        this.f53476c = contract.f53472b;
                        this.f53475b &= -2;
                    } else {
                        if ((this.f53475b & 1) != 1) {
                            this.f53476c = new ArrayList(this.f53476c);
                            this.f53475b |= 1;
                        }
                        this.f53476c.addAll(contract.f53472b);
                    }
                }
                this.f54106a = this.f54106a.m19625c(contract.f53471a);
            }

            /* JADX WARN: Removed duplicated region for block: B:14:0x001d  */
            /* JADX INFO: renamed from: i */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void m19447i(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                Contract contract = null;
                try {
                    try {
                        ((C61151) Contract.f53470g).getClass();
                        m19446h(new Contract(codedInputStream, extensionRegistryLite));
                    } catch (InvalidProtocolBufferException e) {
                        Contract contract2 = (Contract) e.f54121a;
                        try {
                            throw e;
                        } catch (Throwable th) {
                            th = th;
                            contract = contract2;
                            if (contract != null) {
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (contract != null) {
                        m19446h(contract);
                    }
                    throw th;
                }
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* JADX INFO: renamed from: n */
            public final /* bridge */ /* synthetic */ MessageLite.Builder mo19425n(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                m19447i(codedInputStream, extensionRegistryLite);
                return this;
            }
        }

        static {
            Contract contract = new Contract();
            f53469f = contract;
            contract.f53472b = Collections.EMPTY_LIST;
        }

        public Contract() {
            this.f53473c = (byte) -1;
            this.f53474d = -1;
            this.f53471a = ByteString.f54075a;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        /* JADX INFO: renamed from: a */
        public final void mo19416a(CodedOutputStream codedOutputStream) {
            getSerializedSize();
            for (int i = 0; i < this.f53472b.size(); i++) {
                codedOutputStream.m19672o(1, (MessageLite) this.f53472b.get(i));
            }
            codedOutputStream.m19675r(this.f53471a);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final int getSerializedSize() {
            int i = this.f53474d;
            if (i != -1) {
                return i;
            }
            int iM19661d = 0;
            for (int i2 = 0; i2 < this.f53472b.size(); i2++) {
                iM19661d += CodedOutputStream.m19661d(1, (MessageLite) this.f53472b.get(i2));
            }
            int size = this.f53471a.size() + iM19661d;
            this.f53474d = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b2 = this.f53473c;
            if (b2 == 1) {
                return true;
            }
            if (b2 == 0) {
                return false;
            }
            for (int i = 0; i < this.f53472b.size(); i++) {
                if (!((Effect) this.f53472b.get(i)).isInitialized()) {
                    this.f53473c = (byte) 0;
                    return false;
                }
            }
            this.f53473c = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final MessageLite.Builder newBuilderForType() {
            Builder builder = new Builder();
            builder.f53476c = Collections.EMPTY_LIST;
            return builder;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final MessageLite.Builder toBuilder() {
            Builder builder = new Builder();
            builder.f53476c = Collections.EMPTY_LIST;
            builder.m19446h(this);
            return builder;
        }

        public Contract(Builder builder) {
            this.f53473c = (byte) -1;
            this.f53474d = -1;
            this.f53471a = builder.f54106a;
        }

        public Contract(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            this.f53473c = (byte) -1;
            this.f53474d = -1;
            this.f53472b = Collections.EMPTY_LIST;
            ByteString.Output output = new ByteString.Output();
            CodedOutputStream codedOutputStreamM19666j = CodedOutputStream.m19666j(output, 1);
            boolean z2 = false;
            boolean z3 = false;
            while (!z2) {
                try {
                    try {
                        int iM19652n = codedInputStream.m19652n();
                        if (iM19652n != 0) {
                            if (iM19652n != 10) {
                                if (!codedInputStream.m19655q(iM19652n, codedOutputStreamM19666j)) {
                                }
                            } else {
                                if (!z3) {
                                    this.f53472b = new ArrayList();
                                    z3 = true;
                                }
                                this.f53472b.add(codedInputStream.m19645g(Effect.f53478o, extensionRegistryLite));
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
                    if (z3) {
                        this.f53472b = Collections.unmodifiableList(this.f53472b);
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
            if (z3) {
                this.f53472b = Collections.unmodifiableList(this.f53472b);
            }
            try {
                codedOutputStreamM19666j.m19667i();
            } catch (IOException unused2) {
            } finally {
                this.f53471a = output.m19638d();
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class Effect extends GeneratedMessageLite implements EffectOrBuilder {

        /* JADX INFO: renamed from: n */
        public static final Effect f53477n;

        /* JADX INFO: renamed from: o */
        public static final Parser f53478o = new C61161();

        /* JADX INFO: renamed from: a */
        public final ByteString f53479a;

        /* JADX INFO: renamed from: b */
        public int f53480b;

        /* JADX INFO: renamed from: c */
        public EffectType f53481c;

        /* JADX INFO: renamed from: d */
        public List f53482d;

        /* JADX INFO: renamed from: f */
        public Expression f53483f;

        /* JADX INFO: renamed from: g */
        public InvocationKind f53484g;

        /* JADX INFO: renamed from: i */
        public byte f53485i;

        /* JADX INFO: renamed from: j */
        public int f53486j;

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Effect$1 */
        /* JADX INFO: compiled from: Proguard */
        public static class C61161 extends AbstractParser<Effect> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            /* JADX INFO: renamed from: a */
            public final Object mo19417a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new Effect(codedInputStream, extensionRegistryLite);
            }
        }

        /* JADX INFO: compiled from: Proguard */
        public static final class Builder extends GeneratedMessageLite.Builder<Effect, Builder> implements EffectOrBuilder {

            /* JADX INFO: renamed from: b */
            public int f53487b;

            /* JADX INFO: renamed from: c */
            public EffectType f53488c;

            /* JADX INFO: renamed from: d */
            public List f53489d;

            /* JADX INFO: renamed from: f */
            public Expression f53490f;

            /* JADX INFO: renamed from: g */
            public InvocationKind f53491g;

            /* JADX INFO: renamed from: h */
            public static Builder m19448h() {
                Builder builder = new Builder();
                builder.f53488c = EffectType.RETURNS_CONSTANT;
                builder.f53489d = Collections.EMPTY_LIST;
                builder.f53490f = Expression.f53511q;
                builder.f53491g = InvocationKind.AT_MOST_ONCE;
                return builder;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: b */
            public final AbstractMessageLite.Builder mo19418b() {
                Builder builderM19448h = m19448h();
                builderM19448h.m19450i(m19449f());
                return builderM19448h;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public final MessageLite build() {
                Effect effectM19449f = m19449f();
                if (effectM19449f.isInitialized()) {
                    return effectM19449f;
                }
                throw new UninitializedMessageException();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: c */
            public final /* bridge */ /* synthetic */ AbstractMessageLite.Builder mo19419c(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                m19451j(codedInputStream, extensionRegistryLite);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            public final Object clone() {
                Builder builderM19448h = m19448h();
                builderM19448h.m19450i(m19449f());
                return builderM19448h;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* JADX INFO: renamed from: d */
            public final GeneratedMessageLite.Builder mo19420d() {
                Builder builderM19448h = m19448h();
                builderM19448h.m19450i(m19449f());
                return builderM19448h;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* JADX INFO: renamed from: e */
            public final /* bridge */ /* synthetic */ GeneratedMessageLite.Builder mo19421e(GeneratedMessageLite generatedMessageLite) {
                m19450i((Effect) generatedMessageLite);
                return this;
            }

            /* JADX INFO: renamed from: f */
            public final Effect m19449f() {
                Effect effect = new Effect(this);
                int i = this.f53487b;
                int i2 = (i & 1) != 1 ? 0 : 1;
                effect.f53481c = this.f53488c;
                if ((i & 2) == 2) {
                    this.f53489d = Collections.unmodifiableList(this.f53489d);
                    this.f53487b &= -3;
                }
                effect.f53482d = this.f53489d;
                if ((i & 4) == 4) {
                    i2 |= 2;
                }
                effect.f53483f = this.f53490f;
                if ((i & 8) == 8) {
                    i2 |= 4;
                }
                effect.f53484g = this.f53491g;
                effect.f53480b = i2;
                return effect;
            }

            /* JADX INFO: renamed from: i */
            public final void m19450i(Effect effect) {
                Expression expression;
                if (effect == Effect.f53477n) {
                    return;
                }
                if ((effect.f53480b & 1) == 1) {
                    EffectType effectType = effect.f53481c;
                    effectType.getClass();
                    this.f53487b |= 1;
                    this.f53488c = effectType;
                }
                if (!effect.f53482d.isEmpty()) {
                    if (this.f53489d.isEmpty()) {
                        this.f53489d = effect.f53482d;
                        this.f53487b &= -3;
                    } else {
                        if ((this.f53487b & 2) != 2) {
                            this.f53489d = new ArrayList(this.f53489d);
                            this.f53487b |= 2;
                        }
                        this.f53489d.addAll(effect.f53482d);
                    }
                }
                if ((effect.f53480b & 2) == 2) {
                    Expression expression2 = effect.f53483f;
                    if ((this.f53487b & 4) != 4 || (expression = this.f53490f) == Expression.f53511q) {
                        this.f53490f = expression2;
                    } else {
                        Expression.Builder builderM19454h = Expression.Builder.m19454h();
                        builderM19454h.m19456i(expression);
                        builderM19454h.m19456i(expression2);
                        this.f53490f = builderM19454h.m19455f();
                    }
                    this.f53487b |= 4;
                }
                if ((effect.f53480b & 4) == 4) {
                    InvocationKind invocationKind = effect.f53484g;
                    invocationKind.getClass();
                    this.f53487b |= 8;
                    this.f53491g = invocationKind;
                }
                this.f54106a = this.f54106a.m19625c(effect.f53479a);
            }

            /* JADX WARN: Removed duplicated region for block: B:14:0x001d  */
            /* JADX INFO: renamed from: j */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void m19451j(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                Effect effect = null;
                try {
                    try {
                        ((C61161) Effect.f53478o).getClass();
                        m19450i(new Effect(codedInputStream, extensionRegistryLite));
                    } catch (InvalidProtocolBufferException e) {
                        Effect effect2 = (Effect) e.f54121a;
                        try {
                            throw e;
                        } catch (Throwable th) {
                            th = th;
                            effect = effect2;
                            if (effect != null) {
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (effect != null) {
                        m19450i(effect);
                    }
                    throw th;
                }
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* JADX INFO: renamed from: n */
            public final /* bridge */ /* synthetic */ MessageLite.Builder mo19425n(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                m19451j(codedInputStream, extensionRegistryLite);
                return this;
            }
        }

        /* JADX INFO: compiled from: Proguard */
        public enum EffectType implements Internal.EnumLite {
            RETURNS_CONSTANT(0),
            CALLS(1),
            RETURNS_NOT_NULL(2);


            /* JADX INFO: renamed from: a */
            public final int f53496a;

            /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Effect$EffectType$1 */
            /* JADX INFO: compiled from: Proguard */
            public static class C61171 implements Internal.EnumLiteMap<EffectType> {
            }

            EffectType(int i) {
                this.f53496a = i;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
            public final int getNumber() {
                return this.f53496a;
            }
        }

        /* JADX INFO: compiled from: Proguard */
        public enum InvocationKind implements Internal.EnumLite {
            AT_MOST_ONCE(0),
            EXACTLY_ONCE(1),
            AT_LEAST_ONCE(2);


            /* JADX INFO: renamed from: a */
            public final int f53501a;

            /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Effect$InvocationKind$1 */
            /* JADX INFO: compiled from: Proguard */
            public static class C61181 implements Internal.EnumLiteMap<InvocationKind> {
            }

            InvocationKind(int i) {
                this.f53501a = i;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
            public final int getNumber() {
                return this.f53501a;
            }
        }

        static {
            Effect effect = new Effect();
            f53477n = effect;
            effect.f53481c = EffectType.RETURNS_CONSTANT;
            effect.f53482d = Collections.EMPTY_LIST;
            effect.f53483f = Expression.f53511q;
            effect.f53484g = InvocationKind.AT_MOST_ONCE;
        }

        public Effect() {
            this.f53485i = (byte) -1;
            this.f53486j = -1;
            this.f53479a = ByteString.f54075a;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        /* JADX INFO: renamed from: a */
        public final void mo19416a(CodedOutputStream codedOutputStream) {
            getSerializedSize();
            if ((this.f53480b & 1) == 1) {
                codedOutputStream.m19669l(1, this.f53481c.f53496a);
            }
            for (int i = 0; i < this.f53482d.size(); i++) {
                codedOutputStream.m19672o(2, (MessageLite) this.f53482d.get(i));
            }
            if ((this.f53480b & 2) == 2) {
                codedOutputStream.m19672o(3, this.f53483f);
            }
            if ((this.f53480b & 4) == 4) {
                codedOutputStream.m19669l(4, this.f53484g.f53501a);
            }
            codedOutputStream.m19675r(this.f53479a);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final int getSerializedSize() {
            int i = this.f53486j;
            if (i != -1) {
                return i;
            }
            int iM19658a = (this.f53480b & 1) == 1 ? CodedOutputStream.m19658a(1, this.f53481c.f53496a) : 0;
            for (int i2 = 0; i2 < this.f53482d.size(); i2++) {
                iM19658a += CodedOutputStream.m19661d(2, (MessageLite) this.f53482d.get(i2));
            }
            if ((this.f53480b & 2) == 2) {
                iM19658a += CodedOutputStream.m19661d(3, this.f53483f);
            }
            if ((this.f53480b & 4) == 4) {
                iM19658a += CodedOutputStream.m19658a(4, this.f53484g.f53501a);
            }
            int size = this.f53479a.size() + iM19658a;
            this.f53486j = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b2 = this.f53485i;
            if (b2 == 1) {
                return true;
            }
            if (b2 == 0) {
                return false;
            }
            for (int i = 0; i < this.f53482d.size(); i++) {
                if (!((Expression) this.f53482d.get(i)).isInitialized()) {
                    this.f53485i = (byte) 0;
                    return false;
                }
            }
            if ((this.f53480b & 2) != 2 || this.f53483f.isInitialized()) {
                this.f53485i = (byte) 1;
                return true;
            }
            this.f53485i = (byte) 0;
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final MessageLite.Builder newBuilderForType() {
            return Builder.m19448h();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final MessageLite.Builder toBuilder() {
            Builder builderM19448h = Builder.m19448h();
            builderM19448h.m19450i(this);
            return builderM19448h;
        }

        public Effect(Builder builder) {
            this.f53485i = (byte) -1;
            this.f53486j = -1;
            this.f53479a = builder.f54106a;
        }

        public Effect(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            this.f53485i = (byte) -1;
            this.f53486j = -1;
            EffectType effectType = EffectType.RETURNS_CONSTANT;
            this.f53481c = effectType;
            this.f53482d = Collections.EMPTY_LIST;
            this.f53483f = Expression.f53511q;
            InvocationKind invocationKind = InvocationKind.AT_MOST_ONCE;
            this.f53484g = invocationKind;
            ByteString.Output output = new ByteString.Output();
            CodedOutputStream codedOutputStreamM19666j = CodedOutputStream.m19666j(output, 1);
            boolean z2 = false;
            char c2 = 0;
            while (!z2) {
                try {
                    try {
                        int iM19652n = codedInputStream.m19652n();
                        if (iM19652n != 0) {
                            InvocationKind invocationKind2 = null;
                            EffectType effectType2 = null;
                            Expression.Builder builderM19454h = null;
                            if (iM19652n == 8) {
                                int iM19649k = codedInputStream.m19649k();
                                if (iM19649k == 0) {
                                    effectType2 = effectType;
                                } else if (iM19649k == 1) {
                                    effectType2 = EffectType.CALLS;
                                } else if (iM19649k == 2) {
                                    effectType2 = EffectType.RETURNS_NOT_NULL;
                                }
                                if (effectType2 == null) {
                                    codedOutputStreamM19666j.m19679v(iM19652n);
                                    codedOutputStreamM19666j.m19679v(iM19649k);
                                } else {
                                    this.f53480b |= 1;
                                    this.f53481c = effectType2;
                                }
                            } else if (iM19652n == 18) {
                                int i = (c2 == true ? 1 : 0) & 2;
                                c2 = c2;
                                if (i != 2) {
                                    this.f53482d = new ArrayList();
                                    c2 = 2;
                                }
                                this.f53482d.add(codedInputStream.m19645g(Expression.f53512r, extensionRegistryLite));
                            } else if (iM19652n == 26) {
                                if ((this.f53480b & 2) == 2) {
                                    Expression expression = this.f53483f;
                                    expression.getClass();
                                    builderM19454h = Expression.Builder.m19454h();
                                    builderM19454h.m19456i(expression);
                                }
                                Expression expression2 = (Expression) codedInputStream.m19645g(Expression.f53512r, extensionRegistryLite);
                                this.f53483f = expression2;
                                if (builderM19454h != null) {
                                    builderM19454h.m19456i(expression2);
                                    this.f53483f = builderM19454h.m19455f();
                                }
                                this.f53480b |= 2;
                            } else if (iM19652n != 32) {
                                if (!codedInputStream.m19655q(iM19652n, codedOutputStreamM19666j)) {
                                }
                            } else {
                                int iM19649k2 = codedInputStream.m19649k();
                                if (iM19649k2 == 0) {
                                    invocationKind2 = invocationKind;
                                } else if (iM19649k2 == 1) {
                                    invocationKind2 = InvocationKind.EXACTLY_ONCE;
                                } else if (iM19649k2 == 2) {
                                    invocationKind2 = InvocationKind.AT_LEAST_ONCE;
                                }
                                if (invocationKind2 == null) {
                                    codedOutputStreamM19666j.m19679v(iM19652n);
                                    codedOutputStreamM19666j.m19679v(iM19649k2);
                                } else {
                                    this.f53480b |= 4;
                                    this.f53484g = invocationKind2;
                                }
                            }
                        }
                        z2 = true;
                    } catch (Throwable th) {
                        if (((c2 == true ? 1 : 0) & 2) == 2) {
                            this.f53482d = Collections.unmodifiableList(this.f53482d);
                        }
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
            if (((c2 == true ? 1 : 0) & 2) == 2) {
                this.f53482d = Collections.unmodifiableList(this.f53482d);
            }
            try {
                codedOutputStreamM19666j.m19667i();
            } catch (IOException unused2) {
            } finally {
                this.f53479a = output.m19638d();
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class Expression extends GeneratedMessageLite implements ExpressionOrBuilder {

        /* JADX INFO: renamed from: q */
        public static final Expression f53511q;

        /* JADX INFO: renamed from: r */
        public static final Parser f53512r = new C61201();

        /* JADX INFO: renamed from: a */
        public final ByteString f53513a;

        /* JADX INFO: renamed from: b */
        public int f53514b;

        /* JADX INFO: renamed from: c */
        public int f53515c;

        /* JADX INFO: renamed from: d */
        public int f53516d;

        /* JADX INFO: renamed from: f */
        public ConstantValue f53517f;

        /* JADX INFO: renamed from: g */
        public Type f53518g;

        /* JADX INFO: renamed from: i */
        public int f53519i;

        /* JADX INFO: renamed from: j */
        public List f53520j;

        /* JADX INFO: renamed from: n */
        public List f53521n;

        /* JADX INFO: renamed from: o */
        public byte f53522o;

        /* JADX INFO: renamed from: p */
        public int f53523p;

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Expression$1 */
        /* JADX INFO: compiled from: Proguard */
        public static class C61201 extends AbstractParser<Expression> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            /* JADX INFO: renamed from: a */
            public final Object mo19417a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new Expression(codedInputStream, extensionRegistryLite);
            }
        }

        /* JADX INFO: compiled from: Proguard */
        public static final class Builder extends GeneratedMessageLite.Builder<Expression, Builder> implements ExpressionOrBuilder {

            /* JADX INFO: renamed from: b */
            public int f53524b;

            /* JADX INFO: renamed from: c */
            public int f53525c;

            /* JADX INFO: renamed from: d */
            public int f53526d;

            /* JADX INFO: renamed from: f */
            public ConstantValue f53527f;

            /* JADX INFO: renamed from: g */
            public Type f53528g;

            /* JADX INFO: renamed from: i */
            public int f53529i;

            /* JADX INFO: renamed from: j */
            public List f53530j;

            /* JADX INFO: renamed from: n */
            public List f53531n;

            /* JADX INFO: renamed from: h */
            public static Builder m19454h() {
                Builder builder = new Builder();
                builder.f53527f = ConstantValue.TRUE;
                builder.f53528g = Type.f53679y;
                List list = Collections.EMPTY_LIST;
                builder.f53530j = list;
                builder.f53531n = list;
                return builder;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: b */
            public final AbstractMessageLite.Builder mo19418b() {
                Builder builderM19454h = m19454h();
                builderM19454h.m19456i(m19455f());
                return builderM19454h;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public final MessageLite build() {
                Expression expressionM19455f = m19455f();
                if (expressionM19455f.isInitialized()) {
                    return expressionM19455f;
                }
                throw new UninitializedMessageException();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: c */
            public final /* bridge */ /* synthetic */ AbstractMessageLite.Builder mo19419c(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                m19457j(codedInputStream, extensionRegistryLite);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            public final Object clone() {
                Builder builderM19454h = m19454h();
                builderM19454h.m19456i(m19455f());
                return builderM19454h;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* JADX INFO: renamed from: d */
            public final GeneratedMessageLite.Builder mo19420d() {
                Builder builderM19454h = m19454h();
                builderM19454h.m19456i(m19455f());
                return builderM19454h;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* JADX INFO: renamed from: e */
            public final /* bridge */ /* synthetic */ GeneratedMessageLite.Builder mo19421e(GeneratedMessageLite generatedMessageLite) {
                m19456i((Expression) generatedMessageLite);
                return this;
            }

            /* JADX INFO: renamed from: f */
            public final Expression m19455f() {
                Expression expression = new Expression(this);
                int i = this.f53524b;
                int i2 = (i & 1) != 1 ? 0 : 1;
                expression.f53515c = this.f53525c;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                expression.f53516d = this.f53526d;
                if ((i & 4) == 4) {
                    i2 |= 4;
                }
                expression.f53517f = this.f53527f;
                if ((i & 8) == 8) {
                    i2 |= 8;
                }
                expression.f53518g = this.f53528g;
                if ((i & 16) == 16) {
                    i2 |= 16;
                }
                expression.f53519i = this.f53529i;
                if ((i & 32) == 32) {
                    this.f53530j = Collections.unmodifiableList(this.f53530j);
                    this.f53524b &= -33;
                }
                expression.f53520j = this.f53530j;
                if ((this.f53524b & 64) == 64) {
                    this.f53531n = Collections.unmodifiableList(this.f53531n);
                    this.f53524b &= -65;
                }
                expression.f53521n = this.f53531n;
                expression.f53514b = i2;
                return expression;
            }

            /* JADX INFO: renamed from: i */
            public final void m19456i(Expression expression) {
                Type type;
                if (expression == Expression.f53511q) {
                    return;
                }
                int i = expression.f53514b;
                if ((i & 1) == 1) {
                    int i2 = expression.f53515c;
                    this.f53524b = 1 | this.f53524b;
                    this.f53525c = i2;
                }
                if ((i & 2) == 2) {
                    int i3 = expression.f53516d;
                    this.f53524b = 2 | this.f53524b;
                    this.f53526d = i3;
                }
                if ((i & 4) == 4) {
                    ConstantValue constantValue = expression.f53517f;
                    constantValue.getClass();
                    this.f53524b = 4 | this.f53524b;
                    this.f53527f = constantValue;
                }
                if ((expression.f53514b & 8) == 8) {
                    Type type2 = expression.f53518g;
                    if ((this.f53524b & 8) != 8 || (type = this.f53528g) == Type.f53679y) {
                        this.f53528g = type2;
                    } else {
                        Type.Builder builderM19486p = Type.m19486p(type);
                        builderM19486p.m19496k(type2);
                        this.f53528g = builderM19486p.m19495i();
                    }
                    this.f53524b |= 8;
                }
                if ((expression.f53514b & 16) == 16) {
                    int i4 = expression.f53519i;
                    this.f53524b = 16 | this.f53524b;
                    this.f53529i = i4;
                }
                if (!expression.f53520j.isEmpty()) {
                    if (this.f53530j.isEmpty()) {
                        this.f53530j = expression.f53520j;
                        this.f53524b &= -33;
                    } else {
                        if ((this.f53524b & 32) != 32) {
                            this.f53530j = new ArrayList(this.f53530j);
                            this.f53524b |= 32;
                        }
                        this.f53530j.addAll(expression.f53520j);
                    }
                }
                if (!expression.f53521n.isEmpty()) {
                    if (this.f53531n.isEmpty()) {
                        this.f53531n = expression.f53521n;
                        this.f53524b &= -65;
                    } else {
                        if ((this.f53524b & 64) != 64) {
                            this.f53531n = new ArrayList(this.f53531n);
                            this.f53524b |= 64;
                        }
                        this.f53531n.addAll(expression.f53521n);
                    }
                }
                this.f54106a = this.f54106a.m19625c(expression.f53513a);
            }

            /* JADX WARN: Removed duplicated region for block: B:14:0x001d  */
            /* JADX INFO: renamed from: j */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void m19457j(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                Expression expression = null;
                try {
                    try {
                        ((C61201) Expression.f53512r).getClass();
                        m19456i(new Expression(codedInputStream, extensionRegistryLite));
                    } catch (InvalidProtocolBufferException e) {
                        Expression expression2 = (Expression) e.f54121a;
                        try {
                            throw e;
                        } catch (Throwable th) {
                            th = th;
                            expression = expression2;
                            if (expression != null) {
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (expression != null) {
                        m19456i(expression);
                    }
                    throw th;
                }
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* JADX INFO: renamed from: n */
            public final /* bridge */ /* synthetic */ MessageLite.Builder mo19425n(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                m19457j(codedInputStream, extensionRegistryLite);
                return this;
            }
        }

        /* JADX INFO: compiled from: Proguard */
        public enum ConstantValue implements Internal.EnumLite {
            TRUE(0),
            FALSE(1),
            NULL(2);


            /* JADX INFO: renamed from: a */
            public final int f53536a;

            /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Expression$ConstantValue$1 */
            /* JADX INFO: compiled from: Proguard */
            public static class C61211 implements Internal.EnumLiteMap<ConstantValue> {
            }

            ConstantValue(int i) {
                this.f53536a = i;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
            public final int getNumber() {
                return this.f53536a;
            }
        }

        static {
            Expression expression = new Expression();
            f53511q = expression;
            expression.f53515c = 0;
            expression.f53516d = 0;
            expression.f53517f = ConstantValue.TRUE;
            expression.f53518g = Type.f53679y;
            expression.f53519i = 0;
            List list = Collections.EMPTY_LIST;
            expression.f53520j = list;
            expression.f53521n = list;
        }

        public Expression() {
            this.f53522o = (byte) -1;
            this.f53523p = -1;
            this.f53513a = ByteString.f54075a;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        /* JADX INFO: renamed from: a */
        public final void mo19416a(CodedOutputStream codedOutputStream) {
            getSerializedSize();
            if ((this.f53514b & 1) == 1) {
                codedOutputStream.m19670m(1, this.f53515c);
            }
            if ((this.f53514b & 2) == 2) {
                codedOutputStream.m19670m(2, this.f53516d);
            }
            if ((this.f53514b & 4) == 4) {
                codedOutputStream.m19669l(3, this.f53517f.f53536a);
            }
            if ((this.f53514b & 8) == 8) {
                codedOutputStream.m19672o(4, this.f53518g);
            }
            if ((this.f53514b & 16) == 16) {
                codedOutputStream.m19670m(5, this.f53519i);
            }
            for (int i = 0; i < this.f53520j.size(); i++) {
                codedOutputStream.m19672o(6, (MessageLite) this.f53520j.get(i));
            }
            for (int i2 = 0; i2 < this.f53521n.size(); i2++) {
                codedOutputStream.m19672o(7, (MessageLite) this.f53521n.get(i2));
            }
            codedOutputStream.m19675r(this.f53513a);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final int getSerializedSize() {
            int i = this.f53523p;
            if (i != -1) {
                return i;
            }
            int iM19659b = (this.f53514b & 1) == 1 ? CodedOutputStream.m19659b(1, this.f53515c) : 0;
            if ((this.f53514b & 2) == 2) {
                iM19659b += CodedOutputStream.m19659b(2, this.f53516d);
            }
            if ((this.f53514b & 4) == 4) {
                iM19659b += CodedOutputStream.m19658a(3, this.f53517f.f53536a);
            }
            if ((this.f53514b & 8) == 8) {
                iM19659b += CodedOutputStream.m19661d(4, this.f53518g);
            }
            if ((this.f53514b & 16) == 16) {
                iM19659b += CodedOutputStream.m19659b(5, this.f53519i);
            }
            for (int i2 = 0; i2 < this.f53520j.size(); i2++) {
                iM19659b += CodedOutputStream.m19661d(6, (MessageLite) this.f53520j.get(i2));
            }
            for (int i3 = 0; i3 < this.f53521n.size(); i3++) {
                iM19659b += CodedOutputStream.m19661d(7, (MessageLite) this.f53521n.get(i3));
            }
            int size = this.f53513a.size() + iM19659b;
            this.f53523p = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b2 = this.f53522o;
            if (b2 == 1) {
                return true;
            }
            if (b2 == 0) {
                return false;
            }
            if ((this.f53514b & 8) == 8 && !this.f53518g.isInitialized()) {
                this.f53522o = (byte) 0;
                return false;
            }
            for (int i = 0; i < this.f53520j.size(); i++) {
                if (!((Expression) this.f53520j.get(i)).isInitialized()) {
                    this.f53522o = (byte) 0;
                    return false;
                }
            }
            for (int i2 = 0; i2 < this.f53521n.size(); i2++) {
                if (!((Expression) this.f53521n.get(i2)).isInitialized()) {
                    this.f53522o = (byte) 0;
                    return false;
                }
            }
            this.f53522o = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final MessageLite.Builder newBuilderForType() {
            return Builder.m19454h();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final MessageLite.Builder toBuilder() {
            Builder builderM19454h = Builder.m19454h();
            builderM19454h.m19456i(this);
            return builderM19454h;
        }

        public Expression(Builder builder) {
            this.f53522o = (byte) -1;
            this.f53523p = -1;
            this.f53513a = builder.f54106a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Expression(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            ConstantValue constantValue;
            this.f53522o = (byte) -1;
            this.f53523p = -1;
            boolean z2 = false;
            this.f53515c = 0;
            this.f53516d = 0;
            ConstantValue constantValue2 = ConstantValue.TRUE;
            this.f53517f = constantValue2;
            this.f53518g = Type.f53679y;
            this.f53519i = 0;
            List list = Collections.EMPTY_LIST;
            this.f53520j = list;
            this.f53521n = list;
            ByteString.Output output = new ByteString.Output();
            CodedOutputStream codedOutputStreamM19666j = CodedOutputStream.m19666j(output, 1);
            int i = 0;
            while (!z2) {
                try {
                    try {
                        int iM19652n = codedInputStream.m19652n();
                        if (iM19652n != 0) {
                            if (iM19652n == 8) {
                                this.f53514b |= 1;
                                this.f53515c = codedInputStream.m19649k();
                            } else if (iM19652n != 16) {
                                Object objM19486p = null;
                                if (iM19652n == 24) {
                                    int iM19649k = codedInputStream.m19649k();
                                    if (iM19649k != 0) {
                                        if (iM19649k == 1) {
                                            objM19486p = ConstantValue.FALSE;
                                        } else if (iM19649k == 2) {
                                            objM19486p = ConstantValue.NULL;
                                        }
                                        constantValue = objM19486p;
                                    } else {
                                        constantValue = constantValue2;
                                    }
                                    if (constantValue == 0) {
                                        codedOutputStreamM19666j.m19679v(iM19652n);
                                        codedOutputStreamM19666j.m19679v(iM19649k);
                                    } else {
                                        this.f53514b |= 4;
                                        this.f53517f = constantValue;
                                    }
                                } else if (iM19652n == 34) {
                                    if ((this.f53514b & 8) == 8) {
                                        Type type = this.f53518g;
                                        type.getClass();
                                        objM19486p = Type.m19486p(type);
                                    }
                                    Type.Builder builder = objM19486p;
                                    Type type2 = (Type) codedInputStream.m19645g(Type.f53680z, extensionRegistryLite);
                                    this.f53518g = type2;
                                    if (builder != 0) {
                                        builder.m19496k(type2);
                                        this.f53518g = builder.m19495i();
                                    }
                                    this.f53514b |= 8;
                                } else if (iM19652n != 40) {
                                    Parser parser = f53512r;
                                    if (iM19652n == 50) {
                                        if ((i & 32) != 32) {
                                            this.f53520j = new ArrayList();
                                            i |= 32;
                                        }
                                        this.f53520j.add(codedInputStream.m19645g(parser, extensionRegistryLite));
                                    } else if (iM19652n != 58) {
                                        if (!codedInputStream.m19655q(iM19652n, codedOutputStreamM19666j)) {
                                        }
                                    } else {
                                        if ((i & 64) != 64) {
                                            this.f53521n = new ArrayList();
                                            i |= 64;
                                        }
                                        this.f53521n.add(codedInputStream.m19645g(parser, extensionRegistryLite));
                                    }
                                } else {
                                    this.f53514b |= 16;
                                    this.f53519i = codedInputStream.m19649k();
                                }
                            } else {
                                this.f53514b |= 2;
                                this.f53516d = codedInputStream.m19649k();
                            }
                        }
                        z2 = true;
                    } catch (Throwable th) {
                        if ((i & 32) == 32) {
                            this.f53520j = Collections.unmodifiableList(this.f53520j);
                        }
                        if ((i & 64) == 64) {
                            this.f53521n = Collections.unmodifiableList(this.f53521n);
                        }
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
            if ((i & 32) == 32) {
                this.f53520j = Collections.unmodifiableList(this.f53520j);
            }
            if ((i & 64) == 64) {
                this.f53521n = Collections.unmodifiableList(this.f53521n);
            }
            try {
                codedOutputStreamM19666j.m19667i();
            } catch (IOException unused2) {
            } finally {
                this.f53513a = output.m19638d();
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class StringTable extends GeneratedMessageLite implements StringTableOrBuilder {

        /* JADX INFO: renamed from: f */
        public static final StringTable f53671f;

        /* JADX INFO: renamed from: g */
        public static final Parser f53672g = new C61311();

        /* JADX INFO: renamed from: a */
        public final ByteString f53673a;

        /* JADX INFO: renamed from: b */
        public LazyStringList f53674b;

        /* JADX INFO: renamed from: c */
        public byte f53675c;

        /* JADX INFO: renamed from: d */
        public int f53676d;

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$StringTable$1 */
        /* JADX INFO: compiled from: Proguard */
        public static class C61311 extends AbstractParser<StringTable> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            /* JADX INFO: renamed from: a */
            public final Object mo19417a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new StringTable(codedInputStream);
            }
        }

        /* JADX INFO: compiled from: Proguard */
        public static final class Builder extends GeneratedMessageLite.Builder<StringTable, Builder> implements StringTableOrBuilder {

            /* JADX INFO: renamed from: b */
            public int f53677b;

            /* JADX INFO: renamed from: c */
            public LazyStringList f53678c;

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: b */
            public final AbstractMessageLite.Builder mo19418b() {
                Builder builder = new Builder();
                builder.f53678c = LazyStringArrayList.f54125b;
                builder.m19484h(m19483f());
                return builder;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public final MessageLite build() {
                StringTable stringTableM19483f = m19483f();
                stringTableM19483f.isInitialized();
                return stringTableM19483f;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: c */
            public final /* bridge */ /* synthetic */ AbstractMessageLite.Builder mo19419c(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                m19485i(codedInputStream, extensionRegistryLite);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            public final Object clone() {
                Builder builder = new Builder();
                builder.f53678c = LazyStringArrayList.f54125b;
                builder.m19484h(m19483f());
                return builder;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* JADX INFO: renamed from: d */
            public final GeneratedMessageLite.Builder mo19420d() {
                Builder builder = new Builder();
                builder.f53678c = LazyStringArrayList.f54125b;
                builder.m19484h(m19483f());
                return builder;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* JADX INFO: renamed from: e */
            public final /* bridge */ /* synthetic */ GeneratedMessageLite.Builder mo19421e(GeneratedMessageLite generatedMessageLite) {
                m19484h((StringTable) generatedMessageLite);
                return this;
            }

            /* JADX INFO: renamed from: f */
            public final StringTable m19483f() {
                StringTable stringTable = new StringTable(this);
                if ((this.f53677b & 1) == 1) {
                    this.f53678c = this.f53678c.getUnmodifiableView();
                    this.f53677b &= -2;
                }
                stringTable.f53674b = this.f53678c;
                return stringTable;
            }

            /* JADX INFO: renamed from: h */
            public final void m19484h(StringTable stringTable) {
                if (stringTable == StringTable.f53671f) {
                    return;
                }
                if (!stringTable.f53674b.isEmpty()) {
                    if (this.f53678c.isEmpty()) {
                        this.f53678c = stringTable.f53674b;
                        this.f53677b &= -2;
                    } else {
                        if ((this.f53677b & 1) != 1) {
                            this.f53678c = new LazyStringArrayList(this.f53678c);
                            this.f53677b |= 1;
                        }
                        this.f53678c.addAll(stringTable.f53674b);
                    }
                }
                this.f54106a = this.f54106a.m19625c(stringTable.f53673a);
            }

            /* JADX WARN: Removed duplicated region for block: B:14:0x001d  */
            /* JADX INFO: renamed from: i */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void m19485i(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                StringTable stringTable = null;
                try {
                    try {
                        ((C61311) StringTable.f53672g).getClass();
                        m19484h(new StringTable(codedInputStream));
                    } catch (InvalidProtocolBufferException e) {
                        StringTable stringTable2 = (StringTable) e.f54121a;
                        try {
                            throw e;
                        } catch (Throwable th) {
                            th = th;
                            stringTable = stringTable2;
                            if (stringTable != null) {
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (stringTable != null) {
                        m19484h(stringTable);
                    }
                    throw th;
                }
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* JADX INFO: renamed from: n */
            public final /* bridge */ /* synthetic */ MessageLite.Builder mo19425n(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                m19485i(codedInputStream, extensionRegistryLite);
                return this;
            }
        }

        static {
            StringTable stringTable = new StringTable();
            f53671f = stringTable;
            stringTable.f53674b = LazyStringArrayList.f54125b;
        }

        public StringTable() {
            this.f53675c = (byte) -1;
            this.f53676d = -1;
            this.f53673a = ByteString.f54075a;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        /* JADX INFO: renamed from: a */
        public final void mo19416a(CodedOutputStream codedOutputStream) {
            getSerializedSize();
            for (int i = 0; i < this.f53674b.size(); i++) {
                ByteString byteString = this.f53674b.getByteString(i);
                codedOutputStream.m19681x(1, 2);
                codedOutputStream.m19679v(byteString.size());
                codedOutputStream.m19675r(byteString);
            }
            codedOutputStream.m19675r(this.f53673a);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final int getSerializedSize() {
            int i = this.f53676d;
            if (i != -1) {
                return i;
            }
            int size = 0;
            for (int i2 = 0; i2 < this.f53674b.size(); i2++) {
                ByteString byteString = this.f53674b.getByteString(i2);
                size += byteString.size() + CodedOutputStream.m19663f(byteString.size());
            }
            int size2 = this.f53673a.size() + this.f53674b.size() + size;
            this.f53676d = size2;
            return size2;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            if (this.f53675c == 1) {
                return true;
            }
            this.f53675c = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final MessageLite.Builder newBuilderForType() {
            Builder builder = new Builder();
            builder.f53678c = LazyStringArrayList.f54125b;
            return builder;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final MessageLite.Builder toBuilder() {
            Builder builder = new Builder();
            builder.f53678c = LazyStringArrayList.f54125b;
            builder.m19484h(this);
            return builder;
        }

        public StringTable(Builder builder) {
            this.f53675c = (byte) -1;
            this.f53676d = -1;
            this.f53673a = builder.f54106a;
        }

        public StringTable(CodedInputStream codedInputStream) {
            this.f53675c = (byte) -1;
            this.f53676d = -1;
            this.f53674b = LazyStringArrayList.f54125b;
            ByteString.Output output = new ByteString.Output();
            CodedOutputStream codedOutputStreamM19666j = CodedOutputStream.m19666j(output, 1);
            boolean z2 = false;
            boolean z3 = false;
            while (!z2) {
                try {
                    try {
                        int iM19652n = codedInputStream.m19652n();
                        if (iM19652n != 0) {
                            if (iM19652n != 10) {
                                if (!codedInputStream.m19655q(iM19652n, codedOutputStreamM19666j)) {
                                }
                            } else {
                                ByteString byteStringM19643e = codedInputStream.m19643e();
                                if (!z3) {
                                    this.f53674b = new LazyStringArrayList();
                                    z3 = true;
                                }
                                this.f53674b.mo19712L(byteStringM19643e);
                            }
                        }
                        z2 = true;
                    } catch (Throwable th) {
                        if (z3) {
                            this.f53674b = this.f53674b.getUnmodifiableView();
                        }
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
            if (z3) {
                this.f53674b = this.f53674b.getUnmodifiableView();
            }
            try {
                codedOutputStreamM19666j.m19667i();
            } catch (IOException unused2) {
            } finally {
                this.f53673a = output.m19638d();
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class TypeTable extends GeneratedMessageLite implements TypeTableOrBuilder {

        /* JADX INFO: renamed from: i */
        public static final TypeTable f53783i;

        /* JADX INFO: renamed from: j */
        public static final Parser f53784j = new C61381();

        /* JADX INFO: renamed from: a */
        public final ByteString f53785a;

        /* JADX INFO: renamed from: b */
        public int f53786b;

        /* JADX INFO: renamed from: c */
        public List f53787c;

        /* JADX INFO: renamed from: d */
        public int f53788d;

        /* JADX INFO: renamed from: f */
        public byte f53789f;

        /* JADX INFO: renamed from: g */
        public int f53790g;

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable$1 */
        /* JADX INFO: compiled from: Proguard */
        public static class C61381 extends AbstractParser<TypeTable> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            /* JADX INFO: renamed from: a */
            public final Object mo19417a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new TypeTable(codedInputStream, extensionRegistryLite);
            }
        }

        /* JADX INFO: compiled from: Proguard */
        public static final class Builder extends GeneratedMessageLite.Builder<TypeTable, Builder> implements TypeTableOrBuilder {

            /* JADX INFO: renamed from: b */
            public int f53791b;

            /* JADX INFO: renamed from: c */
            public List f53792c;

            /* JADX INFO: renamed from: d */
            public int f53793d;

            /* JADX INFO: renamed from: h */
            public static Builder m19508h() {
                Builder builder = new Builder();
                builder.f53792c = Collections.EMPTY_LIST;
                builder.f53793d = -1;
                return builder;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: b */
            public final AbstractMessageLite.Builder mo19418b() {
                Builder builderM19508h = m19508h();
                builderM19508h.m19510i(m19509f());
                return builderM19508h;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public final MessageLite build() {
                TypeTable typeTableM19509f = m19509f();
                if (typeTableM19509f.isInitialized()) {
                    return typeTableM19509f;
                }
                throw new UninitializedMessageException();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: c */
            public final /* bridge */ /* synthetic */ AbstractMessageLite.Builder mo19419c(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                m19511j(codedInputStream, extensionRegistryLite);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            public final Object clone() {
                Builder builderM19508h = m19508h();
                builderM19508h.m19510i(m19509f());
                return builderM19508h;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* JADX INFO: renamed from: d */
            public final GeneratedMessageLite.Builder mo19420d() {
                Builder builderM19508h = m19508h();
                builderM19508h.m19510i(m19509f());
                return builderM19508h;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* JADX INFO: renamed from: e */
            public final /* bridge */ /* synthetic */ GeneratedMessageLite.Builder mo19421e(GeneratedMessageLite generatedMessageLite) {
                m19510i((TypeTable) generatedMessageLite);
                return this;
            }

            /* JADX INFO: renamed from: f */
            public final TypeTable m19509f() {
                TypeTable typeTable = new TypeTable(this);
                int i = this.f53791b;
                if ((i & 1) == 1) {
                    this.f53792c = Collections.unmodifiableList(this.f53792c);
                    this.f53791b &= -2;
                }
                typeTable.f53787c = this.f53792c;
                int i2 = (i & 2) != 2 ? 0 : 1;
                typeTable.f53788d = this.f53793d;
                typeTable.f53786b = i2;
                return typeTable;
            }

            /* JADX INFO: renamed from: i */
            public final void m19510i(TypeTable typeTable) {
                if (typeTable == TypeTable.f53783i) {
                    return;
                }
                if (!typeTable.f53787c.isEmpty()) {
                    if (this.f53792c.isEmpty()) {
                        this.f53792c = typeTable.f53787c;
                        this.f53791b &= -2;
                    } else {
                        if ((this.f53791b & 1) != 1) {
                            this.f53792c = new ArrayList(this.f53792c);
                            this.f53791b |= 1;
                        }
                        this.f53792c.addAll(typeTable.f53787c);
                    }
                }
                if ((typeTable.f53786b & 1) == 1) {
                    int i = typeTable.f53788d;
                    this.f53791b |= 2;
                    this.f53793d = i;
                }
                this.f54106a = this.f54106a.m19625c(typeTable.f53785a);
            }

            /* JADX WARN: Removed duplicated region for block: B:14:0x001d  */
            /* JADX INFO: renamed from: j */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void m19511j(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                TypeTable typeTable = null;
                try {
                    try {
                        ((C61381) TypeTable.f53784j).getClass();
                        m19510i(new TypeTable(codedInputStream, extensionRegistryLite));
                    } catch (InvalidProtocolBufferException e) {
                        TypeTable typeTable2 = (TypeTable) e.f54121a;
                        try {
                            throw e;
                        } catch (Throwable th) {
                            th = th;
                            typeTable = typeTable2;
                            if (typeTable != null) {
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (typeTable != null) {
                        m19510i(typeTable);
                    }
                    throw th;
                }
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* JADX INFO: renamed from: n */
            public final /* bridge */ /* synthetic */ MessageLite.Builder mo19425n(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                m19511j(codedInputStream, extensionRegistryLite);
                return this;
            }
        }

        static {
            TypeTable typeTable = new TypeTable();
            f53783i = typeTable;
            typeTable.f53787c = Collections.EMPTY_LIST;
            typeTable.f53788d = -1;
        }

        public TypeTable() {
            this.f53789f = (byte) -1;
            this.f53790g = -1;
            this.f53785a = ByteString.f54075a;
        }

        /* JADX INFO: renamed from: d */
        public static Builder m19506d(TypeTable typeTable) {
            Builder builderM19508h = Builder.m19508h();
            builderM19508h.m19510i(typeTable);
            return builderM19508h;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        /* JADX INFO: renamed from: a */
        public final void mo19416a(CodedOutputStream codedOutputStream) {
            getSerializedSize();
            for (int i = 0; i < this.f53787c.size(); i++) {
                codedOutputStream.m19672o(1, (MessageLite) this.f53787c.get(i));
            }
            if ((this.f53786b & 1) == 1) {
                codedOutputStream.m19670m(2, this.f53788d);
            }
            codedOutputStream.m19675r(this.f53785a);
        }

        /* JADX INFO: renamed from: e */
        public final Builder m19507e() {
            return m19506d(this);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final int getSerializedSize() {
            int i = this.f53790g;
            if (i != -1) {
                return i;
            }
            int iM19659b = 0;
            for (int i2 = 0; i2 < this.f53787c.size(); i2++) {
                iM19659b += CodedOutputStream.m19661d(1, (MessageLite) this.f53787c.get(i2));
            }
            if ((this.f53786b & 1) == 1) {
                iM19659b += CodedOutputStream.m19659b(2, this.f53788d);
            }
            int size = this.f53785a.size() + iM19659b;
            this.f53790g = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b2 = this.f53789f;
            if (b2 == 1) {
                return true;
            }
            if (b2 == 0) {
                return false;
            }
            for (int i = 0; i < this.f53787c.size(); i++) {
                if (!((Type) this.f53787c.get(i)).isInitialized()) {
                    this.f53789f = (byte) 0;
                    return false;
                }
            }
            this.f53789f = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final MessageLite.Builder newBuilderForType() {
            return Builder.m19508h();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final MessageLite.Builder toBuilder() {
            return m19506d(this);
        }

        public TypeTable(Builder builder) {
            this.f53789f = (byte) -1;
            this.f53790g = -1;
            this.f53785a = builder.f54106a;
        }

        public TypeTable(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            this.f53789f = (byte) -1;
            this.f53790g = -1;
            this.f53787c = Collections.EMPTY_LIST;
            this.f53788d = -1;
            ByteString.Output output = new ByteString.Output();
            CodedOutputStream codedOutputStreamM19666j = CodedOutputStream.m19666j(output, 1);
            boolean z2 = false;
            boolean z3 = false;
            while (!z2) {
                try {
                    try {
                        int iM19652n = codedInputStream.m19652n();
                        if (iM19652n != 0) {
                            if (iM19652n == 10) {
                                if (!z3) {
                                    this.f53787c = new ArrayList();
                                    z3 = true;
                                }
                                this.f53787c.add(codedInputStream.m19645g(Type.f53680z, extensionRegistryLite));
                            } else if (iM19652n != 16) {
                                if (!codedInputStream.m19655q(iM19652n, codedOutputStreamM19666j)) {
                                }
                            } else {
                                this.f53786b |= 1;
                                this.f53788d = codedInputStream.m19649k();
                            }
                        }
                        z2 = true;
                    } catch (Throwable th) {
                        if (z3) {
                            this.f53787c = Collections.unmodifiableList(this.f53787c);
                        }
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
            if (z3) {
                this.f53787c = Collections.unmodifiableList(this.f53787c);
            }
            try {
                codedOutputStreamM19666j.m19667i();
            } catch (IOException unused2) {
            } finally {
                this.f53785a = output.m19638d();
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class VersionRequirement extends GeneratedMessageLite implements VersionRequirementOrBuilder {

        /* JADX INFO: renamed from: p */
        public static final VersionRequirement f53813p;

        /* JADX INFO: renamed from: q */
        public static final Parser f53814q = new C61401();

        /* JADX INFO: renamed from: a */
        public final ByteString f53815a;

        /* JADX INFO: renamed from: b */
        public int f53816b;

        /* JADX INFO: renamed from: c */
        public int f53817c;

        /* JADX INFO: renamed from: d */
        public int f53818d;

        /* JADX INFO: renamed from: f */
        public Level f53819f;

        /* JADX INFO: renamed from: g */
        public int f53820g;

        /* JADX INFO: renamed from: i */
        public int f53821i;

        /* JADX INFO: renamed from: j */
        public VersionKind f53822j;

        /* JADX INFO: renamed from: n */
        public byte f53823n;

        /* JADX INFO: renamed from: o */
        public int f53824o;

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirement$1 */
        /* JADX INFO: compiled from: Proguard */
        public static class C61401 extends AbstractParser<VersionRequirement> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            /* JADX INFO: renamed from: a */
            public final Object mo19417a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new VersionRequirement(codedInputStream);
            }
        }

        /* JADX INFO: compiled from: Proguard */
        public static final class Builder extends GeneratedMessageLite.Builder<VersionRequirement, Builder> implements VersionRequirementOrBuilder {

            /* JADX INFO: renamed from: b */
            public int f53825b;

            /* JADX INFO: renamed from: c */
            public int f53826c;

            /* JADX INFO: renamed from: d */
            public int f53827d;

            /* JADX INFO: renamed from: f */
            public Level f53828f;

            /* JADX INFO: renamed from: g */
            public int f53829g;

            /* JADX INFO: renamed from: i */
            public int f53830i;

            /* JADX INFO: renamed from: j */
            public VersionKind f53831j;

            /* JADX INFO: renamed from: h */
            public static Builder m19515h() {
                Builder builder = new Builder();
                builder.f53828f = Level.ERROR;
                builder.f53831j = VersionKind.LANGUAGE_VERSION;
                return builder;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: b */
            public final AbstractMessageLite.Builder mo19418b() {
                Builder builderM19515h = m19515h();
                builderM19515h.m19517i(m19516f());
                return builderM19515h;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public final MessageLite build() {
                VersionRequirement versionRequirementM19516f = m19516f();
                versionRequirementM19516f.isInitialized();
                return versionRequirementM19516f;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: c */
            public final /* bridge */ /* synthetic */ AbstractMessageLite.Builder mo19419c(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                m19518j(codedInputStream, extensionRegistryLite);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            public final Object clone() {
                Builder builderM19515h = m19515h();
                builderM19515h.m19517i(m19516f());
                return builderM19515h;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* JADX INFO: renamed from: d */
            public final GeneratedMessageLite.Builder mo19420d() {
                Builder builderM19515h = m19515h();
                builderM19515h.m19517i(m19516f());
                return builderM19515h;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* JADX INFO: renamed from: e */
            public final /* bridge */ /* synthetic */ GeneratedMessageLite.Builder mo19421e(GeneratedMessageLite generatedMessageLite) {
                m19517i((VersionRequirement) generatedMessageLite);
                return this;
            }

            /* JADX INFO: renamed from: f */
            public final VersionRequirement m19516f() {
                VersionRequirement versionRequirement = new VersionRequirement(this);
                int i = this.f53825b;
                int i2 = (i & 1) != 1 ? 0 : 1;
                versionRequirement.f53817c = this.f53826c;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                versionRequirement.f53818d = this.f53827d;
                if ((i & 4) == 4) {
                    i2 |= 4;
                }
                versionRequirement.f53819f = this.f53828f;
                if ((i & 8) == 8) {
                    i2 |= 8;
                }
                versionRequirement.f53820g = this.f53829g;
                if ((i & 16) == 16) {
                    i2 |= 16;
                }
                versionRequirement.f53821i = this.f53830i;
                if ((i & 32) == 32) {
                    i2 |= 32;
                }
                versionRequirement.f53822j = this.f53831j;
                versionRequirement.f53816b = i2;
                return versionRequirement;
            }

            /* JADX INFO: renamed from: i */
            public final void m19517i(VersionRequirement versionRequirement) {
                if (versionRequirement == VersionRequirement.f53813p) {
                    return;
                }
                int i = versionRequirement.f53816b;
                if ((i & 1) == 1) {
                    int i2 = versionRequirement.f53817c;
                    this.f53825b = 1 | this.f53825b;
                    this.f53826c = i2;
                }
                if ((i & 2) == 2) {
                    int i3 = versionRequirement.f53818d;
                    this.f53825b = 2 | this.f53825b;
                    this.f53827d = i3;
                }
                if ((i & 4) == 4) {
                    Level level = versionRequirement.f53819f;
                    level.getClass();
                    this.f53825b = 4 | this.f53825b;
                    this.f53828f = level;
                }
                int i4 = versionRequirement.f53816b;
                if ((i4 & 8) == 8) {
                    int i5 = versionRequirement.f53820g;
                    this.f53825b = 8 | this.f53825b;
                    this.f53829g = i5;
                }
                if ((i4 & 16) == 16) {
                    int i6 = versionRequirement.f53821i;
                    this.f53825b = 16 | this.f53825b;
                    this.f53830i = i6;
                }
                if ((i4 & 32) == 32) {
                    VersionKind versionKind = versionRequirement.f53822j;
                    versionKind.getClass();
                    this.f53825b = 32 | this.f53825b;
                    this.f53831j = versionKind;
                }
                this.f54106a = this.f54106a.m19625c(versionRequirement.f53815a);
            }

            /* JADX WARN: Removed duplicated region for block: B:14:0x001d  */
            /* JADX INFO: renamed from: j */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void m19518j(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                VersionRequirement versionRequirement = null;
                try {
                    try {
                        ((C61401) VersionRequirement.f53814q).getClass();
                        m19517i(new VersionRequirement(codedInputStream));
                    } catch (InvalidProtocolBufferException e) {
                        VersionRequirement versionRequirement2 = (VersionRequirement) e.f54121a;
                        try {
                            throw e;
                        } catch (Throwable th) {
                            th = th;
                            versionRequirement = versionRequirement2;
                            if (versionRequirement != null) {
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (versionRequirement != null) {
                        m19517i(versionRequirement);
                    }
                    throw th;
                }
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* JADX INFO: renamed from: n */
            public final /* bridge */ /* synthetic */ MessageLite.Builder mo19425n(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                m19518j(codedInputStream, extensionRegistryLite);
                return this;
            }
        }

        /* JADX INFO: compiled from: Proguard */
        public enum Level implements Internal.EnumLite {
            WARNING(0),
            ERROR(1),
            HIDDEN(2);


            /* JADX INFO: renamed from: a */
            public final int f53836a;

            /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirement$Level$1 */
            /* JADX INFO: compiled from: Proguard */
            public static class C61411 implements Internal.EnumLiteMap<Level> {
            }

            Level(int i) {
                this.f53836a = i;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
            public final int getNumber() {
                return this.f53836a;
            }
        }

        /* JADX INFO: compiled from: Proguard */
        public enum VersionKind implements Internal.EnumLite {
            LANGUAGE_VERSION(0),
            COMPILER_VERSION(1),
            API_VERSION(2);


            /* JADX INFO: renamed from: a */
            public final int f53841a;

            /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirement$VersionKind$1 */
            /* JADX INFO: compiled from: Proguard */
            public static class C61421 implements Internal.EnumLiteMap<VersionKind> {
            }

            VersionKind(int i) {
                this.f53841a = i;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
            public final int getNumber() {
                return this.f53841a;
            }
        }

        static {
            VersionRequirement versionRequirement = new VersionRequirement();
            f53813p = versionRequirement;
            versionRequirement.f53817c = 0;
            versionRequirement.f53818d = 0;
            versionRequirement.f53819f = Level.ERROR;
            versionRequirement.f53820g = 0;
            versionRequirement.f53821i = 0;
            versionRequirement.f53822j = VersionKind.LANGUAGE_VERSION;
        }

        public VersionRequirement() {
            this.f53823n = (byte) -1;
            this.f53824o = -1;
            this.f53815a = ByteString.f54075a;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        /* JADX INFO: renamed from: a */
        public final void mo19416a(CodedOutputStream codedOutputStream) {
            getSerializedSize();
            if ((this.f53816b & 1) == 1) {
                codedOutputStream.m19670m(1, this.f53817c);
            }
            if ((this.f53816b & 2) == 2) {
                codedOutputStream.m19670m(2, this.f53818d);
            }
            if ((this.f53816b & 4) == 4) {
                codedOutputStream.m19669l(3, this.f53819f.f53836a);
            }
            if ((this.f53816b & 8) == 8) {
                codedOutputStream.m19670m(4, this.f53820g);
            }
            if ((this.f53816b & 16) == 16) {
                codedOutputStream.m19670m(5, this.f53821i);
            }
            if ((this.f53816b & 32) == 32) {
                codedOutputStream.m19669l(6, this.f53822j.f53841a);
            }
            codedOutputStream.m19675r(this.f53815a);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final int getSerializedSize() {
            int i = this.f53824o;
            if (i != -1) {
                return i;
            }
            int iM19659b = (this.f53816b & 1) == 1 ? CodedOutputStream.m19659b(1, this.f53817c) : 0;
            if ((this.f53816b & 2) == 2) {
                iM19659b += CodedOutputStream.m19659b(2, this.f53818d);
            }
            if ((this.f53816b & 4) == 4) {
                iM19659b += CodedOutputStream.m19658a(3, this.f53819f.f53836a);
            }
            if ((this.f53816b & 8) == 8) {
                iM19659b += CodedOutputStream.m19659b(4, this.f53820g);
            }
            if ((this.f53816b & 16) == 16) {
                iM19659b += CodedOutputStream.m19659b(5, this.f53821i);
            }
            if ((this.f53816b & 32) == 32) {
                iM19659b += CodedOutputStream.m19658a(6, this.f53822j.f53841a);
            }
            int size = this.f53815a.size() + iM19659b;
            this.f53824o = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            if (this.f53823n == 1) {
                return true;
            }
            this.f53823n = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final MessageLite.Builder newBuilderForType() {
            return Builder.m19515h();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final MessageLite.Builder toBuilder() {
            Builder builderM19515h = Builder.m19515h();
            builderM19515h.m19517i(this);
            return builderM19515h;
        }

        public VersionRequirement(Builder builder) {
            this.f53823n = (byte) -1;
            this.f53824o = -1;
            this.f53815a = builder.f54106a;
        }

        public VersionRequirement(CodedInputStream codedInputStream) {
            this.f53823n = (byte) -1;
            this.f53824o = -1;
            boolean z2 = false;
            this.f53817c = 0;
            this.f53818d = 0;
            Level level = Level.ERROR;
            this.f53819f = level;
            this.f53820g = 0;
            this.f53821i = 0;
            VersionKind versionKind = VersionKind.LANGUAGE_VERSION;
            this.f53822j = versionKind;
            ByteString.Output output = new ByteString.Output();
            CodedOutputStream codedOutputStreamM19666j = CodedOutputStream.m19666j(output, 1);
            while (!z2) {
                try {
                    try {
                        try {
                            int iM19652n = codedInputStream.m19652n();
                            if (iM19652n != 0) {
                                if (iM19652n == 8) {
                                    this.f53816b |= 1;
                                    this.f53817c = codedInputStream.m19649k();
                                } else if (iM19652n != 16) {
                                    VersionKind versionKind2 = null;
                                    Level level2 = null;
                                    if (iM19652n == 24) {
                                        int iM19649k = codedInputStream.m19649k();
                                        if (iM19649k == 0) {
                                            level2 = Level.WARNING;
                                        } else if (iM19649k == 1) {
                                            level2 = level;
                                        } else if (iM19649k == 2) {
                                            level2 = Level.HIDDEN;
                                        }
                                        if (level2 == null) {
                                            codedOutputStreamM19666j.m19679v(iM19652n);
                                            codedOutputStreamM19666j.m19679v(iM19649k);
                                        } else {
                                            this.f53816b |= 4;
                                            this.f53819f = level2;
                                        }
                                    } else if (iM19652n == 32) {
                                        this.f53816b |= 8;
                                        this.f53820g = codedInputStream.m19649k();
                                    } else if (iM19652n == 40) {
                                        this.f53816b |= 16;
                                        this.f53821i = codedInputStream.m19649k();
                                    } else if (iM19652n != 48) {
                                        if (!codedInputStream.m19655q(iM19652n, codedOutputStreamM19666j)) {
                                        }
                                    } else {
                                        int iM19649k2 = codedInputStream.m19649k();
                                        if (iM19649k2 == 0) {
                                            versionKind2 = versionKind;
                                        } else if (iM19649k2 == 1) {
                                            versionKind2 = VersionKind.COMPILER_VERSION;
                                        } else if (iM19649k2 == 2) {
                                            versionKind2 = VersionKind.API_VERSION;
                                        }
                                        if (versionKind2 == null) {
                                            codedOutputStreamM19666j.m19679v(iM19652n);
                                            codedOutputStreamM19666j.m19679v(iM19649k2);
                                        } else {
                                            this.f53816b |= 32;
                                            this.f53822j = versionKind2;
                                        }
                                    }
                                } else {
                                    this.f53816b |= 2;
                                    this.f53818d = codedInputStream.m19649k();
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
                this.f53815a = output.m19638d();
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class VersionRequirementTable extends GeneratedMessageLite implements VersionRequirementTableOrBuilder {

        /* JADX INFO: renamed from: f */
        public static final VersionRequirementTable f53842f;

        /* JADX INFO: renamed from: g */
        public static final Parser f53843g = new C61431();

        /* JADX INFO: renamed from: a */
        public final ByteString f53844a;

        /* JADX INFO: renamed from: b */
        public List f53845b;

        /* JADX INFO: renamed from: c */
        public byte f53846c;

        /* JADX INFO: renamed from: d */
        public int f53847d;

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirementTable$1 */
        /* JADX INFO: compiled from: Proguard */
        public static class C61431 extends AbstractParser<VersionRequirementTable> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            /* JADX INFO: renamed from: a */
            public final Object mo19417a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new VersionRequirementTable(codedInputStream, extensionRegistryLite);
            }
        }

        /* JADX INFO: compiled from: Proguard */
        public static final class Builder extends GeneratedMessageLite.Builder<VersionRequirementTable, Builder> implements VersionRequirementTableOrBuilder {

            /* JADX INFO: renamed from: b */
            public int f53848b;

            /* JADX INFO: renamed from: c */
            public List f53849c;

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: b */
            public final AbstractMessageLite.Builder mo19418b() {
                Builder builder = new Builder();
                builder.f53849c = Collections.EMPTY_LIST;
                builder.m19521h(m19520f());
                return builder;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public final MessageLite build() {
                VersionRequirementTable versionRequirementTableM19520f = m19520f();
                versionRequirementTableM19520f.isInitialized();
                return versionRequirementTableM19520f;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: c */
            public final /* bridge */ /* synthetic */ AbstractMessageLite.Builder mo19419c(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                m19522i(codedInputStream, extensionRegistryLite);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            public final Object clone() {
                Builder builder = new Builder();
                builder.f53849c = Collections.EMPTY_LIST;
                builder.m19521h(m19520f());
                return builder;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* JADX INFO: renamed from: d */
            public final GeneratedMessageLite.Builder mo19420d() {
                Builder builder = new Builder();
                builder.f53849c = Collections.EMPTY_LIST;
                builder.m19521h(m19520f());
                return builder;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* JADX INFO: renamed from: e */
            public final /* bridge */ /* synthetic */ GeneratedMessageLite.Builder mo19421e(GeneratedMessageLite generatedMessageLite) {
                m19521h((VersionRequirementTable) generatedMessageLite);
                return this;
            }

            /* JADX INFO: renamed from: f */
            public final VersionRequirementTable m19520f() {
                VersionRequirementTable versionRequirementTable = new VersionRequirementTable(this);
                if ((this.f53848b & 1) == 1) {
                    this.f53849c = Collections.unmodifiableList(this.f53849c);
                    this.f53848b &= -2;
                }
                versionRequirementTable.f53845b = this.f53849c;
                return versionRequirementTable;
            }

            /* JADX INFO: renamed from: h */
            public final void m19521h(VersionRequirementTable versionRequirementTable) {
                if (versionRequirementTable == VersionRequirementTable.f53842f) {
                    return;
                }
                if (!versionRequirementTable.f53845b.isEmpty()) {
                    if (this.f53849c.isEmpty()) {
                        this.f53849c = versionRequirementTable.f53845b;
                        this.f53848b &= -2;
                    } else {
                        if ((this.f53848b & 1) != 1) {
                            this.f53849c = new ArrayList(this.f53849c);
                            this.f53848b |= 1;
                        }
                        this.f53849c.addAll(versionRequirementTable.f53845b);
                    }
                }
                this.f54106a = this.f54106a.m19625c(versionRequirementTable.f53844a);
            }

            /* JADX WARN: Removed duplicated region for block: B:14:0x001d  */
            /* JADX INFO: renamed from: i */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void m19522i(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                VersionRequirementTable versionRequirementTable = null;
                try {
                    try {
                        ((C61431) VersionRequirementTable.f53843g).getClass();
                        m19521h(new VersionRequirementTable(codedInputStream, extensionRegistryLite));
                    } catch (InvalidProtocolBufferException e) {
                        VersionRequirementTable versionRequirementTable2 = (VersionRequirementTable) e.f54121a;
                        try {
                            throw e;
                        } catch (Throwable th) {
                            th = th;
                            versionRequirementTable = versionRequirementTable2;
                            if (versionRequirementTable != null) {
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (versionRequirementTable != null) {
                        m19521h(versionRequirementTable);
                    }
                    throw th;
                }
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* JADX INFO: renamed from: n */
            public final /* bridge */ /* synthetic */ MessageLite.Builder mo19425n(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                m19522i(codedInputStream, extensionRegistryLite);
                return this;
            }
        }

        static {
            VersionRequirementTable versionRequirementTable = new VersionRequirementTable();
            f53842f = versionRequirementTable;
            versionRequirementTable.f53845b = Collections.EMPTY_LIST;
        }

        public VersionRequirementTable() {
            this.f53846c = (byte) -1;
            this.f53847d = -1;
            this.f53844a = ByteString.f54075a;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        /* JADX INFO: renamed from: a */
        public final void mo19416a(CodedOutputStream codedOutputStream) {
            getSerializedSize();
            for (int i = 0; i < this.f53845b.size(); i++) {
                codedOutputStream.m19672o(1, (MessageLite) this.f53845b.get(i));
            }
            codedOutputStream.m19675r(this.f53844a);
        }

        /* JADX INFO: renamed from: d */
        public final Builder m19519d() {
            Builder builder = new Builder();
            builder.f53849c = Collections.EMPTY_LIST;
            builder.m19521h(this);
            return builder;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final int getSerializedSize() {
            int i = this.f53847d;
            if (i != -1) {
                return i;
            }
            int iM19661d = 0;
            for (int i2 = 0; i2 < this.f53845b.size(); i2++) {
                iM19661d += CodedOutputStream.m19661d(1, (MessageLite) this.f53845b.get(i2));
            }
            int size = this.f53844a.size() + iM19661d;
            this.f53847d = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            if (this.f53846c == 1) {
                return true;
            }
            this.f53846c = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final MessageLite.Builder newBuilderForType() {
            Builder builder = new Builder();
            builder.f53849c = Collections.EMPTY_LIST;
            return builder;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final MessageLite.Builder toBuilder() {
            Builder builder = new Builder();
            builder.f53849c = Collections.EMPTY_LIST;
            builder.m19521h(this);
            return builder;
        }

        public VersionRequirementTable(Builder builder) {
            this.f53846c = (byte) -1;
            this.f53847d = -1;
            this.f53844a = builder.f54106a;
        }

        public VersionRequirementTable(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            this.f53846c = (byte) -1;
            this.f53847d = -1;
            this.f53845b = Collections.EMPTY_LIST;
            ByteString.Output output = new ByteString.Output();
            CodedOutputStream codedOutputStreamM19666j = CodedOutputStream.m19666j(output, 1);
            boolean z2 = false;
            boolean z3 = false;
            while (!z2) {
                try {
                    try {
                        int iM19652n = codedInputStream.m19652n();
                        if (iM19652n != 0) {
                            if (iM19652n != 10) {
                                if (!codedInputStream.m19655q(iM19652n, codedOutputStreamM19666j)) {
                                }
                            } else {
                                if (!z3) {
                                    this.f53845b = new ArrayList();
                                    z3 = true;
                                }
                                this.f53845b.add(codedInputStream.m19645g(VersionRequirement.f53814q, extensionRegistryLite));
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
                    if (z3) {
                        this.f53845b = Collections.unmodifiableList(this.f53845b);
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
            if (z3) {
                this.f53845b = Collections.unmodifiableList(this.f53845b);
            }
            try {
                codedOutputStreamM19666j.m19667i();
            } catch (IOException unused2) {
            } finally {
                this.f53844a = output.m19638d();
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class Constructor extends GeneratedMessageLite.ExtendableMessage<Constructor> implements ConstructorOrBuilder {

        /* JADX INFO: renamed from: n */
        public static final Constructor f53456n;

        /* JADX INFO: renamed from: o */
        public static final Parser f53457o = new C61141();

        /* JADX INFO: renamed from: b */
        public final ByteString f53458b;

        /* JADX INFO: renamed from: c */
        public int f53459c;

        /* JADX INFO: renamed from: d */
        public int f53460d;

        /* JADX INFO: renamed from: f */
        public List f53461f;

        /* JADX INFO: renamed from: g */
        public List f53462g;

        /* JADX INFO: renamed from: i */
        public byte f53463i;

        /* JADX INFO: renamed from: j */
        public int f53464j;

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Constructor$1 */
        /* JADX INFO: compiled from: Proguard */
        public static class C61141 extends AbstractParser<Constructor> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            /* JADX INFO: renamed from: a */
            public final Object mo19417a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new Constructor(codedInputStream, extensionRegistryLite);
            }
        }

        /* JADX INFO: compiled from: Proguard */
        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<Constructor, Builder> implements ConstructorOrBuilder {

            /* JADX INFO: renamed from: d */
            public int f53465d;

            /* JADX INFO: renamed from: f */
            public int f53466f;

            /* JADX INFO: renamed from: g */
            public List f53467g;

            /* JADX INFO: renamed from: i */
            public List f53468i;

            /* JADX INFO: renamed from: j */
            public static Builder m19441j() {
                Builder builder = new Builder();
                builder.f53466f = 6;
                List list = Collections.EMPTY_LIST;
                builder.f53467g = list;
                builder.f53468i = list;
                return builder;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: b */
            public final AbstractMessageLite.Builder mo19418b() {
                Builder builderM19441j = m19441j();
                builderM19441j.m19443k(m19442i());
                return builderM19441j;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public final MessageLite build() {
                Constructor constructorM19442i = m19442i();
                if (constructorM19442i.isInitialized()) {
                    return constructorM19442i;
                }
                throw new UninitializedMessageException();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: c */
            public final /* bridge */ /* synthetic */ AbstractMessageLite.Builder mo19419c(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                m19444l(codedInputStream, extensionRegistryLite);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            public final Object clone() {
                Builder builderM19441j = m19441j();
                builderM19441j.m19443k(m19442i());
                return builderM19441j;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* JADX INFO: renamed from: d */
            public final GeneratedMessageLite.Builder mo19420d() {
                Builder builderM19441j = m19441j();
                builderM19441j.m19443k(m19442i());
                return builderM19441j;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* JADX INFO: renamed from: e */
            public final /* bridge */ /* synthetic */ GeneratedMessageLite.Builder mo19421e(GeneratedMessageLite generatedMessageLite) {
                m19443k((Constructor) generatedMessageLite);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder
            /* JADX INFO: renamed from: f */
            public final GeneratedMessageLite.ExtendableBuilder mo19437f() {
                Builder builderM19441j = m19441j();
                builderM19441j.m19443k(m19442i());
                return builderM19441j;
            }

            /* JADX INFO: renamed from: i */
            public final Constructor m19442i() {
                Constructor constructor = new Constructor(this);
                int i = this.f53465d;
                int i2 = (i & 1) != 1 ? 0 : 1;
                constructor.f53460d = this.f53466f;
                if ((i & 2) == 2) {
                    this.f53467g = Collections.unmodifiableList(this.f53467g);
                    this.f53465d &= -3;
                }
                constructor.f53461f = this.f53467g;
                if ((this.f53465d & 4) == 4) {
                    this.f53468i = Collections.unmodifiableList(this.f53468i);
                    this.f53465d &= -5;
                }
                constructor.f53462g = this.f53468i;
                constructor.f53459c = i2;
                return constructor;
            }

            /* JADX INFO: renamed from: k */
            public final void m19443k(Constructor constructor) {
                if (constructor == Constructor.f53456n) {
                    return;
                }
                if ((constructor.f53459c & 1) == 1) {
                    int i = constructor.f53460d;
                    this.f53465d = 1 | this.f53465d;
                    this.f53466f = i;
                }
                if (!constructor.f53461f.isEmpty()) {
                    if (this.f53467g.isEmpty()) {
                        this.f53467g = constructor.f53461f;
                        this.f53465d &= -3;
                    } else {
                        if ((this.f53465d & 2) != 2) {
                            this.f53467g = new ArrayList(this.f53467g);
                            this.f53465d |= 2;
                        }
                        this.f53467g.addAll(constructor.f53461f);
                    }
                }
                if (!constructor.f53462g.isEmpty()) {
                    if (this.f53468i.isEmpty()) {
                        this.f53468i = constructor.f53462g;
                        this.f53465d &= -5;
                    } else {
                        if ((this.f53465d & 4) != 4) {
                            this.f53468i = new ArrayList(this.f53468i);
                            this.f53465d |= 4;
                        }
                        this.f53468i.addAll(constructor.f53462g);
                    }
                }
                m19697h(constructor);
                this.f54106a = this.f54106a.m19625c(constructor.f53458b);
            }

            /* JADX WARN: Removed duplicated region for block: B:14:0x001d  */
            /* JADX INFO: renamed from: l */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void m19444l(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                Constructor constructor = null;
                try {
                    try {
                        ((C61141) Constructor.f53457o).getClass();
                        m19443k(new Constructor(codedInputStream, extensionRegistryLite));
                    } catch (InvalidProtocolBufferException e) {
                        Constructor constructor2 = (Constructor) e.f54121a;
                        try {
                            throw e;
                        } catch (Throwable th) {
                            th = th;
                            constructor = constructor2;
                            if (constructor != null) {
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (constructor != null) {
                        m19443k(constructor);
                    }
                    throw th;
                }
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* JADX INFO: renamed from: n */
            public final /* bridge */ /* synthetic */ MessageLite.Builder mo19425n(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                m19444l(codedInputStream, extensionRegistryLite);
                return this;
            }
        }

        static {
            Constructor constructor = new Constructor();
            f53456n = constructor;
            constructor.f53460d = 6;
            List list = Collections.EMPTY_LIST;
            constructor.f53461f = list;
            constructor.f53462g = list;
        }

        public Constructor(Builder builder) {
            super(builder);
            this.f53463i = (byte) -1;
            this.f53464j = -1;
            this.f53458b = builder.f54106a;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        /* JADX INFO: renamed from: a */
        public final void mo19416a(CodedOutputStream codedOutputStream) {
            getSerializedSize();
            GeneratedMessageLite.ExtendableMessage.ExtensionWriter extensionWriter = new GeneratedMessageLite.ExtendableMessage.ExtensionWriter(this);
            if ((this.f53459c & 1) == 1) {
                codedOutputStream.m19670m(1, this.f53460d);
            }
            for (int i = 0; i < this.f53461f.size(); i++) {
                codedOutputStream.m19672o(2, (MessageLite) this.f53461f.get(i));
            }
            for (int i2 = 0; i2 < this.f53462g.size(); i2++) {
                codedOutputStream.m19670m(31, ((Integer) this.f53462g.get(i2)).intValue());
            }
            extensionWriter.m19707a(19000, codedOutputStream);
            codedOutputStream.m19675r(this.f53458b);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final MessageLite getDefaultInstanceForType() {
            return f53456n;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final int getSerializedSize() {
            int i = this.f53464j;
            if (i != -1) {
                return i;
            }
            int iM19659b = (this.f53459c & 1) == 1 ? CodedOutputStream.m19659b(1, this.f53460d) : 0;
            for (int i2 = 0; i2 < this.f53461f.size(); i2++) {
                iM19659b += CodedOutputStream.m19661d(2, (MessageLite) this.f53461f.get(i2));
            }
            int iM19660c = 0;
            for (int i3 = 0; i3 < this.f53462g.size(); i3++) {
                iM19660c += CodedOutputStream.m19660c(((Integer) this.f53462g.get(i3)).intValue());
            }
            int size = this.f53458b.size() + m19699e() + AbstractC0455a.m2225D(this.f53462g, 2, iM19659b + iM19660c);
            this.f53464j = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b2 = this.f53463i;
            if (b2 == 1) {
                return true;
            }
            if (b2 == 0) {
                return false;
            }
            for (int i = 0; i < this.f53461f.size(); i++) {
                if (!((ValueParameter) this.f53461f.get(i)).isInitialized()) {
                    this.f53463i = (byte) 0;
                    return false;
                }
            }
            if (m19698d()) {
                this.f53463i = (byte) 1;
                return true;
            }
            this.f53463i = (byte) 0;
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final MessageLite.Builder newBuilderForType() {
            return Builder.m19441j();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final MessageLite.Builder toBuilder() {
            Builder builderM19441j = Builder.m19441j();
            builderM19441j.m19443k(this);
            return builderM19441j;
        }

        public Constructor() {
            this.f53463i = (byte) -1;
            this.f53464j = -1;
            this.f53458b = ByteString.f54075a;
        }

        public Constructor(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            this.f53463i = (byte) -1;
            this.f53464j = -1;
            this.f53460d = 6;
            List list = Collections.EMPTY_LIST;
            this.f53461f = list;
            this.f53462g = list;
            ByteString.Output output = new ByteString.Output();
            CodedOutputStream codedOutputStreamM19666j = CodedOutputStream.m19666j(output, 1);
            boolean z2 = false;
            int i = 0;
            while (!z2) {
                try {
                    try {
                        int iM19652n = codedInputStream.m19652n();
                        if (iM19652n != 0) {
                            if (iM19652n == 8) {
                                this.f53459c |= 1;
                                this.f53460d = codedInputStream.m19649k();
                            } else if (iM19652n == 18) {
                                if ((i & 2) != 2) {
                                    this.f53461f = new ArrayList();
                                    i |= 2;
                                }
                                this.f53461f.add(codedInputStream.m19645g(ValueParameter.f53795r, extensionRegistryLite));
                            } else if (iM19652n == 248) {
                                if ((i & 4) != 4) {
                                    this.f53462g = new ArrayList();
                                    i |= 4;
                                }
                                this.f53462g.add(Integer.valueOf(codedInputStream.m19649k()));
                            } else if (iM19652n != 250) {
                                if (!m19705k(codedInputStream, codedOutputStreamM19666j, extensionRegistryLite, iM19652n)) {
                                }
                            } else {
                                int iM19642d = codedInputStream.m19642d(codedInputStream.m19649k());
                                if ((i & 4) != 4 && codedInputStream.m19640b() > 0) {
                                    this.f53462g = new ArrayList();
                                    i |= 4;
                                }
                                while (codedInputStream.m19640b() > 0) {
                                    this.f53462g.add(Integer.valueOf(codedInputStream.m19649k()));
                                }
                                codedInputStream.m19641c(iM19642d);
                            }
                        }
                        z2 = true;
                    } catch (Throwable th) {
                        if ((i & 2) == 2) {
                            this.f53461f = Collections.unmodifiableList(this.f53461f);
                        }
                        if ((i & 4) == 4) {
                            this.f53462g = Collections.unmodifiableList(this.f53462g);
                        }
                        try {
                            codedOutputStreamM19666j.m19667i();
                        } catch (IOException unused) {
                        } catch (Throwable th2) {
                            this.f53458b = output.m19638d();
                            throw th2;
                        }
                        this.f53458b = output.m19638d();
                        m19704j();
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
            if ((i & 2) == 2) {
                this.f53461f = Collections.unmodifiableList(this.f53461f);
            }
            if ((i & 4) == 4) {
                this.f53462g = Collections.unmodifiableList(this.f53462g);
            }
            try {
                codedOutputStreamM19666j.m19667i();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.f53458b = output.m19638d();
                throw th3;
            }
            this.f53458b = output.m19638d();
            m19704j();
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class EnumEntry extends GeneratedMessageLite.ExtendableMessage<EnumEntry> implements EnumEntryOrBuilder {

        /* JADX INFO: renamed from: i */
        public static final EnumEntry f53502i;

        /* JADX INFO: renamed from: j */
        public static final Parser f53503j = new C61191();

        /* JADX INFO: renamed from: b */
        public final ByteString f53504b;

        /* JADX INFO: renamed from: c */
        public int f53505c;

        /* JADX INFO: renamed from: d */
        public int f53506d;

        /* JADX INFO: renamed from: f */
        public byte f53507f;

        /* JADX INFO: renamed from: g */
        public int f53508g;

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$EnumEntry$1 */
        /* JADX INFO: compiled from: Proguard */
        public static class C61191 extends AbstractParser<EnumEntry> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            /* JADX INFO: renamed from: a */
            public final Object mo19417a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new EnumEntry(codedInputStream, extensionRegistryLite);
            }
        }

        /* JADX INFO: compiled from: Proguard */
        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<EnumEntry, Builder> implements EnumEntryOrBuilder {

            /* JADX INFO: renamed from: d */
            public int f53509d;

            /* JADX INFO: renamed from: f */
            public int f53510f;

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: b */
            public final AbstractMessageLite.Builder mo19418b() {
                Builder builder = new Builder();
                EnumEntry enumEntry = new EnumEntry(this);
                int i = (this.f53509d & 1) != 1 ? 0 : 1;
                enumEntry.f53506d = this.f53510f;
                enumEntry.f53505c = i;
                builder.m19452i(enumEntry);
                return builder;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public final MessageLite build() {
                EnumEntry enumEntry = new EnumEntry(this);
                int i = (this.f53509d & 1) != 1 ? 0 : 1;
                enumEntry.f53506d = this.f53510f;
                enumEntry.f53505c = i;
                if (enumEntry.isInitialized()) {
                    return enumEntry;
                }
                throw new UninitializedMessageException();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: c */
            public final /* bridge */ /* synthetic */ AbstractMessageLite.Builder mo19419c(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                m19453j(codedInputStream, extensionRegistryLite);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            public final Object clone() {
                Builder builder = new Builder();
                EnumEntry enumEntry = new EnumEntry(this);
                int i = (this.f53509d & 1) != 1 ? 0 : 1;
                enumEntry.f53506d = this.f53510f;
                enumEntry.f53505c = i;
                builder.m19452i(enumEntry);
                return builder;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* JADX INFO: renamed from: d */
            public final GeneratedMessageLite.Builder mo19420d() {
                Builder builder = new Builder();
                EnumEntry enumEntry = new EnumEntry(this);
                int i = (this.f53509d & 1) != 1 ? 0 : 1;
                enumEntry.f53506d = this.f53510f;
                enumEntry.f53505c = i;
                builder.m19452i(enumEntry);
                return builder;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* JADX INFO: renamed from: e */
            public final /* bridge */ /* synthetic */ GeneratedMessageLite.Builder mo19421e(GeneratedMessageLite generatedMessageLite) {
                m19452i((EnumEntry) generatedMessageLite);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder
            /* JADX INFO: renamed from: f */
            public final GeneratedMessageLite.ExtendableBuilder mo19437f() {
                Builder builder = new Builder();
                EnumEntry enumEntry = new EnumEntry(this);
                int i = (this.f53509d & 1) != 1 ? 0 : 1;
                enumEntry.f53506d = this.f53510f;
                enumEntry.f53505c = i;
                builder.m19452i(enumEntry);
                return builder;
            }

            /* JADX INFO: renamed from: i */
            public final void m19452i(EnumEntry enumEntry) {
                if (enumEntry == EnumEntry.f53502i) {
                    return;
                }
                if ((enumEntry.f53505c & 1) == 1) {
                    int i = enumEntry.f53506d;
                    this.f53509d = 1 | this.f53509d;
                    this.f53510f = i;
                }
                m19697h(enumEntry);
                this.f54106a = this.f54106a.m19625c(enumEntry.f53504b);
            }

            /* JADX WARN: Removed duplicated region for block: B:14:0x001d  */
            /* JADX INFO: renamed from: j */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void m19453j(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                EnumEntry enumEntry = null;
                try {
                    try {
                        ((C61191) EnumEntry.f53503j).getClass();
                        m19452i(new EnumEntry(codedInputStream, extensionRegistryLite));
                    } catch (InvalidProtocolBufferException e) {
                        EnumEntry enumEntry2 = (EnumEntry) e.f54121a;
                        try {
                            throw e;
                        } catch (Throwable th) {
                            th = th;
                            enumEntry = enumEntry2;
                            if (enumEntry != null) {
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (enumEntry != null) {
                        m19452i(enumEntry);
                    }
                    throw th;
                }
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* JADX INFO: renamed from: n */
            public final /* bridge */ /* synthetic */ MessageLite.Builder mo19425n(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                m19453j(codedInputStream, extensionRegistryLite);
                return this;
            }
        }

        static {
            EnumEntry enumEntry = new EnumEntry();
            f53502i = enumEntry;
            enumEntry.f53506d = 0;
        }

        public EnumEntry(Builder builder) {
            super(builder);
            this.f53507f = (byte) -1;
            this.f53508g = -1;
            this.f53504b = builder.f54106a;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        /* JADX INFO: renamed from: a */
        public final void mo19416a(CodedOutputStream codedOutputStream) {
            getSerializedSize();
            GeneratedMessageLite.ExtendableMessage.ExtensionWriter extensionWriter = new GeneratedMessageLite.ExtendableMessage.ExtensionWriter(this);
            if ((this.f53505c & 1) == 1) {
                codedOutputStream.m19670m(1, this.f53506d);
            }
            extensionWriter.m19707a(200, codedOutputStream);
            codedOutputStream.m19675r(this.f53504b);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final MessageLite getDefaultInstanceForType() {
            return f53502i;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final int getSerializedSize() {
            int i = this.f53508g;
            if (i != -1) {
                return i;
            }
            int size = this.f53504b.size() + m19699e() + ((this.f53505c & 1) == 1 ? CodedOutputStream.m19659b(1, this.f53506d) : 0);
            this.f53508g = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b2 = this.f53507f;
            if (b2 == 1) {
                return true;
            }
            if (b2 == 0) {
                return false;
            }
            if (m19698d()) {
                this.f53507f = (byte) 1;
                return true;
            }
            this.f53507f = (byte) 0;
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final MessageLite.Builder newBuilderForType() {
            return new Builder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final MessageLite.Builder toBuilder() {
            Builder builder = new Builder();
            builder.m19452i(this);
            return builder;
        }

        public EnumEntry() {
            this.f53507f = (byte) -1;
            this.f53508g = -1;
            this.f53504b = ByteString.f54075a;
        }

        public EnumEntry(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            this.f53507f = (byte) -1;
            this.f53508g = -1;
            boolean z2 = false;
            this.f53506d = 0;
            ByteString.Output output = new ByteString.Output();
            CodedOutputStream codedOutputStreamM19666j = CodedOutputStream.m19666j(output, 1);
            while (!z2) {
                try {
                    try {
                        try {
                            int iM19652n = codedInputStream.m19652n();
                            if (iM19652n != 0) {
                                if (iM19652n != 8) {
                                    if (!m19705k(codedInputStream, codedOutputStreamM19666j, extensionRegistryLite, iM19652n)) {
                                    }
                                } else {
                                    this.f53505c |= 1;
                                    this.f53506d = codedInputStream.m19649k();
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
                    try {
                        codedOutputStreamM19666j.m19667i();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.f53504b = output.m19638d();
                        throw th2;
                    }
                    this.f53504b = output.m19638d();
                    m19704j();
                    throw th;
                }
            }
            try {
                codedOutputStreamM19666j.m19667i();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.f53504b = output.m19638d();
                throw th3;
            }
            this.f53504b = output.m19638d();
            m19704j();
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class Package extends GeneratedMessageLite.ExtendableMessage<Package> implements PackageOrBuilder {

        /* JADX INFO: renamed from: p */
        public static final Package f53577p;

        /* JADX INFO: renamed from: q */
        public static final Parser f53578q = new C61251();

        /* JADX INFO: renamed from: b */
        public final ByteString f53579b;

        /* JADX INFO: renamed from: c */
        public int f53580c;

        /* JADX INFO: renamed from: d */
        public List f53581d;

        /* JADX INFO: renamed from: f */
        public List f53582f;

        /* JADX INFO: renamed from: g */
        public List f53583g;

        /* JADX INFO: renamed from: i */
        public TypeTable f53584i;

        /* JADX INFO: renamed from: j */
        public VersionRequirementTable f53585j;

        /* JADX INFO: renamed from: n */
        public byte f53586n;

        /* JADX INFO: renamed from: o */
        public int f53587o;

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Package$1 */
        /* JADX INFO: compiled from: Proguard */
        public static class C61251 extends AbstractParser<Package> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            /* JADX INFO: renamed from: a */
            public final Object mo19417a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new Package(codedInputStream, extensionRegistryLite);
            }
        }

        /* JADX INFO: compiled from: Proguard */
        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<Package, Builder> implements PackageOrBuilder {

            /* JADX INFO: renamed from: d */
            public int f53588d;

            /* JADX INFO: renamed from: f */
            public List f53589f;

            /* JADX INFO: renamed from: g */
            public List f53590g;

            /* JADX INFO: renamed from: i */
            public List f53591i;

            /* JADX INFO: renamed from: j */
            public TypeTable f53592j;

            /* JADX INFO: renamed from: n */
            public VersionRequirementTable f53593n;

            /* JADX INFO: renamed from: j */
            public static Builder m19463j() {
                Builder builder = new Builder();
                List list = Collections.EMPTY_LIST;
                builder.f53589f = list;
                builder.f53590g = list;
                builder.f53591i = list;
                builder.f53592j = TypeTable.f53783i;
                builder.f53593n = VersionRequirementTable.f53842f;
                return builder;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: b */
            public final AbstractMessageLite.Builder mo19418b() {
                Builder builderM19463j = m19463j();
                builderM19463j.m19465k(m19464i());
                return builderM19463j;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public final MessageLite build() {
                Package packageM19464i = m19464i();
                if (packageM19464i.isInitialized()) {
                    return packageM19464i;
                }
                throw new UninitializedMessageException();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: c */
            public final /* bridge */ /* synthetic */ AbstractMessageLite.Builder mo19419c(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                m19466l(codedInputStream, extensionRegistryLite);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            public final Object clone() {
                Builder builderM19463j = m19463j();
                builderM19463j.m19465k(m19464i());
                return builderM19463j;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* JADX INFO: renamed from: d */
            public final GeneratedMessageLite.Builder mo19420d() {
                Builder builderM19463j = m19463j();
                builderM19463j.m19465k(m19464i());
                return builderM19463j;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* JADX INFO: renamed from: e */
            public final /* bridge */ /* synthetic */ GeneratedMessageLite.Builder mo19421e(GeneratedMessageLite generatedMessageLite) {
                m19465k((Package) generatedMessageLite);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder
            /* JADX INFO: renamed from: f */
            public final GeneratedMessageLite.ExtendableBuilder mo19437f() {
                Builder builderM19463j = m19463j();
                builderM19463j.m19465k(m19464i());
                return builderM19463j;
            }

            /* JADX INFO: renamed from: i */
            public final Package m19464i() {
                Package r0 = new Package(this);
                int i = this.f53588d;
                if ((i & 1) == 1) {
                    this.f53589f = Collections.unmodifiableList(this.f53589f);
                    this.f53588d &= -2;
                }
                r0.f53581d = this.f53589f;
                if ((this.f53588d & 2) == 2) {
                    this.f53590g = Collections.unmodifiableList(this.f53590g);
                    this.f53588d &= -3;
                }
                r0.f53582f = this.f53590g;
                if ((this.f53588d & 4) == 4) {
                    this.f53591i = Collections.unmodifiableList(this.f53591i);
                    this.f53588d &= -5;
                }
                r0.f53583g = this.f53591i;
                int i2 = (i & 8) != 8 ? 0 : 1;
                r0.f53584i = this.f53592j;
                if ((i & 16) == 16) {
                    i2 |= 2;
                }
                r0.f53585j = this.f53593n;
                r0.f53580c = i2;
                return r0;
            }

            /* JADX INFO: renamed from: k */
            public final void m19465k(Package r6) {
                VersionRequirementTable versionRequirementTable;
                TypeTable typeTable;
                if (r6 == Package.f53577p) {
                    return;
                }
                if (!r6.f53581d.isEmpty()) {
                    if (this.f53589f.isEmpty()) {
                        this.f53589f = r6.f53581d;
                        this.f53588d &= -2;
                    } else {
                        if ((this.f53588d & 1) != 1) {
                            this.f53589f = new ArrayList(this.f53589f);
                            this.f53588d |= 1;
                        }
                        this.f53589f.addAll(r6.f53581d);
                    }
                }
                if (!r6.f53582f.isEmpty()) {
                    if (this.f53590g.isEmpty()) {
                        this.f53590g = r6.f53582f;
                        this.f53588d &= -3;
                    } else {
                        if ((this.f53588d & 2) != 2) {
                            this.f53590g = new ArrayList(this.f53590g);
                            this.f53588d |= 2;
                        }
                        this.f53590g.addAll(r6.f53582f);
                    }
                }
                if (!r6.f53583g.isEmpty()) {
                    if (this.f53591i.isEmpty()) {
                        this.f53591i = r6.f53583g;
                        this.f53588d &= -5;
                    } else {
                        if ((this.f53588d & 4) != 4) {
                            this.f53591i = new ArrayList(this.f53591i);
                            this.f53588d |= 4;
                        }
                        this.f53591i.addAll(r6.f53583g);
                    }
                }
                if ((r6.f53580c & 1) == 1) {
                    TypeTable typeTable2 = r6.f53584i;
                    if ((this.f53588d & 8) != 8 || (typeTable = this.f53592j) == TypeTable.f53783i) {
                        this.f53592j = typeTable2;
                    } else {
                        TypeTable.Builder builderM19506d = TypeTable.m19506d(typeTable);
                        builderM19506d.m19510i(typeTable2);
                        this.f53592j = builderM19506d.m19509f();
                    }
                    this.f53588d |= 8;
                }
                if ((r6.f53580c & 2) == 2) {
                    VersionRequirementTable versionRequirementTable2 = r6.f53585j;
                    if ((this.f53588d & 16) != 16 || (versionRequirementTable = this.f53593n) == VersionRequirementTable.f53842f) {
                        this.f53593n = versionRequirementTable2;
                    } else {
                        VersionRequirementTable.Builder builder = new VersionRequirementTable.Builder();
                        builder.f53849c = Collections.EMPTY_LIST;
                        builder.m19521h(versionRequirementTable);
                        builder.m19521h(versionRequirementTable2);
                        this.f53593n = builder.m19520f();
                    }
                    this.f53588d |= 16;
                }
                m19697h(r6);
                this.f54106a = this.f54106a.m19625c(r6.f53579b);
            }

            /* JADX WARN: Removed duplicated region for block: B:14:0x001d  */
            /* JADX INFO: renamed from: l */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void m19466l(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                Package r0 = null;
                try {
                    try {
                        ((C61251) Package.f53578q).getClass();
                        m19465k(new Package(codedInputStream, extensionRegistryLite));
                    } catch (InvalidProtocolBufferException e) {
                        Package r4 = (Package) e.f54121a;
                        try {
                            throw e;
                        } catch (Throwable th) {
                            th = th;
                            r0 = r4;
                            if (r0 != null) {
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (r0 != null) {
                        m19465k(r0);
                    }
                    throw th;
                }
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* JADX INFO: renamed from: n */
            public final /* bridge */ /* synthetic */ MessageLite.Builder mo19425n(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                m19466l(codedInputStream, extensionRegistryLite);
                return this;
            }
        }

        static {
            Package r0 = new Package();
            f53577p = r0;
            List list = Collections.EMPTY_LIST;
            r0.f53581d = list;
            r0.f53582f = list;
            r0.f53583g = list;
            r0.f53584i = TypeTable.f53783i;
            r0.f53585j = VersionRequirementTable.f53842f;
        }

        public Package(Builder builder) {
            super(builder);
            this.f53586n = (byte) -1;
            this.f53587o = -1;
            this.f53579b = builder.f54106a;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        /* JADX INFO: renamed from: a */
        public final void mo19416a(CodedOutputStream codedOutputStream) {
            getSerializedSize();
            GeneratedMessageLite.ExtendableMessage.ExtensionWriter extensionWriter = new GeneratedMessageLite.ExtendableMessage.ExtensionWriter(this);
            for (int i = 0; i < this.f53581d.size(); i++) {
                codedOutputStream.m19672o(3, (MessageLite) this.f53581d.get(i));
            }
            for (int i2 = 0; i2 < this.f53582f.size(); i2++) {
                codedOutputStream.m19672o(4, (MessageLite) this.f53582f.get(i2));
            }
            for (int i3 = 0; i3 < this.f53583g.size(); i3++) {
                codedOutputStream.m19672o(5, (MessageLite) this.f53583g.get(i3));
            }
            if ((this.f53580c & 1) == 1) {
                codedOutputStream.m19672o(30, this.f53584i);
            }
            if ((this.f53580c & 2) == 2) {
                codedOutputStream.m19672o(32, this.f53585j);
            }
            extensionWriter.m19707a(200, codedOutputStream);
            codedOutputStream.m19675r(this.f53579b);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final MessageLite getDefaultInstanceForType() {
            return f53577p;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final int getSerializedSize() {
            int i = this.f53587o;
            if (i != -1) {
                return i;
            }
            int iM19661d = 0;
            for (int i2 = 0; i2 < this.f53581d.size(); i2++) {
                iM19661d += CodedOutputStream.m19661d(3, (MessageLite) this.f53581d.get(i2));
            }
            for (int i3 = 0; i3 < this.f53582f.size(); i3++) {
                iM19661d += CodedOutputStream.m19661d(4, (MessageLite) this.f53582f.get(i3));
            }
            for (int i4 = 0; i4 < this.f53583g.size(); i4++) {
                iM19661d += CodedOutputStream.m19661d(5, (MessageLite) this.f53583g.get(i4));
            }
            if ((this.f53580c & 1) == 1) {
                iM19661d += CodedOutputStream.m19661d(30, this.f53584i);
            }
            if ((this.f53580c & 2) == 2) {
                iM19661d += CodedOutputStream.m19661d(32, this.f53585j);
            }
            int size = this.f53579b.size() + m19699e() + iM19661d;
            this.f53587o = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b2 = this.f53586n;
            if (b2 == 1) {
                return true;
            }
            if (b2 == 0) {
                return false;
            }
            for (int i = 0; i < this.f53581d.size(); i++) {
                if (!((Function) this.f53581d.get(i)).isInitialized()) {
                    this.f53586n = (byte) 0;
                    return false;
                }
            }
            for (int i2 = 0; i2 < this.f53582f.size(); i2++) {
                if (!((Property) this.f53582f.get(i2)).isInitialized()) {
                    this.f53586n = (byte) 0;
                    return false;
                }
            }
            for (int i3 = 0; i3 < this.f53583g.size(); i3++) {
                if (!((TypeAlias) this.f53583g.get(i3)).isInitialized()) {
                    this.f53586n = (byte) 0;
                    return false;
                }
            }
            if ((this.f53580c & 1) == 1 && !this.f53584i.isInitialized()) {
                this.f53586n = (byte) 0;
                return false;
            }
            if (m19698d()) {
                this.f53586n = (byte) 1;
                return true;
            }
            this.f53586n = (byte) 0;
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final MessageLite.Builder newBuilderForType() {
            return Builder.m19463j();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final MessageLite.Builder toBuilder() {
            Builder builderM19463j = Builder.m19463j();
            builderM19463j.m19465k(this);
            return builderM19463j;
        }

        public Package() {
            this.f53586n = (byte) -1;
            this.f53587o = -1;
            this.f53579b = ByteString.f54075a;
        }

        public Package(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            this.f53586n = (byte) -1;
            this.f53587o = -1;
            List list = Collections.EMPTY_LIST;
            this.f53581d = list;
            this.f53582f = list;
            this.f53583g = list;
            this.f53584i = TypeTable.f53783i;
            this.f53585j = VersionRequirementTable.f53842f;
            ByteString.Output output = new ByteString.Output();
            CodedOutputStream codedOutputStreamM19666j = CodedOutputStream.m19666j(output, 1);
            boolean z2 = false;
            int i = 0;
            while (!z2) {
                try {
                    try {
                        int iM19652n = codedInputStream.m19652n();
                        if (iM19652n != 0) {
                            if (iM19652n == 26) {
                                int i2 = (i == true ? 1 : 0) & 1;
                                i = i;
                                if (i2 != 1) {
                                    this.f53581d = new ArrayList();
                                    i = (i == true ? 1 : 0) | 1;
                                }
                                this.f53581d.add(codedInputStream.m19645g(Function.f53537A, extensionRegistryLite));
                            } else if (iM19652n == 34) {
                                int i3 = (i == true ? 1 : 0) & 2;
                                i = i;
                                if (i3 != 2) {
                                    this.f53582f = new ArrayList();
                                    i = (i == true ? 1 : 0) | 2;
                                }
                                this.f53582f.add(codedInputStream.m19645g(Property.f53609A, extensionRegistryLite));
                            } else if (iM19652n != 42) {
                                VersionRequirementTable.Builder builder = null;
                                TypeTable.Builder builderM19506d = null;
                                if (iM19652n == 242) {
                                    if ((this.f53580c & 1) == 1) {
                                        TypeTable typeTable = this.f53584i;
                                        typeTable.getClass();
                                        builderM19506d = TypeTable.m19506d(typeTable);
                                    }
                                    TypeTable typeTable2 = (TypeTable) codedInputStream.m19645g(TypeTable.f53784j, extensionRegistryLite);
                                    this.f53584i = typeTable2;
                                    if (builderM19506d != null) {
                                        builderM19506d.m19510i(typeTable2);
                                        this.f53584i = builderM19506d.m19509f();
                                    }
                                    this.f53580c |= 1;
                                } else if (iM19652n != 258) {
                                    if (!m19705k(codedInputStream, codedOutputStreamM19666j, extensionRegistryLite, iM19652n)) {
                                    }
                                } else {
                                    if ((this.f53580c & 2) == 2) {
                                        VersionRequirementTable versionRequirementTable = this.f53585j;
                                        versionRequirementTable.getClass();
                                        builder = new VersionRequirementTable.Builder();
                                        builder.f53849c = Collections.EMPTY_LIST;
                                        builder.m19521h(versionRequirementTable);
                                    }
                                    VersionRequirementTable versionRequirementTable2 = (VersionRequirementTable) codedInputStream.m19645g(VersionRequirementTable.f53843g, extensionRegistryLite);
                                    this.f53585j = versionRequirementTable2;
                                    if (builder != null) {
                                        builder.m19521h(versionRequirementTable2);
                                        this.f53585j = builder.m19520f();
                                    }
                                    this.f53580c |= 2;
                                }
                            } else {
                                int i4 = (i == true ? 1 : 0) & 4;
                                i = i;
                                if (i4 != 4) {
                                    this.f53583g = new ArrayList();
                                    i = (i == true ? 1 : 0) | 4;
                                }
                                this.f53583g.add(codedInputStream.m19645g(TypeAlias.f53734u, extensionRegistryLite));
                            }
                        }
                        z2 = true;
                    } catch (Throwable th) {
                        if (((i == true ? 1 : 0) & 1) == 1) {
                            this.f53581d = Collections.unmodifiableList(this.f53581d);
                        }
                        if (((i == true ? 1 : 0) & 2) == 2) {
                            this.f53582f = Collections.unmodifiableList(this.f53582f);
                        }
                        if (((i == true ? 1 : 0) & 4) == 4) {
                            this.f53583g = Collections.unmodifiableList(this.f53583g);
                        }
                        try {
                            codedOutputStreamM19666j.m19667i();
                        } catch (IOException unused) {
                        } catch (Throwable th2) {
                            this.f53579b = output.m19638d();
                            throw th2;
                        }
                        this.f53579b = output.m19638d();
                        m19704j();
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
            if (((i == true ? 1 : 0) & 1) == 1) {
                this.f53581d = Collections.unmodifiableList(this.f53581d);
            }
            if (((i == true ? 1 : 0) & 2) == 2) {
                this.f53582f = Collections.unmodifiableList(this.f53582f);
            }
            if (((i == true ? 1 : 0) & 4) == 4) {
                this.f53583g = Collections.unmodifiableList(this.f53583g);
            }
            try {
                codedOutputStreamM19666j.m19667i();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.f53579b = output.m19638d();
                throw th3;
            }
            this.f53579b = output.m19638d();
            m19704j();
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class PackageFragment extends GeneratedMessageLite.ExtendableMessage<PackageFragment> implements PackageFragmentOrBuilder {

        /* JADX INFO: renamed from: o */
        public static final PackageFragment f53594o;

        /* JADX INFO: renamed from: p */
        public static final Parser f53595p = new C61261();

        /* JADX INFO: renamed from: b */
        public final ByteString f53596b;

        /* JADX INFO: renamed from: c */
        public int f53597c;

        /* JADX INFO: renamed from: d */
        public StringTable f53598d;

        /* JADX INFO: renamed from: f */
        public QualifiedNameTable f53599f;

        /* JADX INFO: renamed from: g */
        public Package f53600g;

        /* JADX INFO: renamed from: i */
        public List f53601i;

        /* JADX INFO: renamed from: j */
        public byte f53602j;

        /* JADX INFO: renamed from: n */
        public int f53603n;

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$PackageFragment$1 */
        /* JADX INFO: compiled from: Proguard */
        public static class C61261 extends AbstractParser<PackageFragment> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            /* JADX INFO: renamed from: a */
            public final Object mo19417a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new PackageFragment(codedInputStream, extensionRegistryLite);
            }
        }

        /* JADX INFO: compiled from: Proguard */
        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<PackageFragment, Builder> implements PackageFragmentOrBuilder {

            /* JADX INFO: renamed from: d */
            public int f53604d;

            /* JADX INFO: renamed from: f */
            public StringTable f53605f;

            /* JADX INFO: renamed from: g */
            public QualifiedNameTable f53606g;

            /* JADX INFO: renamed from: i */
            public Package f53607i;

            /* JADX INFO: renamed from: j */
            public List f53608j;

            /* JADX INFO: renamed from: j */
            public static Builder m19467j() {
                Builder builder = new Builder();
                builder.f53605f = StringTable.f53671f;
                builder.f53606g = QualifiedNameTable.f53645f;
                builder.f53607i = Package.f53577p;
                builder.f53608j = Collections.EMPTY_LIST;
                return builder;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: b */
            public final AbstractMessageLite.Builder mo19418b() {
                Builder builderM19467j = m19467j();
                builderM19467j.m19469k(m19468i());
                return builderM19467j;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public final MessageLite build() {
                PackageFragment packageFragmentM19468i = m19468i();
                if (packageFragmentM19468i.isInitialized()) {
                    return packageFragmentM19468i;
                }
                throw new UninitializedMessageException();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: c */
            public final /* bridge */ /* synthetic */ AbstractMessageLite.Builder mo19419c(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                m19470l(codedInputStream, extensionRegistryLite);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            public final Object clone() {
                Builder builderM19467j = m19467j();
                builderM19467j.m19469k(m19468i());
                return builderM19467j;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* JADX INFO: renamed from: d */
            public final GeneratedMessageLite.Builder mo19420d() {
                Builder builderM19467j = m19467j();
                builderM19467j.m19469k(m19468i());
                return builderM19467j;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* JADX INFO: renamed from: e */
            public final /* bridge */ /* synthetic */ GeneratedMessageLite.Builder mo19421e(GeneratedMessageLite generatedMessageLite) {
                m19469k((PackageFragment) generatedMessageLite);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder
            /* JADX INFO: renamed from: f */
            public final GeneratedMessageLite.ExtendableBuilder mo19437f() {
                Builder builderM19467j = m19467j();
                builderM19467j.m19469k(m19468i());
                return builderM19467j;
            }

            /* JADX INFO: renamed from: i */
            public final PackageFragment m19468i() {
                PackageFragment packageFragment = new PackageFragment(this);
                int i = this.f53604d;
                int i2 = (i & 1) != 1 ? 0 : 1;
                packageFragment.f53598d = this.f53605f;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                packageFragment.f53599f = this.f53606g;
                if ((i & 4) == 4) {
                    i2 |= 4;
                }
                packageFragment.f53600g = this.f53607i;
                if ((i & 8) == 8) {
                    this.f53608j = Collections.unmodifiableList(this.f53608j);
                    this.f53604d &= -9;
                }
                packageFragment.f53601i = this.f53608j;
                packageFragment.f53597c = i2;
                return packageFragment;
            }

            /* JADX INFO: renamed from: k */
            public final void m19469k(PackageFragment packageFragment) {
                Package r2;
                QualifiedNameTable qualifiedNameTable;
                StringTable stringTable;
                if (packageFragment == PackageFragment.f53594o) {
                    return;
                }
                if ((packageFragment.f53597c & 1) == 1) {
                    StringTable stringTable2 = packageFragment.f53598d;
                    if ((this.f53604d & 1) != 1 || (stringTable = this.f53605f) == StringTable.f53671f) {
                        this.f53605f = stringTable2;
                    } else {
                        StringTable.Builder builder = new StringTable.Builder();
                        builder.f53678c = LazyStringArrayList.f54125b;
                        builder.m19484h(stringTable);
                        builder.m19484h(stringTable2);
                        this.f53605f = builder.m19483f();
                    }
                    this.f53604d |= 1;
                }
                if ((packageFragment.f53597c & 2) == 2) {
                    QualifiedNameTable qualifiedNameTable2 = packageFragment.f53599f;
                    if ((this.f53604d & 2) != 2 || (qualifiedNameTable = this.f53606g) == QualifiedNameTable.f53645f) {
                        this.f53606g = qualifiedNameTable2;
                    } else {
                        QualifiedNameTable.Builder builder2 = new QualifiedNameTable.Builder();
                        builder2.f53652c = Collections.EMPTY_LIST;
                        builder2.m19477h(qualifiedNameTable);
                        builder2.m19477h(qualifiedNameTable2);
                        this.f53606g = builder2.m19476f();
                    }
                    this.f53604d |= 2;
                }
                if ((packageFragment.f53597c & 4) == 4) {
                    Package r0 = packageFragment.f53600g;
                    if ((this.f53604d & 4) != 4 || (r2 = this.f53607i) == Package.f53577p) {
                        this.f53607i = r0;
                    } else {
                        Package.Builder builderM19463j = Package.Builder.m19463j();
                        builderM19463j.m19465k(r2);
                        builderM19463j.m19465k(r0);
                        this.f53607i = builderM19463j.m19464i();
                    }
                    this.f53604d |= 4;
                }
                if (!packageFragment.f53601i.isEmpty()) {
                    if (this.f53608j.isEmpty()) {
                        this.f53608j = packageFragment.f53601i;
                        this.f53604d &= -9;
                    } else {
                        if ((this.f53604d & 8) != 8) {
                            this.f53608j = new ArrayList(this.f53608j);
                            this.f53604d |= 8;
                        }
                        this.f53608j.addAll(packageFragment.f53601i);
                    }
                }
                m19697h(packageFragment);
                this.f54106a = this.f54106a.m19625c(packageFragment.f53596b);
            }

            /* JADX WARN: Removed duplicated region for block: B:14:0x001d  */
            /* JADX INFO: renamed from: l */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void m19470l(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                PackageFragment packageFragment = null;
                try {
                    try {
                        ((C61261) PackageFragment.f53595p).getClass();
                        m19469k(new PackageFragment(codedInputStream, extensionRegistryLite));
                    } catch (InvalidProtocolBufferException e) {
                        PackageFragment packageFragment2 = (PackageFragment) e.f54121a;
                        try {
                            throw e;
                        } catch (Throwable th) {
                            th = th;
                            packageFragment = packageFragment2;
                            if (packageFragment != null) {
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (packageFragment != null) {
                        m19469k(packageFragment);
                    }
                    throw th;
                }
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* JADX INFO: renamed from: n */
            public final /* bridge */ /* synthetic */ MessageLite.Builder mo19425n(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                m19470l(codedInputStream, extensionRegistryLite);
                return this;
            }
        }

        static {
            PackageFragment packageFragment = new PackageFragment();
            f53594o = packageFragment;
            packageFragment.f53598d = StringTable.f53671f;
            packageFragment.f53599f = QualifiedNameTable.f53645f;
            packageFragment.f53600g = Package.f53577p;
            packageFragment.f53601i = Collections.EMPTY_LIST;
        }

        public PackageFragment(Builder builder) {
            super(builder);
            this.f53602j = (byte) -1;
            this.f53603n = -1;
            this.f53596b = builder.f54106a;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        /* JADX INFO: renamed from: a */
        public final void mo19416a(CodedOutputStream codedOutputStream) {
            getSerializedSize();
            GeneratedMessageLite.ExtendableMessage.ExtensionWriter extensionWriter = new GeneratedMessageLite.ExtendableMessage.ExtensionWriter(this);
            if ((this.f53597c & 1) == 1) {
                codedOutputStream.m19672o(1, this.f53598d);
            }
            if ((this.f53597c & 2) == 2) {
                codedOutputStream.m19672o(2, this.f53599f);
            }
            if ((this.f53597c & 4) == 4) {
                codedOutputStream.m19672o(3, this.f53600g);
            }
            for (int i = 0; i < this.f53601i.size(); i++) {
                codedOutputStream.m19672o(4, (MessageLite) this.f53601i.get(i));
            }
            extensionWriter.m19707a(200, codedOutputStream);
            codedOutputStream.m19675r(this.f53596b);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final MessageLite getDefaultInstanceForType() {
            return f53594o;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final int getSerializedSize() {
            int i = this.f53603n;
            if (i != -1) {
                return i;
            }
            int iM19661d = (this.f53597c & 1) == 1 ? CodedOutputStream.m19661d(1, this.f53598d) : 0;
            if ((this.f53597c & 2) == 2) {
                iM19661d += CodedOutputStream.m19661d(2, this.f53599f);
            }
            if ((this.f53597c & 4) == 4) {
                iM19661d += CodedOutputStream.m19661d(3, this.f53600g);
            }
            for (int i2 = 0; i2 < this.f53601i.size(); i2++) {
                iM19661d += CodedOutputStream.m19661d(4, (MessageLite) this.f53601i.get(i2));
            }
            int size = this.f53596b.size() + m19699e() + iM19661d;
            this.f53603n = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b2 = this.f53602j;
            if (b2 == 1) {
                return true;
            }
            if (b2 == 0) {
                return false;
            }
            if ((this.f53597c & 2) == 2 && !this.f53599f.isInitialized()) {
                this.f53602j = (byte) 0;
                return false;
            }
            if ((this.f53597c & 4) == 4 && !this.f53600g.isInitialized()) {
                this.f53602j = (byte) 0;
                return false;
            }
            for (int i = 0; i < this.f53601i.size(); i++) {
                if (!((Class) this.f53601i.get(i)).isInitialized()) {
                    this.f53602j = (byte) 0;
                    return false;
                }
            }
            if (m19698d()) {
                this.f53602j = (byte) 1;
                return true;
            }
            this.f53602j = (byte) 0;
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final MessageLite.Builder newBuilderForType() {
            return Builder.m19467j();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final MessageLite.Builder toBuilder() {
            Builder builderM19467j = Builder.m19467j();
            builderM19467j.m19469k(this);
            return builderM19467j;
        }

        public PackageFragment() {
            this.f53602j = (byte) -1;
            this.f53603n = -1;
            this.f53596b = ByteString.f54075a;
        }

        public PackageFragment(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            this.f53602j = (byte) -1;
            this.f53603n = -1;
            this.f53598d = StringTable.f53671f;
            this.f53599f = QualifiedNameTable.f53645f;
            this.f53600g = Package.f53577p;
            this.f53601i = Collections.EMPTY_LIST;
            ByteString.Output output = new ByteString.Output();
            CodedOutputStream codedOutputStreamM19666j = CodedOutputStream.m19666j(output, 1);
            boolean z2 = false;
            char c2 = 0;
            while (!z2) {
                try {
                    try {
                        int iM19652n = codedInputStream.m19652n();
                        if (iM19652n != 0) {
                            Package.Builder builderM19463j = null;
                            StringTable.Builder builder = null;
                            QualifiedNameTable.Builder builder2 = null;
                            if (iM19652n == 10) {
                                if ((this.f53597c & 1) == 1) {
                                    StringTable stringTable = this.f53598d;
                                    stringTable.getClass();
                                    builder = new StringTable.Builder();
                                    builder.f53678c = LazyStringArrayList.f54125b;
                                    builder.m19484h(stringTable);
                                }
                                StringTable stringTable2 = (StringTable) codedInputStream.m19645g(StringTable.f53672g, extensionRegistryLite);
                                this.f53598d = stringTable2;
                                if (builder != null) {
                                    builder.m19484h(stringTable2);
                                    this.f53598d = builder.m19483f();
                                }
                                this.f53597c |= 1;
                            } else if (iM19652n == 18) {
                                if ((this.f53597c & 2) == 2) {
                                    QualifiedNameTable qualifiedNameTable = this.f53599f;
                                    qualifiedNameTable.getClass();
                                    builder2 = new QualifiedNameTable.Builder();
                                    builder2.f53652c = Collections.EMPTY_LIST;
                                    builder2.m19477h(qualifiedNameTable);
                                }
                                QualifiedNameTable qualifiedNameTable2 = (QualifiedNameTable) codedInputStream.m19645g(QualifiedNameTable.f53646g, extensionRegistryLite);
                                this.f53599f = qualifiedNameTable2;
                                if (builder2 != null) {
                                    builder2.m19477h(qualifiedNameTable2);
                                    this.f53599f = builder2.m19476f();
                                }
                                this.f53597c |= 2;
                            } else if (iM19652n == 26) {
                                if ((this.f53597c & 4) == 4) {
                                    Package r6 = this.f53600g;
                                    r6.getClass();
                                    builderM19463j = Package.Builder.m19463j();
                                    builderM19463j.m19465k(r6);
                                }
                                Package r62 = (Package) codedInputStream.m19645g(Package.f53578q, extensionRegistryLite);
                                this.f53600g = r62;
                                if (builderM19463j != null) {
                                    builderM19463j.m19465k(r62);
                                    this.f53600g = builderM19463j.m19464i();
                                }
                                this.f53597c |= 4;
                            } else if (iM19652n != 34) {
                                if (!m19705k(codedInputStream, codedOutputStreamM19666j, extensionRegistryLite, iM19652n)) {
                                }
                            } else {
                                int i = (c2 == true ? 1 : 0) & '\b';
                                c2 = c2;
                                if (i != 8) {
                                    this.f53601i = new ArrayList();
                                    c2 = '\b';
                                }
                                this.f53601i.add(codedInputStream.m19645g(Class.f53389P, extensionRegistryLite));
                            }
                        }
                        z2 = true;
                    } catch (Throwable th) {
                        if (((c2 == true ? 1 : 0) & '\b') == 8) {
                            this.f53601i = Collections.unmodifiableList(this.f53601i);
                        }
                        try {
                            codedOutputStreamM19666j.m19667i();
                        } catch (IOException unused) {
                        } catch (Throwable th2) {
                            this.f53596b = output.m19638d();
                            throw th2;
                        }
                        this.f53596b = output.m19638d();
                        m19704j();
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
            if (((c2 == true ? 1 : 0) & '\b') == 8) {
                this.f53601i = Collections.unmodifiableList(this.f53601i);
            }
            try {
                codedOutputStreamM19666j.m19667i();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.f53596b = output.m19638d();
                throw th3;
            }
            this.f53596b = output.m19638d();
            m19704j();
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class TypeAlias extends GeneratedMessageLite.ExtendableMessage<TypeAlias> implements TypeAliasOrBuilder {

        /* JADX INFO: renamed from: t */
        public static final TypeAlias f53733t;

        /* JADX INFO: renamed from: u */
        public static final Parser f53734u = new C61351();

        /* JADX INFO: renamed from: b */
        public final ByteString f53735b;

        /* JADX INFO: renamed from: c */
        public int f53736c;

        /* JADX INFO: renamed from: d */
        public int f53737d;

        /* JADX INFO: renamed from: f */
        public int f53738f;

        /* JADX INFO: renamed from: g */
        public List f53739g;

        /* JADX INFO: renamed from: i */
        public Type f53740i;

        /* JADX INFO: renamed from: j */
        public int f53741j;

        /* JADX INFO: renamed from: n */
        public Type f53742n;

        /* JADX INFO: renamed from: o */
        public int f53743o;

        /* JADX INFO: renamed from: p */
        public List f53744p;

        /* JADX INFO: renamed from: q */
        public List f53745q;

        /* JADX INFO: renamed from: r */
        public byte f53746r;

        /* JADX INFO: renamed from: s */
        public int f53747s;

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeAlias$1 */
        /* JADX INFO: compiled from: Proguard */
        public static class C61351 extends AbstractParser<TypeAlias> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            /* JADX INFO: renamed from: a */
            public final Object mo19417a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new TypeAlias(codedInputStream, extensionRegistryLite);
            }
        }

        /* JADX INFO: compiled from: Proguard */
        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<TypeAlias, Builder> implements TypeAliasOrBuilder {

            /* JADX INFO: renamed from: d */
            public int f53748d;

            /* JADX INFO: renamed from: f */
            public int f53749f;

            /* JADX INFO: renamed from: g */
            public int f53750g;

            /* JADX INFO: renamed from: i */
            public List f53751i;

            /* JADX INFO: renamed from: j */
            public Type f53752j;

            /* JADX INFO: renamed from: n */
            public int f53753n;

            /* JADX INFO: renamed from: o */
            public Type f53754o;

            /* JADX INFO: renamed from: p */
            public int f53755p;

            /* JADX INFO: renamed from: q */
            public List f53756q;

            /* JADX INFO: renamed from: r */
            public List f53757r;

            /* JADX INFO: renamed from: j */
            public static Builder m19498j() {
                Builder builder = new Builder();
                builder.f53749f = 6;
                List list = Collections.EMPTY_LIST;
                builder.f53751i = list;
                Type type = Type.f53679y;
                builder.f53752j = type;
                builder.f53754o = type;
                builder.f53756q = list;
                builder.f53757r = list;
                return builder;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: b */
            public final AbstractMessageLite.Builder mo19418b() {
                Builder builderM19498j = m19498j();
                builderM19498j.m19500k(m19499i());
                return builderM19498j;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public final MessageLite build() {
                TypeAlias typeAliasM19499i = m19499i();
                if (typeAliasM19499i.isInitialized()) {
                    return typeAliasM19499i;
                }
                throw new UninitializedMessageException();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: c */
            public final /* bridge */ /* synthetic */ AbstractMessageLite.Builder mo19419c(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                m19501l(codedInputStream, extensionRegistryLite);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            public final Object clone() {
                Builder builderM19498j = m19498j();
                builderM19498j.m19500k(m19499i());
                return builderM19498j;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* JADX INFO: renamed from: d */
            public final GeneratedMessageLite.Builder mo19420d() {
                Builder builderM19498j = m19498j();
                builderM19498j.m19500k(m19499i());
                return builderM19498j;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* JADX INFO: renamed from: e */
            public final /* bridge */ /* synthetic */ GeneratedMessageLite.Builder mo19421e(GeneratedMessageLite generatedMessageLite) {
                m19500k((TypeAlias) generatedMessageLite);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder
            /* JADX INFO: renamed from: f */
            public final GeneratedMessageLite.ExtendableBuilder mo19437f() {
                Builder builderM19498j = m19498j();
                builderM19498j.m19500k(m19499i());
                return builderM19498j;
            }

            /* JADX INFO: renamed from: i */
            public final TypeAlias m19499i() {
                TypeAlias typeAlias = new TypeAlias(this);
                int i = this.f53748d;
                int i2 = (i & 1) != 1 ? 0 : 1;
                typeAlias.f53737d = this.f53749f;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                typeAlias.f53738f = this.f53750g;
                if ((i & 4) == 4) {
                    this.f53751i = Collections.unmodifiableList(this.f53751i);
                    this.f53748d &= -5;
                }
                typeAlias.f53739g = this.f53751i;
                if ((i & 8) == 8) {
                    i2 |= 4;
                }
                typeAlias.f53740i = this.f53752j;
                if ((i & 16) == 16) {
                    i2 |= 8;
                }
                typeAlias.f53741j = this.f53753n;
                if ((i & 32) == 32) {
                    i2 |= 16;
                }
                typeAlias.f53742n = this.f53754o;
                if ((i & 64) == 64) {
                    i2 |= 32;
                }
                typeAlias.f53743o = this.f53755p;
                if ((this.f53748d & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) == 128) {
                    this.f53756q = Collections.unmodifiableList(this.f53756q);
                    this.f53748d &= -129;
                }
                typeAlias.f53744p = this.f53756q;
                if ((this.f53748d & 256) == 256) {
                    this.f53757r = Collections.unmodifiableList(this.f53757r);
                    this.f53748d &= -257;
                }
                typeAlias.f53745q = this.f53757r;
                typeAlias.f53736c = i2;
                return typeAlias;
            }

            /* JADX INFO: renamed from: k */
            public final void m19500k(TypeAlias typeAlias) {
                Type type;
                Type type2;
                if (typeAlias == TypeAlias.f53733t) {
                    return;
                }
                int i = typeAlias.f53736c;
                if ((i & 1) == 1) {
                    int i2 = typeAlias.f53737d;
                    this.f53748d = 1 | this.f53748d;
                    this.f53749f = i2;
                }
                if ((i & 2) == 2) {
                    int i3 = typeAlias.f53738f;
                    this.f53748d = 2 | this.f53748d;
                    this.f53750g = i3;
                }
                if (!typeAlias.f53739g.isEmpty()) {
                    if (this.f53751i.isEmpty()) {
                        this.f53751i = typeAlias.f53739g;
                        this.f53748d &= -5;
                    } else {
                        if ((this.f53748d & 4) != 4) {
                            this.f53751i = new ArrayList(this.f53751i);
                            this.f53748d |= 4;
                        }
                        this.f53751i.addAll(typeAlias.f53739g);
                    }
                }
                if ((typeAlias.f53736c & 4) == 4) {
                    Type type3 = typeAlias.f53740i;
                    if ((this.f53748d & 8) != 8 || (type2 = this.f53752j) == Type.f53679y) {
                        this.f53752j = type3;
                    } else {
                        Type.Builder builderM19486p = Type.m19486p(type2);
                        builderM19486p.m19496k(type3);
                        this.f53752j = builderM19486p.m19495i();
                    }
                    this.f53748d |= 8;
                }
                int i4 = typeAlias.f53736c;
                if ((i4 & 8) == 8) {
                    int i5 = typeAlias.f53741j;
                    this.f53748d |= 16;
                    this.f53753n = i5;
                }
                if ((i4 & 16) == 16) {
                    Type type4 = typeAlias.f53742n;
                    if ((this.f53748d & 32) != 32 || (type = this.f53754o) == Type.f53679y) {
                        this.f53754o = type4;
                    } else {
                        Type.Builder builderM19486p2 = Type.m19486p(type);
                        builderM19486p2.m19496k(type4);
                        this.f53754o = builderM19486p2.m19495i();
                    }
                    this.f53748d |= 32;
                }
                if ((typeAlias.f53736c & 32) == 32) {
                    int i6 = typeAlias.f53743o;
                    this.f53748d |= 64;
                    this.f53755p = i6;
                }
                if (!typeAlias.f53744p.isEmpty()) {
                    if (this.f53756q.isEmpty()) {
                        this.f53756q = typeAlias.f53744p;
                        this.f53748d &= -129;
                    } else {
                        if ((this.f53748d & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 128) {
                            this.f53756q = new ArrayList(this.f53756q);
                            this.f53748d |= UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                        }
                        this.f53756q.addAll(typeAlias.f53744p);
                    }
                }
                if (!typeAlias.f53745q.isEmpty()) {
                    if (this.f53757r.isEmpty()) {
                        this.f53757r = typeAlias.f53745q;
                        this.f53748d &= -257;
                    } else {
                        if ((this.f53748d & 256) != 256) {
                            this.f53757r = new ArrayList(this.f53757r);
                            this.f53748d |= 256;
                        }
                        this.f53757r.addAll(typeAlias.f53745q);
                    }
                }
                m19697h(typeAlias);
                this.f54106a = this.f54106a.m19625c(typeAlias.f53735b);
            }

            /* JADX WARN: Removed duplicated region for block: B:14:0x001d  */
            /* JADX INFO: renamed from: l */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void m19501l(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                TypeAlias typeAlias = null;
                try {
                    try {
                        ((C61351) TypeAlias.f53734u).getClass();
                        m19500k(new TypeAlias(codedInputStream, extensionRegistryLite));
                    } catch (InvalidProtocolBufferException e) {
                        TypeAlias typeAlias2 = (TypeAlias) e.f54121a;
                        try {
                            throw e;
                        } catch (Throwable th) {
                            th = th;
                            typeAlias = typeAlias2;
                            if (typeAlias != null) {
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (typeAlias != null) {
                        m19500k(typeAlias);
                    }
                    throw th;
                }
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* JADX INFO: renamed from: n */
            public final /* bridge */ /* synthetic */ MessageLite.Builder mo19425n(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                m19501l(codedInputStream, extensionRegistryLite);
                return this;
            }
        }

        static {
            TypeAlias typeAlias = new TypeAlias();
            f53733t = typeAlias;
            typeAlias.f53737d = 6;
            typeAlias.f53738f = 0;
            List list = Collections.EMPTY_LIST;
            typeAlias.f53739g = list;
            Type type = Type.f53679y;
            typeAlias.f53740i = type;
            typeAlias.f53741j = 0;
            typeAlias.f53742n = type;
            typeAlias.f53743o = 0;
            typeAlias.f53744p = list;
            typeAlias.f53745q = list;
        }

        public TypeAlias(Builder builder) {
            super(builder);
            this.f53746r = (byte) -1;
            this.f53747s = -1;
            this.f53735b = builder.f54106a;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        /* JADX INFO: renamed from: a */
        public final void mo19416a(CodedOutputStream codedOutputStream) {
            getSerializedSize();
            GeneratedMessageLite.ExtendableMessage.ExtensionWriter extensionWriter = new GeneratedMessageLite.ExtendableMessage.ExtensionWriter(this);
            if ((this.f53736c & 1) == 1) {
                codedOutputStream.m19670m(1, this.f53737d);
            }
            if ((this.f53736c & 2) == 2) {
                codedOutputStream.m19670m(2, this.f53738f);
            }
            for (int i = 0; i < this.f53739g.size(); i++) {
                codedOutputStream.m19672o(3, (MessageLite) this.f53739g.get(i));
            }
            if ((this.f53736c & 4) == 4) {
                codedOutputStream.m19672o(4, this.f53740i);
            }
            if ((this.f53736c & 8) == 8) {
                codedOutputStream.m19670m(5, this.f53741j);
            }
            if ((this.f53736c & 16) == 16) {
                codedOutputStream.m19672o(6, this.f53742n);
            }
            if ((this.f53736c & 32) == 32) {
                codedOutputStream.m19670m(7, this.f53743o);
            }
            for (int i2 = 0; i2 < this.f53744p.size(); i2++) {
                codedOutputStream.m19672o(8, (MessageLite) this.f53744p.get(i2));
            }
            for (int i3 = 0; i3 < this.f53745q.size(); i3++) {
                codedOutputStream.m19670m(31, ((Integer) this.f53745q.get(i3)).intValue());
            }
            extensionWriter.m19707a(200, codedOutputStream);
            codedOutputStream.m19675r(this.f53735b);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final MessageLite getDefaultInstanceForType() {
            return f53733t;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final int getSerializedSize() {
            int i = this.f53747s;
            if (i != -1) {
                return i;
            }
            int iM19659b = (this.f53736c & 1) == 1 ? CodedOutputStream.m19659b(1, this.f53737d) : 0;
            if ((this.f53736c & 2) == 2) {
                iM19659b += CodedOutputStream.m19659b(2, this.f53738f);
            }
            for (int i2 = 0; i2 < this.f53739g.size(); i2++) {
                iM19659b += CodedOutputStream.m19661d(3, (MessageLite) this.f53739g.get(i2));
            }
            if ((this.f53736c & 4) == 4) {
                iM19659b += CodedOutputStream.m19661d(4, this.f53740i);
            }
            if ((this.f53736c & 8) == 8) {
                iM19659b += CodedOutputStream.m19659b(5, this.f53741j);
            }
            if ((this.f53736c & 16) == 16) {
                iM19659b += CodedOutputStream.m19661d(6, this.f53742n);
            }
            if ((this.f53736c & 32) == 32) {
                iM19659b += CodedOutputStream.m19659b(7, this.f53743o);
            }
            for (int i3 = 0; i3 < this.f53744p.size(); i3++) {
                iM19659b += CodedOutputStream.m19661d(8, (MessageLite) this.f53744p.get(i3));
            }
            int iM19660c = 0;
            for (int i4 = 0; i4 < this.f53745q.size(); i4++) {
                iM19660c += CodedOutputStream.m19660c(((Integer) this.f53745q.get(i4)).intValue());
            }
            int size = this.f53735b.size() + m19699e() + AbstractC0455a.m2225D(this.f53745q, 2, iM19659b + iM19660c);
            this.f53747s = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b2 = this.f53746r;
            if (b2 == 1) {
                return true;
            }
            if (b2 == 0) {
                return false;
            }
            if ((this.f53736c & 2) != 2) {
                this.f53746r = (byte) 0;
                return false;
            }
            for (int i = 0; i < this.f53739g.size(); i++) {
                if (!((TypeParameter) this.f53739g.get(i)).isInitialized()) {
                    this.f53746r = (byte) 0;
                    return false;
                }
            }
            if ((this.f53736c & 4) == 4 && !this.f53740i.isInitialized()) {
                this.f53746r = (byte) 0;
                return false;
            }
            if ((this.f53736c & 16) == 16 && !this.f53742n.isInitialized()) {
                this.f53746r = (byte) 0;
                return false;
            }
            for (int i2 = 0; i2 < this.f53744p.size(); i2++) {
                if (!((Annotation) this.f53744p.get(i2)).isInitialized()) {
                    this.f53746r = (byte) 0;
                    return false;
                }
            }
            if (m19698d()) {
                this.f53746r = (byte) 1;
                return true;
            }
            this.f53746r = (byte) 0;
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final MessageLite.Builder newBuilderForType() {
            return Builder.m19498j();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final MessageLite.Builder toBuilder() {
            Builder builderM19498j = Builder.m19498j();
            builderM19498j.m19500k(this);
            return builderM19498j;
        }

        public TypeAlias() {
            this.f53746r = (byte) -1;
            this.f53747s = -1;
            this.f53735b = ByteString.f54075a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r5v0 */
        /* JADX WARN: Type inference failed for: r5v1 */
        /* JADX WARN: Type inference failed for: r5v2, types: [boolean] */
        public TypeAlias(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            this.f53746r = (byte) -1;
            this.f53747s = -1;
            this.f53737d = 6;
            boolean z2 = false;
            this.f53738f = 0;
            List list = Collections.EMPTY_LIST;
            this.f53739g = list;
            Type type = Type.f53679y;
            this.f53740i = type;
            this.f53741j = 0;
            this.f53742n = type;
            this.f53743o = 0;
            this.f53744p = list;
            this.f53745q = list;
            ByteString.Output output = new ByteString.Output();
            CodedOutputStream codedOutputStreamM19666j = CodedOutputStream.m19666j(output, 1);
            int i = 0;
            while (true) {
                ?? M19705k = 128;
                if (!z2) {
                    try {
                        try {
                            int iM19652n = codedInputStream.m19652n();
                            Type.Builder builderM19486p = null;
                            switch (iM19652n) {
                                case 0:
                                    z2 = true;
                                    break;
                                case 8:
                                    this.f53736c |= 1;
                                    this.f53737d = codedInputStream.m19649k();
                                    break;
                                case 16:
                                    this.f53736c |= 2;
                                    this.f53738f = codedInputStream.m19649k();
                                    break;
                                case 26:
                                    if ((i & 4) != 4) {
                                        this.f53739g = new ArrayList();
                                        i |= 4;
                                    }
                                    this.f53739g.add(codedInputStream.m19645g(TypeParameter.f53759s, extensionRegistryLite));
                                    break;
                                case 34:
                                    if ((this.f53736c & 4) == 4) {
                                        Type type2 = this.f53740i;
                                        type2.getClass();
                                        builderM19486p = Type.m19486p(type2);
                                    }
                                    Type type3 = (Type) codedInputStream.m19645g(Type.f53680z, extensionRegistryLite);
                                    this.f53740i = type3;
                                    if (builderM19486p != null) {
                                        builderM19486p.m19496k(type3);
                                        this.f53740i = builderM19486p.m19495i();
                                    }
                                    this.f53736c |= 4;
                                    break;
                                case 40:
                                    this.f53736c |= 8;
                                    this.f53741j = codedInputStream.m19649k();
                                    break;
                                case 50:
                                    if ((this.f53736c & 16) == 16) {
                                        Type type4 = this.f53742n;
                                        type4.getClass();
                                        builderM19486p = Type.m19486p(type4);
                                    }
                                    Type type5 = (Type) codedInputStream.m19645g(Type.f53680z, extensionRegistryLite);
                                    this.f53742n = type5;
                                    if (builderM19486p != null) {
                                        builderM19486p.m19496k(type5);
                                        this.f53742n = builderM19486p.m19495i();
                                    }
                                    this.f53736c |= 16;
                                    break;
                                case 56:
                                    this.f53736c |= 32;
                                    this.f53743o = codedInputStream.m19649k();
                                    break;
                                case 66:
                                    if ((i & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 128) {
                                        this.f53744p = new ArrayList();
                                        i |= UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                                    }
                                    this.f53744p.add(codedInputStream.m19645g(Annotation.f53323j, extensionRegistryLite));
                                    break;
                                case 248:
                                    if ((i & 256) != 256) {
                                        this.f53745q = new ArrayList();
                                        i |= 256;
                                    }
                                    this.f53745q.add(Integer.valueOf(codedInputStream.m19649k()));
                                    break;
                                case 250:
                                    int iM19642d = codedInputStream.m19642d(codedInputStream.m19649k());
                                    if ((i & 256) != 256 && codedInputStream.m19640b() > 0) {
                                        this.f53745q = new ArrayList();
                                        i |= 256;
                                    }
                                    while (codedInputStream.m19640b() > 0) {
                                        this.f53745q.add(Integer.valueOf(codedInputStream.m19649k()));
                                    }
                                    codedInputStream.m19641c(iM19642d);
                                    break;
                                default:
                                    M19705k = m19705k(codedInputStream, codedOutputStreamM19666j, extensionRegistryLite, iM19652n);
                                    if (M19705k == 0) {
                                        z2 = true;
                                    }
                                    break;
                            }
                        } catch (Throwable th) {
                            if ((i & 4) == 4) {
                                this.f53739g = Collections.unmodifiableList(this.f53739g);
                            }
                            if ((i & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) == M19705k) {
                                this.f53744p = Collections.unmodifiableList(this.f53744p);
                            }
                            if ((i & 256) == 256) {
                                this.f53745q = Collections.unmodifiableList(this.f53745q);
                            }
                            try {
                                codedOutputStreamM19666j.m19667i();
                            } catch (IOException unused) {
                            } catch (Throwable th2) {
                                this.f53735b = output.m19638d();
                                throw th2;
                            }
                            this.f53735b = output.m19638d();
                            m19704j();
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
                } else {
                    if ((i & 4) == 4) {
                        this.f53739g = Collections.unmodifiableList(this.f53739g);
                    }
                    if ((i & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) == 128) {
                        this.f53744p = Collections.unmodifiableList(this.f53744p);
                    }
                    if ((i & 256) == 256) {
                        this.f53745q = Collections.unmodifiableList(this.f53745q);
                    }
                    try {
                        codedOutputStreamM19666j.m19667i();
                    } catch (IOException unused2) {
                    } catch (Throwable th3) {
                        this.f53735b = output.m19638d();
                        throw th3;
                    }
                    this.f53735b = output.m19638d();
                    m19704j();
                    return;
                }
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class ValueParameter extends GeneratedMessageLite.ExtendableMessage<ValueParameter> implements ValueParameterOrBuilder {

        /* JADX INFO: renamed from: q */
        public static final ValueParameter f53794q;

        /* JADX INFO: renamed from: r */
        public static final Parser f53795r = new C61391();

        /* JADX INFO: renamed from: b */
        public final ByteString f53796b;

        /* JADX INFO: renamed from: c */
        public int f53797c;

        /* JADX INFO: renamed from: d */
        public int f53798d;

        /* JADX INFO: renamed from: f */
        public int f53799f;

        /* JADX INFO: renamed from: g */
        public Type f53800g;

        /* JADX INFO: renamed from: i */
        public int f53801i;

        /* JADX INFO: renamed from: j */
        public Type f53802j;

        /* JADX INFO: renamed from: n */
        public int f53803n;

        /* JADX INFO: renamed from: o */
        public byte f53804o;

        /* JADX INFO: renamed from: p */
        public int f53805p;

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$ValueParameter$1 */
        /* JADX INFO: compiled from: Proguard */
        public static class C61391 extends AbstractParser<ValueParameter> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            /* JADX INFO: renamed from: a */
            public final Object mo19417a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new ValueParameter(codedInputStream, extensionRegistryLite);
            }
        }

        /* JADX INFO: compiled from: Proguard */
        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<ValueParameter, Builder> implements ValueParameterOrBuilder {

            /* JADX INFO: renamed from: d */
            public int f53806d;

            /* JADX INFO: renamed from: f */
            public int f53807f;

            /* JADX INFO: renamed from: g */
            public int f53808g;

            /* JADX INFO: renamed from: i */
            public Type f53809i;

            /* JADX INFO: renamed from: j */
            public int f53810j;

            /* JADX INFO: renamed from: n */
            public Type f53811n;

            /* JADX INFO: renamed from: o */
            public int f53812o;

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: b */
            public final AbstractMessageLite.Builder mo19418b() {
                Builder builder = new Builder();
                Type type = Type.f53679y;
                builder.f53809i = type;
                builder.f53811n = type;
                builder.m19513j(m19512i());
                return builder;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public final MessageLite build() {
                ValueParameter valueParameterM19512i = m19512i();
                if (valueParameterM19512i.isInitialized()) {
                    return valueParameterM19512i;
                }
                throw new UninitializedMessageException();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: c */
            public final /* bridge */ /* synthetic */ AbstractMessageLite.Builder mo19419c(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                m19514k(codedInputStream, extensionRegistryLite);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            public final Object clone() {
                Builder builder = new Builder();
                Type type = Type.f53679y;
                builder.f53809i = type;
                builder.f53811n = type;
                builder.m19513j(m19512i());
                return builder;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* JADX INFO: renamed from: d */
            public final GeneratedMessageLite.Builder mo19420d() {
                Builder builder = new Builder();
                Type type = Type.f53679y;
                builder.f53809i = type;
                builder.f53811n = type;
                builder.m19513j(m19512i());
                return builder;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* JADX INFO: renamed from: e */
            public final /* bridge */ /* synthetic */ GeneratedMessageLite.Builder mo19421e(GeneratedMessageLite generatedMessageLite) {
                m19513j((ValueParameter) generatedMessageLite);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder
            /* JADX INFO: renamed from: f */
            public final GeneratedMessageLite.ExtendableBuilder mo19437f() {
                Builder builder = new Builder();
                Type type = Type.f53679y;
                builder.f53809i = type;
                builder.f53811n = type;
                builder.m19513j(m19512i());
                return builder;
            }

            /* JADX INFO: renamed from: i */
            public final ValueParameter m19512i() {
                ValueParameter valueParameter = new ValueParameter(this);
                int i = this.f53806d;
                int i2 = (i & 1) != 1 ? 0 : 1;
                valueParameter.f53798d = this.f53807f;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                valueParameter.f53799f = this.f53808g;
                if ((i & 4) == 4) {
                    i2 |= 4;
                }
                valueParameter.f53800g = this.f53809i;
                if ((i & 8) == 8) {
                    i2 |= 8;
                }
                valueParameter.f53801i = this.f53810j;
                if ((i & 16) == 16) {
                    i2 |= 16;
                }
                valueParameter.f53802j = this.f53811n;
                if ((i & 32) == 32) {
                    i2 |= 32;
                }
                valueParameter.f53803n = this.f53812o;
                valueParameter.f53797c = i2;
                return valueParameter;
            }

            /* JADX INFO: renamed from: j */
            public final void m19513j(ValueParameter valueParameter) {
                Type type;
                Type type2;
                if (valueParameter == ValueParameter.f53794q) {
                    return;
                }
                int i = valueParameter.f53797c;
                if ((i & 1) == 1) {
                    int i2 = valueParameter.f53798d;
                    this.f53806d = 1 | this.f53806d;
                    this.f53807f = i2;
                }
                if ((i & 2) == 2) {
                    int i3 = valueParameter.f53799f;
                    this.f53806d = 2 | this.f53806d;
                    this.f53808g = i3;
                }
                if ((i & 4) == 4) {
                    Type type3 = valueParameter.f53800g;
                    if ((this.f53806d & 4) != 4 || (type2 = this.f53809i) == Type.f53679y) {
                        this.f53809i = type3;
                    } else {
                        Type.Builder builderM19486p = Type.m19486p(type2);
                        builderM19486p.m19496k(type3);
                        this.f53809i = builderM19486p.m19495i();
                    }
                    this.f53806d |= 4;
                }
                int i4 = valueParameter.f53797c;
                if ((i4 & 8) == 8) {
                    int i5 = valueParameter.f53801i;
                    this.f53806d = 8 | this.f53806d;
                    this.f53810j = i5;
                }
                if ((i4 & 16) == 16) {
                    Type type4 = valueParameter.f53802j;
                    if ((this.f53806d & 16) != 16 || (type = this.f53811n) == Type.f53679y) {
                        this.f53811n = type4;
                    } else {
                        Type.Builder builderM19486p2 = Type.m19486p(type);
                        builderM19486p2.m19496k(type4);
                        this.f53811n = builderM19486p2.m19495i();
                    }
                    this.f53806d |= 16;
                }
                if ((valueParameter.f53797c & 32) == 32) {
                    int i6 = valueParameter.f53803n;
                    this.f53806d = 32 | this.f53806d;
                    this.f53812o = i6;
                }
                m19697h(valueParameter);
                this.f54106a = this.f54106a.m19625c(valueParameter.f53796b);
            }

            /* JADX WARN: Removed duplicated region for block: B:14:0x001d  */
            /* JADX INFO: renamed from: k */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void m19514k(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                ValueParameter valueParameter = null;
                try {
                    try {
                        ((C61391) ValueParameter.f53795r).getClass();
                        m19513j(new ValueParameter(codedInputStream, extensionRegistryLite));
                    } catch (InvalidProtocolBufferException e) {
                        ValueParameter valueParameter2 = (ValueParameter) e.f54121a;
                        try {
                            throw e;
                        } catch (Throwable th) {
                            th = th;
                            valueParameter = valueParameter2;
                            if (valueParameter != null) {
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (valueParameter != null) {
                        m19513j(valueParameter);
                    }
                    throw th;
                }
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* JADX INFO: renamed from: n */
            public final /* bridge */ /* synthetic */ MessageLite.Builder mo19425n(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                m19514k(codedInputStream, extensionRegistryLite);
                return this;
            }
        }

        static {
            ValueParameter valueParameter = new ValueParameter();
            f53794q = valueParameter;
            valueParameter.f53798d = 0;
            valueParameter.f53799f = 0;
            Type type = Type.f53679y;
            valueParameter.f53800g = type;
            valueParameter.f53801i = 0;
            valueParameter.f53802j = type;
            valueParameter.f53803n = 0;
        }

        public ValueParameter(Builder builder) {
            super(builder);
            this.f53804o = (byte) -1;
            this.f53805p = -1;
            this.f53796b = builder.f54106a;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        /* JADX INFO: renamed from: a */
        public final void mo19416a(CodedOutputStream codedOutputStream) {
            getSerializedSize();
            GeneratedMessageLite.ExtendableMessage.ExtensionWriter extensionWriter = new GeneratedMessageLite.ExtendableMessage.ExtensionWriter(this);
            if ((this.f53797c & 1) == 1) {
                codedOutputStream.m19670m(1, this.f53798d);
            }
            if ((this.f53797c & 2) == 2) {
                codedOutputStream.m19670m(2, this.f53799f);
            }
            if ((this.f53797c & 4) == 4) {
                codedOutputStream.m19672o(3, this.f53800g);
            }
            if ((this.f53797c & 16) == 16) {
                codedOutputStream.m19672o(4, this.f53802j);
            }
            if ((this.f53797c & 8) == 8) {
                codedOutputStream.m19670m(5, this.f53801i);
            }
            if ((this.f53797c & 32) == 32) {
                codedOutputStream.m19670m(6, this.f53803n);
            }
            extensionWriter.m19707a(200, codedOutputStream);
            codedOutputStream.m19675r(this.f53796b);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final MessageLite getDefaultInstanceForType() {
            return f53794q;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final int getSerializedSize() {
            int i = this.f53805p;
            if (i != -1) {
                return i;
            }
            int iM19659b = (this.f53797c & 1) == 1 ? CodedOutputStream.m19659b(1, this.f53798d) : 0;
            if ((this.f53797c & 2) == 2) {
                iM19659b += CodedOutputStream.m19659b(2, this.f53799f);
            }
            if ((this.f53797c & 4) == 4) {
                iM19659b += CodedOutputStream.m19661d(3, this.f53800g);
            }
            if ((this.f53797c & 16) == 16) {
                iM19659b += CodedOutputStream.m19661d(4, this.f53802j);
            }
            if ((this.f53797c & 8) == 8) {
                iM19659b += CodedOutputStream.m19659b(5, this.f53801i);
            }
            if ((this.f53797c & 32) == 32) {
                iM19659b += CodedOutputStream.m19659b(6, this.f53803n);
            }
            int size = this.f53796b.size() + m19699e() + iM19659b;
            this.f53805p = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b2 = this.f53804o;
            if (b2 == 1) {
                return true;
            }
            if (b2 == 0) {
                return false;
            }
            int i = this.f53797c;
            if ((i & 2) != 2) {
                this.f53804o = (byte) 0;
                return false;
            }
            if ((i & 4) == 4 && !this.f53800g.isInitialized()) {
                this.f53804o = (byte) 0;
                return false;
            }
            if ((this.f53797c & 16) == 16 && !this.f53802j.isInitialized()) {
                this.f53804o = (byte) 0;
                return false;
            }
            if (m19698d()) {
                this.f53804o = (byte) 1;
                return true;
            }
            this.f53804o = (byte) 0;
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final MessageLite.Builder newBuilderForType() {
            Builder builder = new Builder();
            Type type = Type.f53679y;
            builder.f53809i = type;
            builder.f53811n = type;
            return builder;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final MessageLite.Builder toBuilder() {
            Builder builder = new Builder();
            Type type = Type.f53679y;
            builder.f53809i = type;
            builder.f53811n = type;
            builder.m19513j(this);
            return builder;
        }

        public ValueParameter() {
            this.f53804o = (byte) -1;
            this.f53805p = -1;
            this.f53796b = ByteString.f54075a;
        }

        public ValueParameter(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            this.f53804o = (byte) -1;
            this.f53805p = -1;
            boolean z2 = false;
            this.f53798d = 0;
            this.f53799f = 0;
            Type type = Type.f53679y;
            this.f53800g = type;
            this.f53801i = 0;
            this.f53802j = type;
            this.f53803n = 0;
            ByteString.Output output = new ByteString.Output();
            CodedOutputStream codedOutputStreamM19666j = CodedOutputStream.m19666j(output, 1);
            while (!z2) {
                try {
                    try {
                        int iM19652n = codedInputStream.m19652n();
                        if (iM19652n != 0) {
                            if (iM19652n == 8) {
                                this.f53797c |= 1;
                                this.f53798d = codedInputStream.m19649k();
                            } else if (iM19652n != 16) {
                                Type.Builder builderM19486p = null;
                                if (iM19652n == 26) {
                                    if ((this.f53797c & 4) == 4) {
                                        Type type2 = this.f53800g;
                                        type2.getClass();
                                        builderM19486p = Type.m19486p(type2);
                                    }
                                    Type type3 = (Type) codedInputStream.m19645g(Type.f53680z, extensionRegistryLite);
                                    this.f53800g = type3;
                                    if (builderM19486p != null) {
                                        builderM19486p.m19496k(type3);
                                        this.f53800g = builderM19486p.m19495i();
                                    }
                                    this.f53797c |= 4;
                                } else if (iM19652n == 34) {
                                    if ((this.f53797c & 16) == 16) {
                                        Type type4 = this.f53802j;
                                        type4.getClass();
                                        builderM19486p = Type.m19486p(type4);
                                    }
                                    Type type5 = (Type) codedInputStream.m19645g(Type.f53680z, extensionRegistryLite);
                                    this.f53802j = type5;
                                    if (builderM19486p != null) {
                                        builderM19486p.m19496k(type5);
                                        this.f53802j = builderM19486p.m19495i();
                                    }
                                    this.f53797c |= 16;
                                } else if (iM19652n == 40) {
                                    this.f53797c |= 8;
                                    this.f53801i = codedInputStream.m19649k();
                                } else if (iM19652n != 48) {
                                    if (!m19705k(codedInputStream, codedOutputStreamM19666j, extensionRegistryLite, iM19652n)) {
                                    }
                                } else {
                                    this.f53797c |= 32;
                                    this.f53803n = codedInputStream.m19649k();
                                }
                            } else {
                                this.f53797c |= 2;
                                this.f53799f = codedInputStream.m19649k();
                            }
                        }
                        z2 = true;
                    } catch (Throwable th) {
                        try {
                            codedOutputStreamM19666j.m19667i();
                        } catch (IOException unused) {
                        } catch (Throwable th2) {
                            this.f53796b = output.m19638d();
                            throw th2;
                        }
                        this.f53796b = output.m19638d();
                        m19704j();
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
            } catch (Throwable th3) {
                this.f53796b = output.m19638d();
                throw th3;
            }
            this.f53796b = output.m19638d();
            m19704j();
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class Function extends GeneratedMessageLite.ExtendableMessage<Function> implements FunctionOrBuilder {

        /* JADX INFO: renamed from: A */
        public static final Parser f53537A = new C61221();

        /* JADX INFO: renamed from: z */
        public static final Function f53538z;

        /* JADX INFO: renamed from: b */
        public final ByteString f53539b;

        /* JADX INFO: renamed from: c */
        public int f53540c;

        /* JADX INFO: renamed from: d */
        public int f53541d;

        /* JADX INFO: renamed from: f */
        public int f53542f;

        /* JADX INFO: renamed from: g */
        public int f53543g;

        /* JADX INFO: renamed from: i */
        public Type f53544i;

        /* JADX INFO: renamed from: j */
        public int f53545j;

        /* JADX INFO: renamed from: n */
        public List f53546n;

        /* JADX INFO: renamed from: o */
        public Type f53547o;

        /* JADX INFO: renamed from: p */
        public int f53548p;

        /* JADX INFO: renamed from: q */
        public List f53549q;

        /* JADX INFO: renamed from: r */
        public List f53550r;

        /* JADX INFO: renamed from: s */
        public int f53551s;

        /* JADX INFO: renamed from: t */
        public List f53552t;

        /* JADX INFO: renamed from: u */
        public TypeTable f53553u;

        /* JADX INFO: renamed from: v */
        public List f53554v;

        /* JADX INFO: renamed from: w */
        public Contract f53555w;

        /* JADX INFO: renamed from: x */
        public byte f53556x;

        /* JADX INFO: renamed from: y */
        public int f53557y;

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function$1 */
        /* JADX INFO: compiled from: Proguard */
        public static class C61221 extends AbstractParser<Function> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            /* JADX INFO: renamed from: a */
            public final Object mo19417a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new Function(codedInputStream, extensionRegistryLite);
            }
        }

        /* JADX INFO: compiled from: Proguard */
        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<Function, Builder> implements FunctionOrBuilder {

            /* JADX INFO: renamed from: d */
            public int f53558d;

            /* JADX INFO: renamed from: f */
            public int f53559f;

            /* JADX INFO: renamed from: g */
            public int f53560g;

            /* JADX INFO: renamed from: i */
            public int f53561i;

            /* JADX INFO: renamed from: j */
            public Type f53562j;

            /* JADX INFO: renamed from: n */
            public int f53563n;

            /* JADX INFO: renamed from: o */
            public List f53564o;

            /* JADX INFO: renamed from: p */
            public Type f53565p;

            /* JADX INFO: renamed from: q */
            public int f53566q;

            /* JADX INFO: renamed from: r */
            public List f53567r;

            /* JADX INFO: renamed from: s */
            public List f53568s;

            /* JADX INFO: renamed from: t */
            public List f53569t;

            /* JADX INFO: renamed from: u */
            public TypeTable f53570u;

            /* JADX INFO: renamed from: v */
            public List f53571v;

            /* JADX INFO: renamed from: w */
            public Contract f53572w;

            /* JADX INFO: renamed from: j */
            public static Builder m19459j() {
                Builder builder = new Builder();
                builder.f53559f = 6;
                builder.f53560g = 6;
                Type type = Type.f53679y;
                builder.f53562j = type;
                List list = Collections.EMPTY_LIST;
                builder.f53564o = list;
                builder.f53565p = type;
                builder.f53567r = list;
                builder.f53568s = list;
                builder.f53569t = list;
                builder.f53570u = TypeTable.f53783i;
                builder.f53571v = list;
                builder.f53572w = Contract.f53469f;
                return builder;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: b */
            public final AbstractMessageLite.Builder mo19418b() {
                Builder builderM19459j = m19459j();
                builderM19459j.m19461k(m19460i());
                return builderM19459j;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public final MessageLite build() {
                Function functionM19460i = m19460i();
                if (functionM19460i.isInitialized()) {
                    return functionM19460i;
                }
                throw new UninitializedMessageException();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: c */
            public final /* bridge */ /* synthetic */ AbstractMessageLite.Builder mo19419c(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                m19462l(codedInputStream, extensionRegistryLite);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            public final Object clone() {
                Builder builderM19459j = m19459j();
                builderM19459j.m19461k(m19460i());
                return builderM19459j;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* JADX INFO: renamed from: d */
            public final GeneratedMessageLite.Builder mo19420d() {
                Builder builderM19459j = m19459j();
                builderM19459j.m19461k(m19460i());
                return builderM19459j;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* JADX INFO: renamed from: e */
            public final /* bridge */ /* synthetic */ GeneratedMessageLite.Builder mo19421e(GeneratedMessageLite generatedMessageLite) {
                m19461k((Function) generatedMessageLite);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder
            /* JADX INFO: renamed from: f */
            public final GeneratedMessageLite.ExtendableBuilder mo19437f() {
                Builder builderM19459j = m19459j();
                builderM19459j.m19461k(m19460i());
                return builderM19459j;
            }

            /* JADX INFO: renamed from: i */
            public final Function m19460i() {
                Function function = new Function(this);
                int i = this.f53558d;
                int i2 = (i & 1) != 1 ? 0 : 1;
                function.f53541d = this.f53559f;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                function.f53542f = this.f53560g;
                if ((i & 4) == 4) {
                    i2 |= 4;
                }
                function.f53543g = this.f53561i;
                if ((i & 8) == 8) {
                    i2 |= 8;
                }
                function.f53544i = this.f53562j;
                if ((i & 16) == 16) {
                    i2 |= 16;
                }
                function.f53545j = this.f53563n;
                if ((i & 32) == 32) {
                    this.f53564o = Collections.unmodifiableList(this.f53564o);
                    this.f53558d &= -33;
                }
                function.f53546n = this.f53564o;
                if ((i & 64) == 64) {
                    i2 |= 32;
                }
                function.f53547o = this.f53565p;
                if ((i & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) == 128) {
                    i2 |= 64;
                }
                function.f53548p = this.f53566q;
                if ((this.f53558d & 256) == 256) {
                    this.f53567r = Collections.unmodifiableList(this.f53567r);
                    this.f53558d &= -257;
                }
                function.f53549q = this.f53567r;
                if ((this.f53558d & 512) == 512) {
                    this.f53568s = Collections.unmodifiableList(this.f53568s);
                    this.f53558d &= -513;
                }
                function.f53550r = this.f53568s;
                if ((this.f53558d & UserMetadata.MAX_ATTRIBUTE_SIZE) == 1024) {
                    this.f53569t = Collections.unmodifiableList(this.f53569t);
                    this.f53558d &= -1025;
                }
                function.f53552t = this.f53569t;
                if ((i & 2048) == 2048) {
                    i2 |= UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                }
                function.f53553u = this.f53570u;
                if ((this.f53558d & 4096) == 4096) {
                    this.f53571v = Collections.unmodifiableList(this.f53571v);
                    this.f53558d &= -4097;
                }
                function.f53554v = this.f53571v;
                if ((i & UserMetadata.MAX_INTERNAL_KEY_SIZE) == 8192) {
                    i2 |= 256;
                }
                function.f53555w = this.f53572w;
                function.f53540c = i2;
                return function;
            }

            /* JADX INFO: renamed from: k */
            public final void m19461k(Function function) {
                Contract contract;
                TypeTable typeTable;
                Type type;
                Type type2;
                if (function == Function.f53538z) {
                    return;
                }
                int i = function.f53540c;
                if ((i & 1) == 1) {
                    int i2 = function.f53541d;
                    this.f53558d = 1 | this.f53558d;
                    this.f53559f = i2;
                }
                if ((i & 2) == 2) {
                    int i3 = function.f53542f;
                    this.f53558d = 2 | this.f53558d;
                    this.f53560g = i3;
                }
                if ((i & 4) == 4) {
                    int i4 = function.f53543g;
                    this.f53558d = 4 | this.f53558d;
                    this.f53561i = i4;
                }
                if ((i & 8) == 8) {
                    Type type3 = function.f53544i;
                    if ((this.f53558d & 8) != 8 || (type2 = this.f53562j) == Type.f53679y) {
                        this.f53562j = type3;
                    } else {
                        Type.Builder builderM19486p = Type.m19486p(type2);
                        builderM19486p.m19496k(type3);
                        this.f53562j = builderM19486p.m19495i();
                    }
                    this.f53558d |= 8;
                }
                if ((function.f53540c & 16) == 16) {
                    int i5 = function.f53545j;
                    this.f53558d = 16 | this.f53558d;
                    this.f53563n = i5;
                }
                if (!function.f53546n.isEmpty()) {
                    if (this.f53564o.isEmpty()) {
                        this.f53564o = function.f53546n;
                        this.f53558d &= -33;
                    } else {
                        if ((this.f53558d & 32) != 32) {
                            this.f53564o = new ArrayList(this.f53564o);
                            this.f53558d |= 32;
                        }
                        this.f53564o.addAll(function.f53546n);
                    }
                }
                if ((function.f53540c & 32) == 32) {
                    Type type4 = function.f53547o;
                    if ((this.f53558d & 64) != 64 || (type = this.f53565p) == Type.f53679y) {
                        this.f53565p = type4;
                    } else {
                        Type.Builder builderM19486p2 = Type.m19486p(type);
                        builderM19486p2.m19496k(type4);
                        this.f53565p = builderM19486p2.m19495i();
                    }
                    this.f53558d |= 64;
                }
                if ((function.f53540c & 64) == 64) {
                    int i6 = function.f53548p;
                    this.f53558d |= UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                    this.f53566q = i6;
                }
                if (!function.f53549q.isEmpty()) {
                    if (this.f53567r.isEmpty()) {
                        this.f53567r = function.f53549q;
                        this.f53558d &= -257;
                    } else {
                        if ((this.f53558d & 256) != 256) {
                            this.f53567r = new ArrayList(this.f53567r);
                            this.f53558d |= 256;
                        }
                        this.f53567r.addAll(function.f53549q);
                    }
                }
                if (!function.f53550r.isEmpty()) {
                    if (this.f53568s.isEmpty()) {
                        this.f53568s = function.f53550r;
                        this.f53558d &= -513;
                    } else {
                        if ((this.f53558d & 512) != 512) {
                            this.f53568s = new ArrayList(this.f53568s);
                            this.f53558d |= 512;
                        }
                        this.f53568s.addAll(function.f53550r);
                    }
                }
                if (!function.f53552t.isEmpty()) {
                    if (this.f53569t.isEmpty()) {
                        this.f53569t = function.f53552t;
                        this.f53558d &= -1025;
                    } else {
                        if ((this.f53558d & UserMetadata.MAX_ATTRIBUTE_SIZE) != 1024) {
                            this.f53569t = new ArrayList(this.f53569t);
                            this.f53558d |= UserMetadata.MAX_ATTRIBUTE_SIZE;
                        }
                        this.f53569t.addAll(function.f53552t);
                    }
                }
                if ((function.f53540c & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) == 128) {
                    TypeTable typeTable2 = function.f53553u;
                    if ((this.f53558d & 2048) != 2048 || (typeTable = this.f53570u) == TypeTable.f53783i) {
                        this.f53570u = typeTable2;
                    } else {
                        TypeTable.Builder builderM19506d = TypeTable.m19506d(typeTable);
                        builderM19506d.m19510i(typeTable2);
                        this.f53570u = builderM19506d.m19509f();
                    }
                    this.f53558d |= 2048;
                }
                if (!function.f53554v.isEmpty()) {
                    if (this.f53571v.isEmpty()) {
                        this.f53571v = function.f53554v;
                        this.f53558d &= -4097;
                    } else {
                        if ((this.f53558d & 4096) != 4096) {
                            this.f53571v = new ArrayList(this.f53571v);
                            this.f53558d |= 4096;
                        }
                        this.f53571v.addAll(function.f53554v);
                    }
                }
                if ((function.f53540c & 256) == 256) {
                    Contract contract2 = function.f53555w;
                    if ((this.f53558d & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 8192 || (contract = this.f53572w) == Contract.f53469f) {
                        this.f53572w = contract2;
                    } else {
                        Contract.Builder builder = new Contract.Builder();
                        builder.f53476c = Collections.EMPTY_LIST;
                        builder.m19446h(contract);
                        builder.m19446h(contract2);
                        this.f53572w = builder.m19445f();
                    }
                    this.f53558d |= UserMetadata.MAX_INTERNAL_KEY_SIZE;
                }
                m19697h(function);
                this.f54106a = this.f54106a.m19625c(function.f53539b);
            }

            /* JADX WARN: Removed duplicated region for block: B:14:0x001d  */
            /* JADX INFO: renamed from: l */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void m19462l(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                Function function = null;
                try {
                    try {
                        ((C61221) Function.f53537A).getClass();
                        m19461k(new Function(codedInputStream, extensionRegistryLite));
                    } catch (InvalidProtocolBufferException e) {
                        Function function2 = (Function) e.f54121a;
                        try {
                            throw e;
                        } catch (Throwable th) {
                            th = th;
                            function = function2;
                            if (function != null) {
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (function != null) {
                        m19461k(function);
                    }
                    throw th;
                }
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* JADX INFO: renamed from: n */
            public final /* bridge */ /* synthetic */ MessageLite.Builder mo19425n(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                m19462l(codedInputStream, extensionRegistryLite);
                return this;
            }
        }

        static {
            Function function = new Function();
            f53538z = function;
            function.m19458m();
        }

        public Function(Builder builder) {
            super(builder);
            this.f53551s = -1;
            this.f53556x = (byte) -1;
            this.f53557y = -1;
            this.f53539b = builder.f54106a;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        /* JADX INFO: renamed from: a */
        public final void mo19416a(CodedOutputStream codedOutputStream) {
            getSerializedSize();
            GeneratedMessageLite.ExtendableMessage.ExtensionWriter extensionWriter = new GeneratedMessageLite.ExtendableMessage.ExtensionWriter(this);
            if ((this.f53540c & 2) == 2) {
                codedOutputStream.m19670m(1, this.f53542f);
            }
            if ((this.f53540c & 4) == 4) {
                codedOutputStream.m19670m(2, this.f53543g);
            }
            if ((this.f53540c & 8) == 8) {
                codedOutputStream.m19672o(3, this.f53544i);
            }
            for (int i = 0; i < this.f53546n.size(); i++) {
                codedOutputStream.m19672o(4, (MessageLite) this.f53546n.get(i));
            }
            if ((this.f53540c & 32) == 32) {
                codedOutputStream.m19672o(5, this.f53547o);
            }
            for (int i2 = 0; i2 < this.f53552t.size(); i2++) {
                codedOutputStream.m19672o(6, (MessageLite) this.f53552t.get(i2));
            }
            if ((this.f53540c & 16) == 16) {
                codedOutputStream.m19670m(7, this.f53545j);
            }
            if ((this.f53540c & 64) == 64) {
                codedOutputStream.m19670m(8, this.f53548p);
            }
            if ((this.f53540c & 1) == 1) {
                codedOutputStream.m19670m(9, this.f53541d);
            }
            for (int i3 = 0; i3 < this.f53549q.size(); i3++) {
                codedOutputStream.m19672o(10, (MessageLite) this.f53549q.get(i3));
            }
            if (this.f53550r.size() > 0) {
                codedOutputStream.m19679v(90);
                codedOutputStream.m19679v(this.f53551s);
            }
            for (int i4 = 0; i4 < this.f53550r.size(); i4++) {
                codedOutputStream.m19671n(((Integer) this.f53550r.get(i4)).intValue());
            }
            if ((this.f53540c & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) == 128) {
                codedOutputStream.m19672o(30, this.f53553u);
            }
            for (int i5 = 0; i5 < this.f53554v.size(); i5++) {
                codedOutputStream.m19670m(31, ((Integer) this.f53554v.get(i5)).intValue());
            }
            if ((this.f53540c & 256) == 256) {
                codedOutputStream.m19672o(32, this.f53555w);
            }
            extensionWriter.m19707a(19000, codedOutputStream);
            codedOutputStream.m19675r(this.f53539b);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final MessageLite getDefaultInstanceForType() {
            return f53538z;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final int getSerializedSize() {
            int i = this.f53557y;
            if (i != -1) {
                return i;
            }
            int iM19659b = (this.f53540c & 2) == 2 ? CodedOutputStream.m19659b(1, this.f53542f) : 0;
            if ((this.f53540c & 4) == 4) {
                iM19659b += CodedOutputStream.m19659b(2, this.f53543g);
            }
            if ((this.f53540c & 8) == 8) {
                iM19659b += CodedOutputStream.m19661d(3, this.f53544i);
            }
            for (int i2 = 0; i2 < this.f53546n.size(); i2++) {
                iM19659b += CodedOutputStream.m19661d(4, (MessageLite) this.f53546n.get(i2));
            }
            if ((this.f53540c & 32) == 32) {
                iM19659b += CodedOutputStream.m19661d(5, this.f53547o);
            }
            for (int i3 = 0; i3 < this.f53552t.size(); i3++) {
                iM19659b += CodedOutputStream.m19661d(6, (MessageLite) this.f53552t.get(i3));
            }
            if ((this.f53540c & 16) == 16) {
                iM19659b += CodedOutputStream.m19659b(7, this.f53545j);
            }
            if ((this.f53540c & 64) == 64) {
                iM19659b += CodedOutputStream.m19659b(8, this.f53548p);
            }
            if ((this.f53540c & 1) == 1) {
                iM19659b += CodedOutputStream.m19659b(9, this.f53541d);
            }
            for (int i4 = 0; i4 < this.f53549q.size(); i4++) {
                iM19659b += CodedOutputStream.m19661d(10, (MessageLite) this.f53549q.get(i4));
            }
            int iM19660c = 0;
            for (int i5 = 0; i5 < this.f53550r.size(); i5++) {
                iM19660c += CodedOutputStream.m19660c(((Integer) this.f53550r.get(i5)).intValue());
            }
            int iM19661d = iM19659b + iM19660c;
            if (!this.f53550r.isEmpty()) {
                iM19661d = iM19661d + 1 + CodedOutputStream.m19660c(iM19660c);
            }
            this.f53551s = iM19660c;
            if ((this.f53540c & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) == 128) {
                iM19661d += CodedOutputStream.m19661d(30, this.f53553u);
            }
            int iM19660c2 = 0;
            for (int i6 = 0; i6 < this.f53554v.size(); i6++) {
                iM19660c2 += CodedOutputStream.m19660c(((Integer) this.f53554v.get(i6)).intValue());
            }
            int iM2225D = AbstractC0455a.m2225D(this.f53554v, 2, iM19661d + iM19660c2);
            if ((this.f53540c & 256) == 256) {
                iM2225D += CodedOutputStream.m19661d(32, this.f53555w);
            }
            int size = this.f53539b.size() + m19699e() + iM2225D;
            this.f53557y = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b2 = this.f53556x;
            if (b2 == 1) {
                return true;
            }
            if (b2 == 0) {
                return false;
            }
            int i = this.f53540c;
            if ((i & 4) != 4) {
                this.f53556x = (byte) 0;
                return false;
            }
            if ((i & 8) == 8 && !this.f53544i.isInitialized()) {
                this.f53556x = (byte) 0;
                return false;
            }
            for (int i2 = 0; i2 < this.f53546n.size(); i2++) {
                if (!((TypeParameter) this.f53546n.get(i2)).isInitialized()) {
                    this.f53556x = (byte) 0;
                    return false;
                }
            }
            if ((this.f53540c & 32) == 32 && !this.f53547o.isInitialized()) {
                this.f53556x = (byte) 0;
                return false;
            }
            for (int i3 = 0; i3 < this.f53549q.size(); i3++) {
                if (!((Type) this.f53549q.get(i3)).isInitialized()) {
                    this.f53556x = (byte) 0;
                    return false;
                }
            }
            for (int i4 = 0; i4 < this.f53552t.size(); i4++) {
                if (!((ValueParameter) this.f53552t.get(i4)).isInitialized()) {
                    this.f53556x = (byte) 0;
                    return false;
                }
            }
            if ((this.f53540c & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) == 128 && !this.f53553u.isInitialized()) {
                this.f53556x = (byte) 0;
                return false;
            }
            if ((this.f53540c & 256) == 256 && !this.f53555w.isInitialized()) {
                this.f53556x = (byte) 0;
                return false;
            }
            if (m19698d()) {
                this.f53556x = (byte) 1;
                return true;
            }
            this.f53556x = (byte) 0;
            return false;
        }

        /* JADX INFO: renamed from: m */
        public final void m19458m() {
            this.f53541d = 6;
            this.f53542f = 6;
            this.f53543g = 0;
            Type type = Type.f53679y;
            this.f53544i = type;
            this.f53545j = 0;
            List list = Collections.EMPTY_LIST;
            this.f53546n = list;
            this.f53547o = type;
            this.f53548p = 0;
            this.f53549q = list;
            this.f53550r = list;
            this.f53552t = list;
            this.f53553u = TypeTable.f53783i;
            this.f53554v = list;
            this.f53555w = Contract.f53469f;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final MessageLite.Builder newBuilderForType() {
            return Builder.m19459j();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final MessageLite.Builder toBuilder() {
            Builder builderM19459j = Builder.m19459j();
            builderM19459j.m19461k(this);
            return builderM19459j;
        }

        public Function() {
            this.f53551s = -1;
            this.f53556x = (byte) -1;
            this.f53557y = -1;
            this.f53539b = ByteString.f54075a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r5v0 */
        /* JADX WARN: Type inference failed for: r5v1 */
        /* JADX WARN: Type inference failed for: r5v2, types: [boolean] */
        public Function(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            this.f53551s = -1;
            this.f53556x = (byte) -1;
            this.f53557y = -1;
            m19458m();
            ByteString.Output output = new ByteString.Output();
            CodedOutputStream codedOutputStreamM19666j = CodedOutputStream.m19666j(output, 1);
            boolean z2 = false;
            int i = 0;
            while (true) {
                ?? M19705k = 1024;
                if (!z2) {
                    try {
                        try {
                            int iM19652n = codedInputStream.m19652n();
                            Type.Builder builderM19486p = null;
                            Contract.Builder builder = null;
                            TypeTable.Builder builderM19506d = null;
                            Type.Builder builderM19486p2 = null;
                            switch (iM19652n) {
                                case 0:
                                    z2 = true;
                                    break;
                                case 8:
                                    this.f53540c |= 2;
                                    this.f53542f = codedInputStream.m19649k();
                                    break;
                                case 16:
                                    this.f53540c |= 4;
                                    this.f53543g = codedInputStream.m19649k();
                                    break;
                                case 26:
                                    if ((this.f53540c & 8) == 8) {
                                        Type type = this.f53544i;
                                        type.getClass();
                                        builderM19486p = Type.m19486p(type);
                                    }
                                    Type type2 = (Type) codedInputStream.m19645g(Type.f53680z, extensionRegistryLite);
                                    this.f53544i = type2;
                                    if (builderM19486p != null) {
                                        builderM19486p.m19496k(type2);
                                        this.f53544i = builderM19486p.m19495i();
                                    }
                                    this.f53540c |= 8;
                                    break;
                                case 34:
                                    int i2 = (i == true ? 1 : 0) & 32;
                                    i = i;
                                    if (i2 != 32) {
                                        this.f53546n = new ArrayList();
                                        i = (i == true ? 1 : 0) | 32;
                                    }
                                    this.f53546n.add(codedInputStream.m19645g(TypeParameter.f53759s, extensionRegistryLite));
                                    break;
                                case 42:
                                    if ((this.f53540c & 32) == 32) {
                                        Type type3 = this.f53547o;
                                        type3.getClass();
                                        builderM19486p2 = Type.m19486p(type3);
                                    }
                                    Type type4 = (Type) codedInputStream.m19645g(Type.f53680z, extensionRegistryLite);
                                    this.f53547o = type4;
                                    if (builderM19486p2 != null) {
                                        builderM19486p2.m19496k(type4);
                                        this.f53547o = builderM19486p2.m19495i();
                                    }
                                    this.f53540c |= 32;
                                    break;
                                case 50:
                                    int i3 = (i == true ? 1 : 0) & UserMetadata.MAX_ATTRIBUTE_SIZE;
                                    i = i;
                                    if (i3 != 1024) {
                                        this.f53552t = new ArrayList();
                                        i = (i == true ? 1 : 0) | UserMetadata.MAX_ATTRIBUTE_SIZE;
                                    }
                                    this.f53552t.add(codedInputStream.m19645g(ValueParameter.f53795r, extensionRegistryLite));
                                    break;
                                case 56:
                                    this.f53540c |= 16;
                                    this.f53545j = codedInputStream.m19649k();
                                    break;
                                case UserMetadata.MAX_ATTRIBUTES /* 64 */:
                                    this.f53540c |= 64;
                                    this.f53548p = codedInputStream.m19649k();
                                    break;
                                case 72:
                                    this.f53540c |= 1;
                                    this.f53541d = codedInputStream.m19649k();
                                    break;
                                case 82:
                                    int i4 = (i == true ? 1 : 0) & 256;
                                    i = i;
                                    if (i4 != 256) {
                                        this.f53549q = new ArrayList();
                                        i = (i == true ? 1 : 0) | 256;
                                    }
                                    this.f53549q.add(codedInputStream.m19645g(Type.f53680z, extensionRegistryLite));
                                    break;
                                case 88:
                                    int i5 = (i == true ? 1 : 0) & 512;
                                    i = i;
                                    if (i5 != 512) {
                                        this.f53550r = new ArrayList();
                                        i = (i == true ? 1 : 0) | 512;
                                    }
                                    this.f53550r.add(Integer.valueOf(codedInputStream.m19649k()));
                                    break;
                                case PDF417Common.MAX_ROWS_IN_BARCODE /* 90 */:
                                    int iM19642d = codedInputStream.m19642d(codedInputStream.m19649k());
                                    int i6 = (i == true ? 1 : 0) & 512;
                                    i = i;
                                    if (i6 != 512) {
                                        i = i;
                                        if (codedInputStream.m19640b() > 0) {
                                            this.f53550r = new ArrayList();
                                            i = (i == true ? 1 : 0) | 512;
                                        }
                                    }
                                    while (codedInputStream.m19640b() > 0) {
                                        this.f53550r.add(Integer.valueOf(codedInputStream.m19649k()));
                                    }
                                    codedInputStream.m19641c(iM19642d);
                                    break;
                                case 242:
                                    if ((this.f53540c & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) == 128) {
                                        TypeTable typeTable = this.f53553u;
                                        typeTable.getClass();
                                        builderM19506d = TypeTable.m19506d(typeTable);
                                    }
                                    TypeTable typeTable2 = (TypeTable) codedInputStream.m19645g(TypeTable.f53784j, extensionRegistryLite);
                                    this.f53553u = typeTable2;
                                    if (builderM19506d != null) {
                                        builderM19506d.m19510i(typeTable2);
                                        this.f53553u = builderM19506d.m19509f();
                                    }
                                    this.f53540c |= UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                                    break;
                                case 248:
                                    int i7 = (i == true ? 1 : 0) & 4096;
                                    i = i;
                                    if (i7 != 4096) {
                                        this.f53554v = new ArrayList();
                                        i = (i == true ? 1 : 0) | 4096;
                                    }
                                    this.f53554v.add(Integer.valueOf(codedInputStream.m19649k()));
                                    break;
                                case 250:
                                    int iM19642d2 = codedInputStream.m19642d(codedInputStream.m19649k());
                                    int i8 = (i == true ? 1 : 0) & 4096;
                                    i = i;
                                    if (i8 != 4096) {
                                        i = i;
                                        if (codedInputStream.m19640b() > 0) {
                                            this.f53554v = new ArrayList();
                                            i = (i == true ? 1 : 0) | 4096;
                                        }
                                    }
                                    while (codedInputStream.m19640b() > 0) {
                                        this.f53554v.add(Integer.valueOf(codedInputStream.m19649k()));
                                    }
                                    codedInputStream.m19641c(iM19642d2);
                                    break;
                                case 258:
                                    if ((this.f53540c & 256) == 256) {
                                        Contract contract = this.f53555w;
                                        contract.getClass();
                                        builder = new Contract.Builder();
                                        builder.f53476c = Collections.EMPTY_LIST;
                                        builder.m19446h(contract);
                                    }
                                    Contract contract2 = (Contract) codedInputStream.m19645g(Contract.f53470g, extensionRegistryLite);
                                    this.f53555w = contract2;
                                    if (builder != null) {
                                        builder.m19446h(contract2);
                                        this.f53555w = builder.m19445f();
                                    }
                                    this.f53540c |= 256;
                                    break;
                                default:
                                    M19705k = m19705k(codedInputStream, codedOutputStreamM19666j, extensionRegistryLite, iM19652n);
                                    if (M19705k == 0) {
                                        z2 = true;
                                    }
                                    break;
                            }
                        } catch (InvalidProtocolBufferException e) {
                            e.f54121a = this;
                            throw e;
                        } catch (IOException e2) {
                            InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e2.getMessage());
                            invalidProtocolBufferException.f54121a = this;
                            throw invalidProtocolBufferException;
                        }
                    } catch (Throwable th) {
                        if (((i == true ? 1 : 0) & 32) == 32) {
                            this.f53546n = Collections.unmodifiableList(this.f53546n);
                        }
                        if (((i == true ? 1 : 0) & UserMetadata.MAX_ATTRIBUTE_SIZE) == M19705k) {
                            this.f53552t = Collections.unmodifiableList(this.f53552t);
                        }
                        if (((i == true ? 1 : 0) & 256) == 256) {
                            this.f53549q = Collections.unmodifiableList(this.f53549q);
                        }
                        if (((i == true ? 1 : 0) & 512) == 512) {
                            this.f53550r = Collections.unmodifiableList(this.f53550r);
                        }
                        if (((i == true ? 1 : 0) & 4096) == 4096) {
                            this.f53554v = Collections.unmodifiableList(this.f53554v);
                        }
                        try {
                            codedOutputStreamM19666j.m19667i();
                        } catch (IOException unused) {
                        } catch (Throwable th2) {
                            this.f53539b = output.m19638d();
                            throw th2;
                        }
                        this.f53539b = output.m19638d();
                        m19704j();
                        throw th;
                    }
                } else {
                    if (((i == true ? 1 : 0) & 32) == 32) {
                        this.f53546n = Collections.unmodifiableList(this.f53546n);
                    }
                    if (((i == true ? 1 : 0) & UserMetadata.MAX_ATTRIBUTE_SIZE) == 1024) {
                        this.f53552t = Collections.unmodifiableList(this.f53552t);
                    }
                    if (((i == true ? 1 : 0) & 256) == 256) {
                        this.f53549q = Collections.unmodifiableList(this.f53549q);
                    }
                    if (((i == true ? 1 : 0) & 512) == 512) {
                        this.f53550r = Collections.unmodifiableList(this.f53550r);
                    }
                    if (((i == true ? 1 : 0) & 4096) == 4096) {
                        this.f53554v = Collections.unmodifiableList(this.f53554v);
                    }
                    try {
                        codedOutputStreamM19666j.m19667i();
                    } catch (IOException unused2) {
                    } catch (Throwable th3) {
                        this.f53539b = output.m19638d();
                        throw th3;
                    }
                    this.f53539b = output.m19638d();
                    m19704j();
                    return;
                }
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class Property extends GeneratedMessageLite.ExtendableMessage<Property> implements PropertyOrBuilder {

        /* JADX INFO: renamed from: A */
        public static final Parser f53609A = new C61271();

        /* JADX INFO: renamed from: z */
        public static final Property f53610z;

        /* JADX INFO: renamed from: b */
        public final ByteString f53611b;

        /* JADX INFO: renamed from: c */
        public int f53612c;

        /* JADX INFO: renamed from: d */
        public int f53613d;

        /* JADX INFO: renamed from: f */
        public int f53614f;

        /* JADX INFO: renamed from: g */
        public int f53615g;

        /* JADX INFO: renamed from: i */
        public Type f53616i;

        /* JADX INFO: renamed from: j */
        public int f53617j;

        /* JADX INFO: renamed from: n */
        public List f53618n;

        /* JADX INFO: renamed from: o */
        public Type f53619o;

        /* JADX INFO: renamed from: p */
        public int f53620p;

        /* JADX INFO: renamed from: q */
        public List f53621q;

        /* JADX INFO: renamed from: r */
        public List f53622r;

        /* JADX INFO: renamed from: s */
        public int f53623s;

        /* JADX INFO: renamed from: t */
        public ValueParameter f53624t;

        /* JADX INFO: renamed from: u */
        public int f53625u;

        /* JADX INFO: renamed from: v */
        public int f53626v;

        /* JADX INFO: renamed from: w */
        public List f53627w;

        /* JADX INFO: renamed from: x */
        public byte f53628x;

        /* JADX INFO: renamed from: y */
        public int f53629y;

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property$1 */
        /* JADX INFO: compiled from: Proguard */
        public static class C61271 extends AbstractParser<Property> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            /* JADX INFO: renamed from: a */
            public final Object mo19417a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new Property(codedInputStream, extensionRegistryLite);
            }
        }

        /* JADX INFO: compiled from: Proguard */
        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<Property, Builder> implements PropertyOrBuilder {

            /* JADX INFO: renamed from: d */
            public int f53630d;

            /* JADX INFO: renamed from: f */
            public int f53631f;

            /* JADX INFO: renamed from: g */
            public int f53632g;

            /* JADX INFO: renamed from: i */
            public int f53633i;

            /* JADX INFO: renamed from: j */
            public Type f53634j;

            /* JADX INFO: renamed from: n */
            public int f53635n;

            /* JADX INFO: renamed from: o */
            public List f53636o;

            /* JADX INFO: renamed from: p */
            public Type f53637p;

            /* JADX INFO: renamed from: q */
            public int f53638q;

            /* JADX INFO: renamed from: r */
            public List f53639r;

            /* JADX INFO: renamed from: s */
            public List f53640s;

            /* JADX INFO: renamed from: t */
            public ValueParameter f53641t;

            /* JADX INFO: renamed from: u */
            public int f53642u;

            /* JADX INFO: renamed from: v */
            public int f53643v;

            /* JADX INFO: renamed from: w */
            public List f53644w;

            /* JADX INFO: renamed from: j */
            public static Builder m19472j() {
                Builder builder = new Builder();
                builder.f53631f = 518;
                builder.f53632g = 2054;
                Type type = Type.f53679y;
                builder.f53634j = type;
                List list = Collections.EMPTY_LIST;
                builder.f53636o = list;
                builder.f53637p = type;
                builder.f53639r = list;
                builder.f53640s = list;
                builder.f53641t = ValueParameter.f53794q;
                builder.f53644w = list;
                return builder;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: b */
            public final AbstractMessageLite.Builder mo19418b() {
                Builder builderM19472j = m19472j();
                builderM19472j.m19474k(m19473i());
                return builderM19472j;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public final MessageLite build() {
                Property propertyM19473i = m19473i();
                if (propertyM19473i.isInitialized()) {
                    return propertyM19473i;
                }
                throw new UninitializedMessageException();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: c */
            public final /* bridge */ /* synthetic */ AbstractMessageLite.Builder mo19419c(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                m19475l(codedInputStream, extensionRegistryLite);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            public final Object clone() {
                Builder builderM19472j = m19472j();
                builderM19472j.m19474k(m19473i());
                return builderM19472j;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* JADX INFO: renamed from: d */
            public final GeneratedMessageLite.Builder mo19420d() {
                Builder builderM19472j = m19472j();
                builderM19472j.m19474k(m19473i());
                return builderM19472j;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* JADX INFO: renamed from: e */
            public final /* bridge */ /* synthetic */ GeneratedMessageLite.Builder mo19421e(GeneratedMessageLite generatedMessageLite) {
                m19474k((Property) generatedMessageLite);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder
            /* JADX INFO: renamed from: f */
            public final GeneratedMessageLite.ExtendableBuilder mo19437f() {
                Builder builderM19472j = m19472j();
                builderM19472j.m19474k(m19473i());
                return builderM19472j;
            }

            /* JADX INFO: renamed from: i */
            public final Property m19473i() {
                Property property = new Property(this);
                int i = this.f53630d;
                int i2 = (i & 1) != 1 ? 0 : 1;
                property.f53613d = this.f53631f;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                property.f53614f = this.f53632g;
                if ((i & 4) == 4) {
                    i2 |= 4;
                }
                property.f53615g = this.f53633i;
                if ((i & 8) == 8) {
                    i2 |= 8;
                }
                property.f53616i = this.f53634j;
                if ((i & 16) == 16) {
                    i2 |= 16;
                }
                property.f53617j = this.f53635n;
                if ((i & 32) == 32) {
                    this.f53636o = Collections.unmodifiableList(this.f53636o);
                    this.f53630d &= -33;
                }
                property.f53618n = this.f53636o;
                if ((i & 64) == 64) {
                    i2 |= 32;
                }
                property.f53619o = this.f53637p;
                if ((i & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) == 128) {
                    i2 |= 64;
                }
                property.f53620p = this.f53638q;
                if ((this.f53630d & 256) == 256) {
                    this.f53639r = Collections.unmodifiableList(this.f53639r);
                    this.f53630d &= -257;
                }
                property.f53621q = this.f53639r;
                if ((this.f53630d & 512) == 512) {
                    this.f53640s = Collections.unmodifiableList(this.f53640s);
                    this.f53630d &= -513;
                }
                property.f53622r = this.f53640s;
                if ((i & UserMetadata.MAX_ATTRIBUTE_SIZE) == 1024) {
                    i2 |= UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                }
                property.f53624t = this.f53641t;
                if ((i & 2048) == 2048) {
                    i2 |= 256;
                }
                property.f53625u = this.f53642u;
                if ((i & 4096) == 4096) {
                    i2 |= 512;
                }
                property.f53626v = this.f53643v;
                if ((this.f53630d & UserMetadata.MAX_INTERNAL_KEY_SIZE) == 8192) {
                    this.f53644w = Collections.unmodifiableList(this.f53644w);
                    this.f53630d &= -8193;
                }
                property.f53627w = this.f53644w;
                property.f53612c = i2;
                return property;
            }

            /* JADX INFO: renamed from: k */
            public final void m19474k(Property property) {
                ValueParameter valueParameter;
                Type type;
                Type type2;
                if (property == Property.f53610z) {
                    return;
                }
                int i = property.f53612c;
                if ((i & 1) == 1) {
                    int i2 = property.f53613d;
                    this.f53630d = 1 | this.f53630d;
                    this.f53631f = i2;
                }
                if ((i & 2) == 2) {
                    int i3 = property.f53614f;
                    this.f53630d = 2 | this.f53630d;
                    this.f53632g = i3;
                }
                if ((i & 4) == 4) {
                    int i4 = property.f53615g;
                    this.f53630d = 4 | this.f53630d;
                    this.f53633i = i4;
                }
                if ((i & 8) == 8) {
                    Type type3 = property.f53616i;
                    if ((this.f53630d & 8) != 8 || (type2 = this.f53634j) == Type.f53679y) {
                        this.f53634j = type3;
                    } else {
                        Type.Builder builderM19486p = Type.m19486p(type2);
                        builderM19486p.m19496k(type3);
                        this.f53634j = builderM19486p.m19495i();
                    }
                    this.f53630d |= 8;
                }
                if ((property.f53612c & 16) == 16) {
                    int i5 = property.f53617j;
                    this.f53630d = 16 | this.f53630d;
                    this.f53635n = i5;
                }
                if (!property.f53618n.isEmpty()) {
                    if (this.f53636o.isEmpty()) {
                        this.f53636o = property.f53618n;
                        this.f53630d &= -33;
                    } else {
                        if ((this.f53630d & 32) != 32) {
                            this.f53636o = new ArrayList(this.f53636o);
                            this.f53630d |= 32;
                        }
                        this.f53636o.addAll(property.f53618n);
                    }
                }
                if ((property.f53612c & 32) == 32) {
                    Type type4 = property.f53619o;
                    if ((this.f53630d & 64) != 64 || (type = this.f53637p) == Type.f53679y) {
                        this.f53637p = type4;
                    } else {
                        Type.Builder builderM19486p2 = Type.m19486p(type);
                        builderM19486p2.m19496k(type4);
                        this.f53637p = builderM19486p2.m19495i();
                    }
                    this.f53630d |= 64;
                }
                if ((property.f53612c & 64) == 64) {
                    int i6 = property.f53620p;
                    this.f53630d |= UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                    this.f53638q = i6;
                }
                if (!property.f53621q.isEmpty()) {
                    if (this.f53639r.isEmpty()) {
                        this.f53639r = property.f53621q;
                        this.f53630d &= -257;
                    } else {
                        if ((this.f53630d & 256) != 256) {
                            this.f53639r = new ArrayList(this.f53639r);
                            this.f53630d |= 256;
                        }
                        this.f53639r.addAll(property.f53621q);
                    }
                }
                if (!property.f53622r.isEmpty()) {
                    if (this.f53640s.isEmpty()) {
                        this.f53640s = property.f53622r;
                        this.f53630d &= -513;
                    } else {
                        if ((this.f53630d & 512) != 512) {
                            this.f53640s = new ArrayList(this.f53640s);
                            this.f53630d |= 512;
                        }
                        this.f53640s.addAll(property.f53622r);
                    }
                }
                if ((property.f53612c & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) == 128) {
                    ValueParameter valueParameter2 = property.f53624t;
                    if ((this.f53630d & UserMetadata.MAX_ATTRIBUTE_SIZE) != 1024 || (valueParameter = this.f53641t) == ValueParameter.f53794q) {
                        this.f53641t = valueParameter2;
                    } else {
                        ValueParameter.Builder builder = new ValueParameter.Builder();
                        Type type5 = Type.f53679y;
                        builder.f53809i = type5;
                        builder.f53811n = type5;
                        builder.m19513j(valueParameter);
                        builder.m19513j(valueParameter2);
                        this.f53641t = builder.m19512i();
                    }
                    this.f53630d |= UserMetadata.MAX_ATTRIBUTE_SIZE;
                }
                int i7 = property.f53612c;
                if ((i7 & 256) == 256) {
                    int i8 = property.f53625u;
                    this.f53630d |= 2048;
                    this.f53642u = i8;
                }
                if ((i7 & 512) == 512) {
                    int i9 = property.f53626v;
                    this.f53630d |= 4096;
                    this.f53643v = i9;
                }
                if (!property.f53627w.isEmpty()) {
                    if (this.f53644w.isEmpty()) {
                        this.f53644w = property.f53627w;
                        this.f53630d &= -8193;
                    } else {
                        if ((this.f53630d & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 8192) {
                            this.f53644w = new ArrayList(this.f53644w);
                            this.f53630d |= UserMetadata.MAX_INTERNAL_KEY_SIZE;
                        }
                        this.f53644w.addAll(property.f53627w);
                    }
                }
                m19697h(property);
                this.f54106a = this.f54106a.m19625c(property.f53611b);
            }

            /* JADX WARN: Removed duplicated region for block: B:14:0x001d  */
            /* JADX INFO: renamed from: l */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void m19475l(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                Property property = null;
                try {
                    try {
                        ((C61271) Property.f53609A).getClass();
                        m19474k(new Property(codedInputStream, extensionRegistryLite));
                    } catch (InvalidProtocolBufferException e) {
                        Property property2 = (Property) e.f54121a;
                        try {
                            throw e;
                        } catch (Throwable th) {
                            th = th;
                            property = property2;
                            if (property != null) {
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (property != null) {
                        m19474k(property);
                    }
                    throw th;
                }
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* JADX INFO: renamed from: n */
            public final /* bridge */ /* synthetic */ MessageLite.Builder mo19425n(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                m19475l(codedInputStream, extensionRegistryLite);
                return this;
            }
        }

        static {
            Property property = new Property();
            f53610z = property;
            property.m19471m();
        }

        public Property(Builder builder) {
            super(builder);
            this.f53623s = -1;
            this.f53628x = (byte) -1;
            this.f53629y = -1;
            this.f53611b = builder.f54106a;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        /* JADX INFO: renamed from: a */
        public final void mo19416a(CodedOutputStream codedOutputStream) {
            getSerializedSize();
            GeneratedMessageLite.ExtendableMessage.ExtensionWriter extensionWriter = new GeneratedMessageLite.ExtendableMessage.ExtensionWriter(this);
            if ((this.f53612c & 2) == 2) {
                codedOutputStream.m19670m(1, this.f53614f);
            }
            if ((this.f53612c & 4) == 4) {
                codedOutputStream.m19670m(2, this.f53615g);
            }
            if ((this.f53612c & 8) == 8) {
                codedOutputStream.m19672o(3, this.f53616i);
            }
            for (int i = 0; i < this.f53618n.size(); i++) {
                codedOutputStream.m19672o(4, (MessageLite) this.f53618n.get(i));
            }
            if ((this.f53612c & 32) == 32) {
                codedOutputStream.m19672o(5, this.f53619o);
            }
            if ((this.f53612c & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) == 128) {
                codedOutputStream.m19672o(6, this.f53624t);
            }
            if ((this.f53612c & 256) == 256) {
                codedOutputStream.m19670m(7, this.f53625u);
            }
            if ((this.f53612c & 512) == 512) {
                codedOutputStream.m19670m(8, this.f53626v);
            }
            if ((this.f53612c & 16) == 16) {
                codedOutputStream.m19670m(9, this.f53617j);
            }
            if ((this.f53612c & 64) == 64) {
                codedOutputStream.m19670m(10, this.f53620p);
            }
            if ((this.f53612c & 1) == 1) {
                codedOutputStream.m19670m(11, this.f53613d);
            }
            for (int i2 = 0; i2 < this.f53621q.size(); i2++) {
                codedOutputStream.m19672o(12, (MessageLite) this.f53621q.get(i2));
            }
            if (this.f53622r.size() > 0) {
                codedOutputStream.m19679v(106);
                codedOutputStream.m19679v(this.f53623s);
            }
            for (int i3 = 0; i3 < this.f53622r.size(); i3++) {
                codedOutputStream.m19671n(((Integer) this.f53622r.get(i3)).intValue());
            }
            for (int i4 = 0; i4 < this.f53627w.size(); i4++) {
                codedOutputStream.m19670m(31, ((Integer) this.f53627w.get(i4)).intValue());
            }
            extensionWriter.m19707a(19000, codedOutputStream);
            codedOutputStream.m19675r(this.f53611b);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final MessageLite getDefaultInstanceForType() {
            return f53610z;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final int getSerializedSize() {
            int i = this.f53629y;
            if (i != -1) {
                return i;
            }
            int iM19659b = (this.f53612c & 2) == 2 ? CodedOutputStream.m19659b(1, this.f53614f) : 0;
            if ((this.f53612c & 4) == 4) {
                iM19659b += CodedOutputStream.m19659b(2, this.f53615g);
            }
            if ((this.f53612c & 8) == 8) {
                iM19659b += CodedOutputStream.m19661d(3, this.f53616i);
            }
            for (int i2 = 0; i2 < this.f53618n.size(); i2++) {
                iM19659b += CodedOutputStream.m19661d(4, (MessageLite) this.f53618n.get(i2));
            }
            if ((this.f53612c & 32) == 32) {
                iM19659b += CodedOutputStream.m19661d(5, this.f53619o);
            }
            if ((this.f53612c & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) == 128) {
                iM19659b += CodedOutputStream.m19661d(6, this.f53624t);
            }
            if ((this.f53612c & 256) == 256) {
                iM19659b += CodedOutputStream.m19659b(7, this.f53625u);
            }
            if ((this.f53612c & 512) == 512) {
                iM19659b += CodedOutputStream.m19659b(8, this.f53626v);
            }
            if ((this.f53612c & 16) == 16) {
                iM19659b += CodedOutputStream.m19659b(9, this.f53617j);
            }
            if ((this.f53612c & 64) == 64) {
                iM19659b += CodedOutputStream.m19659b(10, this.f53620p);
            }
            if ((this.f53612c & 1) == 1) {
                iM19659b += CodedOutputStream.m19659b(11, this.f53613d);
            }
            for (int i3 = 0; i3 < this.f53621q.size(); i3++) {
                iM19659b += CodedOutputStream.m19661d(12, (MessageLite) this.f53621q.get(i3));
            }
            int iM19660c = 0;
            for (int i4 = 0; i4 < this.f53622r.size(); i4++) {
                iM19660c += CodedOutputStream.m19660c(((Integer) this.f53622r.get(i4)).intValue());
            }
            int iM19660c2 = iM19659b + iM19660c;
            if (!this.f53622r.isEmpty()) {
                iM19660c2 = iM19660c2 + 1 + CodedOutputStream.m19660c(iM19660c);
            }
            this.f53623s = iM19660c;
            int iM19660c3 = 0;
            for (int i5 = 0; i5 < this.f53627w.size(); i5++) {
                iM19660c3 += CodedOutputStream.m19660c(((Integer) this.f53627w.get(i5)).intValue());
            }
            int size = this.f53611b.size() + m19699e() + AbstractC0455a.m2225D(this.f53627w, 2, iM19660c2 + iM19660c3);
            this.f53629y = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b2 = this.f53628x;
            if (b2 == 1) {
                return true;
            }
            if (b2 == 0) {
                return false;
            }
            int i = this.f53612c;
            if ((i & 4) != 4) {
                this.f53628x = (byte) 0;
                return false;
            }
            if ((i & 8) == 8 && !this.f53616i.isInitialized()) {
                this.f53628x = (byte) 0;
                return false;
            }
            for (int i2 = 0; i2 < this.f53618n.size(); i2++) {
                if (!((TypeParameter) this.f53618n.get(i2)).isInitialized()) {
                    this.f53628x = (byte) 0;
                    return false;
                }
            }
            if ((this.f53612c & 32) == 32 && !this.f53619o.isInitialized()) {
                this.f53628x = (byte) 0;
                return false;
            }
            for (int i3 = 0; i3 < this.f53621q.size(); i3++) {
                if (!((Type) this.f53621q.get(i3)).isInitialized()) {
                    this.f53628x = (byte) 0;
                    return false;
                }
            }
            if ((this.f53612c & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) == 128 && !this.f53624t.isInitialized()) {
                this.f53628x = (byte) 0;
                return false;
            }
            if (m19698d()) {
                this.f53628x = (byte) 1;
                return true;
            }
            this.f53628x = (byte) 0;
            return false;
        }

        /* JADX INFO: renamed from: m */
        public final void m19471m() {
            this.f53613d = 518;
            this.f53614f = 2054;
            this.f53615g = 0;
            Type type = Type.f53679y;
            this.f53616i = type;
            this.f53617j = 0;
            List list = Collections.EMPTY_LIST;
            this.f53618n = list;
            this.f53619o = type;
            this.f53620p = 0;
            this.f53621q = list;
            this.f53622r = list;
            this.f53624t = ValueParameter.f53794q;
            this.f53625u = 0;
            this.f53626v = 0;
            this.f53627w = list;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final MessageLite.Builder newBuilderForType() {
            return Builder.m19472j();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final MessageLite.Builder toBuilder() {
            Builder builderM19472j = Builder.m19472j();
            builderM19472j.m19474k(this);
            return builderM19472j;
        }

        public Property() {
            this.f53623s = -1;
            this.f53628x = (byte) -1;
            this.f53629y = -1;
            this.f53611b = ByteString.f54075a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r5v0 */
        /* JADX WARN: Type inference failed for: r5v1 */
        /* JADX WARN: Type inference failed for: r5v2, types: [boolean] */
        public Property(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            this.f53623s = -1;
            this.f53628x = (byte) -1;
            this.f53629y = -1;
            m19471m();
            ByteString.Output output = new ByteString.Output();
            CodedOutputStream codedOutputStreamM19666j = CodedOutputStream.m19666j(output, 1);
            boolean z2 = false;
            int i = 0;
            while (true) {
                ?? M19705k = 256;
                if (!z2) {
                    try {
                        try {
                            try {
                                int iM19652n = codedInputStream.m19652n();
                                Type.Builder builderM19486p = null;
                                ValueParameter.Builder builder = null;
                                Type.Builder builderM19486p2 = null;
                                switch (iM19652n) {
                                    case 0:
                                        z2 = true;
                                        break;
                                    case 8:
                                        this.f53612c |= 2;
                                        this.f53614f = codedInputStream.m19649k();
                                        break;
                                    case 16:
                                        this.f53612c |= 4;
                                        this.f53615g = codedInputStream.m19649k();
                                        break;
                                    case 26:
                                        if ((this.f53612c & 8) == 8) {
                                            Type type = this.f53616i;
                                            type.getClass();
                                            builderM19486p = Type.m19486p(type);
                                        }
                                        Type type2 = (Type) codedInputStream.m19645g(Type.f53680z, extensionRegistryLite);
                                        this.f53616i = type2;
                                        if (builderM19486p != null) {
                                            builderM19486p.m19496k(type2);
                                            this.f53616i = builderM19486p.m19495i();
                                        }
                                        this.f53612c |= 8;
                                        break;
                                    case 34:
                                        int i2 = (i == true ? 1 : 0) & 32;
                                        i = i;
                                        if (i2 != 32) {
                                            this.f53618n = new ArrayList();
                                            i = (i == true ? 1 : 0) | 32;
                                        }
                                        this.f53618n.add(codedInputStream.m19645g(TypeParameter.f53759s, extensionRegistryLite));
                                        break;
                                    case 42:
                                        if ((this.f53612c & 32) == 32) {
                                            Type type3 = this.f53619o;
                                            type3.getClass();
                                            builderM19486p2 = Type.m19486p(type3);
                                        }
                                        Type type4 = (Type) codedInputStream.m19645g(Type.f53680z, extensionRegistryLite);
                                        this.f53619o = type4;
                                        if (builderM19486p2 != null) {
                                            builderM19486p2.m19496k(type4);
                                            this.f53619o = builderM19486p2.m19495i();
                                        }
                                        this.f53612c |= 32;
                                        break;
                                    case 50:
                                        if ((this.f53612c & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) == 128) {
                                            ValueParameter valueParameter = this.f53624t;
                                            valueParameter.getClass();
                                            builder = new ValueParameter.Builder();
                                            Type type5 = Type.f53679y;
                                            builder.f53809i = type5;
                                            builder.f53811n = type5;
                                            builder.m19513j(valueParameter);
                                        }
                                        ValueParameter valueParameter2 = (ValueParameter) codedInputStream.m19645g(ValueParameter.f53795r, extensionRegistryLite);
                                        this.f53624t = valueParameter2;
                                        if (builder != null) {
                                            builder.m19513j(valueParameter2);
                                            this.f53624t = builder.m19512i();
                                        }
                                        this.f53612c |= UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                                        break;
                                    case 56:
                                        this.f53612c |= 256;
                                        this.f53625u = codedInputStream.m19649k();
                                        break;
                                    case UserMetadata.MAX_ATTRIBUTES /* 64 */:
                                        this.f53612c |= 512;
                                        this.f53626v = codedInputStream.m19649k();
                                        break;
                                    case 72:
                                        this.f53612c |= 16;
                                        this.f53617j = codedInputStream.m19649k();
                                        break;
                                    case 80:
                                        this.f53612c |= 64;
                                        this.f53620p = codedInputStream.m19649k();
                                        break;
                                    case 88:
                                        this.f53612c |= 1;
                                        this.f53613d = codedInputStream.m19649k();
                                        break;
                                    case 98:
                                        int i3 = (i == true ? 1 : 0) & 256;
                                        i = i;
                                        if (i3 != 256) {
                                            this.f53621q = new ArrayList();
                                            i = (i == true ? 1 : 0) | 256;
                                        }
                                        this.f53621q.add(codedInputStream.m19645g(Type.f53680z, extensionRegistryLite));
                                        break;
                                    case 104:
                                        int i4 = (i == true ? 1 : 0) & 512;
                                        i = i;
                                        if (i4 != 512) {
                                            this.f53622r = new ArrayList();
                                            i = (i == true ? 1 : 0) | 512;
                                        }
                                        this.f53622r.add(Integer.valueOf(codedInputStream.m19649k()));
                                        break;
                                    case 106:
                                        int iM19642d = codedInputStream.m19642d(codedInputStream.m19649k());
                                        int i5 = (i == true ? 1 : 0) & 512;
                                        i = i;
                                        if (i5 != 512) {
                                            i = i;
                                            if (codedInputStream.m19640b() > 0) {
                                                this.f53622r = new ArrayList();
                                                i = (i == true ? 1 : 0) | 512;
                                            }
                                        }
                                        while (codedInputStream.m19640b() > 0) {
                                            this.f53622r.add(Integer.valueOf(codedInputStream.m19649k()));
                                        }
                                        codedInputStream.m19641c(iM19642d);
                                        break;
                                    case 248:
                                        int i6 = (i == true ? 1 : 0) & UserMetadata.MAX_INTERNAL_KEY_SIZE;
                                        i = i;
                                        if (i6 != 8192) {
                                            this.f53627w = new ArrayList();
                                            i = (i == true ? 1 : 0) | UserMetadata.MAX_INTERNAL_KEY_SIZE;
                                        }
                                        this.f53627w.add(Integer.valueOf(codedInputStream.m19649k()));
                                        break;
                                    case 250:
                                        int iM19642d2 = codedInputStream.m19642d(codedInputStream.m19649k());
                                        int i7 = (i == true ? 1 : 0) & UserMetadata.MAX_INTERNAL_KEY_SIZE;
                                        i = i;
                                        if (i7 != 8192) {
                                            i = i;
                                            if (codedInputStream.m19640b() > 0) {
                                                this.f53627w = new ArrayList();
                                                i = (i == true ? 1 : 0) | UserMetadata.MAX_INTERNAL_KEY_SIZE;
                                            }
                                        }
                                        while (codedInputStream.m19640b() > 0) {
                                            this.f53627w.add(Integer.valueOf(codedInputStream.m19649k()));
                                        }
                                        codedInputStream.m19641c(iM19642d2);
                                        break;
                                    default:
                                        M19705k = m19705k(codedInputStream, codedOutputStreamM19666j, extensionRegistryLite, iM19652n);
                                        if (M19705k == 0) {
                                            z2 = true;
                                        }
                                        break;
                                }
                            } catch (IOException e) {
                                InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e.getMessage());
                                invalidProtocolBufferException.f54121a = this;
                                throw invalidProtocolBufferException;
                            }
                        } catch (InvalidProtocolBufferException e2) {
                            e2.f54121a = this;
                            throw e2;
                        }
                    } catch (Throwable th) {
                        if (((i == true ? 1 : 0) & 32) == 32) {
                            this.f53618n = Collections.unmodifiableList(this.f53618n);
                        }
                        if (((i == true ? 1 : 0) & 256) == M19705k) {
                            this.f53621q = Collections.unmodifiableList(this.f53621q);
                        }
                        if (((i == true ? 1 : 0) & 512) == 512) {
                            this.f53622r = Collections.unmodifiableList(this.f53622r);
                        }
                        if (((i == true ? 1 : 0) & UserMetadata.MAX_INTERNAL_KEY_SIZE) == 8192) {
                            this.f53627w = Collections.unmodifiableList(this.f53627w);
                        }
                        try {
                            codedOutputStreamM19666j.m19667i();
                        } catch (IOException unused) {
                        } catch (Throwable th2) {
                            this.f53611b = output.m19638d();
                            throw th2;
                        }
                        this.f53611b = output.m19638d();
                        m19704j();
                        throw th;
                    }
                } else {
                    if (((i == true ? 1 : 0) & 32) == 32) {
                        this.f53618n = Collections.unmodifiableList(this.f53618n);
                    }
                    if (((i == true ? 1 : 0) & 256) == 256) {
                        this.f53621q = Collections.unmodifiableList(this.f53621q);
                    }
                    if (((i == true ? 1 : 0) & 512) == 512) {
                        this.f53622r = Collections.unmodifiableList(this.f53622r);
                    }
                    if (((i == true ? 1 : 0) & UserMetadata.MAX_INTERNAL_KEY_SIZE) == 8192) {
                        this.f53627w = Collections.unmodifiableList(this.f53627w);
                    }
                    try {
                        codedOutputStreamM19666j.m19667i();
                    } catch (IOException unused2) {
                    } catch (Throwable th3) {
                        this.f53611b = output.m19638d();
                        throw th3;
                    }
                    this.f53611b = output.m19638d();
                    m19704j();
                    return;
                }
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class TypeParameter extends GeneratedMessageLite.ExtendableMessage<TypeParameter> implements TypeParameterOrBuilder {

        /* JADX INFO: renamed from: r */
        public static final TypeParameter f53758r;

        /* JADX INFO: renamed from: s */
        public static final Parser f53759s = new C61361();

        /* JADX INFO: renamed from: b */
        public final ByteString f53760b;

        /* JADX INFO: renamed from: c */
        public int f53761c;

        /* JADX INFO: renamed from: d */
        public int f53762d;

        /* JADX INFO: renamed from: f */
        public int f53763f;

        /* JADX INFO: renamed from: g */
        public boolean f53764g;

        /* JADX INFO: renamed from: i */
        public Variance f53765i;

        /* JADX INFO: renamed from: j */
        public List f53766j;

        /* JADX INFO: renamed from: n */
        public List f53767n;

        /* JADX INFO: renamed from: o */
        public int f53768o;

        /* JADX INFO: renamed from: p */
        public byte f53769p;

        /* JADX INFO: renamed from: q */
        public int f53770q;

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter$1 */
        /* JADX INFO: compiled from: Proguard */
        public static class C61361 extends AbstractParser<TypeParameter> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            /* JADX INFO: renamed from: a */
            public final Object mo19417a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new TypeParameter(codedInputStream, extensionRegistryLite);
            }
        }

        /* JADX INFO: compiled from: Proguard */
        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<TypeParameter, Builder> implements TypeParameterOrBuilder {

            /* JADX INFO: renamed from: d */
            public int f53771d;

            /* JADX INFO: renamed from: f */
            public int f53772f;

            /* JADX INFO: renamed from: g */
            public int f53773g;

            /* JADX INFO: renamed from: i */
            public boolean f53774i;

            /* JADX INFO: renamed from: j */
            public Variance f53775j;

            /* JADX INFO: renamed from: n */
            public List f53776n;

            /* JADX INFO: renamed from: o */
            public List f53777o;

            /* JADX INFO: renamed from: j */
            public static Builder m19502j() {
                Builder builder = new Builder();
                builder.f53775j = Variance.INV;
                List list = Collections.EMPTY_LIST;
                builder.f53776n = list;
                builder.f53777o = list;
                return builder;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: b */
            public final AbstractMessageLite.Builder mo19418b() {
                Builder builderM19502j = m19502j();
                builderM19502j.m19504k(m19503i());
                return builderM19502j;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public final MessageLite build() {
                TypeParameter typeParameterM19503i = m19503i();
                if (typeParameterM19503i.isInitialized()) {
                    return typeParameterM19503i;
                }
                throw new UninitializedMessageException();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: c */
            public final /* bridge */ /* synthetic */ AbstractMessageLite.Builder mo19419c(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                m19505l(codedInputStream, extensionRegistryLite);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            public final Object clone() {
                Builder builderM19502j = m19502j();
                builderM19502j.m19504k(m19503i());
                return builderM19502j;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* JADX INFO: renamed from: d */
            public final GeneratedMessageLite.Builder mo19420d() {
                Builder builderM19502j = m19502j();
                builderM19502j.m19504k(m19503i());
                return builderM19502j;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* JADX INFO: renamed from: e */
            public final /* bridge */ /* synthetic */ GeneratedMessageLite.Builder mo19421e(GeneratedMessageLite generatedMessageLite) {
                m19504k((TypeParameter) generatedMessageLite);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder
            /* JADX INFO: renamed from: f */
            public final GeneratedMessageLite.ExtendableBuilder mo19437f() {
                Builder builderM19502j = m19502j();
                builderM19502j.m19504k(m19503i());
                return builderM19502j;
            }

            /* JADX INFO: renamed from: i */
            public final TypeParameter m19503i() {
                TypeParameter typeParameter = new TypeParameter(this);
                int i = this.f53771d;
                int i2 = (i & 1) != 1 ? 0 : 1;
                typeParameter.f53762d = this.f53772f;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                typeParameter.f53763f = this.f53773g;
                if ((i & 4) == 4) {
                    i2 |= 4;
                }
                typeParameter.f53764g = this.f53774i;
                if ((i & 8) == 8) {
                    i2 |= 8;
                }
                typeParameter.f53765i = this.f53775j;
                if ((i & 16) == 16) {
                    this.f53776n = Collections.unmodifiableList(this.f53776n);
                    this.f53771d &= -17;
                }
                typeParameter.f53766j = this.f53776n;
                if ((this.f53771d & 32) == 32) {
                    this.f53777o = Collections.unmodifiableList(this.f53777o);
                    this.f53771d &= -33;
                }
                typeParameter.f53767n = this.f53777o;
                typeParameter.f53761c = i2;
                return typeParameter;
            }

            /* JADX INFO: renamed from: k */
            public final void m19504k(TypeParameter typeParameter) {
                if (typeParameter == TypeParameter.f53758r) {
                    return;
                }
                int i = typeParameter.f53761c;
                if ((i & 1) == 1) {
                    int i2 = typeParameter.f53762d;
                    this.f53771d = 1 | this.f53771d;
                    this.f53772f = i2;
                }
                if ((i & 2) == 2) {
                    int i3 = typeParameter.f53763f;
                    this.f53771d = 2 | this.f53771d;
                    this.f53773g = i3;
                }
                if ((i & 4) == 4) {
                    boolean z2 = typeParameter.f53764g;
                    this.f53771d = 4 | this.f53771d;
                    this.f53774i = z2;
                }
                if ((i & 8) == 8) {
                    Variance variance = typeParameter.f53765i;
                    variance.getClass();
                    this.f53771d = 8 | this.f53771d;
                    this.f53775j = variance;
                }
                if (!typeParameter.f53766j.isEmpty()) {
                    if (this.f53776n.isEmpty()) {
                        this.f53776n = typeParameter.f53766j;
                        this.f53771d &= -17;
                    } else {
                        if ((this.f53771d & 16) != 16) {
                            this.f53776n = new ArrayList(this.f53776n);
                            this.f53771d |= 16;
                        }
                        this.f53776n.addAll(typeParameter.f53766j);
                    }
                }
                if (!typeParameter.f53767n.isEmpty()) {
                    if (this.f53777o.isEmpty()) {
                        this.f53777o = typeParameter.f53767n;
                        this.f53771d &= -33;
                    } else {
                        if ((this.f53771d & 32) != 32) {
                            this.f53777o = new ArrayList(this.f53777o);
                            this.f53771d |= 32;
                        }
                        this.f53777o.addAll(typeParameter.f53767n);
                    }
                }
                m19697h(typeParameter);
                this.f54106a = this.f54106a.m19625c(typeParameter.f53760b);
            }

            /* JADX WARN: Removed duplicated region for block: B:14:0x001d  */
            /* JADX INFO: renamed from: l */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void m19505l(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                TypeParameter typeParameter = null;
                try {
                    try {
                        ((C61361) TypeParameter.f53759s).getClass();
                        m19504k(new TypeParameter(codedInputStream, extensionRegistryLite));
                    } catch (InvalidProtocolBufferException e) {
                        TypeParameter typeParameter2 = (TypeParameter) e.f54121a;
                        try {
                            throw e;
                        } catch (Throwable th) {
                            th = th;
                            typeParameter = typeParameter2;
                            if (typeParameter != null) {
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (typeParameter != null) {
                        m19504k(typeParameter);
                    }
                    throw th;
                }
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* JADX INFO: renamed from: n */
            public final /* bridge */ /* synthetic */ MessageLite.Builder mo19425n(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                m19505l(codedInputStream, extensionRegistryLite);
                return this;
            }
        }

        /* JADX INFO: compiled from: Proguard */
        public enum Variance implements Internal.EnumLite {
            IN(0),
            OUT(1),
            INV(2);


            /* JADX INFO: renamed from: a */
            public final int f53782a;

            /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter$Variance$1 */
            /* JADX INFO: compiled from: Proguard */
            public static class C61371 implements Internal.EnumLiteMap<Variance> {
            }

            Variance(int i) {
                this.f53782a = i;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
            public final int getNumber() {
                return this.f53782a;
            }
        }

        static {
            TypeParameter typeParameter = new TypeParameter();
            f53758r = typeParameter;
            typeParameter.f53762d = 0;
            typeParameter.f53763f = 0;
            typeParameter.f53764g = false;
            typeParameter.f53765i = Variance.INV;
            List list = Collections.EMPTY_LIST;
            typeParameter.f53766j = list;
            typeParameter.f53767n = list;
        }

        public TypeParameter(Builder builder) {
            super(builder);
            this.f53768o = -1;
            this.f53769p = (byte) -1;
            this.f53770q = -1;
            this.f53760b = builder.f54106a;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        /* JADX INFO: renamed from: a */
        public final void mo19416a(CodedOutputStream codedOutputStream) {
            getSerializedSize();
            GeneratedMessageLite.ExtendableMessage.ExtensionWriter extensionWriter = new GeneratedMessageLite.ExtendableMessage.ExtensionWriter(this);
            if ((this.f53761c & 1) == 1) {
                codedOutputStream.m19670m(1, this.f53762d);
            }
            if ((this.f53761c & 2) == 2) {
                codedOutputStream.m19670m(2, this.f53763f);
            }
            if ((this.f53761c & 4) == 4) {
                boolean z2 = this.f53764g;
                codedOutputStream.m19681x(3, 0);
                codedOutputStream.m19674q(z2 ? 1 : 0);
            }
            if ((this.f53761c & 8) == 8) {
                codedOutputStream.m19669l(4, this.f53765i.f53782a);
            }
            for (int i = 0; i < this.f53766j.size(); i++) {
                codedOutputStream.m19672o(5, (MessageLite) this.f53766j.get(i));
            }
            if (this.f53767n.size() > 0) {
                codedOutputStream.m19679v(50);
                codedOutputStream.m19679v(this.f53768o);
            }
            for (int i2 = 0; i2 < this.f53767n.size(); i2++) {
                codedOutputStream.m19671n(((Integer) this.f53767n.get(i2)).intValue());
            }
            extensionWriter.m19707a(1000, codedOutputStream);
            codedOutputStream.m19675r(this.f53760b);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final MessageLite getDefaultInstanceForType() {
            return f53758r;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final int getSerializedSize() {
            int i = this.f53770q;
            if (i != -1) {
                return i;
            }
            int iM19659b = (this.f53761c & 1) == 1 ? CodedOutputStream.m19659b(1, this.f53762d) : 0;
            if ((this.f53761c & 2) == 2) {
                iM19659b += CodedOutputStream.m19659b(2, this.f53763f);
            }
            if ((this.f53761c & 4) == 4) {
                iM19659b += CodedOutputStream.m19665h(3) + 1;
            }
            if ((this.f53761c & 8) == 8) {
                iM19659b += CodedOutputStream.m19658a(4, this.f53765i.f53782a);
            }
            for (int i2 = 0; i2 < this.f53766j.size(); i2++) {
                iM19659b += CodedOutputStream.m19661d(5, (MessageLite) this.f53766j.get(i2));
            }
            int iM19660c = 0;
            for (int i3 = 0; i3 < this.f53767n.size(); i3++) {
                iM19660c += CodedOutputStream.m19660c(((Integer) this.f53767n.get(i3)).intValue());
            }
            int iM19660c2 = iM19659b + iM19660c;
            if (!this.f53767n.isEmpty()) {
                iM19660c2 = iM19660c2 + 1 + CodedOutputStream.m19660c(iM19660c);
            }
            this.f53768o = iM19660c;
            int size = this.f53760b.size() + m19699e() + iM19660c2;
            this.f53770q = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b2 = this.f53769p;
            if (b2 == 1) {
                return true;
            }
            if (b2 == 0) {
                return false;
            }
            int i = this.f53761c;
            if ((i & 1) != 1) {
                this.f53769p = (byte) 0;
                return false;
            }
            if ((i & 2) != 2) {
                this.f53769p = (byte) 0;
                return false;
            }
            for (int i2 = 0; i2 < this.f53766j.size(); i2++) {
                if (!((Type) this.f53766j.get(i2)).isInitialized()) {
                    this.f53769p = (byte) 0;
                    return false;
                }
            }
            if (m19698d()) {
                this.f53769p = (byte) 1;
                return true;
            }
            this.f53769p = (byte) 0;
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final MessageLite.Builder newBuilderForType() {
            return Builder.m19502j();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final MessageLite.Builder toBuilder() {
            Builder builderM19502j = Builder.m19502j();
            builderM19502j.m19504k(this);
            return builderM19502j;
        }

        public TypeParameter() {
            this.f53768o = -1;
            this.f53769p = (byte) -1;
            this.f53770q = -1;
            this.f53760b = ByteString.f54075a;
        }

        public TypeParameter(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            Variance variance;
            this.f53768o = -1;
            this.f53769p = (byte) -1;
            this.f53770q = -1;
            this.f53762d = 0;
            this.f53763f = 0;
            this.f53764g = false;
            Variance variance2 = Variance.INV;
            this.f53765i = variance2;
            List list = Collections.EMPTY_LIST;
            this.f53766j = list;
            this.f53767n = list;
            ByteString.Output output = new ByteString.Output();
            CodedOutputStream codedOutputStreamM19666j = CodedOutputStream.m19666j(output, 1);
            boolean z2 = false;
            int i = 0;
            while (!z2) {
                try {
                    try {
                        int iM19652n = codedInputStream.m19652n();
                        if (iM19652n != 0) {
                            if (iM19652n == 8) {
                                this.f53761c |= 1;
                                this.f53762d = codedInputStream.m19649k();
                            } else if (iM19652n == 16) {
                                this.f53761c |= 2;
                                this.f53763f = codedInputStream.m19649k();
                            } else if (iM19652n == 24) {
                                this.f53761c |= 4;
                                this.f53764g = codedInputStream.m19650l() != 0;
                            } else if (iM19652n == 32) {
                                int iM19649k = codedInputStream.m19649k();
                                if (iM19649k == 0) {
                                    variance = Variance.IN;
                                } else if (iM19649k != 1) {
                                    variance = iM19649k != 2 ? null : variance2;
                                } else {
                                    variance = Variance.OUT;
                                }
                                if (variance == null) {
                                    codedOutputStreamM19666j.m19679v(iM19652n);
                                    codedOutputStreamM19666j.m19679v(iM19649k);
                                } else {
                                    this.f53761c |= 8;
                                    this.f53765i = variance;
                                }
                            } else if (iM19652n == 42) {
                                if ((i & 16) != 16) {
                                    this.f53766j = new ArrayList();
                                    i |= 16;
                                }
                                this.f53766j.add(codedInputStream.m19645g(Type.f53680z, extensionRegistryLite));
                            } else if (iM19652n == 48) {
                                if ((i & 32) != 32) {
                                    this.f53767n = new ArrayList();
                                    i |= 32;
                                }
                                this.f53767n.add(Integer.valueOf(codedInputStream.m19649k()));
                            } else if (iM19652n != 50) {
                                if (!m19705k(codedInputStream, codedOutputStreamM19666j, extensionRegistryLite, iM19652n)) {
                                }
                            } else {
                                int iM19642d = codedInputStream.m19642d(codedInputStream.m19649k());
                                if ((i & 32) != 32 && codedInputStream.m19640b() > 0) {
                                    this.f53767n = new ArrayList();
                                    i |= 32;
                                }
                                while (codedInputStream.m19640b() > 0) {
                                    this.f53767n.add(Integer.valueOf(codedInputStream.m19649k()));
                                }
                                codedInputStream.m19641c(iM19642d);
                            }
                        }
                        z2 = true;
                    } catch (Throwable th) {
                        if ((i & 16) == 16) {
                            this.f53766j = Collections.unmodifiableList(this.f53766j);
                        }
                        if ((i & 32) == 32) {
                            this.f53767n = Collections.unmodifiableList(this.f53767n);
                        }
                        try {
                            codedOutputStreamM19666j.m19667i();
                        } catch (IOException unused) {
                        } catch (Throwable th2) {
                            this.f53760b = output.m19638d();
                            throw th2;
                        }
                        this.f53760b = output.m19638d();
                        m19704j();
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
            if ((i & 16) == 16) {
                this.f53766j = Collections.unmodifiableList(this.f53766j);
            }
            if ((i & 32) == 32) {
                this.f53767n = Collections.unmodifiableList(this.f53767n);
            }
            try {
                codedOutputStreamM19666j.m19667i();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.f53760b = output.m19638d();
                throw th3;
            }
            this.f53760b = output.m19638d();
            m19704j();
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class Class extends GeneratedMessageLite.ExtendableMessage<Class> implements ClassOrBuilder {

        /* JADX INFO: renamed from: O */
        public static final Class f53388O;

        /* JADX INFO: renamed from: P */
        public static final Parser f53389P = new C61121();

        /* JADX INFO: renamed from: A */
        public int f53390A;

        /* JADX INFO: renamed from: B */
        public int f53391B;

        /* JADX INFO: renamed from: C */
        public Type f53392C;

        /* JADX INFO: renamed from: D */
        public int f53393D;

        /* JADX INFO: renamed from: E */
        public List f53394E;

        /* JADX INFO: renamed from: F */
        public int f53395F;

        /* JADX INFO: renamed from: G */
        public List f53396G;

        /* JADX INFO: renamed from: H */
        public List f53397H;

        /* JADX INFO: renamed from: I */
        public int f53398I;

        /* JADX INFO: renamed from: J */
        public TypeTable f53399J;

        /* JADX INFO: renamed from: K */
        public List f53400K;

        /* JADX INFO: renamed from: L */
        public VersionRequirementTable f53401L;

        /* JADX INFO: renamed from: M */
        public byte f53402M;

        /* JADX INFO: renamed from: N */
        public int f53403N;

        /* JADX INFO: renamed from: b */
        public final ByteString f53404b;

        /* JADX INFO: renamed from: c */
        public int f53405c;

        /* JADX INFO: renamed from: d */
        public int f53406d;

        /* JADX INFO: renamed from: f */
        public int f53407f;

        /* JADX INFO: renamed from: g */
        public int f53408g;

        /* JADX INFO: renamed from: i */
        public List f53409i;

        /* JADX INFO: renamed from: j */
        public List f53410j;

        /* JADX INFO: renamed from: n */
        public List f53411n;

        /* JADX INFO: renamed from: o */
        public int f53412o;

        /* JADX INFO: renamed from: p */
        public List f53413p;

        /* JADX INFO: renamed from: q */
        public int f53414q;

        /* JADX INFO: renamed from: r */
        public List f53415r;

        /* JADX INFO: renamed from: s */
        public List f53416s;

        /* JADX INFO: renamed from: t */
        public int f53417t;

        /* JADX INFO: renamed from: u */
        public List f53418u;

        /* JADX INFO: renamed from: v */
        public List f53419v;

        /* JADX INFO: renamed from: w */
        public List f53420w;

        /* JADX INFO: renamed from: x */
        public List f53421x;

        /* JADX INFO: renamed from: y */
        public List f53422y;

        /* JADX INFO: renamed from: z */
        public List f53423z;

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class$1 */
        /* JADX INFO: compiled from: Proguard */
        public static class C61121 extends AbstractParser<Class> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            /* JADX INFO: renamed from: a */
            public final Object mo19417a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new Class(codedInputStream, extensionRegistryLite);
            }
        }

        /* JADX INFO: compiled from: Proguard */
        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<Class, Builder> implements ClassOrBuilder {

            /* JADX INFO: renamed from: A */
            public int f53424A;

            /* JADX INFO: renamed from: B */
            public List f53425B;

            /* JADX INFO: renamed from: C */
            public List f53426C;

            /* JADX INFO: renamed from: D */
            public List f53427D;

            /* JADX INFO: renamed from: E */
            public TypeTable f53428E;

            /* JADX INFO: renamed from: F */
            public List f53429F;

            /* JADX INFO: renamed from: G */
            public VersionRequirementTable f53430G;

            /* JADX INFO: renamed from: d */
            public int f53431d;

            /* JADX INFO: renamed from: f */
            public int f53432f;

            /* JADX INFO: renamed from: g */
            public int f53433g;

            /* JADX INFO: renamed from: i */
            public int f53434i;

            /* JADX INFO: renamed from: j */
            public List f53435j;

            /* JADX INFO: renamed from: n */
            public List f53436n;

            /* JADX INFO: renamed from: o */
            public List f53437o;

            /* JADX INFO: renamed from: p */
            public List f53438p;

            /* JADX INFO: renamed from: q */
            public List f53439q;

            /* JADX INFO: renamed from: r */
            public List f53440r;

            /* JADX INFO: renamed from: s */
            public List f53441s;

            /* JADX INFO: renamed from: t */
            public List f53442t;

            /* JADX INFO: renamed from: u */
            public List f53443u;

            /* JADX INFO: renamed from: v */
            public List f53444v;

            /* JADX INFO: renamed from: w */
            public List f53445w;

            /* JADX INFO: renamed from: x */
            public List f53446x;

            /* JADX INFO: renamed from: y */
            public int f53447y;

            /* JADX INFO: renamed from: z */
            public Type f53448z;

            /* JADX INFO: renamed from: j */
            public static Builder m19436j() {
                Builder builder = new Builder();
                builder.f53432f = 6;
                List list = Collections.EMPTY_LIST;
                builder.f53435j = list;
                builder.f53436n = list;
                builder.f53437o = list;
                builder.f53438p = list;
                builder.f53439q = list;
                builder.f53440r = list;
                builder.f53441s = list;
                builder.f53442t = list;
                builder.f53443u = list;
                builder.f53444v = list;
                builder.f53445w = list;
                builder.f53446x = list;
                builder.f53448z = Type.f53679y;
                builder.f53425B = list;
                builder.f53426C = list;
                builder.f53427D = list;
                builder.f53428E = TypeTable.f53783i;
                builder.f53429F = list;
                builder.f53430G = VersionRequirementTable.f53842f;
                return builder;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: b */
            public final AbstractMessageLite.Builder mo19418b() {
                Builder builderM19436j = m19436j();
                builderM19436j.m19439k(m19438i());
                return builderM19436j;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public final MessageLite build() {
                Class classM19438i = m19438i();
                if (classM19438i.isInitialized()) {
                    return classM19438i;
                }
                throw new UninitializedMessageException();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: c */
            public final /* bridge */ /* synthetic */ AbstractMessageLite.Builder mo19419c(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                m19440l(codedInputStream, extensionRegistryLite);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            public final Object clone() {
                Builder builderM19436j = m19436j();
                builderM19436j.m19439k(m19438i());
                return builderM19436j;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* JADX INFO: renamed from: d */
            public final GeneratedMessageLite.Builder mo19420d() {
                Builder builderM19436j = m19436j();
                builderM19436j.m19439k(m19438i());
                return builderM19436j;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* JADX INFO: renamed from: e */
            public final /* bridge */ /* synthetic */ GeneratedMessageLite.Builder mo19421e(GeneratedMessageLite generatedMessageLite) {
                m19439k((Class) generatedMessageLite);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder
            /* JADX INFO: renamed from: f */
            public final GeneratedMessageLite.ExtendableBuilder mo19437f() {
                Builder builderM19436j = m19436j();
                builderM19436j.m19439k(m19438i());
                return builderM19436j;
            }

            /* JADX INFO: renamed from: i */
            public final Class m19438i() {
                Class r0 = new Class(this);
                int i = this.f53431d;
                int i2 = (i & 1) != 1 ? 0 : 1;
                r0.f53406d = this.f53432f;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                r0.f53407f = this.f53433g;
                if ((i & 4) == 4) {
                    i2 |= 4;
                }
                r0.f53408g = this.f53434i;
                if ((i & 8) == 8) {
                    this.f53435j = Collections.unmodifiableList(this.f53435j);
                    this.f53431d &= -9;
                }
                r0.f53409i = this.f53435j;
                if ((this.f53431d & 16) == 16) {
                    this.f53436n = Collections.unmodifiableList(this.f53436n);
                    this.f53431d &= -17;
                }
                r0.f53410j = this.f53436n;
                if ((this.f53431d & 32) == 32) {
                    this.f53437o = Collections.unmodifiableList(this.f53437o);
                    this.f53431d &= -33;
                }
                r0.f53411n = this.f53437o;
                if ((this.f53431d & 64) == 64) {
                    this.f53438p = Collections.unmodifiableList(this.f53438p);
                    this.f53431d &= -65;
                }
                r0.f53413p = this.f53438p;
                if ((this.f53431d & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) == 128) {
                    this.f53439q = Collections.unmodifiableList(this.f53439q);
                    this.f53431d &= -129;
                }
                r0.f53415r = this.f53439q;
                if ((this.f53431d & 256) == 256) {
                    this.f53440r = Collections.unmodifiableList(this.f53440r);
                    this.f53431d &= -257;
                }
                r0.f53416s = this.f53440r;
                if ((this.f53431d & 512) == 512) {
                    this.f53441s = Collections.unmodifiableList(this.f53441s);
                    this.f53431d &= -513;
                }
                r0.f53418u = this.f53441s;
                if ((this.f53431d & UserMetadata.MAX_ATTRIBUTE_SIZE) == 1024) {
                    this.f53442t = Collections.unmodifiableList(this.f53442t);
                    this.f53431d &= -1025;
                }
                r0.f53419v = this.f53442t;
                if ((this.f53431d & 2048) == 2048) {
                    this.f53443u = Collections.unmodifiableList(this.f53443u);
                    this.f53431d &= -2049;
                }
                r0.f53420w = this.f53443u;
                if ((this.f53431d & 4096) == 4096) {
                    this.f53444v = Collections.unmodifiableList(this.f53444v);
                    this.f53431d &= -4097;
                }
                r0.f53421x = this.f53444v;
                if ((this.f53431d & UserMetadata.MAX_INTERNAL_KEY_SIZE) == 8192) {
                    this.f53445w = Collections.unmodifiableList(this.f53445w);
                    this.f53431d &= -8193;
                }
                r0.f53422y = this.f53445w;
                if ((this.f53431d & 16384) == 16384) {
                    this.f53446x = Collections.unmodifiableList(this.f53446x);
                    this.f53431d &= -16385;
                }
                r0.f53423z = this.f53446x;
                if ((i & 32768) == 32768) {
                    i2 |= 8;
                }
                r0.f53391B = this.f53447y;
                if ((i & 65536) == 65536) {
                    i2 |= 16;
                }
                r0.f53392C = this.f53448z;
                if ((i & 131072) == 131072) {
                    i2 |= 32;
                }
                r0.f53393D = this.f53424A;
                if ((this.f53431d & 262144) == 262144) {
                    this.f53425B = Collections.unmodifiableList(this.f53425B);
                    this.f53431d &= -262145;
                }
                r0.f53394E = this.f53425B;
                if ((this.f53431d & 524288) == 524288) {
                    this.f53426C = Collections.unmodifiableList(this.f53426C);
                    this.f53431d &= -524289;
                }
                r0.f53396G = this.f53426C;
                if ((this.f53431d & 1048576) == 1048576) {
                    this.f53427D = Collections.unmodifiableList(this.f53427D);
                    this.f53431d &= -1048577;
                }
                r0.f53397H = this.f53427D;
                if ((i & 2097152) == 2097152) {
                    i2 |= 64;
                }
                r0.f53399J = this.f53428E;
                if ((this.f53431d & 4194304) == 4194304) {
                    this.f53429F = Collections.unmodifiableList(this.f53429F);
                    this.f53431d &= -4194305;
                }
                r0.f53400K = this.f53429F;
                if ((i & 8388608) == 8388608) {
                    i2 |= UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                }
                r0.f53401L = this.f53430G;
                r0.f53405c = i2;
                return r0;
            }

            /* JADX INFO: renamed from: k */
            public final void m19439k(Class r9) {
                VersionRequirementTable versionRequirementTable;
                TypeTable typeTable;
                Type type;
                if (r9 == Class.f53388O) {
                    return;
                }
                int i = r9.f53405c;
                if ((i & 1) == 1) {
                    int i2 = r9.f53406d;
                    this.f53431d = 1 | this.f53431d;
                    this.f53432f = i2;
                }
                if ((i & 2) == 2) {
                    int i3 = r9.f53407f;
                    this.f53431d = 2 | this.f53431d;
                    this.f53433g = i3;
                }
                if ((i & 4) == 4) {
                    int i4 = r9.f53408g;
                    this.f53431d = 4 | this.f53431d;
                    this.f53434i = i4;
                }
                if (!r9.f53409i.isEmpty()) {
                    if (this.f53435j.isEmpty()) {
                        this.f53435j = r9.f53409i;
                        this.f53431d &= -9;
                    } else {
                        if ((this.f53431d & 8) != 8) {
                            this.f53435j = new ArrayList(this.f53435j);
                            this.f53431d |= 8;
                        }
                        this.f53435j.addAll(r9.f53409i);
                    }
                }
                if (!r9.f53410j.isEmpty()) {
                    if (this.f53436n.isEmpty()) {
                        this.f53436n = r9.f53410j;
                        this.f53431d &= -17;
                    } else {
                        if ((this.f53431d & 16) != 16) {
                            this.f53436n = new ArrayList(this.f53436n);
                            this.f53431d |= 16;
                        }
                        this.f53436n.addAll(r9.f53410j);
                    }
                }
                if (!r9.f53411n.isEmpty()) {
                    if (this.f53437o.isEmpty()) {
                        this.f53437o = r9.f53411n;
                        this.f53431d &= -33;
                    } else {
                        if ((this.f53431d & 32) != 32) {
                            this.f53437o = new ArrayList(this.f53437o);
                            this.f53431d |= 32;
                        }
                        this.f53437o.addAll(r9.f53411n);
                    }
                }
                if (!r9.f53413p.isEmpty()) {
                    if (this.f53438p.isEmpty()) {
                        this.f53438p = r9.f53413p;
                        this.f53431d &= -65;
                    } else {
                        if ((this.f53431d & 64) != 64) {
                            this.f53438p = new ArrayList(this.f53438p);
                            this.f53431d |= 64;
                        }
                        this.f53438p.addAll(r9.f53413p);
                    }
                }
                if (!r9.f53415r.isEmpty()) {
                    if (this.f53439q.isEmpty()) {
                        this.f53439q = r9.f53415r;
                        this.f53431d &= -129;
                    } else {
                        if ((this.f53431d & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 128) {
                            this.f53439q = new ArrayList(this.f53439q);
                            this.f53431d |= UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                        }
                        this.f53439q.addAll(r9.f53415r);
                    }
                }
                if (!r9.f53416s.isEmpty()) {
                    if (this.f53440r.isEmpty()) {
                        this.f53440r = r9.f53416s;
                        this.f53431d &= -257;
                    } else {
                        if ((this.f53431d & 256) != 256) {
                            this.f53440r = new ArrayList(this.f53440r);
                            this.f53431d |= 256;
                        }
                        this.f53440r.addAll(r9.f53416s);
                    }
                }
                if (!r9.f53418u.isEmpty()) {
                    if (this.f53441s.isEmpty()) {
                        this.f53441s = r9.f53418u;
                        this.f53431d &= -513;
                    } else {
                        if ((this.f53431d & 512) != 512) {
                            this.f53441s = new ArrayList(this.f53441s);
                            this.f53431d |= 512;
                        }
                        this.f53441s.addAll(r9.f53418u);
                    }
                }
                if (!r9.f53419v.isEmpty()) {
                    if (this.f53442t.isEmpty()) {
                        this.f53442t = r9.f53419v;
                        this.f53431d &= -1025;
                    } else {
                        if ((this.f53431d & UserMetadata.MAX_ATTRIBUTE_SIZE) != 1024) {
                            this.f53442t = new ArrayList(this.f53442t);
                            this.f53431d |= UserMetadata.MAX_ATTRIBUTE_SIZE;
                        }
                        this.f53442t.addAll(r9.f53419v);
                    }
                }
                if (!r9.f53420w.isEmpty()) {
                    if (this.f53443u.isEmpty()) {
                        this.f53443u = r9.f53420w;
                        this.f53431d &= -2049;
                    } else {
                        if ((this.f53431d & 2048) != 2048) {
                            this.f53443u = new ArrayList(this.f53443u);
                            this.f53431d |= 2048;
                        }
                        this.f53443u.addAll(r9.f53420w);
                    }
                }
                if (!r9.f53421x.isEmpty()) {
                    if (this.f53444v.isEmpty()) {
                        this.f53444v = r9.f53421x;
                        this.f53431d &= -4097;
                    } else {
                        if ((this.f53431d & 4096) != 4096) {
                            this.f53444v = new ArrayList(this.f53444v);
                            this.f53431d |= 4096;
                        }
                        this.f53444v.addAll(r9.f53421x);
                    }
                }
                if (!r9.f53422y.isEmpty()) {
                    if (this.f53445w.isEmpty()) {
                        this.f53445w = r9.f53422y;
                        this.f53431d &= -8193;
                    } else {
                        if ((this.f53431d & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 8192) {
                            this.f53445w = new ArrayList(this.f53445w);
                            this.f53431d |= UserMetadata.MAX_INTERNAL_KEY_SIZE;
                        }
                        this.f53445w.addAll(r9.f53422y);
                    }
                }
                if (!r9.f53423z.isEmpty()) {
                    if (this.f53446x.isEmpty()) {
                        this.f53446x = r9.f53423z;
                        this.f53431d &= -16385;
                    } else {
                        if ((this.f53431d & 16384) != 16384) {
                            this.f53446x = new ArrayList(this.f53446x);
                            this.f53431d |= 16384;
                        }
                        this.f53446x.addAll(r9.f53423z);
                    }
                }
                int i5 = r9.f53405c;
                if ((i5 & 8) == 8) {
                    int i6 = r9.f53391B;
                    this.f53431d |= 32768;
                    this.f53447y = i6;
                }
                if ((i5 & 16) == 16) {
                    Type type2 = r9.f53392C;
                    if ((this.f53431d & 65536) != 65536 || (type = this.f53448z) == Type.f53679y) {
                        this.f53448z = type2;
                    } else {
                        Type.Builder builderM19486p = Type.m19486p(type);
                        builderM19486p.m19496k(type2);
                        this.f53448z = builderM19486p.m19495i();
                    }
                    this.f53431d |= 65536;
                }
                if ((r9.f53405c & 32) == 32) {
                    int i7 = r9.f53393D;
                    this.f53431d |= 131072;
                    this.f53424A = i7;
                }
                if (!r9.f53394E.isEmpty()) {
                    if (this.f53425B.isEmpty()) {
                        this.f53425B = r9.f53394E;
                        this.f53431d &= -262145;
                    } else {
                        if ((this.f53431d & 262144) != 262144) {
                            this.f53425B = new ArrayList(this.f53425B);
                            this.f53431d |= 262144;
                        }
                        this.f53425B.addAll(r9.f53394E);
                    }
                }
                if (!r9.f53396G.isEmpty()) {
                    if (this.f53426C.isEmpty()) {
                        this.f53426C = r9.f53396G;
                        this.f53431d &= -524289;
                    } else {
                        if ((this.f53431d & 524288) != 524288) {
                            this.f53426C = new ArrayList(this.f53426C);
                            this.f53431d |= 524288;
                        }
                        this.f53426C.addAll(r9.f53396G);
                    }
                }
                if (!r9.f53397H.isEmpty()) {
                    if (this.f53427D.isEmpty()) {
                        this.f53427D = r9.f53397H;
                        this.f53431d &= -1048577;
                    } else {
                        if ((this.f53431d & 1048576) != 1048576) {
                            this.f53427D = new ArrayList(this.f53427D);
                            this.f53431d |= 1048576;
                        }
                        this.f53427D.addAll(r9.f53397H);
                    }
                }
                if ((r9.f53405c & 64) == 64) {
                    TypeTable typeTable2 = r9.f53399J;
                    if ((this.f53431d & 2097152) != 2097152 || (typeTable = this.f53428E) == TypeTable.f53783i) {
                        this.f53428E = typeTable2;
                    } else {
                        TypeTable.Builder builderM19506d = TypeTable.m19506d(typeTable);
                        builderM19506d.m19510i(typeTable2);
                        this.f53428E = builderM19506d.m19509f();
                    }
                    this.f53431d |= 2097152;
                }
                if (!r9.f53400K.isEmpty()) {
                    if (this.f53429F.isEmpty()) {
                        this.f53429F = r9.f53400K;
                        this.f53431d &= -4194305;
                    } else {
                        if ((this.f53431d & 4194304) != 4194304) {
                            this.f53429F = new ArrayList(this.f53429F);
                            this.f53431d |= 4194304;
                        }
                        this.f53429F.addAll(r9.f53400K);
                    }
                }
                if ((r9.f53405c & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) == 128) {
                    VersionRequirementTable versionRequirementTable2 = r9.f53401L;
                    if ((this.f53431d & 8388608) != 8388608 || (versionRequirementTable = this.f53430G) == VersionRequirementTable.f53842f) {
                        this.f53430G = versionRequirementTable2;
                    } else {
                        VersionRequirementTable.Builder builder = new VersionRequirementTable.Builder();
                        builder.f53849c = Collections.EMPTY_LIST;
                        builder.m19521h(versionRequirementTable);
                        builder.m19521h(versionRequirementTable2);
                        this.f53430G = builder.m19520f();
                    }
                    this.f53431d |= 8388608;
                }
                m19697h(r9);
                this.f54106a = this.f54106a.m19625c(r9.f53404b);
            }

            /* JADX WARN: Removed duplicated region for block: B:14:0x001d  */
            /* JADX INFO: renamed from: l */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void m19440l(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                Class r0 = null;
                try {
                    try {
                        ((C61121) Class.f53389P).getClass();
                        m19439k(new Class(codedInputStream, extensionRegistryLite));
                    } catch (InvalidProtocolBufferException e) {
                        Class r4 = (Class) e.f54121a;
                        try {
                            throw e;
                        } catch (Throwable th) {
                            th = th;
                            r0 = r4;
                            if (r0 != null) {
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (r0 != null) {
                        m19439k(r0);
                    }
                    throw th;
                }
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* JADX INFO: renamed from: n */
            public final /* bridge */ /* synthetic */ MessageLite.Builder mo19425n(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                m19440l(codedInputStream, extensionRegistryLite);
                return this;
            }
        }

        /* JADX INFO: compiled from: Proguard */
        public enum Kind implements Internal.EnumLite {
            CLASS(0),
            INTERFACE(1),
            ENUM_CLASS(2),
            /* JADX INFO: Fake field, exist only in values array */
            ENUM_ENTRY(3),
            ANNOTATION_CLASS(4),
            /* JADX INFO: Fake field, exist only in values array */
            OBJECT(5),
            COMPANION_OBJECT(6);


            /* JADX INFO: renamed from: a */
            public final int f53455a;

            /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class$Kind$1 */
            /* JADX INFO: compiled from: Proguard */
            public static class C61131 implements Internal.EnumLiteMap<Kind> {
            }

            Kind(int i) {
                this.f53455a = i;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
            public final int getNumber() {
                return this.f53455a;
            }
        }

        static {
            Class r0 = new Class();
            f53388O = r0;
            r0.m19435m();
        }

        public Class(Builder builder) {
            super(builder);
            this.f53412o = -1;
            this.f53414q = -1;
            this.f53417t = -1;
            this.f53390A = -1;
            this.f53395F = -1;
            this.f53398I = -1;
            this.f53402M = (byte) -1;
            this.f53403N = -1;
            this.f53404b = builder.f54106a;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        /* JADX INFO: renamed from: a */
        public final void mo19416a(CodedOutputStream codedOutputStream) {
            getSerializedSize();
            GeneratedMessageLite.ExtendableMessage.ExtensionWriter extensionWriter = new GeneratedMessageLite.ExtendableMessage.ExtensionWriter(this);
            if ((this.f53405c & 1) == 1) {
                codedOutputStream.m19670m(1, this.f53406d);
            }
            if (this.f53411n.size() > 0) {
                codedOutputStream.m19679v(18);
                codedOutputStream.m19679v(this.f53412o);
            }
            for (int i = 0; i < this.f53411n.size(); i++) {
                codedOutputStream.m19671n(((Integer) this.f53411n.get(i)).intValue());
            }
            if ((this.f53405c & 2) == 2) {
                codedOutputStream.m19670m(3, this.f53407f);
            }
            if ((this.f53405c & 4) == 4) {
                codedOutputStream.m19670m(4, this.f53408g);
            }
            for (int i2 = 0; i2 < this.f53409i.size(); i2++) {
                codedOutputStream.m19672o(5, (MessageLite) this.f53409i.get(i2));
            }
            for (int i3 = 0; i3 < this.f53410j.size(); i3++) {
                codedOutputStream.m19672o(6, (MessageLite) this.f53410j.get(i3));
            }
            if (this.f53413p.size() > 0) {
                codedOutputStream.m19679v(58);
                codedOutputStream.m19679v(this.f53414q);
            }
            for (int i4 = 0; i4 < this.f53413p.size(); i4++) {
                codedOutputStream.m19671n(((Integer) this.f53413p.get(i4)).intValue());
            }
            for (int i5 = 0; i5 < this.f53418u.size(); i5++) {
                codedOutputStream.m19672o(8, (MessageLite) this.f53418u.get(i5));
            }
            for (int i6 = 0; i6 < this.f53419v.size(); i6++) {
                codedOutputStream.m19672o(9, (MessageLite) this.f53419v.get(i6));
            }
            for (int i7 = 0; i7 < this.f53420w.size(); i7++) {
                codedOutputStream.m19672o(10, (MessageLite) this.f53420w.get(i7));
            }
            for (int i8 = 0; i8 < this.f53421x.size(); i8++) {
                codedOutputStream.m19672o(11, (MessageLite) this.f53421x.get(i8));
            }
            for (int i9 = 0; i9 < this.f53422y.size(); i9++) {
                codedOutputStream.m19672o(13, (MessageLite) this.f53422y.get(i9));
            }
            if (this.f53423z.size() > 0) {
                codedOutputStream.m19679v(130);
                codedOutputStream.m19679v(this.f53390A);
            }
            for (int i10 = 0; i10 < this.f53423z.size(); i10++) {
                codedOutputStream.m19671n(((Integer) this.f53423z.get(i10)).intValue());
            }
            if ((this.f53405c & 8) == 8) {
                codedOutputStream.m19670m(17, this.f53391B);
            }
            if ((this.f53405c & 16) == 16) {
                codedOutputStream.m19672o(18, this.f53392C);
            }
            if ((this.f53405c & 32) == 32) {
                codedOutputStream.m19670m(19, this.f53393D);
            }
            for (int i11 = 0; i11 < this.f53415r.size(); i11++) {
                codedOutputStream.m19672o(20, (MessageLite) this.f53415r.get(i11));
            }
            if (this.f53416s.size() > 0) {
                codedOutputStream.m19679v(170);
                codedOutputStream.m19679v(this.f53417t);
            }
            for (int i12 = 0; i12 < this.f53416s.size(); i12++) {
                codedOutputStream.m19671n(((Integer) this.f53416s.get(i12)).intValue());
            }
            if (this.f53394E.size() > 0) {
                codedOutputStream.m19679v(178);
                codedOutputStream.m19679v(this.f53395F);
            }
            for (int i13 = 0; i13 < this.f53394E.size(); i13++) {
                codedOutputStream.m19671n(((Integer) this.f53394E.get(i13)).intValue());
            }
            for (int i14 = 0; i14 < this.f53396G.size(); i14++) {
                codedOutputStream.m19672o(23, (MessageLite) this.f53396G.get(i14));
            }
            if (this.f53397H.size() > 0) {
                codedOutputStream.m19679v(194);
                codedOutputStream.m19679v(this.f53398I);
            }
            for (int i15 = 0; i15 < this.f53397H.size(); i15++) {
                codedOutputStream.m19671n(((Integer) this.f53397H.get(i15)).intValue());
            }
            if ((this.f53405c & 64) == 64) {
                codedOutputStream.m19672o(30, this.f53399J);
            }
            for (int i16 = 0; i16 < this.f53400K.size(); i16++) {
                codedOutputStream.m19670m(31, ((Integer) this.f53400K.get(i16)).intValue());
            }
            if ((this.f53405c & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) == 128) {
                codedOutputStream.m19672o(32, this.f53401L);
            }
            extensionWriter.m19707a(19000, codedOutputStream);
            codedOutputStream.m19675r(this.f53404b);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final MessageLite getDefaultInstanceForType() {
            return f53388O;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final int getSerializedSize() {
            int i = this.f53403N;
            if (i != -1) {
                return i;
            }
            int iM19659b = (this.f53405c & 1) == 1 ? CodedOutputStream.m19659b(1, this.f53406d) : 0;
            int iM19660c = 0;
            for (int i2 = 0; i2 < this.f53411n.size(); i2++) {
                iM19660c += CodedOutputStream.m19660c(((Integer) this.f53411n.get(i2)).intValue());
            }
            int iM19661d = iM19659b + iM19660c;
            if (!this.f53411n.isEmpty()) {
                iM19661d = iM19661d + 1 + CodedOutputStream.m19660c(iM19660c);
            }
            this.f53412o = iM19660c;
            if ((this.f53405c & 2) == 2) {
                iM19661d += CodedOutputStream.m19659b(3, this.f53407f);
            }
            if ((this.f53405c & 4) == 4) {
                iM19661d += CodedOutputStream.m19659b(4, this.f53408g);
            }
            for (int i3 = 0; i3 < this.f53409i.size(); i3++) {
                iM19661d += CodedOutputStream.m19661d(5, (MessageLite) this.f53409i.get(i3));
            }
            for (int i4 = 0; i4 < this.f53410j.size(); i4++) {
                iM19661d += CodedOutputStream.m19661d(6, (MessageLite) this.f53410j.get(i4));
            }
            int iM19660c2 = 0;
            for (int i5 = 0; i5 < this.f53413p.size(); i5++) {
                iM19660c2 += CodedOutputStream.m19660c(((Integer) this.f53413p.get(i5)).intValue());
            }
            int iM19661d2 = iM19661d + iM19660c2;
            if (!this.f53413p.isEmpty()) {
                iM19661d2 = iM19661d2 + 1 + CodedOutputStream.m19660c(iM19660c2);
            }
            this.f53414q = iM19660c2;
            for (int i6 = 0; i6 < this.f53418u.size(); i6++) {
                iM19661d2 += CodedOutputStream.m19661d(8, (MessageLite) this.f53418u.get(i6));
            }
            for (int i7 = 0; i7 < this.f53419v.size(); i7++) {
                iM19661d2 += CodedOutputStream.m19661d(9, (MessageLite) this.f53419v.get(i7));
            }
            for (int i8 = 0; i8 < this.f53420w.size(); i8++) {
                iM19661d2 += CodedOutputStream.m19661d(10, (MessageLite) this.f53420w.get(i8));
            }
            for (int i9 = 0; i9 < this.f53421x.size(); i9++) {
                iM19661d2 += CodedOutputStream.m19661d(11, (MessageLite) this.f53421x.get(i9));
            }
            for (int i10 = 0; i10 < this.f53422y.size(); i10++) {
                iM19661d2 += CodedOutputStream.m19661d(13, (MessageLite) this.f53422y.get(i10));
            }
            int iM19660c3 = 0;
            for (int i11 = 0; i11 < this.f53423z.size(); i11++) {
                iM19660c3 += CodedOutputStream.m19660c(((Integer) this.f53423z.get(i11)).intValue());
            }
            int iM19661d3 = iM19661d2 + iM19660c3;
            if (!this.f53423z.isEmpty()) {
                iM19661d3 = iM19661d3 + 2 + CodedOutputStream.m19660c(iM19660c3);
            }
            this.f53390A = iM19660c3;
            if ((this.f53405c & 8) == 8) {
                iM19661d3 += CodedOutputStream.m19659b(17, this.f53391B);
            }
            if ((this.f53405c & 16) == 16) {
                iM19661d3 += CodedOutputStream.m19661d(18, this.f53392C);
            }
            if ((this.f53405c & 32) == 32) {
                iM19661d3 += CodedOutputStream.m19659b(19, this.f53393D);
            }
            for (int i12 = 0; i12 < this.f53415r.size(); i12++) {
                iM19661d3 += CodedOutputStream.m19661d(20, (MessageLite) this.f53415r.get(i12));
            }
            int iM19660c4 = 0;
            for (int i13 = 0; i13 < this.f53416s.size(); i13++) {
                iM19660c4 += CodedOutputStream.m19660c(((Integer) this.f53416s.get(i13)).intValue());
            }
            int iM19660c5 = iM19661d3 + iM19660c4;
            if (!this.f53416s.isEmpty()) {
                iM19660c5 = iM19660c5 + 2 + CodedOutputStream.m19660c(iM19660c4);
            }
            this.f53417t = iM19660c4;
            int iM19660c6 = 0;
            for (int i14 = 0; i14 < this.f53394E.size(); i14++) {
                iM19660c6 += CodedOutputStream.m19660c(((Integer) this.f53394E.get(i14)).intValue());
            }
            int iM19661d4 = iM19660c5 + iM19660c6;
            if (!this.f53394E.isEmpty()) {
                iM19661d4 = iM19661d4 + 2 + CodedOutputStream.m19660c(iM19660c6);
            }
            this.f53395F = iM19660c6;
            for (int i15 = 0; i15 < this.f53396G.size(); i15++) {
                iM19661d4 += CodedOutputStream.m19661d(23, (MessageLite) this.f53396G.get(i15));
            }
            int iM19660c7 = 0;
            for (int i16 = 0; i16 < this.f53397H.size(); i16++) {
                iM19660c7 += CodedOutputStream.m19660c(((Integer) this.f53397H.get(i16)).intValue());
            }
            int iM19661d5 = iM19661d4 + iM19660c7;
            if (!this.f53397H.isEmpty()) {
                iM19661d5 = iM19661d5 + 2 + CodedOutputStream.m19660c(iM19660c7);
            }
            this.f53398I = iM19660c7;
            if ((this.f53405c & 64) == 64) {
                iM19661d5 += CodedOutputStream.m19661d(30, this.f53399J);
            }
            int iM19660c8 = 0;
            for (int i17 = 0; i17 < this.f53400K.size(); i17++) {
                iM19660c8 += CodedOutputStream.m19660c(((Integer) this.f53400K.get(i17)).intValue());
            }
            int iM2225D = AbstractC0455a.m2225D(this.f53400K, 2, iM19661d5 + iM19660c8);
            if ((this.f53405c & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) == 128) {
                iM2225D += CodedOutputStream.m19661d(32, this.f53401L);
            }
            int size = this.f53404b.size() + m19699e() + iM2225D;
            this.f53403N = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b2 = this.f53402M;
            if (b2 == 1) {
                return true;
            }
            if (b2 == 0) {
                return false;
            }
            if ((this.f53405c & 2) != 2) {
                this.f53402M = (byte) 0;
                return false;
            }
            for (int i = 0; i < this.f53409i.size(); i++) {
                if (!((TypeParameter) this.f53409i.get(i)).isInitialized()) {
                    this.f53402M = (byte) 0;
                    return false;
                }
            }
            for (int i2 = 0; i2 < this.f53410j.size(); i2++) {
                if (!((Type) this.f53410j.get(i2)).isInitialized()) {
                    this.f53402M = (byte) 0;
                    return false;
                }
            }
            for (int i3 = 0; i3 < this.f53415r.size(); i3++) {
                if (!((Type) this.f53415r.get(i3)).isInitialized()) {
                    this.f53402M = (byte) 0;
                    return false;
                }
            }
            for (int i4 = 0; i4 < this.f53418u.size(); i4++) {
                if (!((Constructor) this.f53418u.get(i4)).isInitialized()) {
                    this.f53402M = (byte) 0;
                    return false;
                }
            }
            for (int i5 = 0; i5 < this.f53419v.size(); i5++) {
                if (!((Function) this.f53419v.get(i5)).isInitialized()) {
                    this.f53402M = (byte) 0;
                    return false;
                }
            }
            for (int i6 = 0; i6 < this.f53420w.size(); i6++) {
                if (!((Property) this.f53420w.get(i6)).isInitialized()) {
                    this.f53402M = (byte) 0;
                    return false;
                }
            }
            for (int i7 = 0; i7 < this.f53421x.size(); i7++) {
                if (!((TypeAlias) this.f53421x.get(i7)).isInitialized()) {
                    this.f53402M = (byte) 0;
                    return false;
                }
            }
            for (int i8 = 0; i8 < this.f53422y.size(); i8++) {
                if (!((EnumEntry) this.f53422y.get(i8)).isInitialized()) {
                    this.f53402M = (byte) 0;
                    return false;
                }
            }
            if ((this.f53405c & 16) == 16 && !this.f53392C.isInitialized()) {
                this.f53402M = (byte) 0;
                return false;
            }
            for (int i9 = 0; i9 < this.f53396G.size(); i9++) {
                if (!((Type) this.f53396G.get(i9)).isInitialized()) {
                    this.f53402M = (byte) 0;
                    return false;
                }
            }
            if ((this.f53405c & 64) == 64 && !this.f53399J.isInitialized()) {
                this.f53402M = (byte) 0;
                return false;
            }
            if (m19698d()) {
                this.f53402M = (byte) 1;
                return true;
            }
            this.f53402M = (byte) 0;
            return false;
        }

        /* JADX INFO: renamed from: m */
        public final void m19435m() {
            this.f53406d = 6;
            this.f53407f = 0;
            this.f53408g = 0;
            List list = Collections.EMPTY_LIST;
            this.f53409i = list;
            this.f53410j = list;
            this.f53411n = list;
            this.f53413p = list;
            this.f53415r = list;
            this.f53416s = list;
            this.f53418u = list;
            this.f53419v = list;
            this.f53420w = list;
            this.f53421x = list;
            this.f53422y = list;
            this.f53423z = list;
            this.f53391B = 0;
            this.f53392C = Type.f53679y;
            this.f53393D = 0;
            this.f53394E = list;
            this.f53396G = list;
            this.f53397H = list;
            this.f53399J = TypeTable.f53783i;
            this.f53400K = list;
            this.f53401L = VersionRequirementTable.f53842f;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final MessageLite.Builder newBuilderForType() {
            return Builder.m19436j();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final MessageLite.Builder toBuilder() {
            Builder builderM19436j = Builder.m19436j();
            builderM19436j.m19439k(this);
            return builderM19436j;
        }

        public Class() {
            this.f53412o = -1;
            this.f53414q = -1;
            this.f53417t = -1;
            this.f53390A = -1;
            this.f53395F = -1;
            this.f53398I = -1;
            this.f53402M = (byte) -1;
            this.f53403N = -1;
            this.f53404b = ByteString.f54075a;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:9:0x004d  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Class(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
            this.f53412o = -1;
            this.f53414q = -1;
            this.f53417t = -1;
            this.f53390A = -1;
            this.f53395F = -1;
            this.f53398I = -1;
            this.f53402M = (byte) -1;
            this.f53403N = -1;
            m19435m();
            ByteString.Output outputM19624l = ByteString.m19624l();
            boolean z2 = true;
            CodedOutputStream codedOutputStreamM19666j = CodedOutputStream.m19666j(outputM19624l, 1);
            boolean z3 = false;
            int i = 0;
            while (true) {
                boolean z4 = z2;
                if (!z3) {
                    try {
                        try {
                            int iM19652n = codedInputStream.m19652n();
                            switch (iM19652n) {
                                case 0:
                                    z3 = z4;
                                    z2 = z4;
                                    break;
                                case 8:
                                    this.f53405c |= 1;
                                    this.f53406d = codedInputStream.m19644f();
                                    z2 = z4;
                                    break;
                                case 16:
                                    if ((i & 32) != 32) {
                                        this.f53411n = new ArrayList();
                                        i |= 32;
                                    }
                                    this.f53411n.add(Integer.valueOf(codedInputStream.m19644f()));
                                    z2 = z4;
                                    break;
                                case 18:
                                    int iM19642d = codedInputStream.m19642d(codedInputStream.m19649k());
                                    if ((i & 32) != 32 && codedInputStream.m19640b() > 0) {
                                        this.f53411n = new ArrayList();
                                        i |= 32;
                                    }
                                    while (codedInputStream.m19640b() > 0) {
                                        this.f53411n.add(Integer.valueOf(codedInputStream.m19644f()));
                                    }
                                    codedInputStream.m19641c(iM19642d);
                                    z2 = z4;
                                    break;
                                case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                                    this.f53405c |= 2;
                                    this.f53407f = codedInputStream.m19644f();
                                    z2 = z4;
                                    break;
                                case 32:
                                    this.f53405c |= 4;
                                    this.f53408g = codedInputStream.m19644f();
                                    z2 = z4;
                                    break;
                                case 42:
                                    if ((i & 8) != 8) {
                                        this.f53409i = new ArrayList();
                                        i |= 8;
                                    }
                                    this.f53409i.add(codedInputStream.m19645g(TypeParameter.f53759s, extensionRegistryLite));
                                    z2 = z4;
                                    break;
                                case 50:
                                    if ((i & 16) != 16) {
                                        this.f53410j = new ArrayList();
                                        i |= 16;
                                    }
                                    this.f53410j.add(codedInputStream.m19645g(Type.f53680z, extensionRegistryLite));
                                    z2 = z4;
                                    break;
                                case 56:
                                    if ((i & 64) != 64) {
                                        this.f53413p = new ArrayList();
                                        i |= 64;
                                    }
                                    this.f53413p.add(Integer.valueOf(codedInputStream.m19644f()));
                                    z2 = z4;
                                    break;
                                case 58:
                                    int iM19642d2 = codedInputStream.m19642d(codedInputStream.m19649k());
                                    if ((i & 64) != 64 && codedInputStream.m19640b() > 0) {
                                        this.f53413p = new ArrayList();
                                        i |= 64;
                                    }
                                    while (codedInputStream.m19640b() > 0) {
                                        this.f53413p.add(Integer.valueOf(codedInputStream.m19644f()));
                                    }
                                    codedInputStream.m19641c(iM19642d2);
                                    z2 = z4;
                                    break;
                                case 66:
                                    if ((i & 512) != 512) {
                                        this.f53418u = new ArrayList();
                                        i |= 512;
                                    }
                                    this.f53418u.add(codedInputStream.m19645g(Constructor.f53457o, extensionRegistryLite));
                                    z2 = z4;
                                    break;
                                case 74:
                                    if ((i & UserMetadata.MAX_ATTRIBUTE_SIZE) != 1024) {
                                        this.f53419v = new ArrayList();
                                        i |= UserMetadata.MAX_ATTRIBUTE_SIZE;
                                    }
                                    this.f53419v.add(codedInputStream.m19645g(Function.f53537A, extensionRegistryLite));
                                    z2 = z4;
                                    break;
                                case 82:
                                    if ((i & 2048) != 2048) {
                                        this.f53420w = new ArrayList();
                                        i |= 2048;
                                    }
                                    this.f53420w.add(codedInputStream.m19645g(Property.f53609A, extensionRegistryLite));
                                    z2 = z4;
                                    break;
                                case PDF417Common.MAX_ROWS_IN_BARCODE /* 90 */:
                                    if ((i & 4096) != 4096) {
                                        this.f53421x = new ArrayList();
                                        i |= 4096;
                                    }
                                    this.f53421x.add(codedInputStream.m19645g(TypeAlias.f53734u, extensionRegistryLite));
                                    z2 = z4;
                                    break;
                                case 106:
                                    if ((i & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 8192) {
                                        this.f53422y = new ArrayList();
                                        i |= UserMetadata.MAX_INTERNAL_KEY_SIZE;
                                    }
                                    this.f53422y.add(codedInputStream.m19645g(EnumEntry.f53503j, extensionRegistryLite));
                                    z2 = z4;
                                    break;
                                case UserMetadata.MAX_ROLLOUT_ASSIGNMENTS /* 128 */:
                                    if ((i & 16384) != 16384) {
                                        this.f53423z = new ArrayList();
                                        i |= 16384;
                                    }
                                    this.f53423z.add(Integer.valueOf(codedInputStream.m19644f()));
                                    z2 = z4;
                                    break;
                                case 130:
                                    int iM19642d3 = codedInputStream.m19642d(codedInputStream.m19649k());
                                    if ((i & 16384) != 16384 && codedInputStream.m19640b() > 0) {
                                        this.f53423z = new ArrayList();
                                        i |= 16384;
                                    }
                                    while (codedInputStream.m19640b() > 0) {
                                        this.f53423z.add(Integer.valueOf(codedInputStream.m19644f()));
                                    }
                                    codedInputStream.m19641c(iM19642d3);
                                    z2 = z4;
                                    break;
                                case 136:
                                    this.f53405c |= 8;
                                    this.f53391B = codedInputStream.m19644f();
                                    z2 = z4;
                                    break;
                                case 146:
                                    Type.Builder builderM19489q = (this.f53405c & 16) == 16 ? this.f53392C.m19489q() : null;
                                    Type type = (Type) codedInputStream.m19645g(Type.f53680z, extensionRegistryLite);
                                    this.f53392C = type;
                                    if (builderM19489q != 0) {
                                        builderM19489q.m19496k(type);
                                        this.f53392C = builderM19489q.m19495i();
                                    }
                                    this.f53405c |= 16;
                                    z2 = z4;
                                    break;
                                case 152:
                                    this.f53405c |= 32;
                                    this.f53393D = codedInputStream.m19644f();
                                    z2 = z4;
                                    break;
                                case 162:
                                    if ((i & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 128) {
                                        this.f53415r = new ArrayList();
                                        i |= UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                                    }
                                    this.f53415r.add(codedInputStream.m19645g(Type.f53680z, extensionRegistryLite));
                                    z2 = z4;
                                    break;
                                case 168:
                                    if ((i & 256) != 256) {
                                        this.f53416s = new ArrayList();
                                        i |= 256;
                                    }
                                    this.f53416s.add(Integer.valueOf(codedInputStream.m19644f()));
                                    z2 = z4;
                                    break;
                                case 170:
                                    int iM19642d4 = codedInputStream.m19642d(codedInputStream.m19649k());
                                    if ((i & 256) != 256 && codedInputStream.m19640b() > 0) {
                                        this.f53416s = new ArrayList();
                                        i |= 256;
                                    }
                                    while (codedInputStream.m19640b() > 0) {
                                        this.f53416s.add(Integer.valueOf(codedInputStream.m19644f()));
                                    }
                                    codedInputStream.m19641c(iM19642d4);
                                    z2 = z4;
                                    break;
                                case 176:
                                    if ((i & 262144) != 262144) {
                                        this.f53394E = new ArrayList();
                                        i |= 262144;
                                    }
                                    this.f53394E.add(Integer.valueOf(codedInputStream.m19644f()));
                                    z2 = z4;
                                    break;
                                case 178:
                                    int iM19642d5 = codedInputStream.m19642d(codedInputStream.m19649k());
                                    if ((i & 262144) != 262144 && codedInputStream.m19640b() > 0) {
                                        this.f53394E = new ArrayList();
                                        i |= 262144;
                                    }
                                    while (codedInputStream.m19640b() > 0) {
                                        this.f53394E.add(Integer.valueOf(codedInputStream.m19644f()));
                                    }
                                    codedInputStream.m19641c(iM19642d5);
                                    z2 = z4;
                                    break;
                                case 186:
                                    if ((i & 524288) != 524288) {
                                        this.f53396G = new ArrayList();
                                        i |= 524288;
                                    }
                                    this.f53396G.add(codedInputStream.m19645g(Type.f53680z, extensionRegistryLite));
                                    z2 = z4;
                                    break;
                                case 192:
                                    if ((i & 1048576) != 1048576) {
                                        this.f53397H = new ArrayList();
                                        i |= 1048576;
                                    }
                                    this.f53397H.add(Integer.valueOf(codedInputStream.m19644f()));
                                    z2 = z4;
                                    break;
                                case 194:
                                    int iM19642d6 = codedInputStream.m19642d(codedInputStream.m19649k());
                                    if ((i & 1048576) != 1048576 && codedInputStream.m19640b() > 0) {
                                        this.f53397H = new ArrayList();
                                        i |= 1048576;
                                    }
                                    while (codedInputStream.m19640b() > 0) {
                                        this.f53397H.add(Integer.valueOf(codedInputStream.m19644f()));
                                    }
                                    codedInputStream.m19641c(iM19642d6);
                                    z2 = z4;
                                    break;
                                case 242:
                                    TypeTable.Builder builderM19507e = (this.f53405c & 64) == 64 ? this.f53399J.m19507e() : null;
                                    TypeTable typeTable = (TypeTable) codedInputStream.m19645g(TypeTable.f53784j, extensionRegistryLite);
                                    this.f53399J = typeTable;
                                    if (builderM19507e != 0) {
                                        builderM19507e.m19510i(typeTable);
                                        this.f53399J = builderM19507e.m19509f();
                                    }
                                    this.f53405c |= 64;
                                    z2 = z4;
                                    break;
                                case 248:
                                    if ((i & 4194304) != 4194304) {
                                        this.f53400K = new ArrayList();
                                        i |= 4194304;
                                    }
                                    this.f53400K.add(Integer.valueOf(codedInputStream.m19644f()));
                                    z2 = z4;
                                    break;
                                case 250:
                                    int iM19642d7 = codedInputStream.m19642d(codedInputStream.m19649k());
                                    if ((i & 4194304) != 4194304 && codedInputStream.m19640b() > 0) {
                                        this.f53400K = new ArrayList();
                                        i |= 4194304;
                                    }
                                    while (codedInputStream.m19640b() > 0) {
                                        this.f53400K.add(Integer.valueOf(codedInputStream.m19644f()));
                                    }
                                    codedInputStream.m19641c(iM19642d7);
                                    z2 = z4;
                                    break;
                                case 258:
                                    try {
                                        VersionRequirementTable.Builder builderM19519d = (this.f53405c & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) == 128 ? this.f53401L.m19519d() : null;
                                        VersionRequirementTable versionRequirementTable = (VersionRequirementTable) codedInputStream.m19645g(VersionRequirementTable.f53843g, extensionRegistryLite);
                                        this.f53401L = versionRequirementTable;
                                        if (builderM19519d != 0) {
                                            builderM19519d.m19521h(versionRequirementTable);
                                            this.f53401L = builderM19519d.m19520f();
                                        }
                                        this.f53405c |= UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                                        z2 = z4;
                                    } catch (InvalidProtocolBufferException e) {
                                        e = e;
                                        e.f54121a = this;
                                        throw e;
                                    } catch (IOException e2) {
                                        e = e2;
                                        InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e.getMessage());
                                        invalidProtocolBufferException.f54121a = this;
                                        throw invalidProtocolBufferException;
                                    } catch (Throwable th) {
                                        th = th;
                                        if ((i & 32) == 32) {
                                            this.f53411n = Collections.unmodifiableList(this.f53411n);
                                        }
                                        if ((i & 8) == 8) {
                                            this.f53409i = Collections.unmodifiableList(this.f53409i);
                                        }
                                        if ((i & 16) == 16) {
                                            this.f53410j = Collections.unmodifiableList(this.f53410j);
                                        }
                                        if ((i & 64) == 64) {
                                            this.f53413p = Collections.unmodifiableList(this.f53413p);
                                        }
                                        if ((i & 512) == 512) {
                                            this.f53418u = Collections.unmodifiableList(this.f53418u);
                                        }
                                        if ((i & UserMetadata.MAX_ATTRIBUTE_SIZE) == 1024) {
                                            this.f53419v = Collections.unmodifiableList(this.f53419v);
                                        }
                                        if ((i & 2048) == 2048) {
                                            this.f53420w = Collections.unmodifiableList(this.f53420w);
                                        }
                                        if ((i & 4096) == 4096) {
                                            this.f53421x = Collections.unmodifiableList(this.f53421x);
                                        }
                                        if ((i & UserMetadata.MAX_INTERNAL_KEY_SIZE) == 8192) {
                                            this.f53422y = Collections.unmodifiableList(this.f53422y);
                                        }
                                        if ((i & 16384) == 16384) {
                                            this.f53423z = Collections.unmodifiableList(this.f53423z);
                                        }
                                        if ((i & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) == 128) {
                                            this.f53415r = Collections.unmodifiableList(this.f53415r);
                                        }
                                        if ((i & 256) == 256) {
                                            this.f53416s = Collections.unmodifiableList(this.f53416s);
                                        }
                                        if ((i & 262144) == 262144) {
                                            this.f53394E = Collections.unmodifiableList(this.f53394E);
                                        }
                                        if ((i & 524288) == 524288) {
                                            this.f53396G = Collections.unmodifiableList(this.f53396G);
                                        }
                                        if ((i & 1048576) == 1048576) {
                                            this.f53397H = Collections.unmodifiableList(this.f53397H);
                                        }
                                        if ((i & 4194304) == 4194304) {
                                            this.f53400K = Collections.unmodifiableList(this.f53400K);
                                        }
                                        try {
                                            codedOutputStreamM19666j.m19667i();
                                            break;
                                        } catch (IOException unused) {
                                        } catch (Throwable th2) {
                                            this.f53404b = outputM19624l.m19638d();
                                            throw th2;
                                        }
                                        this.f53404b = outputM19624l.m19638d();
                                        m19704j();
                                        throw th;
                                    }
                                    break;
                                default:
                                    if (!m19705k(codedInputStream, codedOutputStreamM19666j, extensionRegistryLite, iM19652n)) {
                                    }
                                    z2 = z4;
                                    break;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    } catch (InvalidProtocolBufferException e3) {
                        e = e3;
                    } catch (IOException e4) {
                        e = e4;
                    }
                } else {
                    if ((i & 32) == 32) {
                        this.f53411n = Collections.unmodifiableList(this.f53411n);
                    }
                    if ((i & 8) == 8) {
                        this.f53409i = Collections.unmodifiableList(this.f53409i);
                    }
                    if ((i & 16) == 16) {
                        this.f53410j = Collections.unmodifiableList(this.f53410j);
                    }
                    if ((i & 64) == 64) {
                        this.f53413p = Collections.unmodifiableList(this.f53413p);
                    }
                    if ((i & 512) == 512) {
                        this.f53418u = Collections.unmodifiableList(this.f53418u);
                    }
                    if ((i & UserMetadata.MAX_ATTRIBUTE_SIZE) == 1024) {
                        this.f53419v = Collections.unmodifiableList(this.f53419v);
                    }
                    if ((i & 2048) == 2048) {
                        this.f53420w = Collections.unmodifiableList(this.f53420w);
                    }
                    if ((i & 4096) == 4096) {
                        this.f53421x = Collections.unmodifiableList(this.f53421x);
                    }
                    if ((i & UserMetadata.MAX_INTERNAL_KEY_SIZE) == 8192) {
                        this.f53422y = Collections.unmodifiableList(this.f53422y);
                    }
                    if ((i & 16384) == 16384) {
                        this.f53423z = Collections.unmodifiableList(this.f53423z);
                    }
                    if ((i & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) == 128) {
                        this.f53415r = Collections.unmodifiableList(this.f53415r);
                    }
                    if ((i & 256) == 256) {
                        this.f53416s = Collections.unmodifiableList(this.f53416s);
                    }
                    if ((i & 262144) == 262144) {
                        this.f53394E = Collections.unmodifiableList(this.f53394E);
                    }
                    if ((i & 524288) == 524288) {
                        this.f53396G = Collections.unmodifiableList(this.f53396G);
                    }
                    if ((i & 1048576) == 1048576) {
                        this.f53397H = Collections.unmodifiableList(this.f53397H);
                    }
                    if ((i & 4194304) == 4194304) {
                        this.f53400K = Collections.unmodifiableList(this.f53400K);
                    }
                    try {
                        codedOutputStreamM19666j.m19667i();
                    } catch (IOException unused2) {
                    } catch (Throwable th4) {
                        this.f53404b = outputM19624l.m19638d();
                        throw th4;
                    }
                    this.f53404b = outputM19624l.m19638d();
                    m19704j();
                    return;
                }
            }
        }
    }
}
