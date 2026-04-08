package com.airbnb.lottie.compose;

import androidx.compose.runtime.internal.StabilityInferred;
import com.airbnb.lottie.LottieComposition;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, m18302d2 = {"Lcom/airbnb/lottie/compose/LottieClipSpec;", "", "Frame", "Marker", "Markers", "Progress", "Lcom/airbnb/lottie/compose/LottieClipSpec$Frame;", "Lcom/airbnb/lottie/compose/LottieClipSpec$Marker;", "Lcom/airbnb/lottie/compose/LottieClipSpec$Markers;", "Lcom/airbnb/lottie/compose/LottieClipSpec$Progress;", "lottie-compose_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
public abstract class LottieClipSpec {

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/airbnb/lottie/compose/LottieClipSpec$Frame;", "Lcom/airbnb/lottie/compose/LottieClipSpec;", "lottie-compose_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    public static final /* data */ class Frame extends LottieClipSpec {
        @Override // com.airbnb.lottie.compose.LottieClipSpec
        /* JADX INFO: renamed from: a */
        public final float mo12641a(LottieComposition composition) {
            Intrinsics.m18599g(composition, "composition");
            return 1.0f;
        }

        @Override // com.airbnb.lottie.compose.LottieClipSpec
        /* JADX INFO: renamed from: b */
        public final float mo12642b(LottieComposition composition) {
            Intrinsics.m18599g(composition, "composition");
            return 0.0f;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Frame)) {
                return false;
            }
            ((Frame) obj).getClass();
            return true;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "Frame(min=null, max=null, maxInclusive=false)";
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/airbnb/lottie/compose/LottieClipSpec$Marker;", "Lcom/airbnb/lottie/compose/LottieClipSpec;", "lottie-compose_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    public static final /* data */ class Marker extends LottieClipSpec {
        @Override // com.airbnb.lottie.compose.LottieClipSpec
        /* JADX INFO: renamed from: a */
        public final float mo12641a(LottieComposition composition) {
            Intrinsics.m18599g(composition, "composition");
            com.airbnb.lottie.model.Marker markerM12556c = composition.m12556c();
            if (markerM12556c == null) {
                return 1.0f;
            }
            return RangesKt.m18655b((markerM12556c.f34510b + markerM12556c.f34511c) / composition.f34050l, 0.0f, 1.0f);
        }

        @Override // com.airbnb.lottie.compose.LottieClipSpec
        /* JADX INFO: renamed from: b */
        public final float mo12642b(LottieComposition composition) {
            Intrinsics.m18599g(composition, "composition");
            com.airbnb.lottie.model.Marker markerM12556c = composition.m12556c();
            return RangesKt.m18655b((markerM12556c != null ? markerM12556c.f34510b : 0.0f) / composition.f34050l, 0.0f, 1.0f);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Marker)) {
                return false;
            }
            ((Marker) obj).getClass();
            return true;
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return "Marker(marker=null)";
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/airbnb/lottie/compose/LottieClipSpec$Markers;", "Lcom/airbnb/lottie/compose/LottieClipSpec;", "lottie-compose_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    public static final /* data */ class Markers extends LottieClipSpec {
        @Override // com.airbnb.lottie.compose.LottieClipSpec
        /* JADX INFO: renamed from: a */
        public final float mo12641a(LottieComposition composition) {
            Intrinsics.m18599g(composition, "composition");
            return 1.0f;
        }

        @Override // com.airbnb.lottie.compose.LottieClipSpec
        /* JADX INFO: renamed from: b */
        public final float mo12642b(LottieComposition composition) {
            Intrinsics.m18599g(composition, "composition");
            return 0.0f;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Markers)) {
                return false;
            }
            ((Markers) obj).getClass();
            return true;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "Markers(min=null, max=null, maxInclusive=false)";
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/airbnb/lottie/compose/LottieClipSpec$Progress;", "Lcom/airbnb/lottie/compose/LottieClipSpec;", "lottie-compose_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    public static final /* data */ class Progress extends LottieClipSpec {
        @Override // com.airbnb.lottie.compose.LottieClipSpec
        /* JADX INFO: renamed from: a */
        public final float mo12641a(LottieComposition composition) {
            Intrinsics.m18599g(composition, "composition");
            return 0.0f;
        }

        @Override // com.airbnb.lottie.compose.LottieClipSpec
        /* JADX INFO: renamed from: b */
        public final float mo12642b(LottieComposition composition) {
            Intrinsics.m18599g(composition, "composition");
            return 0.0f;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Progress)) {
                return false;
            }
            ((Progress) obj).getClass();
            return Float.compare(0.0f, 0.0f) == 0 && Float.compare(0.0f, 0.0f) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(0.0f) + (Float.hashCode(0.0f) * 31);
        }

        public final String toString() {
            return "Progress(min=0.0, max=0.0)";
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract float mo12641a(LottieComposition lottieComposition);

    /* JADX INFO: renamed from: b */
    public abstract float mo12642b(LottieComposition lottieComposition);
}
