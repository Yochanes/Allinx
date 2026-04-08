package org.mp4parser.boxes.iso23001.part7;

import androidx.compose.animation.AbstractC0455a;
import java.math.BigInteger;
import java.util.Arrays;
import org.mp4parser.tools.Hex;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class CencSampleAuxiliaryDataFormat {

    /* JADX INFO: compiled from: Proguard */
    public abstract class AbstractPair implements Pair {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            Pair pair = (Pair) obj;
            return clear() == pair.clear() && mo21836a() == pair.mo21836a();
        }

        public final String toString() {
            return "P(" + clear() + "|" + mo21836a() + ")";
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public class ByteBytePair extends AbstractPair {
        @Override // org.mp4parser.boxes.iso23001.part7.CencSampleAuxiliaryDataFormat.Pair
        /* JADX INFO: renamed from: a */
        public final long mo21836a() {
            return 0;
        }

        @Override // org.mp4parser.boxes.iso23001.part7.CencSampleAuxiliaryDataFormat.Pair
        public final int clear() {
            return 0;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public class ByteIntPair extends AbstractPair {
        @Override // org.mp4parser.boxes.iso23001.part7.CencSampleAuxiliaryDataFormat.Pair
        /* JADX INFO: renamed from: a */
        public final long mo21836a() {
            return 0;
        }

        @Override // org.mp4parser.boxes.iso23001.part7.CencSampleAuxiliaryDataFormat.Pair
        public final int clear() {
            return 0;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public class ByteLongPair extends AbstractPair {
        @Override // org.mp4parser.boxes.iso23001.part7.CencSampleAuxiliaryDataFormat.Pair
        /* JADX INFO: renamed from: a */
        public final long mo21836a() {
            return 0L;
        }

        @Override // org.mp4parser.boxes.iso23001.part7.CencSampleAuxiliaryDataFormat.Pair
        public final int clear() {
            return 0;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public class ByteShortPair extends AbstractPair {
        @Override // org.mp4parser.boxes.iso23001.part7.CencSampleAuxiliaryDataFormat.Pair
        /* JADX INFO: renamed from: a */
        public final long mo21836a() {
            return 0;
        }

        @Override // org.mp4parser.boxes.iso23001.part7.CencSampleAuxiliaryDataFormat.Pair
        public final int clear() {
            return 0;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public class IntBytePair extends AbstractPair {
        @Override // org.mp4parser.boxes.iso23001.part7.CencSampleAuxiliaryDataFormat.Pair
        /* JADX INFO: renamed from: a */
        public final long mo21836a() {
            return 0;
        }

        @Override // org.mp4parser.boxes.iso23001.part7.CencSampleAuxiliaryDataFormat.Pair
        public final int clear() {
            return 0;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public class IntIntPair extends AbstractPair {
        @Override // org.mp4parser.boxes.iso23001.part7.CencSampleAuxiliaryDataFormat.Pair
        /* JADX INFO: renamed from: a */
        public final long mo21836a() {
            return 0;
        }

        @Override // org.mp4parser.boxes.iso23001.part7.CencSampleAuxiliaryDataFormat.Pair
        public final int clear() {
            return 0;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public class IntLongPair extends AbstractPair {
        @Override // org.mp4parser.boxes.iso23001.part7.CencSampleAuxiliaryDataFormat.Pair
        /* JADX INFO: renamed from: a */
        public final long mo21836a() {
            return 0L;
        }

        @Override // org.mp4parser.boxes.iso23001.part7.CencSampleAuxiliaryDataFormat.Pair
        public final int clear() {
            return 0;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public class IntShortPair extends AbstractPair {
        @Override // org.mp4parser.boxes.iso23001.part7.CencSampleAuxiliaryDataFormat.Pair
        /* JADX INFO: renamed from: a */
        public final long mo21836a() {
            return 0;
        }

        @Override // org.mp4parser.boxes.iso23001.part7.CencSampleAuxiliaryDataFormat.Pair
        public final int clear() {
            return 0;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public interface Pair {
        /* JADX INFO: renamed from: a */
        long mo21836a();

        int clear();
    }

    /* JADX INFO: compiled from: Proguard */
    public class ShortBytePair extends AbstractPair {
        @Override // org.mp4parser.boxes.iso23001.part7.CencSampleAuxiliaryDataFormat.Pair
        /* JADX INFO: renamed from: a */
        public final long mo21836a() {
            return 0;
        }

        @Override // org.mp4parser.boxes.iso23001.part7.CencSampleAuxiliaryDataFormat.Pair
        public final int clear() {
            return 0;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public class ShortIntPair extends AbstractPair {
        @Override // org.mp4parser.boxes.iso23001.part7.CencSampleAuxiliaryDataFormat.Pair
        /* JADX INFO: renamed from: a */
        public final long mo21836a() {
            return 0;
        }

        @Override // org.mp4parser.boxes.iso23001.part7.CencSampleAuxiliaryDataFormat.Pair
        public final int clear() {
            return 0;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public class ShortLongPair extends AbstractPair {
        @Override // org.mp4parser.boxes.iso23001.part7.CencSampleAuxiliaryDataFormat.Pair
        /* JADX INFO: renamed from: a */
        public final long mo21836a() {
            return 0L;
        }

        @Override // org.mp4parser.boxes.iso23001.part7.CencSampleAuxiliaryDataFormat.Pair
        public final int clear() {
            return 0;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public class ShortShortPair extends AbstractPair {
        @Override // org.mp4parser.boxes.iso23001.part7.CencSampleAuxiliaryDataFormat.Pair
        /* JADX INFO: renamed from: a */
        public final long mo21836a() {
            return 0;
        }

        @Override // org.mp4parser.boxes.iso23001.part7.CencSampleAuxiliaryDataFormat.Pair
        public final int clear() {
            return 0;
        }
    }

    /* JADX INFO: renamed from: a */
    public final int m21835a() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return new BigInteger((byte[]) null).equals(new BigInteger((byte[]) null));
    }

    public final int hashCode() {
        return (0 * 31) + 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Entry{iv=");
        sb.append(Hex.m21848a(0, null));
        sb.append(", pairs=");
        return AbstractC0455a.m2241p(sb, Arrays.toString((Object[]) null), '}');
    }
}
