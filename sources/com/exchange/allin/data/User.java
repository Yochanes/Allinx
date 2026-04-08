package com.exchange.allin.data;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.animation.AbstractC0455a;
import androidx.compose.runtime.internal.StabilityInferred;
import com.exchange.allin.R;
import com.exchange.allin.utils.ext.StringExtKt;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.gson.annotations.SerializedName;
import com.mvi.base.IgnoredOnProguard;
import io.intercom.android.sdk.models.AttributeType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Parcelize
@Metadata(m18301d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\bL\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bé\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u000f\u001a\u00020\t\u0012\u0006\u0010\u0010\u001a\u00020\t\u0012\u0006\u0010\u0011\u001a\u00020\t\u0012\u0006\u0010\u0012\u001a\u00020\t\u0012\u0006\u0010\u0013\u001a\u00020\t\u0012\u0006\u0010\u0014\u001a\u00020\t\u0012\u0006\u0010\u0015\u001a\u00020\u0006\u0012\u0006\u0010\u0016\u001a\u00020\u0006\u0012\u0006\u0010\u0017\u001a\u00020\u0006\u0012\u0006\u0010\u0018\u001a\u00020\u0006\u0012\u0006\u0010\u0019\u001a\u00020\u0006\u0012\u0006\u0010\u001a\u001a\u00020\u0006\u0012\u0006\u0010\u001b\u001a\u00020\u0006\u0012\u0006\u0010\u001c\u001a\u00020\u0006\u0012\u0006\u0010\u001d\u001a\u00020\u0006\u0012\u0006\u0010\u001e\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u001f\u001a\u00020 \u0012\u0006\u0010!\u001a\u00020\t¢\u0006\u0004\b\"\u0010#J\t\u0010M\u001a\u00020\u0003HÆ\u0003J\t\u0010N\u001a\u00020\u0003HÆ\u0003J\t\u0010O\u001a\u00020\u0006HÆ\u0003J\t\u0010P\u001a\u00020\u0006HÆ\u0003J\t\u0010Q\u001a\u00020\tHÆ\u0003J\t\u0010R\u001a\u00020\tHÆ\u0003J\t\u0010S\u001a\u00020\tHÆ\u0003J\t\u0010T\u001a\u00020\tHÆ\u0003J\t\u0010U\u001a\u00020\tHÆ\u0003J\t\u0010V\u001a\u00020\tHÆ\u0003J\t\u0010W\u001a\u00020\tHÆ\u0003J\t\u0010X\u001a\u00020\tHÆ\u0003J\t\u0010Y\u001a\u00020\tHÆ\u0003J\t\u0010Z\u001a\u00020\tHÆ\u0003J\t\u0010[\u001a\u00020\tHÆ\u0003J\t\u0010\\\u001a\u00020\tHÆ\u0003J\t\u0010]\u001a\u00020\u0006HÆ\u0003J\t\u0010^\u001a\u00020\u0006HÆ\u0003J\t\u0010_\u001a\u00020\u0006HÆ\u0003J\t\u0010`\u001a\u00020\u0006HÆ\u0003J\t\u0010a\u001a\u00020\u0006HÆ\u0003J\t\u0010b\u001a\u00020\u0006HÆ\u0003J\t\u0010c\u001a\u00020\u0006HÆ\u0003J\t\u0010d\u001a\u00020\u0006HÆ\u0003J\t\u0010e\u001a\u00020\u0006HÆ\u0003J\t\u0010f\u001a\u00020\u0006HÆ\u0003J\t\u0010g\u001a\u00020 HÆ\u0003J\t\u0010h\u001a\u00020\tHÆ\u0003J¡\u0002\u0010i\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\t2\b\b\u0002\u0010\u000f\u001a\u00020\t2\b\b\u0002\u0010\u0010\u001a\u00020\t2\b\b\u0002\u0010\u0011\u001a\u00020\t2\b\b\u0002\u0010\u0012\u001a\u00020\t2\b\b\u0002\u0010\u0013\u001a\u00020\t2\b\b\u0002\u0010\u0014\u001a\u00020\t2\b\b\u0002\u0010\u0015\u001a\u00020\u00062\b\b\u0002\u0010\u0016\u001a\u00020\u00062\b\b\u0002\u0010\u0017\u001a\u00020\u00062\b\b\u0002\u0010\u0018\u001a\u00020\u00062\b\b\u0002\u0010\u0019\u001a\u00020\u00062\b\b\u0002\u0010\u001a\u001a\u00020\u00062\b\b\u0002\u0010\u001b\u001a\u00020\u00062\b\b\u0002\u0010\u001c\u001a\u00020\u00062\b\b\u0002\u0010\u001d\u001a\u00020\u00062\b\b\u0002\u0010\u001e\u001a\u00020\u00062\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020\tHÆ\u0001J\u0006\u0010j\u001a\u00020\u0006J\u0013\u0010k\u001a\u00020 2\b\u0010l\u001a\u0004\u0018\u00010mHÖ\u0003J\t\u0010n\u001a\u00020\u0006HÖ\u0001J\t\u0010o\u001a\u00020\tHÖ\u0001J\u0016\u0010p\u001a\u00020q2\u0006\u0010r\u001a\u00020s2\u0006\u0010t\u001a\u00020\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010%R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0016\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010(R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0016\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010+R\u0011\u0010\u000b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b-\u0010+R\u0011\u0010\f\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b.\u0010+R\u0011\u0010\r\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b/\u0010+R\u0011\u0010\u000e\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b0\u0010+R\u0011\u0010\u000f\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b1\u0010+R\u0011\u0010\u0010\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b2\u0010+R\u0016\u0010\u0011\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u0010+R\u0016\u0010\u0012\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u0010+R\u0016\u0010\u0013\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u0010+R\u0016\u0010\u0014\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u0010+R\u0016\u0010\u0015\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u0010(R\u0016\u0010\u0016\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b8\u0010(R\u0016\u0010\u0017\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b9\u0010(R\u0016\u0010\u0018\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b:\u0010(R\u0016\u0010\u0019\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b;\u0010(R\u0016\u0010\u001a\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b<\u0010(R\u0016\u0010\u001b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b=\u0010(R\u0016\u0010\u001c\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b>\u0010(R\u0016\u0010\u001d\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b?\u0010(R\u0016\u0010\u001e\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b@\u0010(R\u001a\u0010\u001f\u001a\u00020 X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010A\"\u0004\bB\u0010CR\u001a\u0010!\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bD\u0010+\"\u0004\bE\u0010FR\u0011\u0010G\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\bH\u0010+R\u0011\u0010I\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\bJ\u0010+R\u0011\u0010K\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\bL\u0010(¨\u0006u"}, m18302d2 = {"Lcom/exchange/allin/data/User;", "Landroid/os/Parcelable;", "uid", "", "id", "chainId", "", "originId", "chainName", "", "nickName", "email", AttributeType.PHONE, "code", "country", "address", "remark", "invitationCode", "invitationUrl", "phishingCode", "proxyRoot", "emailBindState", "phoneBindState", "googleAuthBindState", "emailAuthState", "phoneAuthState", "googleAuthCodeState", "walletAuthState", "updateAt", "createAt", "verifyStatus", "isExpired", "", "token", "<init>", "(JJIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIIIIIIIIZLjava/lang/String;)V", "getUid", "()J", "getId", "getChainId", "()I", "getOriginId", "getChainName", "()Ljava/lang/String;", "getNickName", "getEmail", "getPhone", "getCode", "getCountry", "getAddress", "getRemark", "getInvitationCode", "getInvitationUrl", "getPhishingCode", "getProxyRoot", "getEmailBindState", "getPhoneBindState", "getGoogleAuthBindState", "getEmailAuthState", "getPhoneAuthState", "getGoogleAuthCodeState", "getWalletAuthState", "getUpdateAt", "getCreateAt", "getVerifyStatus", "()Z", "setExpired", "(Z)V", "getToken", "setToken", "(Ljava/lang/String;)V", "account", "getAccount", "verifyStatusExt", "getVerifyStatusExt", "verifyStatusIconExt", "getVerifyStatusIconExt", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "copy", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
@IgnoredOnProguard
@SourceDebugExtension
public final /* data */ class User implements Parcelable {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<User> CREATOR = new Creator();

    @NotNull
    private final String address;

    @SerializedName("chain_id")
    private final int chainId;

    @SerializedName("chain_name")
    @NotNull
    private final String chainName;

    @NotNull
    private final String code;

    @NotNull
    private final String country;

    @SerializedName("create_at")
    private final int createAt;

    @NotNull
    private final String email;

    @SerializedName("email_auth_state")
    private final int emailAuthState;

    @SerializedName("email_bind_state")
    private final int emailBindState;

    @SerializedName("google_auth_bind_state")
    private final int googleAuthBindState;

    @SerializedName("google_auth_code_state")
    private final int googleAuthCodeState;
    private final long id;

    @SerializedName("invitation_code")
    @NotNull
    private final String invitationCode;

    @SerializedName("invitation_url")
    @NotNull
    private final String invitationUrl;
    private boolean isExpired;

    @SerializedName("nick_name")
    @NotNull
    private final String nickName;

    @SerializedName("origin_id")
    private final int originId;

    @SerializedName("phishing_code")
    @NotNull
    private final String phishingCode;

    @NotNull
    private final String phone;

    @SerializedName("phone_auth_state")
    private final int phoneAuthState;

    @SerializedName("phone_bind_state")
    private final int phoneBindState;

    @SerializedName("proxy_root")
    @NotNull
    private final String proxyRoot;

    @NotNull
    private final String remark;

    @NotNull
    private String token;
    private final long uid;

    @SerializedName("update_at")
    private final int updateAt;

    @SerializedName("verify_status")
    private final int verifyStatus;

    @SerializedName("wallet_auth_state")
    private final int walletAuthState;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18303k = 3, m18304mv = {2, 1, 0}, m18306xi = 48)
    public static final class Creator implements Parcelable.Creator<User> {
        @Override // android.os.Parcelable.Creator
        public final User createFromParcel(Parcel parcel) {
            Intrinsics.m18599g(parcel, "parcel");
            return new User(parcel.readLong(), parcel.readLong(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt() != 0, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final User[] newArray(int i) {
            return new User[i];
        }
    }

    public User(long j, long j2, int i, int i2, @NotNull String chainName, @NotNull String nickName, @NotNull String email, @NotNull String phone, @NotNull String code, @NotNull String country, @NotNull String address, @NotNull String remark, @NotNull String invitationCode, @NotNull String invitationUrl, @NotNull String phishingCode, @NotNull String proxyRoot, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, boolean z2, @NotNull String token) {
        Intrinsics.m18599g(chainName, "chainName");
        Intrinsics.m18599g(nickName, "nickName");
        Intrinsics.m18599g(email, "email");
        Intrinsics.m18599g(phone, "phone");
        Intrinsics.m18599g(code, "code");
        Intrinsics.m18599g(country, "country");
        Intrinsics.m18599g(address, "address");
        Intrinsics.m18599g(remark, "remark");
        Intrinsics.m18599g(invitationCode, "invitationCode");
        Intrinsics.m18599g(invitationUrl, "invitationUrl");
        Intrinsics.m18599g(phishingCode, "phishingCode");
        Intrinsics.m18599g(proxyRoot, "proxyRoot");
        Intrinsics.m18599g(token, "token");
        this.uid = j;
        this.id = j2;
        this.chainId = i;
        this.originId = i2;
        this.chainName = chainName;
        this.nickName = nickName;
        this.email = email;
        this.phone = phone;
        this.code = code;
        this.country = country;
        this.address = address;
        this.remark = remark;
        this.invitationCode = invitationCode;
        this.invitationUrl = invitationUrl;
        this.phishingCode = phishingCode;
        this.proxyRoot = proxyRoot;
        this.emailBindState = i3;
        this.phoneBindState = i4;
        this.googleAuthBindState = i5;
        this.emailAuthState = i6;
        this.phoneAuthState = i7;
        this.googleAuthCodeState = i8;
        this.walletAuthState = i9;
        this.updateAt = i10;
        this.createAt = i11;
        this.verifyStatus = i12;
        this.isExpired = z2;
        this.token = token;
    }

    public static /* synthetic */ User copy$default(User user, long j, long j2, int i, int i2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, boolean z2, String str13, int i13, Object obj) {
        String str14;
        boolean z3;
        long j3 = (i13 & 1) != 0 ? user.uid : j;
        long j4 = (i13 & 2) != 0 ? user.id : j2;
        int i14 = (i13 & 4) != 0 ? user.chainId : i;
        int i15 = (i13 & 8) != 0 ? user.originId : i2;
        String str15 = (i13 & 16) != 0 ? user.chainName : str;
        String str16 = (i13 & 32) != 0 ? user.nickName : str2;
        String str17 = (i13 & 64) != 0 ? user.email : str3;
        String str18 = (i13 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0 ? user.phone : str4;
        String str19 = (i13 & 256) != 0 ? user.code : str5;
        String str20 = (i13 & 512) != 0 ? user.country : str6;
        String str21 = (i13 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 ? user.address : str7;
        String str22 = (i13 & 2048) != 0 ? user.remark : str8;
        long j5 = j3;
        String str23 = (i13 & 4096) != 0 ? user.invitationCode : str9;
        String str24 = (i13 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? user.invitationUrl : str10;
        String str25 = str23;
        String str26 = (i13 & 16384) != 0 ? user.phishingCode : str11;
        String str27 = (i13 & 32768) != 0 ? user.proxyRoot : str12;
        int i16 = (i13 & 65536) != 0 ? user.emailBindState : i3;
        int i17 = (i13 & 131072) != 0 ? user.phoneBindState : i4;
        int i18 = (i13 & 262144) != 0 ? user.googleAuthBindState : i5;
        int i19 = (i13 & 524288) != 0 ? user.emailAuthState : i6;
        int i20 = (i13 & 1048576) != 0 ? user.phoneAuthState : i7;
        int i21 = (i13 & 2097152) != 0 ? user.googleAuthCodeState : i8;
        int i22 = (i13 & 4194304) != 0 ? user.walletAuthState : i9;
        int i23 = (i13 & 8388608) != 0 ? user.updateAt : i10;
        int i24 = (i13 & 16777216) != 0 ? user.createAt : i11;
        int i25 = (i13 & 33554432) != 0 ? user.verifyStatus : i12;
        boolean z4 = (i13 & 67108864) != 0 ? user.isExpired : z2;
        if ((i13 & 134217728) != 0) {
            z3 = z4;
            str14 = user.token;
        } else {
            str14 = str13;
            z3 = z4;
        }
        return user.copy(j5, j4, i14, i15, str15, str16, str17, str18, str19, str20, str21, str22, str25, str24, str26, str27, i16, i17, i18, i19, i20, i21, i22, i23, i24, i25, z3, str14);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getUid() {
        return this.uid;
    }

    @NotNull
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getCountry() {
        return this.country;
    }

    @NotNull
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getAddress() {
        return this.address;
    }

    @NotNull
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getRemark() {
        return this.remark;
    }

    @NotNull
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getInvitationCode() {
        return this.invitationCode;
    }

    @NotNull
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getInvitationUrl() {
        return this.invitationUrl;
    }

    @NotNull
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getPhishingCode() {
        return this.phishingCode;
    }

    @NotNull
    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getProxyRoot() {
        return this.proxyRoot;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final int getEmailBindState() {
        return this.emailBindState;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final int getPhoneBindState() {
        return this.phoneBindState;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final int getGoogleAuthBindState() {
        return this.googleAuthBindState;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final int getEmailAuthState() {
        return this.emailAuthState;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final int getPhoneAuthState() {
        return this.phoneAuthState;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final int getGoogleAuthCodeState() {
        return this.googleAuthCodeState;
    }

    /* JADX INFO: renamed from: component23, reason: from getter */
    public final int getWalletAuthState() {
        return this.walletAuthState;
    }

    /* JADX INFO: renamed from: component24, reason: from getter */
    public final int getUpdateAt() {
        return this.updateAt;
    }

    /* JADX INFO: renamed from: component25, reason: from getter */
    public final int getCreateAt() {
        return this.createAt;
    }

    /* JADX INFO: renamed from: component26, reason: from getter */
    public final int getVerifyStatus() {
        return this.verifyStatus;
    }

    /* JADX INFO: renamed from: component27, reason: from getter */
    public final boolean getIsExpired() {
        return this.isExpired;
    }

    @NotNull
    /* JADX INFO: renamed from: component28, reason: from getter */
    public final String getToken() {
        return this.token;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getChainId() {
        return this.chainId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getOriginId() {
        return this.originId;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getChainName() {
        return this.chainName;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getNickName() {
        return this.nickName;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    @NotNull
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getPhone() {
        return this.phone;
    }

    @NotNull
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    @NotNull
    public final User copy(long uid, long id, int chainId, int originId, @NotNull String chainName, @NotNull String nickName, @NotNull String email, @NotNull String phone, @NotNull String code, @NotNull String country, @NotNull String address, @NotNull String remark, @NotNull String invitationCode, @NotNull String invitationUrl, @NotNull String phishingCode, @NotNull String proxyRoot, int emailBindState, int phoneBindState, int googleAuthBindState, int emailAuthState, int phoneAuthState, int googleAuthCodeState, int walletAuthState, int updateAt, int createAt, int verifyStatus, boolean isExpired, @NotNull String token) {
        Intrinsics.m18599g(chainName, "chainName");
        Intrinsics.m18599g(nickName, "nickName");
        Intrinsics.m18599g(email, "email");
        Intrinsics.m18599g(phone, "phone");
        Intrinsics.m18599g(code, "code");
        Intrinsics.m18599g(country, "country");
        Intrinsics.m18599g(address, "address");
        Intrinsics.m18599g(remark, "remark");
        Intrinsics.m18599g(invitationCode, "invitationCode");
        Intrinsics.m18599g(invitationUrl, "invitationUrl");
        Intrinsics.m18599g(phishingCode, "phishingCode");
        Intrinsics.m18599g(proxyRoot, "proxyRoot");
        Intrinsics.m18599g(token, "token");
        return new User(uid, id, chainId, originId, chainName, nickName, email, phone, code, country, address, remark, invitationCode, invitationUrl, phishingCode, proxyRoot, emailBindState, phoneBindState, googleAuthBindState, emailAuthState, phoneAuthState, googleAuthCodeState, walletAuthState, updateAt, createAt, verifyStatus, isExpired, token);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof User)) {
            return false;
        }
        User user = (User) other;
        return this.uid == user.uid && this.id == user.id && this.chainId == user.chainId && this.originId == user.originId && Intrinsics.m18594b(this.chainName, user.chainName) && Intrinsics.m18594b(this.nickName, user.nickName) && Intrinsics.m18594b(this.email, user.email) && Intrinsics.m18594b(this.phone, user.phone) && Intrinsics.m18594b(this.code, user.code) && Intrinsics.m18594b(this.country, user.country) && Intrinsics.m18594b(this.address, user.address) && Intrinsics.m18594b(this.remark, user.remark) && Intrinsics.m18594b(this.invitationCode, user.invitationCode) && Intrinsics.m18594b(this.invitationUrl, user.invitationUrl) && Intrinsics.m18594b(this.phishingCode, user.phishingCode) && Intrinsics.m18594b(this.proxyRoot, user.proxyRoot) && this.emailBindState == user.emailBindState && this.phoneBindState == user.phoneBindState && this.googleAuthBindState == user.googleAuthBindState && this.emailAuthState == user.emailAuthState && this.phoneAuthState == user.phoneAuthState && this.googleAuthCodeState == user.googleAuthCodeState && this.walletAuthState == user.walletAuthState && this.updateAt == user.updateAt && this.createAt == user.createAt && this.verifyStatus == user.verifyStatus && this.isExpired == user.isExpired && Intrinsics.m18594b(this.token, user.token);
    }

    @NotNull
    public final String getAccount() {
        String str = this.email;
        if (str.length() <= 0) {
            str = null;
        }
        return str == null ? this.phone : str;
    }

    @NotNull
    public final String getAddress() {
        return this.address;
    }

    public final int getChainId() {
        return this.chainId;
    }

    @NotNull
    public final String getChainName() {
        return this.chainName;
    }

    @NotNull
    public final String getCode() {
        return this.code;
    }

    @NotNull
    public final String getCountry() {
        return this.country;
    }

    public final int getCreateAt() {
        return this.createAt;
    }

    @NotNull
    public final String getEmail() {
        return this.email;
    }

    public final int getEmailAuthState() {
        return this.emailAuthState;
    }

    public final int getEmailBindState() {
        return this.emailBindState;
    }

    public final int getGoogleAuthBindState() {
        return this.googleAuthBindState;
    }

    public final int getGoogleAuthCodeState() {
        return this.googleAuthCodeState;
    }

    public final long getId() {
        return this.id;
    }

    @NotNull
    public final String getInvitationCode() {
        return this.invitationCode;
    }

    @NotNull
    public final String getInvitationUrl() {
        return this.invitationUrl;
    }

    @NotNull
    public final String getNickName() {
        return this.nickName;
    }

    public final int getOriginId() {
        return this.originId;
    }

    @NotNull
    public final String getPhishingCode() {
        return this.phishingCode;
    }

    @NotNull
    public final String getPhone() {
        return this.phone;
    }

    public final int getPhoneAuthState() {
        return this.phoneAuthState;
    }

    public final int getPhoneBindState() {
        return this.phoneBindState;
    }

    @NotNull
    public final String getProxyRoot() {
        return this.proxyRoot;
    }

    @NotNull
    public final String getRemark() {
        return this.remark;
    }

    @NotNull
    public final String getToken() {
        return this.token;
    }

    public final long getUid() {
        return this.uid;
    }

    public final int getUpdateAt() {
        return this.updateAt;
    }

    public final int getVerifyStatus() {
        return this.verifyStatus;
    }

    @NotNull
    public final String getVerifyStatusExt() {
        int i = this.verifyStatus;
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? "" : StringExtKt.m14217f("identity_verify_text_status_verification_failure") : StringExtKt.m14217f("identity_verify_text_status_verifying") : StringExtKt.m14217f("identity_verify_text_status_verified") : StringExtKt.m14217f("identity_verify_text_status_not_verified");
    }

    public final int getVerifyStatusIconExt() {
        int i = this.verifyStatus;
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? R.drawable.ic_verify_normal : R.drawable.ic_verify_failure : R.drawable.ic_verifying : R.drawable.ic_verified : R.drawable.ic_verify_normal;
    }

    public final int getWalletAuthState() {
        return this.walletAuthState;
    }

    public int hashCode() {
        return this.token.hashCode() + AbstractC0455a.m2230e(AbstractC0455a.m2228c(this.verifyStatus, AbstractC0455a.m2228c(this.createAt, AbstractC0455a.m2228c(this.updateAt, AbstractC0455a.m2228c(this.walletAuthState, AbstractC0455a.m2228c(this.googleAuthCodeState, AbstractC0455a.m2228c(this.phoneAuthState, AbstractC0455a.m2228c(this.emailAuthState, AbstractC0455a.m2228c(this.googleAuthBindState, AbstractC0455a.m2228c(this.phoneBindState, AbstractC0455a.m2228c(this.emailBindState, AbstractC0000a.m5b(AbstractC0000a.m5b(AbstractC0000a.m5b(AbstractC0000a.m5b(AbstractC0000a.m5b(AbstractC0000a.m5b(AbstractC0000a.m5b(AbstractC0000a.m5b(AbstractC0000a.m5b(AbstractC0000a.m5b(AbstractC0000a.m5b(AbstractC0000a.m5b(AbstractC0455a.m2228c(this.originId, AbstractC0455a.m2228c(this.chainId, AbstractC0455a.m2231f(this.id, Long.hashCode(this.uid) * 31, 31), 31), 31), 31, this.chainName), 31, this.nickName), 31, this.email), 31, this.phone), 31, this.code), 31, this.country), 31, this.address), 31, this.remark), 31, this.invitationCode), 31, this.invitationUrl), 31, this.phishingCode), 31, this.proxyRoot), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31, this.isExpired);
    }

    public final boolean isExpired() {
        return this.isExpired;
    }

    public final void setExpired(boolean z2) {
        this.isExpired = z2;
    }

    public final void setToken(@NotNull String str) {
        Intrinsics.m18599g(str, "<set-?>");
        this.token = str;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("User(uid=");
        sb.append(this.uid);
        sb.append(", id=");
        sb.append(this.id);
        sb.append(", chainId=");
        sb.append(this.chainId);
        sb.append(", originId=");
        sb.append(this.originId);
        sb.append(", chainName=");
        sb.append(this.chainName);
        sb.append(", nickName=");
        sb.append(this.nickName);
        sb.append(", email=");
        sb.append(this.email);
        sb.append(", phone=");
        sb.append(this.phone);
        sb.append(", code=");
        sb.append(this.code);
        sb.append(", country=");
        sb.append(this.country);
        sb.append(", address=");
        sb.append(this.address);
        sb.append(", remark=");
        sb.append(this.remark);
        sb.append(", invitationCode=");
        sb.append(this.invitationCode);
        sb.append(", invitationUrl=");
        sb.append(this.invitationUrl);
        sb.append(", phishingCode=");
        sb.append(this.phishingCode);
        sb.append(", proxyRoot=");
        sb.append(this.proxyRoot);
        sb.append(", emailBindState=");
        sb.append(this.emailBindState);
        sb.append(", phoneBindState=");
        sb.append(this.phoneBindState);
        sb.append(", googleAuthBindState=");
        sb.append(this.googleAuthBindState);
        sb.append(", emailAuthState=");
        sb.append(this.emailAuthState);
        sb.append(", phoneAuthState=");
        sb.append(this.phoneAuthState);
        sb.append(", googleAuthCodeState=");
        sb.append(this.googleAuthCodeState);
        sb.append(", walletAuthState=");
        sb.append(this.walletAuthState);
        sb.append(", updateAt=");
        sb.append(this.updateAt);
        sb.append(", createAt=");
        sb.append(this.createAt);
        sb.append(", verifyStatus=");
        sb.append(this.verifyStatus);
        sb.append(", isExpired=");
        sb.append(this.isExpired);
        sb.append(", token=");
        return AbstractC0455a.m2241p(sb, this.token, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.m18599g(dest, "dest");
        dest.writeLong(this.uid);
        dest.writeLong(this.id);
        dest.writeInt(this.chainId);
        dest.writeInt(this.originId);
        dest.writeString(this.chainName);
        dest.writeString(this.nickName);
        dest.writeString(this.email);
        dest.writeString(this.phone);
        dest.writeString(this.code);
        dest.writeString(this.country);
        dest.writeString(this.address);
        dest.writeString(this.remark);
        dest.writeString(this.invitationCode);
        dest.writeString(this.invitationUrl);
        dest.writeString(this.phishingCode);
        dest.writeString(this.proxyRoot);
        dest.writeInt(this.emailBindState);
        dest.writeInt(this.phoneBindState);
        dest.writeInt(this.googleAuthBindState);
        dest.writeInt(this.emailAuthState);
        dest.writeInt(this.phoneAuthState);
        dest.writeInt(this.googleAuthCodeState);
        dest.writeInt(this.walletAuthState);
        dest.writeInt(this.updateAt);
        dest.writeInt(this.createAt);
        dest.writeInt(this.verifyStatus);
        dest.writeInt(this.isExpired ? 1 : 0);
        dest.writeString(this.token);
    }

    public /* synthetic */ User(long j, long j2, int i, int i2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, boolean z2, String str13, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, i, i2, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, (i13 & 67108864) != 0 ? false : z2, str13);
    }
}
