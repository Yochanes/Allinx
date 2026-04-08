package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.ExtensionRegistryLite;
import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import androidx.datastore.preferences.protobuf.WireFormat;
import java.util.Map;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
final class ExtensionSchemaLite extends ExtensionSchema<GeneratedMessageLite.ExtensionDescriptor> {

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.ExtensionSchemaLite$1 */
    /* JADX INFO: compiled from: Proguard */
    public static /* synthetic */ class C15591 {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f23927a;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            f23927a = iArr;
            try {
                iArr[WireFormat.FieldType.f24166c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23927a[WireFormat.FieldType.f24167d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f23927a[WireFormat.FieldType.f24168f.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f23927a[WireFormat.FieldType.f24169g.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f23927a[WireFormat.FieldType.f24170i.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f23927a[WireFormat.FieldType.f24171j.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f23927a[WireFormat.FieldType.f24172n.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f23927a[WireFormat.FieldType.f24173o.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f23927a[WireFormat.FieldType.f24178t.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f23927a[WireFormat.FieldType.f24180v.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f23927a[WireFormat.FieldType.f24181w.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f23927a[WireFormat.FieldType.f24182x.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f23927a[WireFormat.FieldType.f24183y.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f23927a[WireFormat.FieldType.f24179u.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f23927a[WireFormat.FieldType.f24177s.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f23927a[WireFormat.FieldType.f24174p.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f23927a[WireFormat.FieldType.f24175q.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f23927a[WireFormat.FieldType.f24176r.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.ExtensionSchema
    /* JADX INFO: renamed from: a */
    public final void mo8479a(Map.Entry entry) {
        ((GeneratedMessageLite.ExtensionDescriptor) entry.getKey()).getClass();
    }

    @Override // androidx.datastore.preferences.protobuf.ExtensionSchema
    /* JADX INFO: renamed from: b */
    public final GeneratedMessageLite.GeneratedExtension mo8480b(ExtensionRegistryLite extensionRegistryLite, MessageLite messageLite, int i) {
        extensionRegistryLite.getClass();
        return (GeneratedMessageLite.GeneratedExtension) extensionRegistryLite.f23924a.get(new ExtensionRegistryLite.ObjectIntPair(i, messageLite));
    }

    @Override // androidx.datastore.preferences.protobuf.ExtensionSchema
    /* JADX INFO: renamed from: c */
    public final FieldSet mo8481c(Object obj) {
        return ((GeneratedMessageLite.ExtendableMessage) obj).extensions;
    }

    @Override // androidx.datastore.preferences.protobuf.ExtensionSchema
    /* JADX INFO: renamed from: d */
    public final FieldSet mo8482d(Object obj) {
        GeneratedMessageLite.ExtendableMessage extendableMessage = (GeneratedMessageLite.ExtendableMessage) obj;
        FieldSet<GeneratedMessageLite.ExtensionDescriptor> fieldSet = extendableMessage.extensions;
        if (fieldSet.f23963b) {
            extendableMessage.extensions = fieldSet.m8494a();
        }
        return extendableMessage.extensions;
    }

    @Override // androidx.datastore.preferences.protobuf.ExtensionSchema
    /* JADX INFO: renamed from: e */
    public final boolean mo8483e(MessageLite messageLite) {
        return messageLite instanceof GeneratedMessageLite.ExtendableMessage;
    }

    @Override // androidx.datastore.preferences.protobuf.ExtensionSchema
    /* JADX INFO: renamed from: f */
    public final void mo8484f(Object obj) {
        ((GeneratedMessageLite.ExtendableMessage) obj).extensions.m8497h();
    }

    @Override // androidx.datastore.preferences.protobuf.ExtensionSchema
    /* JADX INFO: renamed from: g */
    public final Object mo8485g(Object obj) {
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.ExtensionSchema
    /* JADX INFO: renamed from: h */
    public final void mo8486h(Object obj) {
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.ExtensionSchema
    /* JADX INFO: renamed from: i */
    public final void mo8487i(Object obj) {
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.ExtensionSchema
    /* JADX INFO: renamed from: j */
    public final void mo8488j(Map.Entry entry) {
        ((GeneratedMessageLite.ExtensionDescriptor) entry.getKey()).getClass();
        throw null;
    }
}
