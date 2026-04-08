package com.tinder.scarlet.messageadapter.moshi;

import com.squareup.moshi.Moshi;
import com.tinder.scarlet.MessageAdapter;
import kotlin.Metadata;
import okio.ByteString;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0002\u0003\u0004¨\u0006\u0005"}, m18302d2 = {"Lcom/tinder/scarlet/messageadapter/moshi/MoshiMessageAdapter;", "T", "Lcom/tinder/scarlet/MessageAdapter;", "Companion", "Factory", "scarlet-message-adapter-moshi"}, m18303k = 1, m18304mv = {1, 4, 2})
public final class MoshiMessageAdapter<T> implements MessageAdapter<T> {

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001R\u001c\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001c\u0010\u0007\u001a\n \u0003*\u0004\u0018\u00010\u00060\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, m18302d2 = {"Lcom/tinder/scarlet/messageadapter/moshi/MoshiMessageAdapter$Companion;", "", "Lcom/squareup/moshi/Moshi;", "kotlin.jvm.PlatformType", "DEFAULT_MOSHI", "Lcom/squareup/moshi/Moshi;", "Lokio/ByteString;", "UTF8_BOM", "Lokio/ByteString;", "scarlet-message-adapter-moshi"}, m18303k = 1, m18304mv = {1, 4, 2})
    public static final class Companion {
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Lcom/tinder/scarlet/messageadapter/moshi/MoshiMessageAdapter$Factory;", "Lcom/tinder/scarlet/MessageAdapter$Factory;", "Config", "scarlet-message-adapter-moshi"}, m18303k = 1, m18304mv = {1, 4, 2})
    public static final class Factory implements MessageAdapter.Factory {

        /* JADX INFO: compiled from: Proguard */
        @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/tinder/scarlet/messageadapter/moshi/MoshiMessageAdapter$Factory$Config;", "", "scarlet-message-adapter-moshi"}, m18303k = 1, m18304mv = {1, 4, 2})
        public static final /* data */ class Config {
            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Config)) {
                    return false;
                }
                ((Config) obj).getClass();
                return true;
            }

            public final int hashCode() {
                return 0;
            }

            public final String toString() {
                return "Config(lenient=false, serializeNull=false, failOnUnknown=false)";
            }
        }
    }

    static {
        new Moshi(new Moshi.Builder());
        ByteString.Companion companion = ByteString.f57840d;
        ByteString.Companion.m21632b("EFBBBF");
    }
}
