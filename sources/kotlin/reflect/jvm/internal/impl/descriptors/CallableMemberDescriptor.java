package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.Collection;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public interface CallableMemberDescriptor extends CallableDescriptor, MemberDescriptor {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: Proguard */
    public static final class Kind {

        /* JADX INFO: renamed from: a */
        public static final Kind f52227a;

        /* JADX INFO: renamed from: b */
        public static final Kind f52228b;

        /* JADX INFO: renamed from: c */
        public static final Kind f52229c;

        /* JADX INFO: renamed from: d */
        public static final Kind f52230d;

        /* JADX INFO: renamed from: f */
        public static final /* synthetic */ Kind[] f52231f;

        static {
            Kind kind = new Kind("DECLARATION", 0);
            f52227a = kind;
            Kind kind2 = new Kind("FAKE_OVERRIDE", 1);
            f52228b = kind2;
            Kind kind3 = new Kind("DELEGATION", 2);
            f52229c = kind3;
            Kind kind4 = new Kind("SYNTHESIZED", 3);
            f52230d = kind4;
            f52231f = new Kind[]{kind, kind2, kind3, kind4};
        }

        public static Kind valueOf(String str) {
            return (Kind) Enum.valueOf(Kind.class, str);
        }

        public static Kind[] values() {
            return (Kind[]) f52231f.clone();
        }
    }

    /* JADX INFO: renamed from: D0 */
    CallableMemberDescriptor mo18879D0(ClassDescriptor classDescriptor, Modality modality, DelegatedDescriptorVisibility delegatedDescriptorVisibility);

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    /* JADX INFO: renamed from: a */
    CallableMemberDescriptor mo18872a();

    Kind getKind();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    /* JADX INFO: renamed from: m */
    Collection mo18877m();

    /* JADX INFO: renamed from: r0 */
    void mo18880r0(Collection collection);
}
