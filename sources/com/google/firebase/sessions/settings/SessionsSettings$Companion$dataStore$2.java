package com.google.firebase.sessions.settings;

import android.util.Log;
import androidx.datastore.core.CorruptionException;
import androidx.datastore.preferences.core.MutablePreferences;
import androidx.datastore.preferences.core.Preferences;
import com.google.firebase.sessions.ProcessDetailsProvider;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m18301d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m18302d2 = {"<anonymous>", "Landroidx/datastore/preferences/core/Preferences;", "ex", "Landroidx/datastore/core/CorruptionException;", "invoke"}, m18303k = 3, m18304mv = {1, 8, 0}, m18306xi = 48)
public final class SessionsSettings$Companion$dataStore$2 extends Lambda implements Function1<CorruptionException, Preferences> {
    public static final SessionsSettings$Companion$dataStore$2 INSTANCE = new SessionsSettings$Companion$dataStore$2();

    public SessionsSettings$Companion$dataStore$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke((CorruptionException) obj);
    }

    @NotNull
    public final Preferences invoke(@NotNull CorruptionException ex) {
        Intrinsics.m18599g(ex, "ex");
        Log.w("SessionsSettings", "CorruptionException in settings DataStore in " + ProcessDetailsProvider.INSTANCE.getProcessName$com_google_firebase_firebase_sessions() + '.', ex);
        return new MutablePreferences(true);
    }
}
