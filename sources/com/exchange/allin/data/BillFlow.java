package com.exchange.allin.data;

import androidx.compose.animation.AbstractC0455a;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.mvi.base.IgnoredOnProguard;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0006HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u000eHÆ\u0003Jm\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u000eHÆ\u0001J\u0013\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020\u0006HÖ\u0001J\t\u0010-\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0012R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0012R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u0006."}, m18302d2 = {"Lcom/exchange/allin/data/BillFlow;", "", "businessId", "", "eventId", "detailType", "", "coinName", "amount", "business", "note", "to", "frm", "time", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V", "getBusinessId", "()Ljava/lang/String;", "getEventId", "getDetailType", "()I", "getCoinName", "getAmount", "getBusiness", "getNote", "getTo", "getFrm", "getTime", "()J", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "", "other", "hashCode", "toString", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
@IgnoredOnProguard
public final /* data */ class BillFlow {
    public static final int $stable = 0;

    @NotNull
    private final String amount;

    @NotNull
    private final String business;

    @NotNull
    private final String businessId;

    @NotNull
    private final String coinName;
    private final int detailType;

    @NotNull
    private final String eventId;

    @NotNull
    private final String frm;

    @NotNull
    private final String note;
    private final long time;

    @NotNull
    private final String to;

    public BillFlow(@NotNull String businessId, @NotNull String eventId, int i, @NotNull String coinName, @NotNull String amount, @NotNull String business, @NotNull String note, @NotNull String to, @NotNull String frm, long j) {
        Intrinsics.m18599g(businessId, "businessId");
        Intrinsics.m18599g(eventId, "eventId");
        Intrinsics.m18599g(coinName, "coinName");
        Intrinsics.m18599g(amount, "amount");
        Intrinsics.m18599g(business, "business");
        Intrinsics.m18599g(note, "note");
        Intrinsics.m18599g(to, "to");
        Intrinsics.m18599g(frm, "frm");
        this.businessId = businessId;
        this.eventId = eventId;
        this.detailType = i;
        this.coinName = coinName;
        this.amount = amount;
        this.business = business;
        this.note = note;
        this.to = to;
        this.frm = frm;
        this.time = j;
    }

    public static /* synthetic */ BillFlow copy$default(BillFlow billFlow, String str, String str2, int i, String str3, String str4, String str5, String str6, String str7, String str8, long j, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = billFlow.businessId;
        }
        if ((i2 & 2) != 0) {
            str2 = billFlow.eventId;
        }
        if ((i2 & 4) != 0) {
            i = billFlow.detailType;
        }
        if ((i2 & 8) != 0) {
            str3 = billFlow.coinName;
        }
        if ((i2 & 16) != 0) {
            str4 = billFlow.amount;
        }
        if ((i2 & 32) != 0) {
            str5 = billFlow.business;
        }
        if ((i2 & 64) != 0) {
            str6 = billFlow.note;
        }
        if ((i2 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0) {
            str7 = billFlow.to;
        }
        if ((i2 & 256) != 0) {
            str8 = billFlow.frm;
        }
        if ((i2 & 512) != 0) {
            j = billFlow.time;
        }
        long j2 = j;
        String str9 = str7;
        String str10 = str8;
        String str11 = str5;
        String str12 = str6;
        String str13 = str4;
        int i3 = i;
        return billFlow.copy(str, str2, i3, str3, str13, str11, str12, str9, str10, j2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getBusinessId() {
        return this.businessId;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final long getTime() {
        return this.time;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getEventId() {
        return this.eventId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getDetailType() {
        return this.detailType;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCoinName() {
        return this.coinName;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getAmount() {
        return this.amount;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getBusiness() {
        return this.business;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getNote() {
        return this.note;
    }

    @NotNull
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getTo() {
        return this.to;
    }

    @NotNull
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getFrm() {
        return this.frm;
    }

    @NotNull
    public final BillFlow copy(@NotNull String businessId, @NotNull String eventId, int detailType, @NotNull String coinName, @NotNull String amount, @NotNull String business, @NotNull String note, @NotNull String to, @NotNull String frm, long time) {
        Intrinsics.m18599g(businessId, "businessId");
        Intrinsics.m18599g(eventId, "eventId");
        Intrinsics.m18599g(coinName, "coinName");
        Intrinsics.m18599g(amount, "amount");
        Intrinsics.m18599g(business, "business");
        Intrinsics.m18599g(note, "note");
        Intrinsics.m18599g(to, "to");
        Intrinsics.m18599g(frm, "frm");
        return new BillFlow(businessId, eventId, detailType, coinName, amount, business, note, to, frm, time);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BillFlow)) {
            return false;
        }
        BillFlow billFlow = (BillFlow) other;
        return Intrinsics.m18594b(this.businessId, billFlow.businessId) && Intrinsics.m18594b(this.eventId, billFlow.eventId) && this.detailType == billFlow.detailType && Intrinsics.m18594b(this.coinName, billFlow.coinName) && Intrinsics.m18594b(this.amount, billFlow.amount) && Intrinsics.m18594b(this.business, billFlow.business) && Intrinsics.m18594b(this.note, billFlow.note) && Intrinsics.m18594b(this.to, billFlow.to) && Intrinsics.m18594b(this.frm, billFlow.frm) && this.time == billFlow.time;
    }

    @NotNull
    public final String getAmount() {
        return this.amount;
    }

    @NotNull
    public final String getBusiness() {
        return this.business;
    }

    @NotNull
    public final String getBusinessId() {
        return this.businessId;
    }

    @NotNull
    public final String getCoinName() {
        return this.coinName;
    }

    public final int getDetailType() {
        return this.detailType;
    }

    @NotNull
    public final String getEventId() {
        return this.eventId;
    }

    @NotNull
    public final String getFrm() {
        return this.frm;
    }

    @NotNull
    public final String getNote() {
        return this.note;
    }

    public final long getTime() {
        return this.time;
    }

    @NotNull
    public final String getTo() {
        return this.to;
    }

    public int hashCode() {
        return Long.hashCode(this.time) + AbstractC0000a.m5b(AbstractC0000a.m5b(AbstractC0000a.m5b(AbstractC0000a.m5b(AbstractC0000a.m5b(AbstractC0000a.m5b(AbstractC0455a.m2228c(this.detailType, AbstractC0000a.m5b(this.businessId.hashCode() * 31, 31, this.eventId), 31), 31, this.coinName), 31, this.amount), 31, this.business), 31, this.note), 31, this.to), 31, this.frm);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("BillFlow(businessId=");
        sb.append(this.businessId);
        sb.append(", eventId=");
        sb.append(this.eventId);
        sb.append(", detailType=");
        sb.append(this.detailType);
        sb.append(", coinName=");
        sb.append(this.coinName);
        sb.append(", amount=");
        sb.append(this.amount);
        sb.append(", business=");
        sb.append(this.business);
        sb.append(", note=");
        sb.append(this.note);
        sb.append(", to=");
        sb.append(this.to);
        sb.append(", frm=");
        sb.append(this.frm);
        sb.append(", time=");
        return AbstractC0455a.m2240o(sb, this.time, ')');
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public /* synthetic */ BillFlow(java.lang.String r15, java.lang.String r16, int r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, long r24, int r26, kotlin.jvm.internal.DefaultConstructorMarker r27) {
        /*
            r14 = this;
            r0 = r26
            r1 = r0 & 4
            if (r1 == 0) goto L9
            r1 = 0
            r5 = r1
            goto Lb
        L9:
            r5 = r17
        Lb:
            r1 = r0 & 64
            java.lang.String r2 = ""
            if (r1 == 0) goto L13
            r9 = r2
            goto L15
        L13:
            r9 = r21
        L15:
            r1 = r0 & 128(0x80, float:1.8E-43)
            if (r1 == 0) goto L1b
            r10 = r2
            goto L1d
        L1b:
            r10 = r22
        L1d:
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L2f
            r11 = r2
            r3 = r15
            r4 = r16
            r6 = r18
            r7 = r19
            r8 = r20
            r12 = r24
            r2 = r14
            goto L3d
        L2f:
            r11 = r23
            r2 = r14
            r3 = r15
            r4 = r16
            r6 = r18
            r7 = r19
            r8 = r20
            r12 = r24
        L3d:
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.exchange.allin.data.BillFlow.<init>(java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, long, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
