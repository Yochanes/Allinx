package io.intercom.android.sdk.p032m5.push;

import android.content.Context;
import androidx.compose.animation.AbstractC0455a;
import com.engagelab.privates.push.constants.MTPushConstants;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.intercom.twig.Twig;
import io.intercom.android.sdk.C5101R;
import io.intercom.android.sdk.Intercom;
import io.intercom.android.sdk.logger.LumberMill;
import io.intercom.android.sdk.p032m5.push.IntercomPushData;
import io.intercom.android.sdk.p041ui.common.ActualStringOrResKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonBuilder;
import kotlinx.serialization.json.JsonKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001Bw\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0006\u0010(\u001a\u00020\u0003J\u000e\u0010)\u001a\u00020\u00032\u0006\u0010*\u001a\u00020+J\u0006\u0010,\u001a\u00020-J\b\u0010!\u001a\u0004\u0018\u00010.J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\t\u00100\u001a\u00020\u0003HÆ\u0003J\t\u00101\u001a\u00020\u0003HÆ\u0003J\t\u00102\u001a\u00020\u0003HÆ\u0003J\t\u00103\u001a\u00020\u0003HÆ\u0003J\t\u00104\u001a\u00020\u0003HÆ\u0003J\t\u00105\u001a\u00020\u0003HÆ\u0003J\t\u00106\u001a\u00020\u0003HÆ\u0003J\t\u00107\u001a\u00020\u0003HÆ\u0003J\t\u00108\u001a\u00020\u0003HÆ\u0003J\t\u00109\u001a\u00020\u0003HÆ\u0003J\t\u0010:\u001a\u00020\u0003HÆ\u0003J\t\u0010;\u001a\u00020\u0003HÆ\u0003J\t\u0010<\u001a\u00020\u0003HÆ\u0003J\u0095\u0001\u0010=\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u0003HÆ\u0001J\u0013\u0010>\u001a\u00020-2\b\u0010?\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010@\u001a\u00020AHÖ\u0001J\t\u0010B\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0014R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0014R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0014R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0014R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0014R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0014R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0014R\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0014R\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0014R\u000e\u0010\"\u001a\u00020#X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010$\u001a\n &*\u0004\u0018\u00010%0%X\u0082\u0004¢\u0006\u0004\n\u0002\u0010'¨\u0006C"}, m18302d2 = {"Lio/intercom/android/sdk/m5/push/SimplePushData;", "", "intercomPushType", "", "conversationId", "title", "message", "body", "receiver", "authorName", "appName", "contentImageUrl", "imageUrl", "uri", "instanceId", "conversationPartType", "messageData", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getIntercomPushType", "()Ljava/lang/String;", "getConversationId", "getTitle", "getMessage", "getBody", "getReceiver", "getAuthorName", "getAppName", "getContentImageUrl", "getImageUrl", "getUri", "getInstanceId", "getConversationPartType", "getMessageData", MTPushConstants.Analysis.KEY_JSON, "Lkotlinx/serialization/json/Json;", "twig", "Lcom/intercom/twig/Twig;", "kotlin.jvm.PlatformType", "Lcom/intercom/twig/Twig;", "getContentText", "getContentTitle", "context", "Landroid/content/Context;", "isIntercomPush", "", "Lio/intercom/android/sdk/m5/push/IntercomPushData$ConversationPushData$MessageData;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "copy", "equals", "other", "hashCode", "", "toString", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
@SourceDebugExtension
final /* data */ class SimplePushData {

    @NotNull
    private final String appName;

    @NotNull
    private final String authorName;

    @NotNull
    private final String body;

    @NotNull
    private final String contentImageUrl;

    @NotNull
    private final String conversationId;

    @NotNull
    private final String conversationPartType;

    @NotNull
    private final String imageUrl;

    @NotNull
    private final String instanceId;

    @NotNull
    private final String intercomPushType;

    @NotNull
    private final Json json;

    @NotNull
    private final String message;

    @NotNull
    private final String messageData;

    @NotNull
    private final String receiver;

    @NotNull
    private final String title;
    private final Twig twig;

    @NotNull
    private final String uri;

    public SimplePushData(@NotNull String intercomPushType, @NotNull String conversationId, @NotNull String title, @NotNull String message, @NotNull String body, @NotNull String receiver, @NotNull String authorName, @NotNull String appName, @NotNull String contentImageUrl, @NotNull String imageUrl, @NotNull String uri, @NotNull String instanceId, @NotNull String conversationPartType, @NotNull String messageData) {
        Intrinsics.m18599g(intercomPushType, "intercomPushType");
        Intrinsics.m18599g(conversationId, "conversationId");
        Intrinsics.m18599g(title, "title");
        Intrinsics.m18599g(message, "message");
        Intrinsics.m18599g(body, "body");
        Intrinsics.m18599g(receiver, "receiver");
        Intrinsics.m18599g(authorName, "authorName");
        Intrinsics.m18599g(appName, "appName");
        Intrinsics.m18599g(contentImageUrl, "contentImageUrl");
        Intrinsics.m18599g(imageUrl, "imageUrl");
        Intrinsics.m18599g(uri, "uri");
        Intrinsics.m18599g(instanceId, "instanceId");
        Intrinsics.m18599g(conversationPartType, "conversationPartType");
        Intrinsics.m18599g(messageData, "messageData");
        this.intercomPushType = intercomPushType;
        this.conversationId = conversationId;
        this.title = title;
        this.message = message;
        this.body = body;
        this.receiver = receiver;
        this.authorName = authorName;
        this.appName = appName;
        this.contentImageUrl = contentImageUrl;
        this.imageUrl = imageUrl;
        this.uri = uri;
        this.instanceId = instanceId;
        this.conversationPartType = conversationPartType;
        this.messageData = messageData;
        this.json = JsonKt.m21066a(new C5616b());
        this.twig = LumberMill.getLogger();
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Unit m16312a(JsonBuilder jsonBuilder) {
        return json$lambda$0(jsonBuilder);
    }

    public static /* synthetic */ SimplePushData copy$default(SimplePushData simplePushData, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, int i, Object obj) {
        return simplePushData.copy((i & 1) != 0 ? simplePushData.intercomPushType : str, (i & 2) != 0 ? simplePushData.conversationId : str2, (i & 4) != 0 ? simplePushData.title : str3, (i & 8) != 0 ? simplePushData.message : str4, (i & 16) != 0 ? simplePushData.body : str5, (i & 32) != 0 ? simplePushData.receiver : str6, (i & 64) != 0 ? simplePushData.authorName : str7, (i & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0 ? simplePushData.appName : str8, (i & 256) != 0 ? simplePushData.contentImageUrl : str9, (i & 512) != 0 ? simplePushData.imageUrl : str10, (i & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 ? simplePushData.uri : str11, (i & 2048) != 0 ? simplePushData.instanceId : str12, (i & 4096) != 0 ? simplePushData.conversationPartType : str13, (i & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? simplePushData.messageData : str14);
    }

    private static final Unit json$lambda$0(JsonBuilder Json) {
        Intrinsics.m18599g(Json, "$this$Json");
        Json.f56818b = true;
        return Unit.f51459a;
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getIntercomPushType() {
        return this.intercomPushType;
    }

    @NotNull
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    @NotNull
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getUri() {
        return this.uri;
    }

    @NotNull
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getInstanceId() {
        return this.instanceId;
    }

    @NotNull
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getConversationPartType() {
        return this.conversationPartType;
    }

    @NotNull
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getMessageData() {
        return this.messageData;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getConversationId() {
        return this.conversationId;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getBody() {
        return this.body;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getReceiver() {
        return this.receiver;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getAuthorName() {
        return this.authorName;
    }

    @NotNull
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getAppName() {
        return this.appName;
    }

    @NotNull
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getContentImageUrl() {
        return this.contentImageUrl;
    }

    @NotNull
    public final SimplePushData copy(@NotNull String intercomPushType, @NotNull String conversationId, @NotNull String title, @NotNull String message, @NotNull String body, @NotNull String receiver, @NotNull String authorName, @NotNull String appName, @NotNull String contentImageUrl, @NotNull String imageUrl, @NotNull String uri, @NotNull String instanceId, @NotNull String conversationPartType, @NotNull String messageData) {
        Intrinsics.m18599g(intercomPushType, "intercomPushType");
        Intrinsics.m18599g(conversationId, "conversationId");
        Intrinsics.m18599g(title, "title");
        Intrinsics.m18599g(message, "message");
        Intrinsics.m18599g(body, "body");
        Intrinsics.m18599g(receiver, "receiver");
        Intrinsics.m18599g(authorName, "authorName");
        Intrinsics.m18599g(appName, "appName");
        Intrinsics.m18599g(contentImageUrl, "contentImageUrl");
        Intrinsics.m18599g(imageUrl, "imageUrl");
        Intrinsics.m18599g(uri, "uri");
        Intrinsics.m18599g(instanceId, "instanceId");
        Intrinsics.m18599g(conversationPartType, "conversationPartType");
        Intrinsics.m18599g(messageData, "messageData");
        return new SimplePushData(intercomPushType, conversationId, title, message, body, receiver, authorName, appName, contentImageUrl, imageUrl, uri, instanceId, conversationPartType, messageData);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SimplePushData)) {
            return false;
        }
        SimplePushData simplePushData = (SimplePushData) other;
        return Intrinsics.m18594b(this.intercomPushType, simplePushData.intercomPushType) && Intrinsics.m18594b(this.conversationId, simplePushData.conversationId) && Intrinsics.m18594b(this.title, simplePushData.title) && Intrinsics.m18594b(this.message, simplePushData.message) && Intrinsics.m18594b(this.body, simplePushData.body) && Intrinsics.m18594b(this.receiver, simplePushData.receiver) && Intrinsics.m18594b(this.authorName, simplePushData.authorName) && Intrinsics.m18594b(this.appName, simplePushData.appName) && Intrinsics.m18594b(this.contentImageUrl, simplePushData.contentImageUrl) && Intrinsics.m18594b(this.imageUrl, simplePushData.imageUrl) && Intrinsics.m18594b(this.uri, simplePushData.uri) && Intrinsics.m18594b(this.instanceId, simplePushData.instanceId) && Intrinsics.m18594b(this.conversationPartType, simplePushData.conversationPartType) && Intrinsics.m18594b(this.messageData, simplePushData.messageData);
    }

    @NotNull
    public final String getAppName() {
        return this.appName;
    }

    @NotNull
    public final String getAuthorName() {
        return this.authorName;
    }

    @NotNull
    public final String getBody() {
        return this.body;
    }

    @NotNull
    public final String getContentImageUrl() {
        return this.contentImageUrl;
    }

    @NotNull
    public final String getContentText() {
        String str = this.message;
        return StringsKt.m20448x(str) ? this.body : str;
    }

    @NotNull
    public final String getContentTitle(@NotNull Context context) {
        Intrinsics.m18599g(context, "context");
        return !StringsKt.m20448x(this.title) ? this.title : (StringsKt.m20448x(this.authorName) || StringsKt.m20448x(this.appName)) ? !StringsKt.m20448x(this.authorName) ? this.authorName : this.appName : ActualStringOrResKt.parseString(context, C5101R.string.intercom_teammate_from_company, CollectionsKt.m18414O(new Pair("name", this.authorName), new Pair("company", this.appName)));
    }

    @NotNull
    public final String getConversationId() {
        return this.conversationId;
    }

    @NotNull
    public final String getConversationPartType() {
        return this.conversationPartType;
    }

    @NotNull
    public final String getImageUrl() {
        return this.imageUrl;
    }

    @NotNull
    public final String getInstanceId() {
        return this.instanceId;
    }

    @NotNull
    public final String getIntercomPushType() {
        return this.intercomPushType;
    }

    @NotNull
    public final String getMessage() {
        return this.message;
    }

    @NotNull
    /* JADX INFO: renamed from: getMessageData, reason: collision with other method in class */
    public final String m22391getMessageData() {
        return this.messageData;
    }

    @NotNull
    public final String getReceiver() {
        return this.receiver;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    public final String getUri() {
        return this.uri;
    }

    public int hashCode() {
        return this.messageData.hashCode() + AbstractC0000a.m5b(AbstractC0000a.m5b(AbstractC0000a.m5b(AbstractC0000a.m5b(AbstractC0000a.m5b(AbstractC0000a.m5b(AbstractC0000a.m5b(AbstractC0000a.m5b(AbstractC0000a.m5b(AbstractC0000a.m5b(AbstractC0000a.m5b(AbstractC0000a.m5b(this.intercomPushType.hashCode() * 31, 31, this.conversationId), 31, this.title), 31, this.message), 31, this.body), 31, this.receiver), 31, this.authorName), 31, this.appName), 31, this.contentImageUrl), 31, this.imageUrl), 31, this.uri), 31, this.instanceId), 31, this.conversationPartType);
    }

    public final boolean isIntercomPush() {
        return !StringsKt.m20448x(this.intercomPushType) && Intercom.PUSH_RECEIVER.equals(this.receiver);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("SimplePushData(intercomPushType=");
        sb.append(this.intercomPushType);
        sb.append(", conversationId=");
        sb.append(this.conversationId);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", message=");
        sb.append(this.message);
        sb.append(", body=");
        sb.append(this.body);
        sb.append(", receiver=");
        sb.append(this.receiver);
        sb.append(", authorName=");
        sb.append(this.authorName);
        sb.append(", appName=");
        sb.append(this.appName);
        sb.append(", contentImageUrl=");
        sb.append(this.contentImageUrl);
        sb.append(", imageUrl=");
        sb.append(this.imageUrl);
        sb.append(", uri=");
        sb.append(this.uri);
        sb.append(", instanceId=");
        sb.append(this.instanceId);
        sb.append(", conversationPartType=");
        sb.append(this.conversationPartType);
        sb.append(", messageData=");
        return AbstractC0455a.m2241p(sb, this.messageData, ')');
    }

    @Nullable
    public final IntercomPushData.ConversationPushData.MessageData getMessageData() {
        if (!StringsKt.m20448x(this.body)) {
            return new IntercomPushData.ConversationPushData.MessageData.Text(this.body);
        }
        if (StringsKt.m20448x(this.messageData)) {
            return null;
        }
        try {
            Json json = this.json;
            String str = this.messageData;
            json.getClass();
            return (IntercomPushData.ConversationPushData.MessageData) json.m21054b(BuiltinSerializersKt.m20935d(IntercomPushData.ConversationPushData.MessageData.INSTANCE.serializer()), str);
        } catch (IllegalArgumentException e) {
            this.twig.m15306e(e);
            return null;
        }
    }
}
