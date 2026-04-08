package com.exchange.allin.data;

import androidx.compose.animation.AbstractC0455a;
import androidx.compose.runtime.internal.StabilityInferred;
import com.exchange.allin.utils.ext.StringExtKt;
import com.google.gson.annotations.SerializedName;
import com.mvi.base.IgnoredOnProguard;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0007HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u000bHÆ\u0003JO\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010+\u001a\u00020,HÖ\u0001J\t\u0010-\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0018\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u001c\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u000fR\u0011\u0010\u001e\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u000f¨\u0006."}, m18302d2 = {"Lcom/exchange/allin/data/TransferRecord;", "", "tokenName", "", "from", "to", "amount", "", "status", "transferId", "createAt", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;J)V", "getTokenName", "()Ljava/lang/String;", "getFrom", "getTo", "getAmount", "()D", "getStatus", "getTransferId", "getCreateAt", "()J", "billFlow", "Lcom/exchange/allin/data/BillFlow;", "getBillFlow", "()Lcom/exchange/allin/data/BillFlow;", "fromExt", "getFromExt", "toExt", "getToExt", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
@IgnoredOnProguard
public final /* data */ class TransferRecord {
    public static final int $stable = 0;
    private final double amount;

    @SerializedName("create_at")
    private final long createAt;

    @NotNull
    private final String from;

    @NotNull
    private final String status;

    @NotNull
    private final String to;

    @SerializedName("token_name")
    @NotNull
    private final String tokenName;

    @SerializedName("transfer_id")
    @NotNull
    private final String transferId;

    public TransferRecord(@NotNull String tokenName, @NotNull String from, @NotNull String to, double d, @NotNull String status, @NotNull String transferId, long j) {
        Intrinsics.m18599g(tokenName, "tokenName");
        Intrinsics.m18599g(from, "from");
        Intrinsics.m18599g(to, "to");
        Intrinsics.m18599g(status, "status");
        Intrinsics.m18599g(transferId, "transferId");
        this.tokenName = tokenName;
        this.from = from;
        this.to = to;
        this.amount = d;
        this.status = status;
        this.transferId = transferId;
        this.createAt = j;
    }

    public static /* synthetic */ TransferRecord copy$default(TransferRecord transferRecord, String str, String str2, String str3, double d, String str4, String str5, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = transferRecord.tokenName;
        }
        if ((i & 2) != 0) {
            str2 = transferRecord.from;
        }
        if ((i & 4) != 0) {
            str3 = transferRecord.to;
        }
        if ((i & 8) != 0) {
            d = transferRecord.amount;
        }
        if ((i & 16) != 0) {
            str4 = transferRecord.status;
        }
        if ((i & 32) != 0) {
            str5 = transferRecord.transferId;
        }
        if ((i & 64) != 0) {
            j = transferRecord.createAt;
        }
        double d2 = d;
        String str6 = str3;
        return transferRecord.copy(str, str2, str6, d2, str4, str5, j);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTokenName() {
        return this.tokenName;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getFrom() {
        return this.from;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTo() {
        return this.to;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final double getAmount() {
        return this.amount;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getTransferId() {
        return this.transferId;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final long getCreateAt() {
        return this.createAt;
    }

    @NotNull
    public final TransferRecord copy(@NotNull String tokenName, @NotNull String from, @NotNull String to, double amount, @NotNull String status, @NotNull String transferId, long createAt) {
        Intrinsics.m18599g(tokenName, "tokenName");
        Intrinsics.m18599g(from, "from");
        Intrinsics.m18599g(to, "to");
        Intrinsics.m18599g(status, "status");
        Intrinsics.m18599g(transferId, "transferId");
        return new TransferRecord(tokenName, from, to, amount, status, transferId, createAt);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TransferRecord)) {
            return false;
        }
        TransferRecord transferRecord = (TransferRecord) other;
        return Intrinsics.m18594b(this.tokenName, transferRecord.tokenName) && Intrinsics.m18594b(this.from, transferRecord.from) && Intrinsics.m18594b(this.to, transferRecord.to) && Double.compare(this.amount, transferRecord.amount) == 0 && Intrinsics.m18594b(this.status, transferRecord.status) && Intrinsics.m18594b(this.transferId, transferRecord.transferId) && this.createAt == transferRecord.createAt;
    }

    public final double getAmount() {
        return this.amount;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00c7  */
    @NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final BillFlow getBillFlow() {
        String strM14217f;
        String strM14217f2;
        String str = this.transferId;
        String str2 = this.tokenName;
        String strM14213b = StringExtKt.m14213b(6, 1, this.amount);
        String str3 = this.from;
        switch (str3.hashCode()) {
            case -576816931:
                strM14217f = !str3.equals("FUTURES ACCOUNT") ? this.from : StringExtKt.m14217f("asset_bill_text_futures_account");
                break;
            case -269254417:
                if (str3.equals("SPOT ACCOUNT")) {
                    strM14217f = StringExtKt.m14217f("asset_bill_text_spot_account");
                    break;
                }
                break;
            case -54837084:
                if (str3.equals("GUESS ACCOUNT")) {
                    strM14217f = StringExtKt.m14217f("asset_bill_text_guess_account");
                    break;
                }
                break;
            case 412313195:
                if (str3.equals("OPTIONS ACCOUNT")) {
                    strM14217f = StringExtKt.m14217f("asset_bill_text_flash_options_account");
                    break;
                }
                break;
            case 722850762:
                if (str3.equals("FUNDING ACCOUNT")) {
                    strM14217f = StringExtKt.m14217f("asset_bill_text_funding_account");
                    break;
                }
                break;
            case 1174455060:
                if (str3.equals("MINI FUTURES ACCOUNT")) {
                    strM14217f = StringExtKt.m14217f("asset_bill_text_mini_futures_account");
                    break;
                }
                break;
        }
        String str4 = this.to;
        switch (str4.hashCode()) {
            case -576816931:
                strM14217f2 = !str4.equals("FUTURES ACCOUNT") ? this.to : StringExtKt.m14217f("asset_bill_text_futures_account");
                break;
            case -269254417:
                if (str4.equals("SPOT ACCOUNT")) {
                    strM14217f2 = StringExtKt.m14217f("asset_bill_text_spot_account");
                    break;
                }
                break;
            case -54837084:
                if (str4.equals("GUESS ACCOUNT")) {
                    strM14217f2 = StringExtKt.m14217f("asset_bill_text_guess_account");
                    break;
                }
                break;
            case 412313195:
                if (str4.equals("OPTIONS ACCOUNT")) {
                    strM14217f2 = StringExtKt.m14217f("asset_bill_text_flash_options_account");
                    break;
                }
                break;
            case 722850762:
                if (str4.equals("FUNDING ACCOUNT")) {
                    strM14217f2 = StringExtKt.m14217f("asset_bill_text_funding_account");
                    break;
                }
                break;
            case 1174455060:
                if (str4.equals("MINI FUTURES ACCOUNT")) {
                    strM14217f2 = StringExtKt.m14217f("asset_bill_text_mini_futures_account");
                    break;
                }
                break;
        }
        return new BillFlow(str, str, 5, str2, strM14213b, StringExtKt.m14218g("asset_bill_business_text_transfer", strM14217f, strM14217f2), null, null, null, this.createAt, 448, null);
    }

    public final long getCreateAt() {
        return this.createAt;
    }

    @NotNull
    public final String getFrom() {
        return this.from;
    }

    @NotNull
    public final String getFromExt() {
        return this.from;
    }

    @NotNull
    public final String getStatus() {
        return this.status;
    }

    @NotNull
    public final String getTo() {
        return this.to;
    }

    @NotNull
    public final String getToExt() {
        return this.to;
    }

    @NotNull
    public final String getTokenName() {
        return this.tokenName;
    }

    @NotNull
    public final String getTransferId() {
        return this.transferId;
    }

    public int hashCode() {
        return Long.hashCode(this.createAt) + AbstractC0000a.m5b(AbstractC0000a.m5b(AbstractC0455a.m2227b(AbstractC0000a.m5b(AbstractC0000a.m5b(this.tokenName.hashCode() * 31, 31, this.from), 31, this.to), 31, this.amount), 31, this.status), 31, this.transferId);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("TransferRecord(tokenName=");
        sb.append(this.tokenName);
        sb.append(", from=");
        sb.append(this.from);
        sb.append(", to=");
        sb.append(this.to);
        sb.append(", amount=");
        sb.append(this.amount);
        sb.append(", status=");
        sb.append(this.status);
        sb.append(", transferId=");
        sb.append(this.transferId);
        sb.append(", createAt=");
        return AbstractC0455a.m2240o(sb, this.createAt, ')');
    }
}
