package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
final class AutoValue_CrashlyticsReport_Session_Event_Log extends CrashlyticsReport.Session.Event.Log {
    private final String content;

    /* JADX INFO: compiled from: Proguard */
    public static final class Builder extends CrashlyticsReport.Session.Event.Log.Builder {
        private String content;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Log.Builder
        public CrashlyticsReport.Session.Event.Log build() {
            String str = this.content;
            if (str != null) {
                return new AutoValue_CrashlyticsReport_Session_Event_Log(str, null);
            }
            throw new IllegalStateException("Missing required properties: content");
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Log.Builder
        public CrashlyticsReport.Session.Event.Log.Builder setContent(String str) {
            if (str == null) {
                throw new NullPointerException("Null content");
            }
            this.content = str;
            return this;
        }
    }

    public /* synthetic */ AutoValue_CrashlyticsReport_Session_Event_Log(String str, C46921 c46921) {
        this(str);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CrashlyticsReport.Session.Event.Log) {
            return this.content.equals(((CrashlyticsReport.Session.Event.Log) obj).getContent());
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Log
    @NonNull
    public String getContent() {
        return this.content;
    }

    public int hashCode() {
        return this.content.hashCode() ^ 1000003;
    }

    public String toString() {
        return AbstractC0000a.m19p(new StringBuilder("Log{content="), this.content, "}");
    }

    private AutoValue_CrashlyticsReport_Session_Event_Log(String str) {
        this.content = str;
    }
}
