package kotlin.reflect.jvm.internal.impl.load.kotlin;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import kotlin.reflect.jvm.internal.impl.types.Variance;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class TypeMappingMode {

    /* JADX INFO: renamed from: k */
    public static final TypeMappingMode f53276k = new TypeMappingMode(false, false, false, false, false, new TypeMappingMode(false, false, false, false, false, null, false, null, null, 1023), false, null, null, 988);

    /* JADX INFO: renamed from: a */
    public final boolean f53277a;

    /* JADX INFO: renamed from: b */
    public final boolean f53278b;

    /* JADX INFO: renamed from: c */
    public final boolean f53279c;

    /* JADX INFO: renamed from: d */
    public final boolean f53280d;

    /* JADX INFO: renamed from: e */
    public final boolean f53281e;

    /* JADX INFO: renamed from: f */
    public final TypeMappingMode f53282f;

    /* JADX INFO: renamed from: g */
    public final boolean f53283g;

    /* JADX INFO: renamed from: h */
    public final TypeMappingMode f53284h;

    /* JADX INFO: renamed from: i */
    public final TypeMappingMode f53285i;

    /* JADX INFO: renamed from: j */
    public final boolean f53286j;

    /* JADX INFO: compiled from: Proguard */
    public static final class Companion {
    }

    /* JADX INFO: compiled from: Proguard */
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[Variance.values().length];
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public TypeMappingMode(boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, TypeMappingMode typeMappingMode, boolean z7, TypeMappingMode typeMappingMode2, TypeMappingMode typeMappingMode3, int i) {
        z2 = (i & 1) != 0 ? true : z2;
        z3 = (i & 2) != 0 ? true : z3;
        z4 = (i & 4) != 0 ? false : z4;
        z5 = (i & 8) != 0 ? false : z5;
        z6 = (i & 16) != 0 ? false : z6;
        typeMappingMode = (i & 32) != 0 ? null : typeMappingMode;
        z7 = (i & 64) != 0 ? true : z7;
        typeMappingMode2 = (i & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0 ? typeMappingMode : typeMappingMode2;
        typeMappingMode3 = (i & 256) != 0 ? typeMappingMode : typeMappingMode3;
        boolean z8 = (i & 512) == 0;
        this.f53277a = z2;
        this.f53278b = z3;
        this.f53279c = z4;
        this.f53280d = z5;
        this.f53281e = z6;
        this.f53282f = typeMappingMode;
        this.f53283g = z7;
        this.f53284h = typeMappingMode2;
        this.f53285i = typeMappingMode3;
        this.f53286j = z8;
    }
}
