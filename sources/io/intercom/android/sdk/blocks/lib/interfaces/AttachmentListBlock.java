package io.intercom.android.sdk.blocks.lib.interfaces;

import android.view.View;
import android.view.ViewGroup;
import io.intercom.android.sdk.blocks.lib.models.BlockAttachment;
import io.intercom.android.sdk.blocks.lib.models.BlockMetadata;
import java.util.List;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public interface AttachmentListBlock {
    View addAttachmentList(List<BlockAttachment> list, BlockMetadata blockMetadata, ViewGroup viewGroup);
}
