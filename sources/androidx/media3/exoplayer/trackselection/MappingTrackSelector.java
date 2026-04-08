package androidx.media3.exoplayer.trackselection;

import android.util.Pair;
import androidx.media3.common.Format;
import androidx.media3.common.Timeline;
import androidx.media3.common.TrackGroup;
import androidx.media3.common.Tracks;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.media3.exoplayer.RendererConfiguration;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.TrackGroupArray;
import com.google.common.collect.ImmutableList;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public abstract class MappingTrackSelector extends TrackSelector {

    /* JADX INFO: compiled from: Proguard */
    public static final class MappedTrackInfo {

        /* JADX INFO: renamed from: a */
        public final int f27648a;

        /* JADX INFO: renamed from: b */
        public final int[] f27649b;

        /* JADX INFO: renamed from: c */
        public final TrackGroupArray[] f27650c;

        /* JADX INFO: renamed from: d */
        public final int[] f27651d;

        /* JADX INFO: renamed from: e */
        public final int[][][] f27652e;

        /* JADX INFO: renamed from: f */
        public final TrackGroupArray f27653f;

        /* JADX INFO: compiled from: Proguard */
        @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
        @Documented
        @Retention(RetentionPolicy.SOURCE)
        public @interface RendererSupport {
        }

        public MappedTrackInfo(int[] iArr, TrackGroupArray[] trackGroupArrayArr, int[] iArr2, int[][][] iArr3, TrackGroupArray trackGroupArray) {
            this.f27649b = iArr;
            this.f27650c = trackGroupArrayArr;
            this.f27652e = iArr3;
            this.f27651d = iArr2;
            this.f27653f = trackGroupArray;
            this.f27648a = iArr.length;
        }
    }

    @Override // androidx.media3.exoplayer.trackselection.TrackSelector
    /* JADX INFO: renamed from: f */
    public final TrackSelectorResult mo10654f(RendererCapabilities[] rendererCapabilitiesArr, TrackGroupArray trackGroupArray, MediaSource.MediaPeriodId mediaPeriodId, Timeline timeline) {
        int[][][] iArr;
        int i;
        boolean z2;
        boolean z3;
        Format[] formatArr;
        int i2;
        int[] iArr2;
        TrackGroupArray trackGroupArray2 = trackGroupArray;
        boolean z4 = true;
        int[] iArr3 = new int[rendererCapabilitiesArr.length + 1];
        int length = rendererCapabilitiesArr.length + 1;
        TrackGroup[][] trackGroupArr = new TrackGroup[length][];
        int[][][] iArr4 = new int[rendererCapabilitiesArr.length + 1][][];
        for (int i3 = 0; i3 < length; i3++) {
            int i4 = trackGroupArray2.f27451a;
            trackGroupArr[i3] = new TrackGroup[i4];
            iArr4[i3] = new int[i4][];
        }
        int length2 = rendererCapabilitiesArr.length;
        int[] iArr5 = new int[length2];
        for (int i5 = 0; i5 < length2; i5++) {
            iArr5[i5] = rendererCapabilitiesArr[i5].mo9793v();
        }
        int i6 = 0;
        while (i6 < trackGroupArray2.f27451a) {
            TrackGroup trackGroupM10583a = trackGroupArray2.m10583a(i6);
            boolean z5 = trackGroupM10583a.f25367c == 5 ? z4 : false;
            int length3 = rendererCapabilitiesArr.length;
            boolean z6 = z4;
            int i7 = 0;
            int i8 = 0;
            while (true) {
                int length4 = rendererCapabilitiesArr.length;
                z3 = z4;
                formatArr = trackGroupM10583a.f25368d;
                i2 = trackGroupM10583a.f25365a;
                if (i7 >= length4) {
                    break;
                }
                RendererCapabilities rendererCapabilities = rendererCapabilitiesArr[i7];
                int[] iArr6 = iArr3;
                int i9 = 0;
                int iMax = 0;
                while (i9 < i2) {
                    int i10 = i9;
                    iMax = Math.max(iMax, rendererCapabilities.mo10016g(formatArr[i10]) & 7);
                    i9 = i10 + 1;
                }
                boolean z7 = iArr6[i7] == 0 ? z3 : false;
                if (iMax > i8 || (iMax == i8 && z5 && !z6 && z7)) {
                    z6 = z7;
                    i8 = iMax;
                    length3 = i7;
                }
                i7++;
                z4 = z3;
                iArr3 = iArr6;
            }
            int[] iArr7 = iArr3;
            if (length3 == rendererCapabilitiesArr.length) {
                iArr2 = new int[i2];
            } else {
                RendererCapabilities rendererCapabilities2 = rendererCapabilitiesArr[length3];
                int[] iArr8 = new int[i2];
                for (int i11 = 0; i11 < i2; i11++) {
                    iArr8[i11] = rendererCapabilities2.mo10016g(formatArr[i11]);
                }
                iArr2 = iArr8;
            }
            int i12 = iArr7[length3];
            trackGroupArr[length3][i12] = trackGroupM10583a;
            iArr4[length3][i12] = iArr2;
            iArr7[length3] = i12 + 1;
            i6++;
            trackGroupArray2 = trackGroupArray;
            z4 = z3;
            iArr3 = iArr7;
        }
        int[] iArr9 = iArr3;
        boolean z8 = z4;
        TrackGroupArray[] trackGroupArrayArr = new TrackGroupArray[rendererCapabilitiesArr.length];
        String[] strArr = new String[rendererCapabilitiesArr.length];
        int[] iArr10 = new int[rendererCapabilitiesArr.length];
        for (int i13 = 0; i13 < rendererCapabilitiesArr.length; i13++) {
            int i14 = iArr9[i13];
            trackGroupArrayArr[i13] = new TrackGroupArray((TrackGroup[]) Util.m9600J(i14, trackGroupArr[i13]));
            iArr4[i13] = (int[][]) Util.m9600J(i14, iArr4[i13]);
            strArr[i13] = rendererCapabilitiesArr[i13].getName();
            iArr10[i13] = rendererCapabilitiesArr[i13].mo9784f();
        }
        MappedTrackInfo mappedTrackInfo = new MappedTrackInfo(iArr10, trackGroupArrayArr, iArr5, iArr4, new TrackGroupArray((TrackGroup[]) Util.m9600J(iArr9[rendererCapabilitiesArr.length], trackGroupArr[rendererCapabilitiesArr.length])));
        Pair pairMo10645i = mo10645i(mappedTrackInfo, iArr4, iArr5, mediaPeriodId, timeline);
        TrackSelection[] trackSelectionArr = (TrackSelection[]) pairMo10645i.second;
        List[] listArr = new List[trackSelectionArr.length];
        for (int i15 = 0; i15 < trackSelectionArr.length; i15++) {
            TrackSelection trackSelection = trackSelectionArr[i15];
            listArr[i15] = trackSelection != null ? ImmutableList.m14825of(trackSelection) : ImmutableList.m14824of();
        }
        ImmutableList.Builder builder = new ImmutableList.Builder();
        int i16 = 0;
        while (i16 < mappedTrackInfo.f27648a) {
            TrackGroupArray[] trackGroupArrayArr2 = mappedTrackInfo.f27650c;
            TrackGroupArray trackGroupArray3 = trackGroupArrayArr2[i16];
            List list = listArr[i16];
            int i17 = 0;
            while (i17 < trackGroupArray3.f27451a) {
                TrackGroup trackGroupM10583a2 = trackGroupArray3.m10583a(i17);
                int i18 = trackGroupArrayArr2[i16].m10583a(i17).f25365a;
                int[] iArr11 = new int[i18];
                int i19 = 0;
                int i20 = 0;
                while (true) {
                    iArr = mappedTrackInfo.f27652e;
                    if (i19 >= i18) {
                        break;
                    }
                    if ((iArr[i16][i17][i19] & 7) == 4) {
                        iArr11[i20] = i19;
                        i20++;
                    }
                    i19++;
                }
                int[] iArrCopyOf = Arrays.copyOf(iArr11, i20);
                int iMin = 16;
                String str = null;
                List[] listArr2 = listArr;
                int i21 = 0;
                boolean z9 = false;
                int i22 = 0;
                while (i21 < iArrCopyOf.length) {
                    String str2 = trackGroupArrayArr2[i16].m10583a(i17).f25368d[iArrCopyOf[i21]].f25161n;
                    int i23 = i22 + 1;
                    if (i22 == 0) {
                        str = str2;
                    } else {
                        z9 |= !Objects.equals(str, str2);
                    }
                    iMin = Math.min(iMin, iArr[i16][i17][i21] & 24);
                    i21++;
                    i22 = i23;
                }
                if (z9) {
                    iMin = Math.min(iMin, mappedTrackInfo.f27651d[i16]);
                }
                boolean z10 = iMin != 0 ? z8 : false;
                int i24 = trackGroupM10583a2.f25365a;
                int[] iArr12 = new int[i24];
                boolean[] zArr = new boolean[i24];
                int i25 = 0;
                while (i25 < trackGroupM10583a2.f25365a) {
                    iArr12[i25] = iArr[i16][i17][i25] & 7;
                    int i26 = 0;
                    while (true) {
                        if (i26 >= list.size()) {
                            i = i16;
                            z2 = false;
                            break;
                        }
                        TrackSelection trackSelection2 = (TrackSelection) list.get(i26);
                        i = i16;
                        if (trackSelection2.mo10520a().equals(trackGroupM10583a2) && trackSelection2.mo10531m(i25) != -1) {
                            z2 = z8;
                            break;
                        }
                        i26++;
                        i16 = i;
                    }
                    zArr[i25] = z2;
                    i25++;
                    i16 = i;
                }
                builder.add(new Tracks.Group(trackGroupM10583a2, z10, iArr12, zArr));
                i17++;
                i16 = i16;
                listArr = listArr2;
            }
            i16++;
        }
        int i27 = 0;
        while (true) {
            TrackGroupArray trackGroupArray4 = mappedTrackInfo.f27653f;
            if (i27 >= trackGroupArray4.f27451a) {
                return new TrackSelectorResult((RendererConfiguration[]) pairMo10645i.first, (ExoTrackSelection[]) pairMo10645i.second, new Tracks(builder.build()), mappedTrackInfo);
            }
            TrackGroup trackGroupM10583a3 = trackGroupArray4.m10583a(i27);
            int[] iArr13 = new int[trackGroupM10583a3.f25365a];
            Arrays.fill(iArr13, 0);
            builder.add(new Tracks.Group(trackGroupM10583a3, false, iArr13, new boolean[trackGroupM10583a3.f25365a]));
            i27++;
        }
    }

    /* JADX INFO: renamed from: i */
    public abstract Pair mo10645i(MappedTrackInfo mappedTrackInfo, int[][][] iArr, int[] iArr2, MediaSource.MediaPeriodId mediaPeriodId, Timeline timeline);

    @Override // androidx.media3.exoplayer.trackselection.TrackSelector
    /* JADX INFO: renamed from: d */
    public final void mo10653d(MappedTrackInfo mappedTrackInfo) {
    }
}
