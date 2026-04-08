package androidx.compose.p013ui.res;

import android.content.res.Resources;
import androidx.compose.p013ui.graphics.vector.ImageVector;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, m18302d2 = {"Landroidx/compose/ui/res/ImageVectorCache;", "", "ImageVectorEntry", "Key", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class ImageVectorCache {

    /* JADX INFO: renamed from: a */
    public final HashMap f19665a = new HashMap();

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/res/ImageVectorCache$ImageVectorEntry;", "", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final /* data */ class ImageVectorEntry {

        /* JADX INFO: renamed from: a */
        public final ImageVector f19666a;

        /* JADX INFO: renamed from: b */
        public final int f19667b;

        public ImageVectorEntry(ImageVector imageVector, int i) {
            this.f19666a = imageVector;
            this.f19667b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ImageVectorEntry)) {
                return false;
            }
            ImageVectorEntry imageVectorEntry = (ImageVectorEntry) obj;
            return Intrinsics.m18594b(this.f19666a, imageVectorEntry.f19666a) && this.f19667b == imageVectorEntry.f19667b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f19667b) + (this.f19666a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ImageVectorEntry(imageVector=");
            sb.append(this.f19666a);
            sb.append(", configFlags=");
            return AbstractC0000a.m17n(sb, this.f19667b, ')');
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/res/ImageVectorCache$Key;", "", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final /* data */ class Key {

        /* JADX INFO: renamed from: a */
        public final Resources.Theme f19668a;

        /* JADX INFO: renamed from: b */
        public final int f19669b;

        public Key(Resources.Theme theme, int i) {
            this.f19668a = theme;
            this.f19669b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Key)) {
                return false;
            }
            Key key = (Key) obj;
            return Intrinsics.m18594b(this.f19668a, key.f19668a) && this.f19669b == key.f19669b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f19669b) + (this.f19668a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Key(theme=");
            sb.append(this.f19668a);
            sb.append(", id=");
            return AbstractC0000a.m17n(sb, this.f19669b, ')');
        }
    }
}
