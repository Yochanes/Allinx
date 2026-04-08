package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite;
import kotlin.reflect.jvm.internal.impl.protobuf.FieldSet;
import kotlin.reflect.jvm.internal.impl.protobuf.Internal;
import kotlin.reflect.jvm.internal.impl.protobuf.LazyField;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.SmallSortedMap;
import kotlin.reflect.jvm.internal.impl.protobuf.WireFormat;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public abstract class GeneratedMessageLite extends AbstractMessageLite implements Serializable {

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$1 */
    /* JADX INFO: compiled from: Proguard */
    public static /* synthetic */ class C61561 {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f54105a;

        static {
            int[] iArr = new int[WireFormat.JavaType.values().length];
            f54105a = iArr;
            try {
                WireFormat.JavaType javaType = WireFormat.JavaType.INT;
                iArr[8] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                int[] iArr2 = f54105a;
                WireFormat.JavaType javaType2 = WireFormat.JavaType.INT;
                iArr2[7] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static abstract class Builder<MessageType extends GeneratedMessageLite, BuilderType extends Builder> extends AbstractMessageLite.Builder<BuilderType> {

        /* JADX INFO: renamed from: a */
        public ByteString f54106a = ByteString.f54075a;

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
        /* JADX INFO: renamed from: b */
        public /* bridge */ /* synthetic */ AbstractMessageLite.Builder mo19418b() {
            return mo19420d();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
        public /* bridge */ /* synthetic */ Object clone() {
            return mo19420d();
        }

        /* JADX INFO: renamed from: d */
        public Builder mo19420d() {
            throw new UnsupportedOperationException("This is supposed to be overridden by subclasses.");
        }

        /* JADX INFO: renamed from: e */
        public abstract Builder mo19421e(GeneratedMessageLite generatedMessageLite);
    }

    /* JADX INFO: compiled from: Proguard */
    public static abstract class ExtendableBuilder<MessageType extends ExtendableMessage<MessageType>, BuilderType extends ExtendableBuilder<MessageType, BuilderType>> extends Builder<MessageType, BuilderType> implements ExtendableMessageOrBuilder<MessageType> {

        /* JADX INFO: renamed from: b */
        public FieldSet f54107b = FieldSet.f54099d;

        /* JADX INFO: renamed from: c */
        public boolean f54108c;

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
        /* JADX INFO: renamed from: b */
        public /* bridge */ /* synthetic */ AbstractMessageLite.Builder mo19418b() {
            return mo19437f();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
        public /* bridge */ /* synthetic */ Object clone() {
            return mo19437f();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
        /* JADX INFO: renamed from: d */
        public /* bridge */ /* synthetic */ Builder mo19420d() {
            return mo19437f();
        }

        /* JADX INFO: renamed from: f */
        public ExtendableBuilder mo19437f() {
            throw new UnsupportedOperationException("This is supposed to be overridden by subclasses.");
        }

        /* JADX INFO: renamed from: h */
        public final void m19697h(ExtendableMessage extendableMessage) {
            SmallSortedMap.C61601 c61601;
            if (!this.f54108c) {
                this.f54107b = this.f54107b.m19690b();
                this.f54108c = true;
            }
            FieldSet fieldSet = this.f54107b;
            FieldSet fieldSet2 = extendableMessage.f54109a;
            fieldSet.getClass();
            int i = 0;
            while (true) {
                int size = fieldSet2.f54100a.f54153b.size();
                c61601 = fieldSet2.f54100a;
                if (i >= size) {
                    break;
                }
                fieldSet.m19692g((Map.Entry) c61601.f54153b.get(i));
                i++;
            }
            Iterator it = c61601.m19720f().iterator();
            while (it.hasNext()) {
                fieldSet.m19692g((Map.Entry) it.next());
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public interface ExtendableMessageOrBuilder<MessageType extends ExtendableMessage> extends MessageLiteOrBuilder {
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class ExtensionDescriptor implements FieldSet.FieldDescriptorLite<ExtensionDescriptor> {

        /* JADX INFO: renamed from: a */
        public final int f54112a;

        /* JADX INFO: renamed from: b */
        public final WireFormat.FieldType f54113b;

        /* JADX INFO: renamed from: c */
        public final boolean f54114c;

        public ExtensionDescriptor(int i, WireFormat.FieldType fieldType, boolean z2) {
            this.f54112a = i;
            this.f54113b = fieldType;
            this.f54114c = z2;
        }

        @Override // java.lang.Comparable
        public final int compareTo(Object obj) {
            return this.f54112a - ((ExtensionDescriptor) obj).f54112a;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.FieldSet.FieldDescriptorLite
        /* JADX INFO: renamed from: g */
        public final Builder mo19694g(MessageLite.Builder builder, MessageLite messageLite) {
            return ((Builder) builder).mo19421e((GeneratedMessageLite) messageLite);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.FieldSet.FieldDescriptorLite
        public final WireFormat.JavaType getLiteJavaType() {
            return this.f54113b.f54189a;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.FieldSet.FieldDescriptorLite
        public final WireFormat.FieldType getLiteType() {
            return this.f54113b;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.FieldSet.FieldDescriptorLite
        public final int getNumber() {
            return this.f54112a;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.FieldSet.FieldDescriptorLite
        public final boolean isPacked() {
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.FieldSet.FieldDescriptorLite
        public final boolean isRepeated() {
            return this.f54114c;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static class GeneratedExtension<ContainingType extends MessageLite, Type> {

        /* JADX INFO: renamed from: a */
        public final ExtendableMessage f54115a;

        /* JADX INFO: renamed from: b */
        public final Object f54116b;

        /* JADX INFO: renamed from: c */
        public final GeneratedMessageLite f54117c;

        /* JADX INFO: renamed from: d */
        public final ExtensionDescriptor f54118d;

        /* JADX INFO: renamed from: e */
        public final Method f54119e;

        public GeneratedExtension(ExtendableMessage extendableMessage, Object obj, GeneratedMessageLite generatedMessageLite, ExtensionDescriptor extensionDescriptor, Class cls) {
            if (extendableMessage == null) {
                throw new IllegalArgumentException("Null containingTypeDefaultInstance");
            }
            if (extensionDescriptor.f54113b == WireFormat.FieldType.f54180r && generatedMessageLite == null) {
                throw new IllegalArgumentException("Null messageDefaultInstance");
            }
            this.f54115a = extendableMessage;
            this.f54116b = obj;
            this.f54117c = generatedMessageLite;
            this.f54118d = extensionDescriptor;
            if (!Internal.EnumLite.class.isAssignableFrom(cls)) {
                this.f54119e = null;
                return;
            }
            try {
                this.f54119e = cls.getMethod("valueOf", Integer.TYPE);
            } catch (NoSuchMethodException e) {
                String name = cls.getName();
                StringBuilder sb = new StringBuilder(name.length() + 52);
                sb.append("Generated message class \"");
                sb.append(name);
                sb.append("\" missing method \"valueOf\".");
                throw new RuntimeException(sb.toString(), e);
            }
        }

        /* JADX INFO: renamed from: a */
        public final Object m19708a(Object obj) {
            if (this.f54118d.f54113b.f54189a != WireFormat.JavaType.ENUM) {
                return obj;
            }
            try {
                return this.f54119e.invoke(null, (Integer) obj);
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

        /* JADX INFO: renamed from: b */
        public final Object m19709b(Object obj) {
            return this.f54118d.f54113b.f54189a == WireFormat.JavaType.ENUM ? Integer.valueOf(((Internal.EnumLite) obj).getNumber()) : obj;
        }
    }

    /* JADX INFO: renamed from: b */
    public static GeneratedExtension m19695b(ExtendableMessage extendableMessage, GeneratedMessageLite generatedMessageLite, int i, WireFormat.FieldType fieldType, Class cls) {
        return new GeneratedExtension(extendableMessage, Collections.EMPTY_LIST, generatedMessageLite, new ExtensionDescriptor(i, fieldType, true), cls);
    }

    /* JADX INFO: renamed from: c */
    public static GeneratedExtension m19696c(ExtendableMessage extendableMessage, Serializable serializable, GeneratedMessageLite generatedMessageLite, int i, WireFormat.FieldType fieldType, Class cls) {
        return new GeneratedExtension(extendableMessage, serializable, generatedMessageLite, new ExtensionDescriptor(i, fieldType, false), cls);
    }

    /* JADX INFO: compiled from: Proguard */
    public static abstract class ExtendableMessage<MessageType extends ExtendableMessage<MessageType>> extends GeneratedMessageLite implements ExtendableMessageOrBuilder<MessageType> {

        /* JADX INFO: renamed from: a */
        public final FieldSet f54109a;

        /* JADX INFO: compiled from: Proguard */
        public class ExtensionWriter {

            /* JADX INFO: renamed from: a */
            public final Iterator f54110a;

            /* JADX INFO: renamed from: b */
            public Map.Entry f54111b;

            public ExtensionWriter(ExtendableMessage extendableMessage) {
                Iterator it;
                FieldSet fieldSet = extendableMessage.f54109a;
                boolean z2 = fieldSet.f54102c;
                SmallSortedMap.C61601 c61601 = fieldSet.f54100a;
                if (z2) {
                    Iterator it2 = c61601.entrySet().iterator();
                    LazyField.LazyIterator lazyIterator = new LazyField.LazyIterator();
                    lazyIterator.f54123a = it2;
                    it = lazyIterator;
                } else {
                    it = c61601.entrySet().iterator();
                }
                this.f54110a = it;
                if (it.hasNext()) {
                    this.f54111b = (Map.Entry) it.next();
                }
            }

            /* JADX INFO: renamed from: a */
            public final void m19707a(int i, CodedOutputStream codedOutputStream) {
                while (true) {
                    Map.Entry entry = this.f54111b;
                    if (entry == null || ((ExtensionDescriptor) entry.getKey()).f54112a >= i) {
                        return;
                    }
                    ExtensionDescriptor extensionDescriptor = (ExtensionDescriptor) this.f54111b.getKey();
                    Object value = this.f54111b.getValue();
                    FieldSet fieldSet = FieldSet.f54099d;
                    WireFormat.FieldType fieldType = extensionDescriptor.f54113b;
                    int i2 = extensionDescriptor.f54112a;
                    if (extensionDescriptor.f54114c) {
                        Iterator it = ((List) value).iterator();
                        while (it.hasNext()) {
                            FieldSet.m19688k(codedOutputStream, fieldType, i2, it.next());
                        }
                    } else if (value instanceof LazyField) {
                        FieldSet.m19688k(codedOutputStream, fieldType, i2, ((LazyField) value).m19711a());
                    } else {
                        FieldSet.m19688k(codedOutputStream, fieldType, i2, value);
                    }
                    Iterator it2 = this.f54110a;
                    if (it2.hasNext()) {
                        this.f54111b = (Map.Entry) it2.next();
                    } else {
                        this.f54111b = null;
                    }
                }
            }
        }

        public ExtendableMessage() {
            this.f54109a = new FieldSet();
        }

        /* JADX INFO: renamed from: d */
        public final boolean m19698d() {
            int i = 0;
            while (true) {
                SmallSortedMap.C61601 c61601 = this.f54109a.f54100a;
                if (i >= c61601.f54153b.size()) {
                    Iterator it = c61601.m19720f().iterator();
                    while (it.hasNext()) {
                        if (!FieldSet.m19685f((Map.Entry) it.next())) {
                        }
                    }
                    return true;
                }
                if (!FieldSet.m19685f((Map.Entry) c61601.f54153b.get(i))) {
                    break;
                }
                i++;
            }
            return false;
        }

        /* JADX INFO: renamed from: e */
        public final int m19699e() {
            SmallSortedMap.C61601 c61601;
            int i = 0;
            int iM19684d = 0;
            while (true) {
                c61601 = this.f54109a.f54100a;
                if (i >= c61601.f54153b.size()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) c61601.f54153b.get(i);
                iM19684d += FieldSet.m19684d((FieldSet.FieldDescriptorLite) entry.getKey(), entry.getValue());
                i++;
            }
            for (Map.Entry entry2 : c61601.m19720f()) {
                iM19684d += FieldSet.m19684d((FieldSet.FieldDescriptorLite) entry2.getKey(), entry2.getValue());
            }
            return iM19684d;
        }

        /* JADX INFO: renamed from: f */
        public final Object m19700f(GeneratedExtension generatedExtension) {
            m19706l(generatedExtension);
            FieldSet fieldSet = this.f54109a;
            ExtensionDescriptor extensionDescriptor = generatedExtension.f54118d;
            Object objM19691e = fieldSet.m19691e(extensionDescriptor);
            if (objM19691e == null) {
                return generatedExtension.f54116b;
            }
            if (!extensionDescriptor.f54114c) {
                return generatedExtension.m19708a(objM19691e);
            }
            if (extensionDescriptor.f54113b.f54189a != WireFormat.JavaType.ENUM) {
                return objM19691e;
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = ((List) objM19691e).iterator();
            while (it.hasNext()) {
                arrayList.add(generatedExtension.m19708a(it.next()));
            }
            return arrayList;
        }

        /* JADX INFO: renamed from: g */
        public final Object m19701g(GeneratedExtension generatedExtension, int i) {
            m19706l(generatedExtension);
            FieldSet fieldSet = this.f54109a;
            fieldSet.getClass();
            ExtensionDescriptor extensionDescriptor = generatedExtension.f54118d;
            if (!extensionDescriptor.f54114c) {
                throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
            }
            Object objM19691e = fieldSet.m19691e(extensionDescriptor);
            if (objM19691e != null) {
                return generatedExtension.m19708a(((List) objM19691e).get(i));
            }
            throw new IndexOutOfBoundsException();
        }

        /* JADX INFO: renamed from: h */
        public final int m19702h(GeneratedExtension generatedExtension) {
            m19706l(generatedExtension);
            FieldSet fieldSet = this.f54109a;
            fieldSet.getClass();
            ExtensionDescriptor extensionDescriptor = generatedExtension.f54118d;
            if (!extensionDescriptor.f54114c) {
                throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
            }
            Object objM19691e = fieldSet.m19691e(extensionDescriptor);
            if (objM19691e == null) {
                return 0;
            }
            return ((List) objM19691e).size();
        }

        /* JADX INFO: renamed from: i */
        public final boolean m19703i(GeneratedExtension generatedExtension) {
            m19706l(generatedExtension);
            FieldSet fieldSet = this.f54109a;
            fieldSet.getClass();
            ExtensionDescriptor extensionDescriptor = generatedExtension.f54118d;
            if (extensionDescriptor.f54114c) {
                throw new IllegalArgumentException("hasField() can only be called on non-repeated fields.");
            }
            return fieldSet.f54100a.get(extensionDescriptor) != null;
        }

        /* JADX INFO: renamed from: j */
        public final void m19704j() {
            FieldSet fieldSet = this.f54109a;
            if (fieldSet.f54101b) {
                return;
            }
            fieldSet.f54100a.mo19722h();
            fieldSet.f54101b = true;
        }

        /* JADX WARN: Removed duplicated region for block: B:4:0x001d  */
        /* JADX INFO: renamed from: k */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean m19705k(CodedInputStream codedInputStream, CodedOutputStream codedOutputStream, ExtensionRegistryLite extensionRegistryLite, int i) throws InvalidProtocolBufferException {
            boolean z2;
            boolean z3;
            Object objBuild;
            MessageLite messageLite;
            MessageLite defaultInstanceForType = getDefaultInstanceForType();
            int i2 = i & 7;
            extensionRegistryLite.getClass();
            GeneratedExtension generatedExtension = (GeneratedExtension) extensionRegistryLite.f54096a.get(new ExtensionRegistryLite.ObjectIntPair(i >>> 3, defaultInstanceForType));
            if (generatedExtension == null) {
                z3 = false;
                z2 = true;
            } else {
                ExtensionDescriptor extensionDescriptor = generatedExtension.f54118d;
                WireFormat.FieldType fieldType = extensionDescriptor.f54113b;
                FieldSet fieldSet = FieldSet.f54099d;
                if (i2 == fieldType.f54190b) {
                    z2 = false;
                    z3 = false;
                } else if (extensionDescriptor.f54114c && fieldType.mo19729a() && i2 == 2) {
                    z2 = false;
                    z3 = true;
                }
            }
            if (z2) {
                return codedInputStream.m19655q(i, codedOutputStream);
            }
            MessageLite.Builder builderNewBuilderForType = null;
            FieldSet fieldSet2 = this.f54109a;
            if (z3) {
                int iM19642d = codedInputStream.m19642d(codedInputStream.m19649k());
                ExtensionDescriptor extensionDescriptor2 = generatedExtension.f54118d;
                if (extensionDescriptor2.f54113b != WireFormat.FieldType.f54183u) {
                    while (codedInputStream.m19640b() > 0) {
                        fieldSet2.m19689a(extensionDescriptor2, FieldSet.m19686h(codedInputStream, extensionDescriptor2.f54113b));
                    }
                } else if (codedInputStream.m19640b() > 0) {
                    codedInputStream.m19649k();
                    throw null;
                }
                codedInputStream.m19641c(iM19642d);
                return true;
            }
            int iOrdinal = generatedExtension.f54118d.f54113b.f54189a.ordinal();
            ExtensionDescriptor extensionDescriptor3 = generatedExtension.f54118d;
            if (iOrdinal == 7) {
                codedInputStream.m19649k();
                extensionDescriptor3.getClass();
                throw null;
            }
            if (iOrdinal != 8) {
                objBuild = FieldSet.m19686h(codedInputStream, extensionDescriptor3.f54113b);
            } else {
                if (!extensionDescriptor3.f54114c && (messageLite = (MessageLite) fieldSet2.m19691e(extensionDescriptor3)) != null) {
                    builderNewBuilderForType = messageLite.toBuilder();
                }
                if (builderNewBuilderForType == null) {
                    builderNewBuilderForType = generatedExtension.f54117c.newBuilderForType();
                }
                if (extensionDescriptor3.f54113b == WireFormat.FieldType.f54179q) {
                    int i3 = codedInputStream.f54090i;
                    if (i3 >= 64) {
                        throw new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
                    }
                    codedInputStream.f54090i = i3 + 1;
                    builderNewBuilderForType.mo19425n(codedInputStream, extensionRegistryLite);
                    codedInputStream.m19639a((extensionDescriptor3.f54112a << 3) | 4);
                    codedInputStream.f54090i--;
                } else {
                    int iM19649k = codedInputStream.m19649k();
                    if (codedInputStream.f54090i >= 64) {
                        throw new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
                    }
                    int iM19642d2 = codedInputStream.m19642d(iM19649k);
                    codedInputStream.f54090i++;
                    builderNewBuilderForType.mo19425n(codedInputStream, extensionRegistryLite);
                    codedInputStream.m19639a(0);
                    codedInputStream.f54090i--;
                    codedInputStream.m19641c(iM19642d2);
                }
                objBuild = builderNewBuilderForType.build();
            }
            if (extensionDescriptor3.f54114c) {
                fieldSet2.m19689a(extensionDescriptor3, generatedExtension.m19709b(objBuild));
                return true;
            }
            fieldSet2.m19693i(extensionDescriptor3, generatedExtension.m19709b(objBuild));
            return true;
        }

        /* JADX INFO: renamed from: l */
        public final void m19706l(GeneratedExtension generatedExtension) {
            if (generatedExtension.f54115a != getDefaultInstanceForType()) {
                throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
            }
        }

        public ExtendableMessage(ExtendableBuilder extendableBuilder) {
            FieldSet fieldSet = extendableBuilder.f54107b;
            if (!fieldSet.f54101b) {
                fieldSet.f54100a.mo19722h();
                fieldSet.f54101b = true;
            }
            extendableBuilder.f54108c = false;
            this.f54109a = extendableBuilder.f54107b;
        }
    }
}
