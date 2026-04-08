package io.intercom.android.sdk.identity;

import androidx.annotation.ColorInt;
import androidx.compose.animation.AbstractC0455a;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.common.primitives.Ints;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import io.intercom.android.nexus.NexusConfig;
import io.intercom.android.sdk.models.AttachmentSettings;
import io.intercom.android.sdk.models.ConfigModules;
import io.intercom.android.sdk.models.ConversationStateSyncSettings;
import io.intercom.android.sdk.models.HomeConfig;
import io.intercom.android.sdk.models.OpenConfig;
import io.intercom.android.sdk.models.Space;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\"\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b)\n\u0002\u0018\u0002\n\u0002\b)\b\u0081\b\u0018\u00002\u00020\u0001B«\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\u0006\u0010\u0012\u001a\u00020\t\u0012\u0006\u0010\u0013\u001a\u00020\t\u0012\u0006\u0010\u0014\u001a\u00020\u0003\u0012\u0006\u0010\u0015\u001a\u00020\u0003\u0012\u0006\u0010\u0016\u001a\u00020\t\u0012\u0006\u0010\u0017\u001a\u00020\t\u0012\u0006\u0010\u0018\u001a\u00020\u0003\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u001a\u0012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00030\u001a\u0012\u0006\u0010\u001c\u001a\u00020\u0003\u0012\u0006\u0010\u001d\u001a\u00020\u0003\u0012\u0006\u0010\u001e\u001a\u00020\t\u0012\u0006\u0010\u001f\u001a\u00020\t\u0012\u0006\u0010 \u001a\u00020\t\u0012\u0006\u0010!\u001a\u00020\t\u0012\u0006\u0010\"\u001a\u00020\t\u0012\b\u0010#\u001a\u0004\u0018\u00010$\u0012\u0006\u0010%\u001a\u00020&\u0012\u0006\u0010'\u001a\u00020(\u0012\u0006\u0010)\u001a\u00020\t\u0012\u0006\u0010*\u001a\u00020\t\u0012\u0006\u0010+\u001a\u00020,¢\u0006\u0004\b-\u0010.J\u000e\u0010Q\u001a\u00020\t2\u0006\u0010R\u001a\u00020\u0003J\u0006\u0010S\u001a\u00020\tJ\u000e\u0010T\u001a\u00020\t2\u0006\u0010U\u001a\u00020VJ\u0010\u0010W\u001a\u0004\u0018\u00010\u00032\u0006\u0010U\u001a\u00020VJ\t\u0010X\u001a\u00020\u0003HÆ\u0003J\t\u0010Y\u001a\u00020\u0005HÆ\u0003J\t\u0010Z\u001a\u00020\u0005HÆ\u0003J\t\u0010[\u001a\u00020\u0005HÆ\u0003J\t\u0010\\\u001a\u00020\tHÆ\u0003J\t\u0010]\u001a\u00020\tHÆ\u0003J\t\u0010^\u001a\u00020\tHÆ\u0003J\t\u0010_\u001a\u00020\u0005HÆ\u0003J\t\u0010`\u001a\u00020\u000eHÆ\u0003J\t\u0010a\u001a\u00020\u000eHÆ\u0003J\t\u0010b\u001a\u00020\u000eHÆ\u0003J\t\u0010c\u001a\u00020\u000eHÆ\u0003J\t\u0010d\u001a\u00020\tHÆ\u0003J\t\u0010e\u001a\u00020\tHÆ\u0003J\t\u0010f\u001a\u00020\u0003HÆ\u0003J\t\u0010g\u001a\u00020\u0003HÆ\u0003J\t\u0010h\u001a\u00020\tHÆ\u0003J\t\u0010i\u001a\u00020\tHÆ\u0003J\t\u0010j\u001a\u00020\u0003HÆ\u0003J\u000f\u0010k\u001a\b\u0012\u0004\u0012\u00020\u00030\u001aHÆ\u0003J\u000f\u0010l\u001a\b\u0012\u0004\u0012\u00020\u00030\u001aHÆ\u0003J\t\u0010m\u001a\u00020\u0003HÆ\u0003J\t\u0010n\u001a\u00020\u0003HÆ\u0003J\t\u0010o\u001a\u00020\tHÆ\u0003J\t\u0010p\u001a\u00020\tHÆ\u0003J\t\u0010q\u001a\u00020\tHÆ\u0003J\t\u0010r\u001a\u00020\tHÆ\u0003J\t\u0010s\u001a\u00020\tHÆ\u0003J\u000b\u0010t\u001a\u0004\u0018\u00010$HÆ\u0003J\t\u0010u\u001a\u00020&HÆ\u0003J\t\u0010v\u001a\u00020(HÆ\u0003J\t\u0010w\u001a\u00020\tHÆ\u0003J\t\u0010x\u001a\u00020\tHÆ\u0003J\t\u0010y\u001a\u00020,HÆ\u0003Jë\u0002\u0010z\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00052\b\b\u0003\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u000e2\b\b\u0002\u0010\u0012\u001a\u00020\t2\b\b\u0002\u0010\u0013\u001a\u00020\t2\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\t2\b\b\u0002\u0010\u0017\u001a\u00020\t2\b\b\u0002\u0010\u0018\u001a\u00020\u00032\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u001a2\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00030\u001a2\b\b\u0002\u0010\u001c\u001a\u00020\u00032\b\b\u0002\u0010\u001d\u001a\u00020\u00032\b\b\u0002\u0010\u001e\u001a\u00020\t2\b\b\u0002\u0010\u001f\u001a\u00020\t2\b\b\u0002\u0010 \u001a\u00020\t2\b\b\u0002\u0010!\u001a\u00020\t2\b\b\u0002\u0010\"\u001a\u00020\t2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$2\b\b\u0002\u0010%\u001a\u00020&2\b\b\u0002\u0010'\u001a\u00020(2\b\b\u0002\u0010)\u001a\u00020\t2\b\b\u0002\u0010*\u001a\u00020\t2\b\b\u0002\u0010+\u001a\u00020,HÇ\u0001J\u0013\u0010{\u001a\u00020\t2\b\u0010|\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010}\u001a\u00020\u0005H×\u0001J\t\u0010~\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b1\u00102\u001a\u0004\b3\u00104R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b5\u00104R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b6\u00104R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u00107R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u00107R\u0011\u0010\u000b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u00107R\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b8\u00104R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b9\u0010:R\u0011\u0010\u000f\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b;\u0010:R\u0011\u0010\u0010\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b<\u0010:R\u0011\u0010\u0011\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b=\u0010:R\u0011\u0010\u0012\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u00107R\u0011\u0010\u0013\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u00107R\u0011\u0010\u0014\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b>\u00100R\u0011\u0010\u0015\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b?\u00100R\u0011\u0010\u0016\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u00107R\u0011\u0010\u0017\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u00107R\u0011\u0010\u0018\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b@\u00100R\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u001a¢\u0006\b\n\u0000\u001a\u0004\bA\u0010BR\u0017\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00030\u001a¢\u0006\b\n\u0000\u001a\u0004\bC\u0010BR\u0011\u0010\u001c\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bD\u00100R\u0011\u0010\u001d\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bE\u00100R\u0011\u0010\u001e\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u00107R\u0011\u0010\u001f\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u00107R\u0011\u0010 \u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b \u00107R\u0011\u0010!\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b!\u00107R\u0011\u0010\"\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\bF\u00107R\u0013\u0010#\u001a\u0004\u0018\u00010$¢\u0006\b\n\u0000\u001a\u0004\bG\u0010HR\u0011\u0010%\u001a\u00020&¢\u0006\b\n\u0000\u001a\u0004\bI\u0010JR\u0011\u0010'\u001a\u00020(¢\u0006\b\n\u0000\u001a\u0004\bK\u0010LR\u0011\u0010)\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\bM\u00107R\u0011\u0010*\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\bN\u00107R\u0011\u0010+\u001a\u00020,¢\u0006\b\n\u0000\u001a\u0004\bO\u0010P¨\u0006\u007f"}, m18302d2 = {"Lio/intercom/android/sdk/identity/AppConfig;", "", "name", "", "primaryColor", "", "secondaryColor", "secondaryColorDark", "isPrimaryColorRenderDarkText", "", "isSecondaryColorRenderDarkText", "isInboundMessages", "rateLimitCount", "rateLimitPeriodMs", "", "userUpdateCacheMaxAgeMs", "newSessionThresholdMs", "softResetTimeoutMs", "isMetricsEnabled", "isAudioEnabled", "locale", "helpCenterLocale", "isReceivedFromServer", "isBackgroundRequestsEnabled", "helpCenterUrl", "helpCenterUrls", "", "features", "launcherLogoUrl", "teamGreeting", "isIdentityVerificationEnabled", "isAccessToTeammateEnabled", "isHelpCenterRequireSearchEnabled", "isPreventMultipleInboundConversationsEnabled", "hasOpenConversations", "configModules", "Lio/intercom/android/sdk/models/ConfigModules;", "realTimeConfig", "Lio/intercom/android/nexus/NexusConfig;", "attachmentSettings", "Lio/intercom/android/sdk/models/AttachmentSettings;", "articleAutoReactionEnabled", "finDictationUiEnabled", "conversationStateSyncSettings", "Lio/intercom/android/sdk/models/ConversationStateSyncSettings;", "<init>", "(Ljava/lang/String;IIIZZZIJJJJZZLjava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Ljava/util/Set;Ljava/util/Set;Ljava/lang/String;Ljava/lang/String;ZZZZZLio/intercom/android/sdk/models/ConfigModules;Lio/intercom/android/nexus/NexusConfig;Lio/intercom/android/sdk/models/AttachmentSettings;ZZLio/intercom/android/sdk/models/ConversationStateSyncSettings;)V", "getName", "()Ljava/lang/String;", "getPrimaryColor$annotations", "()V", "getPrimaryColor", "()I", "getSecondaryColor", "getSecondaryColorDark", "()Z", "getRateLimitCount", "getRateLimitPeriodMs", "()J", "getUserUpdateCacheMaxAgeMs", "getNewSessionThresholdMs", "getSoftResetTimeoutMs", "getLocale", "getHelpCenterLocale", "getHelpCenterUrl", "getHelpCenterUrls", "()Ljava/util/Set;", "getFeatures", "getLauncherLogoUrl", "getTeamGreeting", "getHasOpenConversations", "getConfigModules", "()Lio/intercom/android/sdk/models/ConfigModules;", "getRealTimeConfig", "()Lio/intercom/android/nexus/NexusConfig;", "getAttachmentSettings", "()Lio/intercom/android/sdk/models/AttachmentSettings;", "getArticleAutoReactionEnabled", "getFinDictationUiEnabled", "getConversationStateSyncSettings", "()Lio/intercom/android/sdk/models/ConversationStateSyncSettings;", "hasFeature", "feature", "isBackgroundRequestsDisabled", "isSpaceEnabled", "space", "Lio/intercom/android/sdk/models/Space$Type;", "getSpaceLabelIfExists", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "component31", "component32", "component33", "component34", "copy", "equals", "other", "hashCode", "toString", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
@SourceDebugExtension
public final /* data */ class AppConfig {
    public static final int $stable = 8;
    private final boolean articleAutoReactionEnabled;

    @NotNull
    private final AttachmentSettings attachmentSettings;

    @Nullable
    private final ConfigModules configModules;

    @NotNull
    private final ConversationStateSyncSettings conversationStateSyncSettings;

    @NotNull
    private final Set<String> features;
    private final boolean finDictationUiEnabled;
    private final boolean hasOpenConversations;

    @NotNull
    private final String helpCenterLocale;

    @NotNull
    private final String helpCenterUrl;

    @NotNull
    private final Set<String> helpCenterUrls;
    private final boolean isAccessToTeammateEnabled;
    private final boolean isAudioEnabled;
    private final boolean isBackgroundRequestsEnabled;
    private final boolean isHelpCenterRequireSearchEnabled;
    private final boolean isIdentityVerificationEnabled;
    private final boolean isInboundMessages;
    private final boolean isMetricsEnabled;
    private final boolean isPreventMultipleInboundConversationsEnabled;
    private final boolean isPrimaryColorRenderDarkText;
    private final boolean isReceivedFromServer;
    private final boolean isSecondaryColorRenderDarkText;

    @NotNull
    private final String launcherLogoUrl;

    @NotNull
    private final String locale;

    @NotNull
    private final String name;
    private final long newSessionThresholdMs;
    private final int primaryColor;
    private final int rateLimitCount;
    private final long rateLimitPeriodMs;

    @NotNull
    private final NexusConfig realTimeConfig;
    private final int secondaryColor;
    private final int secondaryColorDark;
    private final long softResetTimeoutMs;

    @NotNull
    private final String teamGreeting;
    private final long userUpdateCacheMaxAgeMs;

    public AppConfig(@NotNull String name, @ColorInt int i, @ColorInt int i2, @ColorInt int i3, boolean z2, boolean z3, boolean z4, int i4, long j, long j2, long j3, long j4, boolean z5, boolean z6, @NotNull String locale, @NotNull String helpCenterLocale, boolean z7, boolean z8, @NotNull String helpCenterUrl, @NotNull Set<String> helpCenterUrls, @NotNull Set<String> features, @NotNull String launcherLogoUrl, @NotNull String teamGreeting, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, @Nullable ConfigModules configModules, @NotNull NexusConfig realTimeConfig, @NotNull AttachmentSettings attachmentSettings, boolean z14, boolean z15, @NotNull ConversationStateSyncSettings conversationStateSyncSettings) {
        Intrinsics.m18599g(name, "name");
        Intrinsics.m18599g(locale, "locale");
        Intrinsics.m18599g(helpCenterLocale, "helpCenterLocale");
        Intrinsics.m18599g(helpCenterUrl, "helpCenterUrl");
        Intrinsics.m18599g(helpCenterUrls, "helpCenterUrls");
        Intrinsics.m18599g(features, "features");
        Intrinsics.m18599g(launcherLogoUrl, "launcherLogoUrl");
        Intrinsics.m18599g(teamGreeting, "teamGreeting");
        Intrinsics.m18599g(realTimeConfig, "realTimeConfig");
        Intrinsics.m18599g(attachmentSettings, "attachmentSettings");
        Intrinsics.m18599g(conversationStateSyncSettings, "conversationStateSyncSettings");
        this.name = name;
        this.primaryColor = i;
        this.secondaryColor = i2;
        this.secondaryColorDark = i3;
        this.isPrimaryColorRenderDarkText = z2;
        this.isSecondaryColorRenderDarkText = z3;
        this.isInboundMessages = z4;
        this.rateLimitCount = i4;
        this.rateLimitPeriodMs = j;
        this.userUpdateCacheMaxAgeMs = j2;
        this.newSessionThresholdMs = j3;
        this.softResetTimeoutMs = j4;
        this.isMetricsEnabled = z5;
        this.isAudioEnabled = z6;
        this.locale = locale;
        this.helpCenterLocale = helpCenterLocale;
        this.isReceivedFromServer = z7;
        this.isBackgroundRequestsEnabled = z8;
        this.helpCenterUrl = helpCenterUrl;
        this.helpCenterUrls = helpCenterUrls;
        this.features = features;
        this.launcherLogoUrl = launcherLogoUrl;
        this.teamGreeting = teamGreeting;
        this.isIdentityVerificationEnabled = z9;
        this.isAccessToTeammateEnabled = z10;
        this.isHelpCenterRequireSearchEnabled = z11;
        this.isPreventMultipleInboundConversationsEnabled = z12;
        this.hasOpenConversations = z13;
        this.configModules = configModules;
        this.realTimeConfig = realTimeConfig;
        this.attachmentSettings = attachmentSettings;
        this.articleAutoReactionEnabled = z14;
        this.finDictationUiEnabled = z15;
        this.conversationStateSyncSettings = conversationStateSyncSettings;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AppConfig copy$default(AppConfig appConfig, String str, int i, int i2, int i3, boolean z2, boolean z3, boolean z4, int i4, long j, long j2, long j3, long j4, boolean z5, boolean z6, String str2, String str3, boolean z7, boolean z8, String str4, Set set, Set set2, String str5, String str6, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, ConfigModules configModules, NexusConfig nexusConfig, AttachmentSettings attachmentSettings, boolean z14, boolean z15, ConversationStateSyncSettings conversationStateSyncSettings, int i5, int i6, Object obj) {
        ConversationStateSyncSettings conversationStateSyncSettings2;
        boolean z16;
        boolean z17;
        String str7;
        Set set3;
        Set set4;
        String str8;
        String str9;
        boolean z18;
        boolean z19;
        boolean z20;
        boolean z21;
        boolean z22;
        ConfigModules configModules2;
        NexusConfig nexusConfig2;
        AttachmentSettings attachmentSettings2;
        boolean z23;
        String str10;
        boolean z24;
        boolean z25;
        int i7;
        long j5;
        long j6;
        long j7;
        long j8;
        boolean z26;
        String str11;
        boolean z27;
        int i8;
        int i9;
        boolean z28;
        boolean z29;
        String str12 = (i5 & 1) != 0 ? appConfig.name : str;
        int i10 = (i5 & 2) != 0 ? appConfig.primaryColor : i;
        int i11 = (i5 & 4) != 0 ? appConfig.secondaryColor : i2;
        int i12 = (i5 & 8) != 0 ? appConfig.secondaryColorDark : i3;
        boolean z30 = (i5 & 16) != 0 ? appConfig.isPrimaryColorRenderDarkText : z2;
        boolean z31 = (i5 & 32) != 0 ? appConfig.isSecondaryColorRenderDarkText : z3;
        boolean z32 = (i5 & 64) != 0 ? appConfig.isInboundMessages : z4;
        int i13 = (i5 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0 ? appConfig.rateLimitCount : i4;
        long j9 = (i5 & 256) != 0 ? appConfig.rateLimitPeriodMs : j;
        long j10 = (i5 & 512) != 0 ? appConfig.userUpdateCacheMaxAgeMs : j2;
        long j11 = (i5 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 ? appConfig.newSessionThresholdMs : j3;
        String str13 = str12;
        int i14 = i10;
        long j12 = (i5 & 2048) != 0 ? appConfig.softResetTimeoutMs : j4;
        boolean z33 = (i5 & 4096) != 0 ? appConfig.isMetricsEnabled : z5;
        boolean z34 = (i5 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? appConfig.isAudioEnabled : z6;
        boolean z35 = z33;
        String str14 = (i5 & 16384) != 0 ? appConfig.locale : str2;
        String str15 = (i5 & 32768) != 0 ? appConfig.helpCenterLocale : str3;
        boolean z36 = (i5 & 65536) != 0 ? appConfig.isReceivedFromServer : z7;
        boolean z37 = (i5 & 131072) != 0 ? appConfig.isBackgroundRequestsEnabled : z8;
        String str16 = (i5 & 262144) != 0 ? appConfig.helpCenterUrl : str4;
        Set set5 = (i5 & 524288) != 0 ? appConfig.helpCenterUrls : set;
        Set set6 = (i5 & 1048576) != 0 ? appConfig.features : set2;
        String str17 = (i5 & 2097152) != 0 ? appConfig.launcherLogoUrl : str5;
        String str18 = (i5 & 4194304) != 0 ? appConfig.teamGreeting : str6;
        boolean z38 = (i5 & 8388608) != 0 ? appConfig.isIdentityVerificationEnabled : z9;
        boolean z39 = (i5 & 16777216) != 0 ? appConfig.isAccessToTeammateEnabled : z10;
        boolean z40 = (i5 & 33554432) != 0 ? appConfig.isHelpCenterRequireSearchEnabled : z11;
        boolean z41 = (i5 & 67108864) != 0 ? appConfig.isPreventMultipleInboundConversationsEnabled : z12;
        boolean z42 = (i5 & 134217728) != 0 ? appConfig.hasOpenConversations : z13;
        ConfigModules configModules3 = (i5 & 268435456) != 0 ? appConfig.configModules : configModules;
        NexusConfig nexusConfig3 = (i5 & 536870912) != 0 ? appConfig.realTimeConfig : nexusConfig;
        AttachmentSettings attachmentSettings3 = (i5 & Ints.MAX_POWER_OF_TWO) != 0 ? appConfig.attachmentSettings : attachmentSettings;
        boolean z43 = (i5 & Integer.MIN_VALUE) != 0 ? appConfig.articleAutoReactionEnabled : z14;
        boolean z44 = (i6 & 1) != 0 ? appConfig.finDictationUiEnabled : z15;
        if ((i6 & 2) != 0) {
            z16 = z44;
            conversationStateSyncSettings2 = appConfig.conversationStateSyncSettings;
            str7 = str16;
            set3 = set5;
            set4 = set6;
            str8 = str17;
            str9 = str18;
            z18 = z38;
            z19 = z39;
            z20 = z40;
            z21 = z41;
            z22 = z42;
            configModules2 = configModules3;
            nexusConfig2 = nexusConfig3;
            attachmentSettings2 = attachmentSettings3;
            z23 = z43;
            str10 = str14;
            z24 = z34;
            i7 = i13;
            j5 = j9;
            j6 = j10;
            j7 = j11;
            j8 = j12;
            z26 = z35;
            str11 = str15;
            z27 = z36;
            z17 = z37;
            i8 = i11;
            i9 = i12;
            z28 = z30;
            z29 = z31;
            z25 = z32;
        } else {
            conversationStateSyncSettings2 = conversationStateSyncSettings;
            z16 = z44;
            z17 = z37;
            str7 = str16;
            set3 = set5;
            set4 = set6;
            str8 = str17;
            str9 = str18;
            z18 = z38;
            z19 = z39;
            z20 = z40;
            z21 = z41;
            z22 = z42;
            configModules2 = configModules3;
            nexusConfig2 = nexusConfig3;
            attachmentSettings2 = attachmentSettings3;
            z23 = z43;
            str10 = str14;
            z24 = z34;
            z25 = z32;
            i7 = i13;
            j5 = j9;
            j6 = j10;
            j7 = j11;
            j8 = j12;
            z26 = z35;
            str11 = str15;
            z27 = z36;
            i8 = i11;
            i9 = i12;
            z28 = z30;
            z29 = z31;
        }
        return appConfig.copy(str13, i14, i8, i9, z28, z29, z25, i7, j5, j6, j7, j8, z26, z24, str10, str11, z27, z17, str7, set3, set4, str8, str9, z18, z19, z20, z21, z22, configModules2, nexusConfig2, attachmentSettings2, z23, z16, conversationStateSyncSettings2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final long getUserUpdateCacheMaxAgeMs() {
        return this.userUpdateCacheMaxAgeMs;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final long getNewSessionThresholdMs() {
        return this.newSessionThresholdMs;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final long getSoftResetTimeoutMs() {
        return this.softResetTimeoutMs;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final boolean getIsMetricsEnabled() {
        return this.isMetricsEnabled;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final boolean getIsAudioEnabled() {
        return this.isAudioEnabled;
    }

    @NotNull
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getLocale() {
        return this.locale;
    }

    @NotNull
    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getHelpCenterLocale() {
        return this.helpCenterLocale;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final boolean getIsReceivedFromServer() {
        return this.isReceivedFromServer;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final boolean getIsBackgroundRequestsEnabled() {
        return this.isBackgroundRequestsEnabled;
    }

    @NotNull
    /* JADX INFO: renamed from: component19, reason: from getter */
    public final String getHelpCenterUrl() {
        return this.helpCenterUrl;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getPrimaryColor() {
        return this.primaryColor;
    }

    @NotNull
    public final Set<String> component20() {
        return this.helpCenterUrls;
    }

    @NotNull
    public final Set<String> component21() {
        return this.features;
    }

    @NotNull
    /* JADX INFO: renamed from: component22, reason: from getter */
    public final String getLauncherLogoUrl() {
        return this.launcherLogoUrl;
    }

    @NotNull
    /* JADX INFO: renamed from: component23, reason: from getter */
    public final String getTeamGreeting() {
        return this.teamGreeting;
    }

    /* JADX INFO: renamed from: component24, reason: from getter */
    public final boolean getIsIdentityVerificationEnabled() {
        return this.isIdentityVerificationEnabled;
    }

    /* JADX INFO: renamed from: component25, reason: from getter */
    public final boolean getIsAccessToTeammateEnabled() {
        return this.isAccessToTeammateEnabled;
    }

    /* JADX INFO: renamed from: component26, reason: from getter */
    public final boolean getIsHelpCenterRequireSearchEnabled() {
        return this.isHelpCenterRequireSearchEnabled;
    }

    /* JADX INFO: renamed from: component27, reason: from getter */
    public final boolean getIsPreventMultipleInboundConversationsEnabled() {
        return this.isPreventMultipleInboundConversationsEnabled;
    }

    /* JADX INFO: renamed from: component28, reason: from getter */
    public final boolean getHasOpenConversations() {
        return this.hasOpenConversations;
    }

    @Nullable
    /* JADX INFO: renamed from: component29, reason: from getter */
    public final ConfigModules getConfigModules() {
        return this.configModules;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getSecondaryColor() {
        return this.secondaryColor;
    }

    @NotNull
    /* JADX INFO: renamed from: component30, reason: from getter */
    public final NexusConfig getRealTimeConfig() {
        return this.realTimeConfig;
    }

    @NotNull
    /* JADX INFO: renamed from: component31, reason: from getter */
    public final AttachmentSettings getAttachmentSettings() {
        return this.attachmentSettings;
    }

    /* JADX INFO: renamed from: component32, reason: from getter */
    public final boolean getArticleAutoReactionEnabled() {
        return this.articleAutoReactionEnabled;
    }

    /* JADX INFO: renamed from: component33, reason: from getter */
    public final boolean getFinDictationUiEnabled() {
        return this.finDictationUiEnabled;
    }

    @NotNull
    /* JADX INFO: renamed from: component34, reason: from getter */
    public final ConversationStateSyncSettings getConversationStateSyncSettings() {
        return this.conversationStateSyncSettings;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getSecondaryColorDark() {
        return this.secondaryColorDark;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getIsPrimaryColorRenderDarkText() {
        return this.isPrimaryColorRenderDarkText;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getIsSecondaryColorRenderDarkText() {
        return this.isSecondaryColorRenderDarkText;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getIsInboundMessages() {
        return this.isInboundMessages;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getRateLimitCount() {
        return this.rateLimitCount;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final long getRateLimitPeriodMs() {
        return this.rateLimitPeriodMs;
    }

    @NotNull
    public final AppConfig copy(@NotNull String name, @ColorInt int primaryColor, @ColorInt int secondaryColor, @ColorInt int secondaryColorDark, boolean isPrimaryColorRenderDarkText, boolean isSecondaryColorRenderDarkText, boolean isInboundMessages, int rateLimitCount, long rateLimitPeriodMs, long userUpdateCacheMaxAgeMs, long newSessionThresholdMs, long softResetTimeoutMs, boolean isMetricsEnabled, boolean isAudioEnabled, @NotNull String locale, @NotNull String helpCenterLocale, boolean isReceivedFromServer, boolean isBackgroundRequestsEnabled, @NotNull String helpCenterUrl, @NotNull Set<String> helpCenterUrls, @NotNull Set<String> features, @NotNull String launcherLogoUrl, @NotNull String teamGreeting, boolean isIdentityVerificationEnabled, boolean isAccessToTeammateEnabled, boolean isHelpCenterRequireSearchEnabled, boolean isPreventMultipleInboundConversationsEnabled, boolean hasOpenConversations, @Nullable ConfigModules configModules, @NotNull NexusConfig realTimeConfig, @NotNull AttachmentSettings attachmentSettings, boolean articleAutoReactionEnabled, boolean finDictationUiEnabled, @NotNull ConversationStateSyncSettings conversationStateSyncSettings) {
        Intrinsics.m18599g(name, "name");
        Intrinsics.m18599g(locale, "locale");
        Intrinsics.m18599g(helpCenterLocale, "helpCenterLocale");
        Intrinsics.m18599g(helpCenterUrl, "helpCenterUrl");
        Intrinsics.m18599g(helpCenterUrls, "helpCenterUrls");
        Intrinsics.m18599g(features, "features");
        Intrinsics.m18599g(launcherLogoUrl, "launcherLogoUrl");
        Intrinsics.m18599g(teamGreeting, "teamGreeting");
        Intrinsics.m18599g(realTimeConfig, "realTimeConfig");
        Intrinsics.m18599g(attachmentSettings, "attachmentSettings");
        Intrinsics.m18599g(conversationStateSyncSettings, "conversationStateSyncSettings");
        return new AppConfig(name, primaryColor, secondaryColor, secondaryColorDark, isPrimaryColorRenderDarkText, isSecondaryColorRenderDarkText, isInboundMessages, rateLimitCount, rateLimitPeriodMs, userUpdateCacheMaxAgeMs, newSessionThresholdMs, softResetTimeoutMs, isMetricsEnabled, isAudioEnabled, locale, helpCenterLocale, isReceivedFromServer, isBackgroundRequestsEnabled, helpCenterUrl, helpCenterUrls, features, launcherLogoUrl, teamGreeting, isIdentityVerificationEnabled, isAccessToTeammateEnabled, isHelpCenterRequireSearchEnabled, isPreventMultipleInboundConversationsEnabled, hasOpenConversations, configModules, realTimeConfig, attachmentSettings, articleAutoReactionEnabled, finDictationUiEnabled, conversationStateSyncSettings);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AppConfig)) {
            return false;
        }
        AppConfig appConfig = (AppConfig) other;
        return Intrinsics.m18594b(this.name, appConfig.name) && this.primaryColor == appConfig.primaryColor && this.secondaryColor == appConfig.secondaryColor && this.secondaryColorDark == appConfig.secondaryColorDark && this.isPrimaryColorRenderDarkText == appConfig.isPrimaryColorRenderDarkText && this.isSecondaryColorRenderDarkText == appConfig.isSecondaryColorRenderDarkText && this.isInboundMessages == appConfig.isInboundMessages && this.rateLimitCount == appConfig.rateLimitCount && this.rateLimitPeriodMs == appConfig.rateLimitPeriodMs && this.userUpdateCacheMaxAgeMs == appConfig.userUpdateCacheMaxAgeMs && this.newSessionThresholdMs == appConfig.newSessionThresholdMs && this.softResetTimeoutMs == appConfig.softResetTimeoutMs && this.isMetricsEnabled == appConfig.isMetricsEnabled && this.isAudioEnabled == appConfig.isAudioEnabled && Intrinsics.m18594b(this.locale, appConfig.locale) && Intrinsics.m18594b(this.helpCenterLocale, appConfig.helpCenterLocale) && this.isReceivedFromServer == appConfig.isReceivedFromServer && this.isBackgroundRequestsEnabled == appConfig.isBackgroundRequestsEnabled && Intrinsics.m18594b(this.helpCenterUrl, appConfig.helpCenterUrl) && Intrinsics.m18594b(this.helpCenterUrls, appConfig.helpCenterUrls) && Intrinsics.m18594b(this.features, appConfig.features) && Intrinsics.m18594b(this.launcherLogoUrl, appConfig.launcherLogoUrl) && Intrinsics.m18594b(this.teamGreeting, appConfig.teamGreeting) && this.isIdentityVerificationEnabled == appConfig.isIdentityVerificationEnabled && this.isAccessToTeammateEnabled == appConfig.isAccessToTeammateEnabled && this.isHelpCenterRequireSearchEnabled == appConfig.isHelpCenterRequireSearchEnabled && this.isPreventMultipleInboundConversationsEnabled == appConfig.isPreventMultipleInboundConversationsEnabled && this.hasOpenConversations == appConfig.hasOpenConversations && Intrinsics.m18594b(this.configModules, appConfig.configModules) && Intrinsics.m18594b(this.realTimeConfig, appConfig.realTimeConfig) && Intrinsics.m18594b(this.attachmentSettings, appConfig.attachmentSettings) && this.articleAutoReactionEnabled == appConfig.articleAutoReactionEnabled && this.finDictationUiEnabled == appConfig.finDictationUiEnabled && Intrinsics.m18594b(this.conversationStateSyncSettings, appConfig.conversationStateSyncSettings);
    }

    public final boolean getArticleAutoReactionEnabled() {
        return this.articleAutoReactionEnabled;
    }

    @NotNull
    public final AttachmentSettings getAttachmentSettings() {
        return this.attachmentSettings;
    }

    @Nullable
    public final ConfigModules getConfigModules() {
        return this.configModules;
    }

    @NotNull
    public final ConversationStateSyncSettings getConversationStateSyncSettings() {
        return this.conversationStateSyncSettings;
    }

    @NotNull
    public final Set<String> getFeatures() {
        return this.features;
    }

    public final boolean getFinDictationUiEnabled() {
        return this.finDictationUiEnabled;
    }

    public final boolean getHasOpenConversations() {
        return this.hasOpenConversations;
    }

    @NotNull
    public final String getHelpCenterLocale() {
        return this.helpCenterLocale;
    }

    @NotNull
    public final String getHelpCenterUrl() {
        return this.helpCenterUrl;
    }

    @NotNull
    public final Set<String> getHelpCenterUrls() {
        return this.helpCenterUrls;
    }

    @NotNull
    public final String getLauncherLogoUrl() {
        return this.launcherLogoUrl;
    }

    @NotNull
    public final String getLocale() {
        return this.locale;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final long getNewSessionThresholdMs() {
        return this.newSessionThresholdMs;
    }

    public final int getPrimaryColor() {
        return this.primaryColor;
    }

    public final int getRateLimitCount() {
        return this.rateLimitCount;
    }

    public final long getRateLimitPeriodMs() {
        return this.rateLimitPeriodMs;
    }

    @NotNull
    public final NexusConfig getRealTimeConfig() {
        return this.realTimeConfig;
    }

    public final int getSecondaryColor() {
        return this.secondaryColor;
    }

    public final int getSecondaryColorDark() {
        return this.secondaryColorDark;
    }

    public final long getSoftResetTimeoutMs() {
        return this.softResetTimeoutMs;
    }

    @Nullable
    public final String getSpaceLabelIfExists(@NotNull Space.Type space) {
        HomeConfig home;
        OpenConfig openConfig;
        List<Space> spaces;
        Object next;
        Intrinsics.m18599g(space, "space");
        ConfigModules configModules = this.configModules;
        if (configModules != null && (home = configModules.getHome()) != null && (openConfig = home.getOpenConfig()) != null && (spaces = openConfig.getSpaces()) != null) {
            Iterator<T> it = spaces.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((Space) next).getType() == space) {
                    break;
                }
            }
            Space space2 = (Space) next;
            if (space2 != null) {
                return space2.getLabel();
            }
        }
        return null;
    }

    @NotNull
    public final String getTeamGreeting() {
        return this.teamGreeting;
    }

    public final long getUserUpdateCacheMaxAgeMs() {
        return this.userUpdateCacheMaxAgeMs;
    }

    public final boolean hasFeature(@NotNull String feature) {
        Intrinsics.m18599g(feature, "feature");
        return this.features.contains(feature);
    }

    public int hashCode() {
        int iM2230e = AbstractC0455a.m2230e(AbstractC0455a.m2230e(AbstractC0455a.m2230e(AbstractC0455a.m2230e(AbstractC0455a.m2230e(AbstractC0000a.m5b(AbstractC0000a.m5b((this.features.hashCode() + ((this.helpCenterUrls.hashCode() + AbstractC0000a.m5b(AbstractC0455a.m2230e(AbstractC0455a.m2230e(AbstractC0000a.m5b(AbstractC0000a.m5b(AbstractC0455a.m2230e(AbstractC0455a.m2230e(AbstractC0455a.m2231f(this.softResetTimeoutMs, AbstractC0455a.m2231f(this.newSessionThresholdMs, AbstractC0455a.m2231f(this.userUpdateCacheMaxAgeMs, AbstractC0455a.m2231f(this.rateLimitPeriodMs, AbstractC0455a.m2228c(this.rateLimitCount, AbstractC0455a.m2230e(AbstractC0455a.m2230e(AbstractC0455a.m2230e(AbstractC0455a.m2228c(this.secondaryColorDark, AbstractC0455a.m2228c(this.secondaryColor, AbstractC0455a.m2228c(this.primaryColor, this.name.hashCode() * 31, 31), 31), 31), 31, this.isPrimaryColorRenderDarkText), 31, this.isSecondaryColorRenderDarkText), 31, this.isInboundMessages), 31), 31), 31), 31), 31), 31, this.isMetricsEnabled), 31, this.isAudioEnabled), 31, this.locale), 31, this.helpCenterLocale), 31, this.isReceivedFromServer), 31, this.isBackgroundRequestsEnabled), 31, this.helpCenterUrl)) * 31)) * 31, 31, this.launcherLogoUrl), 31, this.teamGreeting), 31, this.isIdentityVerificationEnabled), 31, this.isAccessToTeammateEnabled), 31, this.isHelpCenterRequireSearchEnabled), 31, this.isPreventMultipleInboundConversationsEnabled), 31, this.hasOpenConversations);
        ConfigModules configModules = this.configModules;
        return this.conversationStateSyncSettings.hashCode() + AbstractC0455a.m2230e(AbstractC0455a.m2230e((this.attachmentSettings.hashCode() + ((this.realTimeConfig.hashCode() + ((iM2230e + (configModules == null ? 0 : configModules.hashCode())) * 31)) * 31)) * 31, 31, this.articleAutoReactionEnabled), 31, this.finDictationUiEnabled);
    }

    public final boolean isAccessToTeammateEnabled() {
        return this.isAccessToTeammateEnabled;
    }

    public final boolean isAudioEnabled() {
        return this.isAudioEnabled;
    }

    public final boolean isBackgroundRequestsDisabled() {
        return !this.isBackgroundRequestsEnabled;
    }

    public final boolean isBackgroundRequestsEnabled() {
        return this.isBackgroundRequestsEnabled;
    }

    public final boolean isHelpCenterRequireSearchEnabled() {
        return this.isHelpCenterRequireSearchEnabled;
    }

    public final boolean isIdentityVerificationEnabled() {
        return this.isIdentityVerificationEnabled;
    }

    public final boolean isInboundMessages() {
        return this.isInboundMessages;
    }

    public final boolean isMetricsEnabled() {
        return this.isMetricsEnabled;
    }

    public final boolean isPreventMultipleInboundConversationsEnabled() {
        return this.isPreventMultipleInboundConversationsEnabled;
    }

    public final boolean isPrimaryColorRenderDarkText() {
        return this.isPrimaryColorRenderDarkText;
    }

    public final boolean isReceivedFromServer() {
        return this.isReceivedFromServer;
    }

    public final boolean isSecondaryColorRenderDarkText() {
        return this.isSecondaryColorRenderDarkText;
    }

    public final boolean isSpaceEnabled(@NotNull Space.Type space) {
        HomeConfig home;
        OpenConfig openConfig;
        List<Space> spaces;
        Intrinsics.m18599g(space, "space");
        ConfigModules configModules = this.configModules;
        if (configModules != null && (home = configModules.getHome()) != null && (openConfig = home.getOpenConfig()) != null && (spaces = openConfig.getSpaces()) != null) {
            List<Space> list = spaces;
            if ((list instanceof Collection) && list.isEmpty()) {
                return false;
            }
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((Space) it.next()).getType() == space) {
                    return true;
                }
            }
        }
        return false;
    }

    @NotNull
    public String toString() {
        return "AppConfig(name=" + this.name + ", primaryColor=" + this.primaryColor + ", secondaryColor=" + this.secondaryColor + ", secondaryColorDark=" + this.secondaryColorDark + ", isPrimaryColorRenderDarkText=" + this.isPrimaryColorRenderDarkText + ", isSecondaryColorRenderDarkText=" + this.isSecondaryColorRenderDarkText + ", isInboundMessages=" + this.isInboundMessages + ", rateLimitCount=" + this.rateLimitCount + ", rateLimitPeriodMs=" + this.rateLimitPeriodMs + ", userUpdateCacheMaxAgeMs=" + this.userUpdateCacheMaxAgeMs + ", newSessionThresholdMs=" + this.newSessionThresholdMs + ", softResetTimeoutMs=" + this.softResetTimeoutMs + ", isMetricsEnabled=" + this.isMetricsEnabled + ", isAudioEnabled=" + this.isAudioEnabled + ", locale=" + this.locale + ", helpCenterLocale=" + this.helpCenterLocale + ", isReceivedFromServer=" + this.isReceivedFromServer + ", isBackgroundRequestsEnabled=" + this.isBackgroundRequestsEnabled + ", helpCenterUrl=" + this.helpCenterUrl + ", helpCenterUrls=" + this.helpCenterUrls + ", features=" + this.features + ", launcherLogoUrl=" + this.launcherLogoUrl + ", teamGreeting=" + this.teamGreeting + ", isIdentityVerificationEnabled=" + this.isIdentityVerificationEnabled + ", isAccessToTeammateEnabled=" + this.isAccessToTeammateEnabled + ", isHelpCenterRequireSearchEnabled=" + this.isHelpCenterRequireSearchEnabled + ", isPreventMultipleInboundConversationsEnabled=" + this.isPreventMultipleInboundConversationsEnabled + ", hasOpenConversations=" + this.hasOpenConversations + ", configModules=" + this.configModules + ", realTimeConfig=" + this.realTimeConfig + ", attachmentSettings=" + this.attachmentSettings + ", articleAutoReactionEnabled=" + this.articleAutoReactionEnabled + ", finDictationUiEnabled=" + this.finDictationUiEnabled + ", conversationStateSyncSettings=" + this.conversationStateSyncSettings + ')';
    }

    @Deprecated
    public static /* synthetic */ void getPrimaryColor$annotations() {
    }
}
