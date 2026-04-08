package io.intercom.android.sdk.utilities;

import android.content.Context;
import androidx.compose.animation.AbstractC0455a;
import androidx.compose.runtime.internal.StabilityInferred;
import com.engagelab.privates.push.constants.MTPushConstants;
import io.intercom.android.sdk.C5101R;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007J \u0010\f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007¨\u0006\r"}, m18302d2 = {"Lio/intercom/android/sdk/utilities/GroupConversationTextFormatter;", "", "<init>", "()V", "groupConversationTitle", "", "firstName", "", "otherParticipants", "", "context", "Landroid/content/Context;", "groupConversationSubtitle", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public final class GroupConversationTextFormatter {
    public static final int $stable = 0;

    @NotNull
    public static final GroupConversationTextFormatter INSTANCE = new GroupConversationTextFormatter();

    private GroupConversationTextFormatter() {
    }

    @JvmStatic
    @NotNull
    public static final CharSequence groupConversationSubtitle(@NotNull String firstName, int otherParticipants, @NotNull Context context) {
        Intrinsics.m18599g(firstName, "firstName");
        Intrinsics.m18599g(context, "context");
        if (otherParticipants == 1) {
            CharSequence charSequence = Phrase.from(context, C5101R.string.intercom_name_and_1_other).put("name", firstName).format();
            Intrinsics.m18596d(charSequence);
            return charSequence;
        }
        if (otherParticipants <= 1) {
            return firstName;
        }
        CharSequence charSequence2 = Phrase.from(context, C5101R.string.intercom_name_and_x_others).put("name", firstName).put(MTPushConstants.Geofence.KEY_COUNT, otherParticipants).format();
        Intrinsics.m18596d(charSequence2);
        return charSequence2;
    }

    @JvmStatic
    @NotNull
    public static final CharSequence groupConversationTitle(@NotNull String firstName, int otherParticipants, @NotNull Context context) {
        Intrinsics.m18599g(firstName, "firstName");
        Intrinsics.m18599g(context, "context");
        if (otherParticipants == 1) {
            StringBuilder sbM2244s = AbstractC0455a.m2244s(firstName);
            sbM2244s.append(context.getString(C5101R.string.intercom_group_conversation_1_other_participant_count_short));
            return sbM2244s.toString();
        }
        if (otherParticipants <= 1) {
            return firstName;
        }
        StringBuilder sbM2244s2 = AbstractC0455a.m2244s(firstName);
        sbM2244s2.append((Object) Phrase.from(context, C5101R.string.f43549x90bbb904).put("other_participant_count", otherParticipants).format());
        return sbM2244s2.toString();
    }
}
