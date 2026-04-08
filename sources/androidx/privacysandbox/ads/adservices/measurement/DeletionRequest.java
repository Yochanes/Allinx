package androidx.privacysandbox.ads.adservices.measurement;

import androidx.annotation.RequiresApi;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Collection;
import java.util.HashSet;
import kotlin.Metadata;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, m18302d2 = {"Landroidx/privacysandbox/ads/adservices/measurement/DeletionRequest;", "", "Builder", "Companion", "ads-adservices_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
public final class DeletionRequest {

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/privacysandbox/ads/adservices/measurement/DeletionRequest$Builder;", "", "ads-adservices_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    public static final class Builder {
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0002\b\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004¨\u0006\n"}, m18302d2 = {"Landroidx/privacysandbox/ads/adservices/measurement/DeletionRequest$Companion;", "", "", "DELETION_MODE_ALL", "I", "DELETION_MODE_EXCLUDE_INTERNAL_DATA", "MATCH_BEHAVIOR_DELETE", "MATCH_BEHAVIOR_PRESERVE", "DeletionMode", "MatchBehavior", "ads-adservices_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    public static final class Companion {

        /* JADX INFO: compiled from: Proguard */
        @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, m18302d2 = {"Landroidx/privacysandbox/ads/adservices/measurement/DeletionRequest$Companion$DeletionMode;", "", "ads-adservices_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
        @Retention(RetentionPolicy.SOURCE)
        @kotlin.annotation.Retention
        public @interface DeletionMode {
        }

        /* JADX INFO: compiled from: Proguard */
        @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, m18302d2 = {"Landroidx/privacysandbox/ads/adservices/measurement/DeletionRequest$Companion$MatchBehavior;", "", "ads-adservices_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
        @Retention(RetentionPolicy.SOURCE)
        @kotlin.annotation.Retention
        public @interface MatchBehavior {
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeletionRequest)) {
            return false;
        }
        DeletionRequest deletionRequest = (DeletionRequest) obj;
        deletionRequest.getClass();
        HashSet hashSet = new HashSet((Collection) null);
        deletionRequest.getClass();
        if (hashSet.equals(new HashSet((Collection) null))) {
            HashSet hashSet2 = new HashSet((Collection) null);
            deletionRequest.getClass();
            if (hashSet2.equals(new HashSet((Collection) null))) {
                deletionRequest.getClass();
                deletionRequest.getClass();
                deletionRequest.getClass();
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Integer.hashCode(0);
        throw null;
    }

    public final String toString() {
        return AbstractC0000a.m15l("DeletionRequest { DeletionMode=", "DELETION_MODE_ALL", ", MatchBehavior=", "MATCH_BEHAVIOR_DELETE", ", Start=null, End=null, DomainUris=null, OriginUris=null }");
    }
}
