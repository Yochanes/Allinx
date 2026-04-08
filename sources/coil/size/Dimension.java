package coil.size;

import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, m18302d2 = {"Lcoil/size/Dimension;", "", "Pixels", "Undefined", "Lcoil/size/Dimension$Pixels;", "Lcoil/size/Dimension$Undefined;", "coil-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public abstract class Dimension {

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcoil/size/Dimension$Pixels;", "Lcoil/size/Dimension;", "coil-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    @SourceDebugExtension
    public static final class Pixels extends Dimension {

        /* JADX INFO: renamed from: a */
        public final int f33941a;

        public Pixels(int i) {
            this.f33941a = i;
            if (i <= 0) {
                throw new IllegalArgumentException("px must be > 0.");
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Pixels) {
                return this.f33941a == ((Pixels) obj).f33941a;
            }
            return false;
        }

        /* JADX INFO: renamed from: hashCode, reason: from getter */
        public final int getF33941a() {
            return this.f33941a;
        }

        public final String toString() {
            return String.valueOf(this.f33941a);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcoil/size/Dimension$Undefined;", "Lcoil/size/Dimension;", "coil-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    public static final class Undefined extends Dimension {

        /* JADX INFO: renamed from: a */
        public static final Undefined f33942a = new Undefined();

        public final String toString() {
            return "Dimension.Undefined";
        }
    }
}
