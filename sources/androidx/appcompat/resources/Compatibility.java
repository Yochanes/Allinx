package androidx.appcompat.resources;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo
public final class Compatibility {

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class Api21Impl {
        @NonNull
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static Drawable m413a(@NonNull Resources resources, @NonNull XmlPullParser xmlPullParser, @NonNull AttributeSet attributeSet, @Nullable Resources.Theme theme) {
            return Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme);
        }

        @DoNotInline
        /* JADX INFO: renamed from: b */
        public static int m414b(@NonNull TypedArray typedArray) {
            return typedArray.getChangingConfigurations();
        }

        @DoNotInline
        /* JADX INFO: renamed from: c */
        public static void m415c(@NonNull Drawable drawable, @NonNull Resources resources, @NonNull XmlPullParser xmlPullParser, @NonNull AttributeSet attributeSet, @Nullable Resources.Theme theme) throws XmlPullParserException, IOException {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
        }
    }
}
