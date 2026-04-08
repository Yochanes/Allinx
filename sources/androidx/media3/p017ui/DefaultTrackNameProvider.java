package androidx.media3.p017ui;

import android.content.res.Resources;
import android.text.TextUtils;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import com.exchange.allin.R;
import java.util.Locale;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public class DefaultTrackNameProvider implements TrackNameProvider {

    /* JADX INFO: renamed from: a */
    public final Resources f29864a;

    public DefaultTrackNameProvider(Resources resources) {
        resources.getClass();
        this.f29864a = resources;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0058  */
    @Override // androidx.media3.p017ui.TrackNameProvider
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String mo11104a(Format format) {
        String strM11105b;
        String strM9333d;
        int iM9337h = MimeTypes.m9337h(format.f25161n);
        int i = format.f25137D;
        int i2 = format.f25169v;
        int i3 = format.f25168u;
        if (iM9337h == -1) {
            int i4 = 0;
            String str = null;
            String str2 = format.f25158k;
            if (str2 == null) {
                strM9333d = null;
                if (strM9333d == null) {
                    if (str2 != null) {
                        String[] strArrM9607Q = Util.m9607Q(str2);
                        int length = strArrM9607Q.length;
                        while (true) {
                            if (i4 >= length) {
                                break;
                            }
                            String strM9333d2 = MimeTypes.m9333d(strArrM9607Q[i4]);
                            if (strM9333d2 != null && MimeTypes.m9338i(strM9333d2)) {
                                str = strM9333d2;
                                break;
                            }
                            i4++;
                        }
                    }
                    if (str == null) {
                        iM9337h = (i3 == -1 && i2 == -1) ? (i == -1 && format.f25138E == -1) ? -1 : 1 : 2;
                    }
                }
            } else {
                for (String str3 : Util.m9607Q(str2)) {
                    strM9333d = MimeTypes.m9333d(str3);
                    if (strM9333d != null && MimeTypes.m9341l(strM9333d)) {
                        break;
                    }
                }
                strM9333d = null;
                if (strM9333d == null) {
                }
            }
        }
        Resources resources = this.f29864a;
        int i5 = format.f25157j;
        if (iM9337h == 2) {
            strM11105b = m11107d(m11106c(format), (i3 == -1 || i2 == -1) ? "" : resources.getString(R.string.exo_track_resolution, Integer.valueOf(i3), Integer.valueOf(i2)), i5 != -1 ? resources.getString(R.string.exo_track_bitrate, Float.valueOf(i5 / 1000000.0f)) : "");
        } else if (iM9337h == 1) {
            strM11105b = m11107d(m11105b(format), (i == -1 || i < 1) ? "" : i != 1 ? i != 2 ? (i == 6 || i == 7) ? resources.getString(R.string.exo_track_surround_5_point_1) : i != 8 ? resources.getString(R.string.exo_track_surround) : resources.getString(R.string.exo_track_surround_7_point_1) : resources.getString(R.string.exo_track_stereo) : resources.getString(R.string.exo_track_mono), i5 != -1 ? resources.getString(R.string.exo_track_bitrate, Float.valueOf(i5 / 1000000.0f)) : "");
        } else {
            strM11105b = m11105b(format);
        }
        if (strM11105b.length() != 0) {
            return strM11105b;
        }
        String str4 = format.f25151d;
        return (str4 == null || str4.trim().isEmpty()) ? resources.getString(R.string.exo_track_unknown) : resources.getString(R.string.exo_track_unknown_name, str4);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0032  */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String m11105b(Format format) {
        String displayName;
        String str = format.f25151d;
        if (TextUtils.isEmpty(str) || "und".equals(str)) {
            displayName = "";
        } else {
            Locale localeForLanguageTag = Locale.forLanguageTag(str);
            Locale locale = Util.f25665a >= 24 ? Locale.getDefault(Locale.Category.DISPLAY) : Locale.getDefault();
            displayName = localeForLanguageTag.getDisplayName(locale);
            if (!TextUtils.isEmpty(displayName)) {
                try {
                    int iOffsetByCodePoints = displayName.offsetByCodePoints(0, 1);
                    displayName = displayName.substring(0, iOffsetByCodePoints).toUpperCase(locale) + displayName.substring(iOffsetByCodePoints);
                } catch (IndexOutOfBoundsException unused) {
                }
            }
        }
        String strM11107d = m11107d(displayName, m11106c(format));
        if (!TextUtils.isEmpty(strM11107d)) {
            return strM11107d;
        }
        String str2 = format.f25149b;
        return TextUtils.isEmpty(str2) ? "" : str2;
    }

    /* JADX INFO: renamed from: c */
    public final String m11106c(Format format) {
        int i = format.f25153f & 2;
        Resources resources = this.f29864a;
        String string = i != 0 ? resources.getString(R.string.exo_track_role_alternate) : "";
        int i2 = format.f25153f;
        if ((i2 & 4) != 0) {
            string = m11107d(string, resources.getString(R.string.exo_track_role_supplementary));
        }
        if ((i2 & 8) != 0) {
            string = m11107d(string, resources.getString(R.string.exo_track_role_commentary));
        }
        return (i2 & 1088) != 0 ? m11107d(string, resources.getString(R.string.exo_track_role_closed_captions)) : string;
    }

    /* JADX INFO: renamed from: d */
    public final String m11107d(String... strArr) {
        String string = "";
        for (String str : strArr) {
            if (str.length() > 0) {
                string = TextUtils.isEmpty(string) ? str : this.f29864a.getString(R.string.exo_item_list, string, str);
            }
        }
        return string;
    }
}
