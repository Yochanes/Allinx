package androidx.compose.p013ui.window;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/window/SecureFlagPolicy;", "", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class SecureFlagPolicy {

    /* JADX INFO: renamed from: a */
    public static final SecureFlagPolicy f20802a;

    /* JADX INFO: renamed from: b */
    public static final SecureFlagPolicy f20803b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ SecureFlagPolicy[] f20804c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ EnumEntries f20805d;

    static {
        SecureFlagPolicy secureFlagPolicy = new SecureFlagPolicy("Inherit", 0);
        f20802a = secureFlagPolicy;
        SecureFlagPolicy secureFlagPolicy2 = new SecureFlagPolicy("SecureOn", 1);
        f20803b = secureFlagPolicy2;
        SecureFlagPolicy[] secureFlagPolicyArr = {secureFlagPolicy, secureFlagPolicy2, new SecureFlagPolicy("SecureOff", 2)};
        f20804c = secureFlagPolicyArr;
        f20805d = EnumEntriesKt.m18563a(secureFlagPolicyArr);
    }

    public static SecureFlagPolicy valueOf(String str) {
        return (SecureFlagPolicy) Enum.valueOf(SecureFlagPolicy.class, str);
    }

    public static SecureFlagPolicy[] values() {
        return (SecureFlagPolicy[]) f20804c.clone();
    }
}
