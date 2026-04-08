package com.livechatinc.inappchat;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ChatWindowErrorType {

    /* JADX INFO: renamed from: a */
    public static final ChatWindowErrorType f43313a;

    /* JADX INFO: renamed from: b */
    public static final ChatWindowErrorType f43314b;

    /* JADX INFO: renamed from: c */
    public static final ChatWindowErrorType f43315c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ ChatWindowErrorType[] f43316d;

    static {
        ChatWindowErrorType chatWindowErrorType = new ChatWindowErrorType("Console", 0);
        f43313a = chatWindowErrorType;
        ChatWindowErrorType chatWindowErrorType2 = new ChatWindowErrorType("WebViewClient", 1);
        f43314b = chatWindowErrorType2;
        ChatWindowErrorType chatWindowErrorType3 = new ChatWindowErrorType("InitialConfiguration", 2);
        f43315c = chatWindowErrorType3;
        f43316d = new ChatWindowErrorType[]{chatWindowErrorType, chatWindowErrorType2, chatWindowErrorType3};
    }

    public static ChatWindowErrorType valueOf(String str) {
        return (ChatWindowErrorType) Enum.valueOf(ChatWindowErrorType.class, str);
    }

    public static ChatWindowErrorType[] values() {
        return (ChatWindowErrorType[]) f43316d.clone();
    }
}
