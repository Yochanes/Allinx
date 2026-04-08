package io.intercom.android.sdk.p032m5.push;

import android.os.Bundle;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0002\"\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\r\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000e\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0010\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0011\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0012\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m18302d2 = {"getSimplePushDataFromBundle", "Lio/intercom/android/sdk/m5/push/SimplePushData;", "bundle", "Landroid/os/Bundle;", "AppName", "", "AuthorName", "Body", "ContentImageUrl", "ConversationId", "ConversationPartType", "ImageUrl", "InstanceId", "IntercomPushType", "Message", "MessageData", "Receiver", "Title", "Uri", "intercom-sdk-base_release"}, m18303k = 2, m18304mv = {2, 0, 0}, m18306xi = 48)
public final class IntercomPushDataKt {

    @NotNull
    private static final String AppName = "app_name";

    @NotNull
    private static final String AuthorName = "author_name";

    @NotNull
    private static final String Body = "body";

    @NotNull
    private static final String ContentImageUrl = "content_image_url";

    @NotNull
    private static final String ConversationId = "conversation_id";

    @NotNull
    private static final String ConversationPartType = "conversation_part_type";

    @NotNull
    private static final String ImageUrl = "image_url";

    @NotNull
    private static final String InstanceId = "instance_id";

    @NotNull
    private static final String IntercomPushType = "intercom_push_type";

    @NotNull
    private static final String Message = "message";

    @NotNull
    private static final String MessageData = "message_data";

    @NotNull
    private static final String Receiver = "receiver";

    @NotNull
    private static final String Title = "title";

    @NotNull
    private static final String Uri = "uri";

    public static final /* synthetic */ SimplePushData access$getSimplePushDataFromBundle(Bundle bundle) {
        return getSimplePushDataFromBundle(bundle);
    }

    private static final SimplePushData getSimplePushDataFromBundle(Bundle bundle) {
        String string = bundle.getString(IntercomPushType, "");
        Intrinsics.m18598f(string, "getString(...)");
        String string2 = bundle.getString("conversation_id", "");
        Intrinsics.m18598f(string2, "getString(...)");
        String string3 = bundle.getString(Title, "");
        Intrinsics.m18598f(string3, "getString(...)");
        String string4 = bundle.getString("message", "");
        Intrinsics.m18598f(string4, "getString(...)");
        String string5 = bundle.getString(Receiver, "");
        Intrinsics.m18598f(string5, "getString(...)");
        String string6 = bundle.getString(AuthorName, "");
        Intrinsics.m18598f(string6, "getString(...)");
        String string7 = bundle.getString(Body, "");
        Intrinsics.m18598f(string7, "getString(...)");
        String string8 = bundle.getString(AppName, "");
        Intrinsics.m18598f(string8, "getString(...)");
        String string9 = bundle.getString(ContentImageUrl, "");
        Intrinsics.m18598f(string9, "getString(...)");
        String string10 = bundle.getString(ImageUrl, "");
        Intrinsics.m18598f(string10, "getString(...)");
        String string11 = bundle.getString(Uri, "");
        Intrinsics.m18598f(string11, "getString(...)");
        String string12 = bundle.getString(InstanceId, "");
        Intrinsics.m18598f(string12, "getString(...)");
        String string13 = bundle.getString(ConversationPartType, "");
        Intrinsics.m18598f(string13, "getString(...)");
        String string14 = bundle.getString(MessageData, "");
        Intrinsics.m18598f(string14, "getString(...)");
        return new SimplePushData(string, string2, string3, string4, string7, string5, string6, string8, string9, string10, string11, string12, string13, string14);
    }
}
