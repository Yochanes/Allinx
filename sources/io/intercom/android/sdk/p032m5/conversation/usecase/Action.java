package io.intercom.android.sdk.p032m5.conversation.usecase;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, m18302d2 = {"Lio/intercom/android/sdk/m5/conversation/usecase/Action;", "", "<init>", "(Ljava/lang/String;I)V", "MESSAGE_SENT", "ADMIN_MESSAGE_RECEIVED", "OPERATOR_MESSAGE_RECEIVED", "MESSAGE_FAILED", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public final class Action {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ Action[] $VALUES;
    public static final Action MESSAGE_SENT = new Action("MESSAGE_SENT", 0);
    public static final Action ADMIN_MESSAGE_RECEIVED = new Action("ADMIN_MESSAGE_RECEIVED", 1);
    public static final Action OPERATOR_MESSAGE_RECEIVED = new Action("OPERATOR_MESSAGE_RECEIVED", 2);
    public static final Action MESSAGE_FAILED = new Action("MESSAGE_FAILED", 3);

    private static final /* synthetic */ Action[] $values() {
        return new Action[]{MESSAGE_SENT, ADMIN_MESSAGE_RECEIVED, OPERATOR_MESSAGE_RECEIVED, MESSAGE_FAILED};
    }

    static {
        Action[] actionArr$values = $values();
        $VALUES = actionArr$values;
        $ENTRIES = EnumEntriesKt.m18563a(actionArr$values);
    }

    private Action(String str, int i) {
    }

    @NotNull
    public static EnumEntries<Action> getEntries() {
        return $ENTRIES;
    }

    public static Action valueOf(String str) {
        return (Action) Enum.valueOf(Action.class, str);
    }

    public static Action[] values() {
        return (Action[]) $VALUES.clone();
    }
}
