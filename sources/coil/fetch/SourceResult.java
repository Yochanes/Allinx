package coil.fetch;

import coil.decode.DataSource;
import coil.decode.ImageSource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcoil/fetch/SourceResult;", "Lcoil/fetch/FetchResult;", "coil-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public final class SourceResult extends FetchResult {

    /* JADX INFO: renamed from: a */
    public final ImageSource f33661a;

    /* JADX INFO: renamed from: b */
    public final String f33662b;

    /* JADX INFO: renamed from: c */
    public final DataSource f33663c;

    public SourceResult(ImageSource imageSource, String str, DataSource dataSource) {
        this.f33661a = imageSource;
        this.f33662b = str;
        this.f33663c = dataSource;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SourceResult)) {
            return false;
        }
        SourceResult sourceResult = (SourceResult) obj;
        return Intrinsics.m18594b(this.f33661a, sourceResult.f33661a) && Intrinsics.m18594b(this.f33662b, sourceResult.f33662b) && this.f33663c == sourceResult.f33663c;
    }

    public final int hashCode() {
        int iHashCode = this.f33661a.hashCode() * 31;
        String str = this.f33662b;
        return this.f33663c.hashCode() + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31);
    }
}
