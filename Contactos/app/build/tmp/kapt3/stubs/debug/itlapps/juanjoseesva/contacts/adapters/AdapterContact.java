package itlapps.juanjoseesva.contacts.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB/\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n0\t\u00a2\u0006\u0002\u0010\u000bJ\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u0018\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0014H\u0016J\u0018\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u0014H\u0016R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001d\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n0\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Litlapps/juanjoseesva/contacts/adapters/AdapterContact;", "Landroid/support/v7/widget/RecyclerView$Adapter;", "Litlapps/juanjoseesva/contacts/adapters/AdapterContact$AdapterContactViewHolder;", "contacts", "", "Litlapps/juanjoseesva/contacts/model/Contact;", "context", "Landroid/content/Context;", "listener", "Lkotlin/Function1;", "", "(Ljava/util/List;Landroid/content/Context;Lkotlin/jvm/functions/Function1;)V", "getContacts", "()Ljava/util/List;", "getContext", "()Landroid/content/Context;", "getListener", "()Lkotlin/jvm/functions/Function1;", "searchList", "getItemCount", "", "onBindViewHolder", "p0", "p1", "onCreateViewHolder", "Landroid/view/ViewGroup;", "AdapterContactViewHolder", "app_debug"})
public final class AdapterContact extends android.support.v7.widget.RecyclerView.Adapter<itlapps.juanjoseesva.contacts.adapters.AdapterContact.AdapterContactViewHolder> {
    private java.util.List<? extends itlapps.juanjoseesva.contacts.model.Contact> searchList;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<itlapps.juanjoseesva.contacts.model.Contact> contacts = null;
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function1<itlapps.juanjoseesva.contacts.model.Contact, kotlin.Unit> listener = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public itlapps.juanjoseesva.contacts.adapters.AdapterContact.AdapterContactViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup p0, int p1) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    itlapps.juanjoseesva.contacts.adapters.AdapterContact.AdapterContactViewHolder p0, int p1) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<itlapps.juanjoseesva.contacts.model.Contact> getContacts() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function1<itlapps.juanjoseesva.contacts.model.Contact, kotlin.Unit> getListener() {
        return null;
    }
    
    public AdapterContact(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends itlapps.juanjoseesva.contacts.model.Contact> contacts, @org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super itlapps.juanjoseesva.contacts.model.Contact, kotlin.Unit> listener) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\"\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\n\u00a8\u0006\u000b"}, d2 = {"Litlapps/juanjoseesva/contacts/adapters/AdapterContact$AdapterContactViewHolder;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "bind", "", "contact", "Litlapps/juanjoseesva/contacts/model/Contact;", "listener", "Lkotlin/Function1;", "app_debug"})
    public static final class AdapterContactViewHolder extends android.support.v7.widget.RecyclerView.ViewHolder {
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        itlapps.juanjoseesva.contacts.model.Contact contact, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super itlapps.juanjoseesva.contacts.model.Contact, kotlin.Unit> listener) {
        }
        
        public AdapterContactViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
    }
}