package androidx.paging;

import androidx.compose.animation.AbstractC0455a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, m18302d2 = {"Landroidx/paging/LoadState;", "", "Error", "Loading", "NotLoading", "Landroidx/paging/LoadState$Error;", "Landroidx/paging/LoadState$Loading;", "Landroidx/paging/LoadState$NotLoading;", "paging-common_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
public abstract class LoadState {

    /* JADX INFO: renamed from: a */
    public final boolean f30741a;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/paging/LoadState$Error;", "Landroidx/paging/LoadState;", "paging-common_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    public static final class Error extends LoadState {

        /* JADX INFO: renamed from: b */
        public final Throwable f30742b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(Throwable error) {
            super(false);
            Intrinsics.m18599g(error, "error");
            this.f30742b = error;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof Error)) {
                return false;
            }
            Error error = (Error) obj;
            return this.f30741a == error.f30741a && Intrinsics.m18594b(this.f30742b, error.f30742b);
        }

        public final int hashCode() {
            return this.f30742b.hashCode() + Boolean.hashCode(this.f30741a);
        }

        public final String toString() {
            return "Error(endOfPaginationReached=" + this.f30741a + ", error=" + this.f30742b + ')';
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/paging/LoadState$Loading;", "Landroidx/paging/LoadState;", "paging-common_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    public static final class Loading extends LoadState {

        /* JADX INFO: renamed from: b */
        public static final Loading f30743b = new Loading(false);

        public final boolean equals(Object obj) {
            if (obj instanceof Loading) {
                return this.f30741a == ((Loading) obj).f30741a;
            }
            return false;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f30741a);
        }

        public final String toString() {
            return AbstractC0455a.m2243r(new StringBuilder("Loading(endOfPaginationReached="), this.f30741a, ')');
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/paging/LoadState$NotLoading;", "Landroidx/paging/LoadState;", "Companion", "paging-common_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    public static final class NotLoading extends LoadState {

        /* JADX INFO: renamed from: b */
        public static final NotLoading f30744b = new NotLoading(true);

        /* JADX INFO: renamed from: c */
        public static final NotLoading f30745c = new NotLoading(false);

        /* JADX INFO: compiled from: Proguard */
        @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/paging/LoadState$NotLoading$Companion;", "", "paging-common_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
        public static final class Companion {
        }

        public final boolean equals(Object obj) {
            if (obj instanceof NotLoading) {
                return this.f30741a == ((NotLoading) obj).f30741a;
            }
            return false;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f30741a);
        }

        public final String toString() {
            return AbstractC0455a.m2243r(new StringBuilder("NotLoading(endOfPaginationReached="), this.f30741a, ')');
        }
    }

    public LoadState(boolean z2) {
        this.f30741a = z2;
    }
}
