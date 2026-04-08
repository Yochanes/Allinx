package com.livechatinc.inappchat;

import android.app.Fragment;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.livechatinc.inappchat.ChatWindowConfiguration;
import java.util.HashMap;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ChatWindowFragment extends Fragment implements ChatWindowEventsListener {

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ int f43317c = 0;

    /* JADX INFO: renamed from: a */
    public ChatWindowConfiguration f43318a;

    /* JADX INFO: renamed from: b */
    public ChatWindowView f43319b;

    @Override // com.livechatinc.inappchat.ChatWindowEventsListener
    /* JADX INFO: renamed from: a */
    public final boolean mo14012a() {
        return false;
    }

    @Override // com.livechatinc.inappchat.ChatWindowEventsListener
    /* JADX INFO: renamed from: i */
    public final void mo14015i(boolean z2) {
        if (z2) {
            return;
        }
        getActivity().onBackPressed();
    }

    @Override // com.livechatinc.inappchat.ChatWindowEventsListener
    /* JADX INFO: renamed from: j */
    public final void mo14016j(Intent intent) {
        startActivityForResult(intent, 21354);
    }

    @Override // android.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        this.f43319b.mo15402a(i, i2, intent);
    }

    @Override // android.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ChatWindowConfiguration.Builder builder = new ChatWindowConfiguration.Builder();
        HashMap map = new HashMap();
        if (getArguments() != null) {
            for (String str : getArguments().keySet()) {
                if ("KEY_LICENCE_NUMBER".equals(str)) {
                    builder.f43308a = getArguments().getString("KEY_LICENCE_NUMBER");
                } else if ("KEY_GROUP_ID".equals(str)) {
                    builder.f43309b = getArguments().getString("KEY_GROUP_ID");
                } else if ("KEY_VISITOR_NAME".equals(str)) {
                    builder.f43310c = getArguments().getString("KEY_VISITOR_NAME");
                } else if ("KEY_VISITOR_EMAIL".equals(str)) {
                    builder.f43311d = getArguments().getString("KEY_VISITOR_EMAIL");
                } else {
                    map.put(str, String.valueOf(getArguments().get(str)));
                }
            }
            builder.f43312e = map;
        }
        if (TextUtils.isEmpty(builder.f43308a)) {
            throw new IllegalStateException("Licence Number cannot be null");
        }
        this.f43318a = new ChatWindowConfiguration(builder.f43308a, builder.f43309b, builder.f43310c, builder.f43311d, builder.f43312e);
    }

    @Override // android.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ChatWindowView chatWindowView = (ChatWindowView) layoutInflater.inflate(com.exchange.allin.R.layout.view_chat_window, viewGroup, false);
        this.f43319b = chatWindowView;
        chatWindowView.mo15404c(this.f43318a);
        this.f43319b.setEventsListener(this);
        this.f43319b.initialize();
        this.f43319b.mo15403b();
        return (View) this.f43319b;
    }

    @Override // com.livechatinc.inappchat.ChatWindowEventsListener
    /* JADX INFO: renamed from: g */
    public final void mo14013g(String[] strArr) {
    }

    @Override // com.livechatinc.inappchat.ChatWindowEventsListener
    /* JADX INFO: renamed from: h */
    public final void mo14014h(Uri uri) {
    }
}
