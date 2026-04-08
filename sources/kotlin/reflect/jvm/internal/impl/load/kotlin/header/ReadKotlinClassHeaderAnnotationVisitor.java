package kotlin.reflect.jvm.internal.impl.load.kotlin.header;

import java.util.ArrayList;
import java.util.HashMap;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectAnnotationSource;
import kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNames;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ClassLiteralValue;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class ReadKotlinClassHeaderAnnotationVisitor implements KotlinJvmBinaryClass.AnnotationVisitor {

    /* JADX INFO: renamed from: i */
    public static final boolean f53303i = "true".equals(System.getProperty("kotlin.ignore.old.metadata"));

    /* JADX INFO: renamed from: j */
    public static final HashMap f53304j;

    /* JADX INFO: renamed from: a */
    public int[] f53305a;

    /* JADX INFO: renamed from: b */
    public String f53306b;

    /* JADX INFO: renamed from: c */
    public int f53307c;

    /* JADX INFO: renamed from: d */
    public String[] f53308d;

    /* JADX INFO: renamed from: e */
    public String[] f53309e;

    /* JADX INFO: renamed from: f */
    public String[] f53310f;

    /* JADX INFO: renamed from: g */
    public KotlinClassHeader.Kind f53311g;

    /* JADX INFO: renamed from: h */
    public String[] f53312h;

    static {
        HashMap map = new HashMap();
        f53304j = map;
        map.put(ClassId.m19576j(new FqName("kotlin.jvm.internal.KotlinClass")), KotlinClassHeader.Kind.CLASS);
        map.put(ClassId.m19576j(new FqName("kotlin.jvm.internal.KotlinFileFacade")), KotlinClassHeader.Kind.FILE_FACADE);
        map.put(ClassId.m19576j(new FqName("kotlin.jvm.internal.KotlinMultifileClass")), KotlinClassHeader.Kind.MULTIFILE_CLASS);
        map.put(ClassId.m19576j(new FqName("kotlin.jvm.internal.KotlinMultifileClassPart")), KotlinClassHeader.Kind.MULTIFILE_CLASS_PART);
        map.put(ClassId.m19576j(new FqName("kotlin.jvm.internal.KotlinSyntheticClass")), KotlinClassHeader.Kind.SYNTHETIC_CLASS);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationVisitor
    /* JADX INFO: renamed from: b */
    public final KotlinJvmBinaryClass.AnnotationArgumentVisitor mo18762b(ClassId classId, ReflectAnnotationSource reflectAnnotationSource) {
        KotlinClassHeader.Kind kind;
        FqName fqNameM19577b = classId.m19577b();
        if (fqNameM19577b.equals(JvmAnnotationNames.f52760a)) {
            return new KotlinMetadataArgumentVisitor();
        }
        if (fqNameM19577b.equals(JvmAnnotationNames.f52774o)) {
            return new KotlinSerializedIrArgumentVisitor();
        }
        if (f53303i || this.f53311g != null || (kind = (KotlinClassHeader.Kind) f53304j.get(classId)) == null) {
            return null;
        }
        this.f53311g = kind;
        return new OldDeprecatedAnnotationArgumentVisitor();
    }

    /* JADX INFO: compiled from: Proguard */
    public class KotlinMetadataArgumentVisitor implements KotlinJvmBinaryClass.AnnotationArgumentVisitor {

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.header.ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor$1 */
        /* JADX INFO: compiled from: Proguard */
        class C61021 extends CollectStringArrayAnnotationVisitor {
            public C61021() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.header.ReadKotlinClassHeaderAnnotationVisitor.CollectStringArrayAnnotationVisitor
            /* JADX INFO: renamed from: f */
            public final void mo19415f(String[] strArr) {
                if (strArr == null) {
                    throw new IllegalArgumentException("Argument for @NotNull parameter 'result' of kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor$1.visitEnd must not be null");
                }
                ReadKotlinClassHeaderAnnotationVisitor.this.f53308d = strArr;
            }
        }

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.header.ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor$2 */
        /* JADX INFO: compiled from: Proguard */
        class C61032 extends CollectStringArrayAnnotationVisitor {
            public C61032() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.header.ReadKotlinClassHeaderAnnotationVisitor.CollectStringArrayAnnotationVisitor
            /* JADX INFO: renamed from: f */
            public final void mo19415f(String[] strArr) {
                if (strArr == null) {
                    throw new IllegalArgumentException("Argument for @NotNull parameter 'result' of kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor$2.visitEnd must not be null");
                }
                ReadKotlinClassHeaderAnnotationVisitor.this.f53309e = strArr;
            }
        }

        public KotlinMetadataArgumentVisitor() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        /* JADX INFO: renamed from: c */
        public final KotlinJvmBinaryClass.AnnotationArgumentVisitor mo19370c(ClassId classId, Name name) {
            return null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        /* JADX INFO: renamed from: e */
        public final void mo19372e(Object obj, Name name) {
            String strM19608b = name.m19608b();
            boolean zEquals = "k".equals(strM19608b);
            ReadKotlinClassHeaderAnnotationVisitor readKotlinClassHeaderAnnotationVisitor = ReadKotlinClassHeaderAnnotationVisitor.this;
            if (zEquals) {
                if (obj instanceof Integer) {
                    KotlinClassHeader.Kind kind = (KotlinClassHeader.Kind) KotlinClassHeader.Kind.f53294b.get((Integer) obj);
                    if (kind == null) {
                        kind = KotlinClassHeader.Kind.UNKNOWN;
                    }
                    readKotlinClassHeaderAnnotationVisitor.f53311g = kind;
                    return;
                }
                return;
            }
            if ("mv".equals(strM19608b)) {
                if (obj instanceof int[]) {
                    readKotlinClassHeaderAnnotationVisitor.f53305a = (int[]) obj;
                    return;
                }
                return;
            }
            if ("xs".equals(strM19608b)) {
                if (obj instanceof String) {
                    String str = (String) obj;
                    if (str.isEmpty()) {
                        return;
                    }
                    readKotlinClassHeaderAnnotationVisitor.f53306b = str;
                    return;
                }
                return;
            }
            if ("xi".equals(strM19608b)) {
                if (obj instanceof Integer) {
                    readKotlinClassHeaderAnnotationVisitor.f53307c = ((Integer) obj).intValue();
                }
            } else if ("pn".equals(strM19608b) && (obj instanceof String) && !((String) obj).isEmpty()) {
                readKotlinClassHeaderAnnotationVisitor.getClass();
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        /* JADX INFO: renamed from: f */
        public final KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor mo19373f(Name name) {
            String strM19608b = name.m19608b();
            if ("d1".equals(strM19608b)) {
                return new C61021();
            }
            if ("d2".equals(strM19608b)) {
                return new C61032();
            }
            return null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        /* JADX INFO: renamed from: a */
        public final void mo19376a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        /* JADX INFO: renamed from: b */
        public final void mo19369b(Name name, ClassLiteralValue classLiteralValue) {
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        /* JADX INFO: renamed from: d */
        public final void mo19371d(Name name, ClassId classId, Name name2) {
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public class KotlinSerializedIrArgumentVisitor implements KotlinJvmBinaryClass.AnnotationArgumentVisitor {

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.header.ReadKotlinClassHeaderAnnotationVisitor$KotlinSerializedIrArgumentVisitor$1 */
        /* JADX INFO: compiled from: Proguard */
        class C61041 extends CollectStringArrayAnnotationVisitor {
            public C61041() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.header.ReadKotlinClassHeaderAnnotationVisitor.CollectStringArrayAnnotationVisitor
            /* JADX INFO: renamed from: f */
            public final void mo19415f(String[] strArr) {
                if (strArr == null) {
                    throw new IllegalArgumentException("Argument for @NotNull parameter 'result' of kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinSerializedIrArgumentVisitor$1.visitEnd must not be null");
                }
                ReadKotlinClassHeaderAnnotationVisitor.this.f53312h = strArr;
            }
        }

        public KotlinSerializedIrArgumentVisitor() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        /* JADX INFO: renamed from: c */
        public final KotlinJvmBinaryClass.AnnotationArgumentVisitor mo19370c(ClassId classId, Name name) {
            return null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        /* JADX INFO: renamed from: f */
        public final KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor mo19373f(Name name) {
            if ("b".equals(name.m19608b())) {
                return new C61041();
            }
            return null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        /* JADX INFO: renamed from: a */
        public final void mo19376a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        /* JADX INFO: renamed from: b */
        public final void mo19369b(Name name, ClassLiteralValue classLiteralValue) {
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        /* JADX INFO: renamed from: e */
        public final void mo19372e(Object obj, Name name) {
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        /* JADX INFO: renamed from: d */
        public final void mo19371d(Name name, ClassId classId, Name name2) {
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public class OldDeprecatedAnnotationArgumentVisitor implements KotlinJvmBinaryClass.AnnotationArgumentVisitor {

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.header.ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor$1 */
        /* JADX INFO: compiled from: Proguard */
        class C61051 extends CollectStringArrayAnnotationVisitor {
            public C61051() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.header.ReadKotlinClassHeaderAnnotationVisitor.CollectStringArrayAnnotationVisitor
            /* JADX INFO: renamed from: f */
            public final void mo19415f(String[] strArr) {
                if (strArr == null) {
                    throw new IllegalArgumentException("Argument for @NotNull parameter 'data' of kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor$1.visitEnd must not be null");
                }
                ReadKotlinClassHeaderAnnotationVisitor.this.f53308d = strArr;
            }
        }

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.header.ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor$2 */
        /* JADX INFO: compiled from: Proguard */
        class C61062 extends CollectStringArrayAnnotationVisitor {
            public C61062() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.header.ReadKotlinClassHeaderAnnotationVisitor.CollectStringArrayAnnotationVisitor
            /* JADX INFO: renamed from: f */
            public final void mo19415f(String[] strArr) {
                if (strArr == null) {
                    throw new IllegalArgumentException("Argument for @NotNull parameter 'data' of kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor$2.visitEnd must not be null");
                }
                ReadKotlinClassHeaderAnnotationVisitor.this.f53309e = strArr;
            }
        }

        public OldDeprecatedAnnotationArgumentVisitor() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        /* JADX INFO: renamed from: c */
        public final KotlinJvmBinaryClass.AnnotationArgumentVisitor mo19370c(ClassId classId, Name name) {
            return null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        /* JADX INFO: renamed from: e */
        public final void mo19372e(Object obj, Name name) {
            String strM19608b = name.m19608b();
            boolean zEquals = "version".equals(strM19608b);
            ReadKotlinClassHeaderAnnotationVisitor readKotlinClassHeaderAnnotationVisitor = ReadKotlinClassHeaderAnnotationVisitor.this;
            if (zEquals) {
                if (obj instanceof int[]) {
                    readKotlinClassHeaderAnnotationVisitor.f53305a = (int[]) obj;
                }
            } else if ("multifileClassName".equals(strM19608b)) {
                readKotlinClassHeaderAnnotationVisitor.f53306b = obj instanceof String ? (String) obj : null;
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        /* JADX INFO: renamed from: f */
        public final KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor mo19373f(Name name) {
            String strM19608b = name.m19608b();
            if ("data".equals(strM19608b) || "filePartClassNames".equals(strM19608b)) {
                return new C61051();
            }
            if ("strings".equals(strM19608b)) {
                return new C61062();
            }
            return null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        /* JADX INFO: renamed from: a */
        public final void mo19376a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        /* JADX INFO: renamed from: b */
        public final void mo19369b(Name name, ClassLiteralValue classLiteralValue) {
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        /* JADX INFO: renamed from: d */
        public final void mo19371d(Name name, ClassId classId, Name name2) {
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationVisitor
    /* JADX INFO: renamed from: a */
    public final void mo18761a() {
    }

    /* JADX INFO: compiled from: Proguard */
    public static abstract class CollectStringArrayAnnotationVisitor implements KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor {

        /* JADX INFO: renamed from: a */
        public final ArrayList f53313a = new ArrayList();

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor
        /* JADX INFO: renamed from: a */
        public final void mo19377a() {
            mo19415f((String[]) this.f53313a.toArray(new String[0]));
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor
        /* JADX INFO: renamed from: b */
        public final void mo19378b(Object obj) {
            if (obj instanceof String) {
                this.f53313a.add((String) obj);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor
        /* JADX INFO: renamed from: d */
        public final KotlinJvmBinaryClass.AnnotationArgumentVisitor mo19380d(ClassId classId) {
            return null;
        }

        /* JADX INFO: renamed from: f */
        public abstract void mo19415f(String[] strArr);

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor
        /* JADX INFO: renamed from: e */
        public final void mo19381e(ClassLiteralValue classLiteralValue) {
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor
        /* JADX INFO: renamed from: c */
        public final void mo19379c(ClassId classId, Name name) {
        }
    }
}
