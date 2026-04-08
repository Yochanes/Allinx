package androidx.compose.foundation.text;

import androidx.compose.animation.AbstractC0455a;
import androidx.compose.p013ui.text.input.ImeAction;
import androidx.compose.p013ui.text.input.ImeOptions;
import androidx.compose.p013ui.text.input.KeyboardCapitalization;
import androidx.compose.p013ui.text.input.KeyboardType;
import androidx.compose.p013ui.text.input.PlatformImeOptions;
import androidx.compose.p013ui.text.intl.LocaleList;
import androidx.compose.runtime.Immutable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Immutable
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/compose/foundation/text/KeyboardOptions;", "", "Companion", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class KeyboardOptions {

    /* JADX INFO: renamed from: h */
    public static final KeyboardOptions f8486h = new KeyboardOptions(0, 0, 127);

    /* JADX INFO: renamed from: a */
    public final int f8487a;

    /* JADX INFO: renamed from: b */
    public final Boolean f8488b;

    /* JADX INFO: renamed from: c */
    public final int f8489c;

    /* JADX INFO: renamed from: d */
    public final int f8490d;

    /* JADX INFO: renamed from: e */
    public final PlatformImeOptions f8491e;

    /* JADX INFO: renamed from: f */
    public final Boolean f8492f;

    /* JADX INFO: renamed from: g */
    public final LocaleList f8493g;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/foundation/text/KeyboardOptions$Companion;", "", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class Companion {
    }

    public KeyboardOptions(int i, Boolean bool, int i2, int i3, PlatformImeOptions platformImeOptions, Boolean bool2, LocaleList localeList) {
        this.f8487a = i;
        this.f8488b = bool;
        this.f8489c = i2;
        this.f8490d = i3;
        this.f8491e = platformImeOptions;
        this.f8492f = bool2;
        this.f8493g = localeList;
    }

    /* JADX INFO: renamed from: a */
    public final int m3230a() {
        int i = this.f8490d;
        ImeAction imeAction = new ImeAction(i);
        if (i == -1) {
            imeAction = null;
        }
        if (imeAction != null) {
            return imeAction.f20366a;
        }
        return 1;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m3231b() {
        return this.f8487a == -1 && this.f8488b == null && this.f8489c == 0 && this.f8490d == -1 && this.f8491e == null && this.f8492f == null && this.f8493g == null;
    }

    /* JADX INFO: renamed from: c */
    public final ImeOptions m3232c(boolean z2) {
        int i = this.f8487a;
        KeyboardCapitalization keyboardCapitalization = new KeyboardCapitalization(i);
        if (i == -1) {
            keyboardCapitalization = null;
        }
        int i2 = keyboardCapitalization != null ? keyboardCapitalization.f20379a : 0;
        Boolean bool = this.f8488b;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : true;
        int i3 = this.f8489c;
        KeyboardType keyboardType = i3 != 0 ? new KeyboardType(i3) : null;
        int i4 = keyboardType != null ? keyboardType.f20380a : 1;
        int iM3230a = m3230a();
        LocaleList localeList = this.f8493g;
        if (localeList == null) {
            localeList = LocaleList.f20448c;
        }
        return new ImeOptions(z2, i2, zBooleanValue, i4, iM3230a, this.f8491e, localeList);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KeyboardOptions)) {
            return false;
        }
        KeyboardOptions keyboardOptions = (KeyboardOptions) obj;
        if (this.f8487a != keyboardOptions.f8487a || !Intrinsics.m18594b(this.f8488b, keyboardOptions.f8488b)) {
            return false;
        }
        if (this.f8489c == keyboardOptions.f8489c) {
            return this.f8490d == keyboardOptions.f8490d && Intrinsics.m18594b(this.f8491e, keyboardOptions.f8491e) && Intrinsics.m18594b(this.f8492f, keyboardOptions.f8492f) && Intrinsics.m18594b(this.f8493g, keyboardOptions.f8493g);
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f8487a) * 31;
        Boolean bool = this.f8488b;
        int iM2228c = AbstractC0455a.m2228c(this.f8490d, AbstractC0455a.m2228c(this.f8489c, (iHashCode + (bool != null ? bool.hashCode() : 0)) * 31, 31), 961);
        Boolean bool2 = this.f8492f;
        int iHashCode2 = (iM2228c + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        LocaleList localeList = this.f8493g;
        return iHashCode2 + (localeList != null ? localeList.f20449a.hashCode() : 0);
    }

    public final String toString() {
        return "KeyboardOptions(capitalization=" + ((Object) KeyboardCapitalization.m6550a(this.f8487a)) + ", autoCorrectEnabled=" + this.f8488b + ", keyboardType=" + ((Object) KeyboardType.m6551a(this.f8489c)) + ", imeAction=" + ((Object) ImeAction.m6547a(this.f8490d)) + ", platformImeOptions=" + this.f8491e + "showKeyboardOnFocus=" + this.f8492f + ", hintLocales=" + this.f8493g + ')';
    }

    public /* synthetic */ KeyboardOptions(int i, int i2, int i3) {
        this(-1, (i3 & 2) != 0 ? null : Boolean.FALSE, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? -1 : i2, null, null, null);
    }
}
