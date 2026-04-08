package io.intercom.android.sdk.blocks.lib;

import java.util.Locale;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public enum VideoProvider {
    YOUTUBE,
    VIMEO,
    WISTIA,
    LOOM,
    VIDYARD,
    BRIGHTCOVE,
    JWPLAYER,
    MICROSOFTSTREAM,
    SYNTHESIA,
    GUIDDE,
    DESCRIPT,
    UNKNOWN;

    public static VideoProvider videoValueOf(String str) {
        try {
            return valueOf(str.toUpperCase(Locale.ENGLISH));
        } catch (IllegalArgumentException unused) {
            return UNKNOWN;
        }
    }
}
