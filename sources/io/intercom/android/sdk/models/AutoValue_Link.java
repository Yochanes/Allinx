package io.intercom.android.sdk.models;

import io.intercom.android.sdk.blocks.lib.models.Block;
import java.util.List;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
final class AutoValue_Link extends Link {
    private final List<Block> blocks;
    private final Card card;
    private final long createdAt;

    /* JADX INFO: renamed from: id */
    private final String f44357id;
    private final ReactionReply reactionReply;
    private final long updatedAt;

    public AutoValue_Link(String str, Card card, List<Block> list, ReactionReply reactionReply, long j, long j2) {
        if (str == null) {
            throw new NullPointerException("Null id");
        }
        this.f44357id = str;
        if (card == null) {
            throw new NullPointerException("Null card");
        }
        this.card = card;
        if (list == null) {
            throw new NullPointerException("Null blocks");
        }
        this.blocks = list;
        if (reactionReply == null) {
            throw new NullPointerException("Null reactionReply");
        }
        this.reactionReply = reactionReply;
        this.createdAt = j;
        this.updatedAt = j2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Link) {
            Link link = (Link) obj;
            if (this.f44357id.equals(link.getId()) && this.card.equals(link.getCard()) && this.blocks.equals(link.getBlocks()) && this.reactionReply.equals(link.getReactionReply()) && this.createdAt == link.getCreatedAt() && this.updatedAt == link.getUpdatedAt()) {
                return true;
            }
        }
        return false;
    }

    @Override // io.intercom.android.sdk.models.Link
    public List<Block> getBlocks() {
        return this.blocks;
    }

    @Override // io.intercom.android.sdk.models.Link
    public Card getCard() {
        return this.card;
    }

    @Override // io.intercom.android.sdk.models.Link
    public long getCreatedAt() {
        return this.createdAt;
    }

    @Override // io.intercom.android.sdk.models.Link
    public String getId() {
        return this.f44357id;
    }

    @Override // io.intercom.android.sdk.models.Link
    public ReactionReply getReactionReply() {
        return this.reactionReply;
    }

    @Override // io.intercom.android.sdk.models.Link
    public long getUpdatedAt() {
        return this.updatedAt;
    }

    public int hashCode() {
        int iHashCode = (((((((this.f44357id.hashCode() ^ 1000003) * 1000003) ^ this.card.hashCode()) * 1000003) ^ this.blocks.hashCode()) * 1000003) ^ this.reactionReply.hashCode()) * 1000003;
        long j = this.createdAt;
        long j2 = this.updatedAt;
        return ((iHashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Link{id=");
        sb.append(this.f44357id);
        sb.append(", card=");
        sb.append(this.card);
        sb.append(", blocks=");
        sb.append(this.blocks);
        sb.append(", reactionReply=");
        sb.append(this.reactionReply);
        sb.append(", createdAt=");
        sb.append(this.createdAt);
        sb.append(", updatedAt=");
        return AbstractC0000a.m12i(this.updatedAt, "}", sb);
    }
}
