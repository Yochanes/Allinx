package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.ApiOptions;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.UnsupportedApiCallException;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.ArrayUtils;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final class zabq<O extends Api.ApiOptions> implements GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener, zau {
    final /* synthetic */ GoogleApiManager zaa;

    @NotOnlyInitialized
    private final Api.Client zac;
    private final ApiKey<O> zad;
    private final zaad zae;
    private final int zah;

    @Nullable
    private final zact zai;
    private boolean zaj;
    private final Queue<zai> zab = new LinkedList();
    private final Set<zal> zaf = new HashSet();
    private final Map<ListenerHolder.ListenerKey<?>, zaci> zag = new HashMap();
    private final List<zabs> zak = new ArrayList();

    @Nullable
    private ConnectionResult zal = null;
    private int zam = 0;

    @WorkerThread
    public zabq(GoogleApiManager googleApiManager, GoogleApi<O> googleApi) {
        this.zaa = googleApiManager;
        Api.Client clientZab = googleApi.zab(GoogleApiManager.zaf(googleApiManager).getLooper(), this);
        this.zac = clientZab;
        this.zad = googleApi.getApiKey();
        this.zae = new zaad();
        this.zah = googleApi.zaa();
        if (clientZab.requiresSignIn()) {
            this.zai = googleApi.zac(GoogleApiManager.zae(googleApiManager), GoogleApiManager.zaf(googleApiManager));
        } else {
            this.zai = null;
        }
    }

    @Nullable
    @WorkerThread
    private final Feature zaB(@Nullable Feature[] featureArr) {
        if (featureArr != null && featureArr.length != 0) {
            Feature[] availableFeatures = this.zac.getAvailableFeatures();
            if (availableFeatures == null) {
                availableFeatures = new Feature[0];
            }
            ArrayMap arrayMap = new ArrayMap(availableFeatures.length);
            for (Feature feature : availableFeatures) {
                arrayMap.put(feature.getName(), Long.valueOf(feature.getVersion()));
            }
            for (Feature feature2 : featureArr) {
                Long l = (Long) arrayMap.get(feature2.getName());
                if (l == null || l.longValue() < feature2.getVersion()) {
                    return feature2;
                }
            }
        }
        return null;
    }

    @WorkerThread
    private final void zaC(ConnectionResult connectionResult) {
        Iterator<zal> it = this.zaf.iterator();
        while (it.hasNext()) {
            it.next().zac(this.zad, connectionResult, Objects.equal(connectionResult, ConnectionResult.RESULT_SUCCESS) ? this.zac.getEndpointPackageName() : null);
        }
        this.zaf.clear();
    }

    @WorkerThread
    private final void zaD(Status status) {
        Preconditions.checkHandlerThread(GoogleApiManager.zaf(this.zaa));
        zaE(status, null, false);
    }

    @WorkerThread
    private final void zaE(@Nullable Status status, @Nullable Exception exc, boolean z2) {
        Preconditions.checkHandlerThread(GoogleApiManager.zaf(this.zaa));
        if ((status == null) == (exc == null)) {
            throw new IllegalArgumentException("Status XOR exception should be null");
        }
        Iterator<zai> it = this.zab.iterator();
        while (it.hasNext()) {
            zai next = it.next();
            if (!z2 || next.zac == 2) {
                if (status != null) {
                    next.zad(status);
                } else {
                    next.zae(exc);
                }
                it.remove();
            }
        }
    }

    @WorkerThread
    private final void zaF() {
        ArrayList arrayList = new ArrayList(this.zab);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            zai zaiVar = (zai) arrayList.get(i);
            if (!this.zac.isConnected()) {
                return;
            }
            if (zaL(zaiVar)) {
                this.zab.remove(zaiVar);
            }
        }
    }

    @WorkerThread
    private final void zaG() {
        zan();
        zaC(ConnectionResult.RESULT_SUCCESS);
        zaK();
        Iterator<zaci> it = this.zag.values().iterator();
        while (it.hasNext()) {
            zaci next = it.next();
            if (zaB(next.zaa.getRequiredFeatures()) != null) {
                it.remove();
            } else {
                try {
                    next.zaa.registerListener(this.zac, new TaskCompletionSource<>());
                } catch (DeadObjectException unused) {
                    onConnectionSuspended(3);
                    this.zac.disconnect("DeadObjectException thrown while calling register listener method.");
                } catch (RemoteException unused2) {
                    it.remove();
                }
            }
        }
        zaF();
        zaI();
    }

    @WorkerThread
    private final void zaH(int i) {
        zan();
        this.zaj = true;
        this.zae.zae(i, this.zac.getLastDisconnectMessage());
        GoogleApiManager googleApiManager = this.zaa;
        GoogleApiManager.zaf(googleApiManager).sendMessageDelayed(Message.obtain(GoogleApiManager.zaf(googleApiManager), 9, this.zad), GoogleApiManager.zab(this.zaa));
        GoogleApiManager googleApiManager2 = this.zaa;
        GoogleApiManager.zaf(googleApiManager2).sendMessageDelayed(Message.obtain(GoogleApiManager.zaf(googleApiManager2), 11, this.zad), GoogleApiManager.zac(this.zaa));
        GoogleApiManager.zan(this.zaa).zac();
        Iterator<zaci> it = this.zag.values().iterator();
        while (it.hasNext()) {
            it.next().zac.run();
        }
    }

    private final void zaI() {
        GoogleApiManager.zaf(this.zaa).removeMessages(12, this.zad);
        GoogleApiManager googleApiManager = this.zaa;
        GoogleApiManager.zaf(googleApiManager).sendMessageDelayed(GoogleApiManager.zaf(googleApiManager).obtainMessage(12, this.zad), GoogleApiManager.zad(this.zaa));
    }

    @WorkerThread
    private final void zaJ(zai zaiVar) {
        zaiVar.zag(this.zae, zaz());
        try {
            zaiVar.zaf(this);
        } catch (DeadObjectException unused) {
            onConnectionSuspended(1);
            this.zac.disconnect("DeadObjectException thrown while running ApiCallRunner.");
        }
    }

    @WorkerThread
    private final void zaK() {
        if (this.zaj) {
            GoogleApiManager.zaf(this.zaa).removeMessages(11, this.zad);
            GoogleApiManager.zaf(this.zaa).removeMessages(9, this.zad);
            this.zaj = false;
        }
    }

    @WorkerThread
    private final boolean zaL(zai zaiVar) {
        if (!(zaiVar instanceof zac)) {
            zaJ(zaiVar);
            return true;
        }
        zac zacVar = (zac) zaiVar;
        Feature featureZaB = zaB(zacVar.zab(this));
        if (featureZaB == null) {
            zaJ(zaiVar);
            return true;
        }
        String name = this.zac.getClass().getName();
        String name2 = featureZaB.getName();
        long version = featureZaB.getVersion();
        StringBuilder sb = new StringBuilder(name.length() + 77 + String.valueOf(name2).length());
        sb.append(name);
        sb.append(" could not execute call because it requires feature (");
        sb.append(name2);
        sb.append(", ");
        sb.append(version);
        sb.append(").");
        Log.w("GoogleApiManager", sb.toString());
        if (!GoogleApiManager.zaE(this.zaa) || !zacVar.zaa(this)) {
            zacVar.zae(new UnsupportedApiCallException(featureZaB));
            return true;
        }
        zabs zabsVar = new zabs(this.zad, featureZaB, null);
        int iIndexOf = this.zak.indexOf(zabsVar);
        if (iIndexOf >= 0) {
            zabs zabsVar2 = this.zak.get(iIndexOf);
            GoogleApiManager.zaf(this.zaa).removeMessages(15, zabsVar2);
            GoogleApiManager googleApiManager = this.zaa;
            GoogleApiManager.zaf(googleApiManager).sendMessageDelayed(Message.obtain(GoogleApiManager.zaf(googleApiManager), 15, zabsVar2), GoogleApiManager.zab(this.zaa));
            return false;
        }
        this.zak.add(zabsVar);
        GoogleApiManager googleApiManager2 = this.zaa;
        GoogleApiManager.zaf(googleApiManager2).sendMessageDelayed(Message.obtain(GoogleApiManager.zaf(googleApiManager2), 15, zabsVar), GoogleApiManager.zab(this.zaa));
        GoogleApiManager googleApiManager3 = this.zaa;
        GoogleApiManager.zaf(googleApiManager3).sendMessageDelayed(Message.obtain(GoogleApiManager.zaf(googleApiManager3), 16, zabsVar), GoogleApiManager.zac(this.zaa));
        ConnectionResult connectionResult = new ConnectionResult(2, null);
        if (zaM(connectionResult)) {
            return false;
        }
        this.zaa.zaG(connectionResult, this.zah);
        return false;
    }

    @WorkerThread
    private final boolean zaM(@NonNull ConnectionResult connectionResult) {
        synchronized (GoogleApiManager.zas()) {
            try {
                GoogleApiManager googleApiManager = this.zaa;
                if (GoogleApiManager.zaj(googleApiManager) == null || !GoogleApiManager.zau(googleApiManager).contains(this.zad)) {
                    return false;
                }
                GoogleApiManager.zaj(this.zaa).zah(connectionResult, this.zah);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @WorkerThread
    private final boolean zaN(boolean z2) {
        Preconditions.checkHandlerThread(GoogleApiManager.zaf(this.zaa));
        if (!this.zac.isConnected() || this.zag.size() != 0) {
            return false;
        }
        if (!this.zae.zag()) {
            this.zac.disconnect("Timing out service connection.");
            return true;
        }
        if (z2) {
            zaI();
        }
        return false;
    }

    public static /* bridge */ /* synthetic */ Api.Client zae(zabq zabqVar) {
        return zabqVar.zac;
    }

    public static /* bridge */ /* synthetic */ ApiKey zag(zabq zabqVar) {
        return zabqVar.zad;
    }

    public static /* bridge */ /* synthetic */ void zai(zabq zabqVar, Status status) {
        zabqVar.zaD(status);
    }

    public static /* bridge */ /* synthetic */ void zaj(zabq zabqVar) {
        zabqVar.zaG();
    }

    public static /* bridge */ /* synthetic */ void zak(zabq zabqVar, int i) {
        zabqVar.zaH(i);
    }

    public static /* bridge */ /* synthetic */ void zal(zabq zabqVar, zabs zabsVar) {
        if (zabqVar.zak.contains(zabsVar) && !zabqVar.zaj) {
            if (zabqVar.zac.isConnected()) {
                zabqVar.zaF();
            } else {
                zabqVar.zao();
            }
        }
    }

    public static /* bridge */ /* synthetic */ void zam(zabq zabqVar, zabs zabsVar) {
        Feature[] featureArrZab;
        if (zabqVar.zak.remove(zabsVar)) {
            GoogleApiManager.zaf(zabqVar.zaa).removeMessages(15, zabsVar);
            GoogleApiManager.zaf(zabqVar.zaa).removeMessages(16, zabsVar);
            Feature featureZaa = zabs.zaa(zabsVar);
            ArrayList arrayList = new ArrayList(zabqVar.zab.size());
            for (zai zaiVar : zabqVar.zab) {
                if ((zaiVar instanceof zac) && (featureArrZab = ((zac) zaiVar).zab(zabqVar)) != null && ArrayUtils.contains(featureArrZab, featureZaa)) {
                    arrayList.add(zaiVar);
                }
            }
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                zai zaiVar2 = (zai) arrayList.get(i);
                zabqVar.zab.remove(zaiVar2);
                zaiVar2.zae(new UnsupportedApiCallException(featureZaa));
            }
        }
    }

    public static /* bridge */ /* synthetic */ boolean zax(zabq zabqVar, boolean z2) {
        return zabqVar.zaN(false);
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnected(@Nullable Bundle bundle) {
        if (Looper.myLooper() == GoogleApiManager.zaf(this.zaa).getLooper()) {
            zaG();
        } else {
            GoogleApiManager.zaf(this.zaa).post(new zabm(this));
        }
    }

    @Override // com.google.android.gms.common.api.internal.OnConnectionFailedListener
    @WorkerThread
    public final void onConnectionFailed(@NonNull ConnectionResult connectionResult) {
        zar(connectionResult, null);
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnectionSuspended(int i) {
        if (Looper.myLooper() == GoogleApiManager.zaf(this.zaa).getLooper()) {
            zaH(i);
        } else {
            GoogleApiManager.zaf(this.zaa).post(new zabn(this, i));
        }
    }

    @WorkerThread
    public final boolean zaA() {
        return zaN(true);
    }

    @Override // com.google.android.gms.common.api.internal.zau
    public final void zaa(ConnectionResult connectionResult, Api<?> api, boolean z2) {
        throw null;
    }

    public final int zab() {
        return this.zah;
    }

    @WorkerThread
    public final int zac() {
        return this.zam;
    }

    @Nullable
    @WorkerThread
    public final ConnectionResult zad() {
        Preconditions.checkHandlerThread(GoogleApiManager.zaf(this.zaa));
        return this.zal;
    }

    public final Api.Client zaf() {
        return this.zac;
    }

    public final Map<ListenerHolder.ListenerKey<?>, zaci> zah() {
        return this.zag;
    }

    @WorkerThread
    public final void zan() {
        Preconditions.checkHandlerThread(GoogleApiManager.zaf(this.zaa));
        this.zal = null;
    }

    @WorkerThread
    public final void zao() {
        Preconditions.checkHandlerThread(GoogleApiManager.zaf(this.zaa));
        if (this.zac.isConnected() || this.zac.isConnecting()) {
            return;
        }
        try {
            GoogleApiManager googleApiManager = this.zaa;
            int iZab = GoogleApiManager.zan(googleApiManager).zab(GoogleApiManager.zae(googleApiManager), this.zac);
            if (iZab == 0) {
                GoogleApiManager googleApiManager2 = this.zaa;
                Api.Client client = this.zac;
                zabu zabuVar = new zabu(googleApiManager2, client, this.zad);
                if (client.requiresSignIn()) {
                    ((zact) Preconditions.checkNotNull(this.zai)).zae(zabuVar);
                }
                try {
                    this.zac.connect(zabuVar);
                    return;
                } catch (SecurityException e) {
                    zar(new ConnectionResult(10), e);
                    return;
                }
            }
            ConnectionResult connectionResult = new ConnectionResult(iZab, null);
            String name = this.zac.getClass().getName();
            String string = connectionResult.toString();
            StringBuilder sb = new StringBuilder(name.length() + 35 + string.length());
            sb.append("The service for ");
            sb.append(name);
            sb.append(" is not available: ");
            sb.append(string);
            Log.w("GoogleApiManager", sb.toString());
            zar(connectionResult, null);
        } catch (IllegalStateException e2) {
            zar(new ConnectionResult(10), e2);
        }
    }

    @WorkerThread
    public final void zap(zai zaiVar) {
        Preconditions.checkHandlerThread(GoogleApiManager.zaf(this.zaa));
        if (this.zac.isConnected()) {
            if (zaL(zaiVar)) {
                zaI();
                return;
            } else {
                this.zab.add(zaiVar);
                return;
            }
        }
        this.zab.add(zaiVar);
        ConnectionResult connectionResult = this.zal;
        if (connectionResult == null || !connectionResult.hasResolution()) {
            zao();
        } else {
            zar(this.zal, null);
        }
    }

    @WorkerThread
    public final void zaq() {
        this.zam++;
    }

    @WorkerThread
    public final void zar(@NonNull ConnectionResult connectionResult, @Nullable Exception exc) {
        Preconditions.checkHandlerThread(GoogleApiManager.zaf(this.zaa));
        zact zactVar = this.zai;
        if (zactVar != null) {
            zactVar.zaf();
        }
        zan();
        GoogleApiManager.zan(this.zaa).zac();
        zaC(connectionResult);
        if ((this.zac instanceof com.google.android.gms.common.internal.service.zap) && connectionResult.getErrorCode() != 24) {
            GoogleApiManager.zav(this.zaa, true);
            GoogleApiManager googleApiManager = this.zaa;
            GoogleApiManager.zaf(googleApiManager).sendMessageDelayed(GoogleApiManager.zaf(googleApiManager).obtainMessage(19), 300000L);
        }
        if (connectionResult.getErrorCode() == 4) {
            zaD(GoogleApiManager.zah());
            return;
        }
        if (this.zab.isEmpty()) {
            this.zal = connectionResult;
            return;
        }
        if (exc != null) {
            Preconditions.checkHandlerThread(GoogleApiManager.zaf(this.zaa));
            zaE(null, exc, false);
            return;
        }
        if (!GoogleApiManager.zaE(this.zaa)) {
            zaD(GoogleApiManager.zai(this.zad, connectionResult));
            return;
        }
        zaE(GoogleApiManager.zai(this.zad, connectionResult), null, true);
        if (this.zab.isEmpty() || zaM(connectionResult) || this.zaa.zaG(connectionResult, this.zah)) {
            return;
        }
        if (connectionResult.getErrorCode() == 18) {
            this.zaj = true;
        }
        if (!this.zaj) {
            zaD(GoogleApiManager.zai(this.zad, connectionResult));
        } else {
            GoogleApiManager googleApiManager2 = this.zaa;
            GoogleApiManager.zaf(googleApiManager2).sendMessageDelayed(Message.obtain(GoogleApiManager.zaf(googleApiManager2), 9, this.zad), GoogleApiManager.zab(this.zaa));
        }
    }

    @WorkerThread
    public final void zas(@NonNull ConnectionResult connectionResult) {
        Preconditions.checkHandlerThread(GoogleApiManager.zaf(this.zaa));
        Api.Client client = this.zac;
        String name = client.getClass().getName();
        String strValueOf = String.valueOf(connectionResult);
        StringBuilder sb = new StringBuilder(name.length() + 25 + strValueOf.length());
        sb.append("onSignInFailed for ");
        sb.append(name);
        sb.append(" with ");
        sb.append(strValueOf);
        client.disconnect(sb.toString());
        zar(connectionResult, null);
    }

    @WorkerThread
    public final void zat(zal zalVar) {
        Preconditions.checkHandlerThread(GoogleApiManager.zaf(this.zaa));
        this.zaf.add(zalVar);
    }

    @WorkerThread
    public final void zau() {
        Preconditions.checkHandlerThread(GoogleApiManager.zaf(this.zaa));
        if (this.zaj) {
            zao();
        }
    }

    @WorkerThread
    public final void zav() {
        Preconditions.checkHandlerThread(GoogleApiManager.zaf(this.zaa));
        zaD(GoogleApiManager.zaa);
        this.zae.zaf();
        for (ListenerHolder.ListenerKey listenerKey : (ListenerHolder.ListenerKey[]) this.zag.keySet().toArray(new ListenerHolder.ListenerKey[0])) {
            zap(new zah(listenerKey, new TaskCompletionSource()));
        }
        zaC(new ConnectionResult(4));
        if (this.zac.isConnected()) {
            this.zac.onUserSignOut(new zabp(this));
        }
    }

    @WorkerThread
    public final void zaw() {
        Preconditions.checkHandlerThread(GoogleApiManager.zaf(this.zaa));
        if (this.zaj) {
            zaK();
            GoogleApiManager googleApiManager = this.zaa;
            zaD(GoogleApiManager.zag(googleApiManager).isGooglePlayServicesAvailable(GoogleApiManager.zae(googleApiManager)) == 18 ? new Status(21, "Connection timed out waiting for Google Play services update to complete.") : new Status(22, "API failed to connect while resuming due to an unknown error."));
            this.zac.disconnect("Timing out connection while resuming.");
        }
    }

    public final boolean zay() {
        return this.zac.isConnected();
    }

    public final boolean zaz() {
        return this.zac.requiresSignIn();
    }
}
