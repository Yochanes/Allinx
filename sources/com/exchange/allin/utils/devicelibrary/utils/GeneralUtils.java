package com.exchange.allin.utils.devicelibrary.utils;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public class GeneralUtils {

    /* JADX INFO: renamed from: com.exchange.allin.utils.devicelibrary.utils.GeneralUtils$1 */
    /* JADX INFO: compiled from: Proguard */
    class RunnableC35601 implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            try {
                throw new NullPointerException("reflect failed.");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: Proguard */
    public static final class NetworkType {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ NetworkType[] f41619a = {new NetworkType("NETWORK_ETHERNET", 0), new NetworkType("NETWORK_WIFI", 1), new NetworkType("NETWORK_5G", 2), new NetworkType("NETWORK_4G", 3), new NetworkType("NETWORK_3G", 4), new NetworkType("NETWORK_2G", 5), new NetworkType("NETWORK_UNKNOWN", 6), new NetworkType("NETWORK_NO", 7)};

        /* JADX INFO: Fake field, exist only in values array */
        NetworkType EF5;

        public static NetworkType valueOf(String str) {
            return (NetworkType) Enum.valueOf(NetworkType.class, str);
        }

        public static NetworkType[] values() {
            return (NetworkType[]) f41619a.clone();
        }
    }
}
