package ru.mirea.webPetShop.myPets.ServiceElements;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Cart implements List<CartElement> {

    private List<CartElement> cartElementList;

    public Cart(List<CartElement> cartElementList) {
        this.cartElementList = cartElementList;

    }

    /**
     * Return count elements in cart.
     * If this cart contains
     * more than {@code Integer.MAX_VALUE} elements, returns
     * {@code Integer.MAX_VALUE}.
     *
     * @return the number of elements in this cart
     */
    @Override
    public int size() {
        return cartElementList.size();
    }

    /**
     * Returns {@code true} if this cart contains no elements.
     *
     * @return {@code true} if this cart contains no elements
     */
    @Override
    public boolean isEmpty() {
        return cartElementList.isEmpty();
    }

    /**
     * Returns {@code true} if this cart contains the specified element.
     * More formally, returns {@code true} if and only if this cart contains
     * at least one element {@code e} such that
     * {@code Objects.equals(o, e)}.
     *
     * @param o element whose presence in this cart is to be tested
     * @return {@code true} if this cart contains the specified element
     * @throws ClassCastException   if the type of the specified element
     *                              is incompatible with this cart
     *                              (<a href="Collection.html#optional-restrictions">optional</a>)
     * @throws NullPointerException if the specified element is null and this
     *                              cart does not permit null elements
     *                              (<a href="Collection.html#optional-restrictions">optional</a>)
     */
    @Override
    public boolean contains(Object o) {
        return cartElementList.contains(o);
    }

    /**
     * Returns an iterator over the elements in this cart in proper sequence.
     *
     * @return an iterator over the elements in this cart in proper sequence
     */
    @Override
    public Iterator<CartElement> iterator() {
        return cartElementList.iterator();
    }

    /**
     * Returns an array containing all of the elements in this cart in proper
     * sequence (from first to last element).
     *
     * <p>The returned array will be "safe" in that no references to it are
     * maintained by this cart.  (In other words, this method must
     * allocate a new array even if this cart is backed by an array).
     * The caller is thus free to modify the returned array.
     *
     * <p>This method acts as bridge between array-based and collection-based
     * APIs.
     *
     * @return an array containing all of the elements in this cart in proper
     * sequence
     */
    @Override
    public Object[] toArray() {
        return cartElementList.toArray();
    }

    /**
     * Returns an array containing all of the elements in this cart in
     * proper sequence (from first to last element); the runtime type of
     * the returned array is that of the specified array.  If the cart fits
     * in the specified array, it is returned therein.  Otherwise, a new
     * array is allocated with the runtime type of the specified array and
     * the size of this cart.
     *
     * <p>If the cart fits in the specified array with room to spare (i.e.,
     * the array has more elements than the cart), the element in the array
     * immediately following the end of the cart is set to {@code null}.
     * (This is useful in determining the length of the cart <i>only</i> if
     * the caller knows that the cart does not contain any null elements.)
     *
     * <p>Like the {@link #toArray()} method, this method acts as bridge between
     * array-based and collection-based APIs.  Further, this method allows
     * precise control over the runtime type of the output array, and may,
     * under certain circumstances, be used to save allocation costs.
     *
     * <p>Suppose {@code x} is a cart known to contain only strings.
     * The following code can be used to dump the cart into a newly
     * allocated array of {@code String}:
     *
     * <pre>{@code
     *     String[] y = x.toArray(new String[0]);
     * }</pre>
     * <p>
     * Note that {@code toArray(new Object[0])} is identical in function to
     * {@code toArray()}.
     *
     * @param a the array into which the elements of this cart are to
     *          be stored, if it is big enough; otherwise, a new array of the
     *          same runtime type is allocated for this purpose.
     * @return an array containing the elements of this cart
     * @throws ArrayStoreException  if the runtime type of the specified array
     *                              is not a supertype of the runtime type of every element in
     *                              this cart
     * @throws NullPointerException if the specified array is null
     */
    @Override
    public <T> T[] toArray(T[] a) {
        return cartElementList.toArray(a);
    }

    /**
     * Appends the specified element to the end of this cart (optional
     * operation).
     *
     * <p>Lists that support this operation may place limitations on what
     * elements may be added to this cart.  In particular, some
     * carts will refuse to add null elements, and others will impose
     * restrictions on the type of elements that may be added.  List
     * classes should clearly specify in their documentation any restrictions
     * on what elements may be added.
     *
     * @param cartElement element to be appended to this cart
     * @return {@code true} (as specified by {@link Collection#add})
     * @throws UnsupportedOperationException if the {@code add} operation
     *                                       is not supported by this cart
     * @throws ClassCastException            if the class of the specified element
     *                                       prevents it from being added to this cart
     * @throws NullPointerException          if the specified element is null and this
     *                                       cart does not permit null elements
     * @throws IllegalArgumentException      if some property of this element
     *                                       prevents it from being added to this cart
     */
    @Override
    public boolean add(CartElement cartElement) {
        return cartElementList.add(cartElement);
    }

    /**
     * Removes the first occurrence of the specified element from this cart,
     * if it is present (optional operation).  If this cart does not contain
     * the element, it is unchanged.  More formally, removes the element with
     * the lowest index {@code i} such that
     * {@code Objects.equals(o, get(i))}
     * (if such an element exists).  Returns {@code true} if this cart
     * contained the specified element (or equivalently, if this cart changed
     * as a result of the call).
     *
     * @param o element to be removed from this cart, if present
     * @return {@code true} if this cart contained the specified element
     * @throws ClassCastException            if the type of the specified element
     *                                       is incompatible with this cart
     *                                       (<a href="Collection.html#optional-restrictions">optional</a>)
     * @throws NullPointerException          if the specified element is null and this
     *                                       cart does not permit null elements
     *                                       (<a href="Collection.html#optional-restrictions">optional</a>)
     * @throws UnsupportedOperationException if the {@code remove} operation
     *                                       is not supported by this cart
     */
    @Override
    public boolean remove(Object o) {
        return cartElementList.remove(o);
    }

    /**
     * Returns {@code true} if this cart contains all of the elements of the
     * specified collection.
     *
     * @param c collection to be checked for containment in this cart
     * @return {@code true} if this cart contains all of the elements of the
     * specified collection
     * @throws ClassCastException   if the types of one or more elements
     *                              in the specified collection are incompatible with this
     *                              cart
     *                              (<a href="Collection.html#optional-restrictions">optional</a>)
     * @throws NullPointerException if the specified collection contains one
     *                              or more null elements and this cart does not permit null
     *                              elements
     *                              (<a href="Collection.html#optional-restrictions">optional</a>),
     *                              or if the specified collection is null
     * @see #contains(Object)
     */
    @Override
    public boolean containsAll(Collection<?> c) {
        return cartElementList.containsAll(c);
    }

    /**
     * Appends all of the elements in the specified collection to the end of
     * this cart, in the order that they are returned by the specified
     * collection's iterator (optional operation).  The behavior of this
     * operation is undefined if the specified collection is modified while
     * the operation is in progress.  (Note that this will occur if the
     * specified collection is this cart, and it's nonempty.)
     *
     * @param c collection containing elements to be added to this cart
     * @return {@code true} if this cart changed as a result of the call
     * @throws UnsupportedOperationException if the {@code addAll} operation
     *                                       is not supported by this cart
     * @throws ClassCastException            if the class of an element of the specified
     *                                       collection prevents it from being added to this cart
     * @throws NullPointerException          if the specified collection contains one
     *                                       or more null elements and this cart does not permit null
     *                                       elements, or if the specified collection is null
     * @throws IllegalArgumentException      if some property of an element of the
     *                                       specified collection prevents it from being added to this cart
     * @see #add(Object)
     */
    @Override
    public boolean addAll(Collection<? extends CartElement> c) {
        return cartElementList.addAll(c);
    }

    /**
     * Inserts all of the elements in the specified collection into this
     * cart at the specified position (optional operation).  Shifts the
     * element currently at that position (if any) and any subsequent
     * elements to the right (increases their indices).  The new elements
     * will appear in this cart in the order that they are returned by the
     * specified collection's iterator.  The behavior of this operation is
     * undefined if the specified collection is modified while the
     * operation is in progress.  (Note that this will occur if the specified
     * collection is this cart, and it's nonempty.)
     *
     * @param index index at which to insert the first element from the
     *              specified collection
     * @param c     collection containing elements to be added to this cart
     * @return {@code true} if this cart changed as a result of the call
     * @throws UnsupportedOperationException if the {@code addAll} operation
     *                                       is not supported by this cart
     * @throws ClassCastException            if the class of an element of the specified
     *                                       collection prevents it from being added to this cart
     * @throws NullPointerException          if the specified collection contains one
     *                                       or more null elements and this cart does not permit null
     *                                       elements, or if the specified collection is null
     * @throws IllegalArgumentException      if some property of an element of the
     *                                       specified collection prevents it from being added to this cart
     * @throws IndexOutOfBoundsException     if the index is out of range
     *                                       ({@code index < 0 || index > size()})
     */
    @Override
    public boolean addAll(int index, Collection<? extends CartElement> c) {
        return cartElementList.addAll(index, c);
    }

    /**
     * Removes from this cart all of its elements that are contained in the
     * specified collection (optional operation).
     *
     * @param c collection containing elements to be removed from this cart
     * @return {@code true} if this cart changed as a result of the call
     * @throws UnsupportedOperationException if the {@code removeAll} operation
     *                                       is not supported by this cart
     * @throws ClassCastException            if the class of an element of this cart
     *                                       is incompatible with the specified collection
     *                                       (<a href="Collection.html#optional-restrictions">optional</a>)
     * @throws NullPointerException          if this cart contains a null element and the
     *                                       specified collection does not permit null elements
     *                                       (<a href="Collection.html#optional-restrictions">optional</a>),
     *                                       or if the specified collection is null
     * @see #remove(Object)
     * @see #contains(Object)
     */
    @Override
    public boolean removeAll(Collection<?> c) {
        return cartElementList.removeAll(c);
    }

    /**
     * Retains only the elements in this cart that are contained in the
     * specified collection (optional operation).  In other words, removes
     * from this cart all of its elements that are not contained in the
     * specified collection.
     *
     * @param c collection containing elements to be retained in this cart
     * @return {@code true} if this cart changed as a result of the call
     * @throws UnsupportedOperationException if the {@code retainAll} operation
     *                                       is not supported by this cart
     * @throws ClassCastException            if the class of an element of this cart
     *                                       is incompatible with the specified collection
     *                                       (<a href="Collection.html#optional-restrictions">optional</a>)
     * @throws NullPointerException          if this cart contains a null element and the
     *                                       specified collection does not permit null elements
     *                                       (<a href="Collection.html#optional-restrictions">optional</a>),
     *                                       or if the specified collection is null
     * @see #remove(Object)
     * @see #contains(Object)
     */
    @Override
    public boolean retainAll(Collection<?> c) {
        return cartElementList.retainAll(c);
    }

    /**
     * Removes all of the elements from this cart (optional operation).
     * The cart will be empty after this call returns.
     *
     * @throws UnsupportedOperationException if the {@code clear} operation
     *                                       is not supported by this cart
     */
    @Override
    public void clear() {
        cartElementList.clear();
    }

    /**
     * Returns the element at the specified position in this cart.
     *
     * @param index index of the element to return
     * @return the element at the specified position in this cart
     * @throws IndexOutOfBoundsException if the index is out of range
     *                                   ({@code index < 0 || index >= size()})
     */
    @Override
    public CartElement get(int index) {
        return cartElementList.get(index);
    }

    /**
     * Replaces the element at the specified position in this cart with the
     * specified element (optional operation).
     *
     * @param index   index of the element to replace
     * @param element element to be stored at the specified position
     * @return the element previously at the specified position
     * @throws UnsupportedOperationException if the {@code set} operation
     *                                       is not supported by this cart
     * @throws ClassCastException            if the class of the specified element
     *                                       prevents it from being added to this cart
     * @throws NullPointerException          if the specified element is null and
     *                                       this cart does not permit null elements
     * @throws IllegalArgumentException      if some property of the specified
     *                                       element prevents it from being added to this cart
     * @throws IndexOutOfBoundsException     if the index is out of range
     *                                       ({@code index < 0 || index >= size()})
     */
    @Override
    public CartElement set(int index, CartElement element) {
        return cartElementList.set(index, element);
    }

    /**
     * Inserts the specified element at the specified position in this cart
     * (optional operation).  Shifts the element currently at that position
     * (if any) and any subsequent elements to the right (adds one to their
     * indices).
     *
     * @param index   index at which the specified element is to be inserted
     * @param element element to be inserted
     * @throws UnsupportedOperationException if the {@code add} operation
     *                                       is not supported by this cart
     * @throws ClassCastException            if the class of the specified element
     *                                       prevents it from being added to this cart
     * @throws NullPointerException          if the specified element is null and
     *                                       this cart does not permit null elements
     * @throws IllegalArgumentException      if some property of the specified
     *                                       element prevents it from being added to this cart
     * @throws IndexOutOfBoundsException     if the index is out of range
     *                                       ({@code index < 0 || index > size()})
     */
    @Override
    public void add(int index, CartElement element) {
        cartElementList.add(index, element);
    }

    /**
     * Removes the element at the specified position in this cart (optional
     * operation).  Shifts any subsequent elements to the left (subtracts one
     * from their indices).  Returns the element that was removed from the
     * cart.
     *
     * @param index the index of the element to be removed
     * @return the element previously at the specified position
     * @throws UnsupportedOperationException if the {@code remove} operation
     *                                       is not supported by this cart
     * @throws IndexOutOfBoundsException     if the index is out of range
     *                                       ({@code index < 0 || index >= size()})
     */
    @Override
    public CartElement remove(int index) {
        return cartElementList.remove(index);
    }

    /**
     * Returns the index of the first occurrence of the specified element
     * in this cart, or -1 if this cart does not contain the element.
     * More formally, returns the lowest index {@code i} such that
     * {@code Objects.equals(o, get(i))},
     * or -1 if there is no such index.
     *
     * @param o element to search for
     * @return the index of the first occurrence of the specified element in
     * this cart, or -1 if this cart does not contain the element
     * @throws ClassCastException   if the type of the specified element
     *                              is incompatible with this cart
     *                              (<a href="Collection.html#optional-restrictions">optional</a>)
     * @throws NullPointerException if the specified element is null and this
     *                              cart does not permit null elements
     *                              (<a href="Collection.html#optional-restrictions">optional</a>)
     */
    @Override
    public int indexOf(Object o) {
        return cartElementList.indexOf(o);
    }

    /**
     * Returns the index of the last occurrence of the specified element
     * in this cart, or -1 if this cart does not contain the element.
     * More formally, returns the highest index {@code i} such that
     * {@code Objects.equals(o, get(i))},
     * or -1 if there is no such index.
     *
     * @param o element to search for
     * @return the index of the last occurrence of the specified element in
     * this cart, or -1 if this cart does not contain the element
     * @throws ClassCastException   if the type of the specified element
     *                              is incompatible with this cart
     *                              (<a href="Collection.html#optional-restrictions">optional</a>)
     * @throws NullPointerException if the specified element is null and this
     *                              cart does not permit null elements
     *                              (<a href="Collection.html#optional-restrictions">optional</a>)
     */
    @Override
    public int lastIndexOf(Object o) {
        return cartElementList.lastIndexOf(o);
    }

    /**
     * Returns a cart iterator over the elements in this cart (in proper
     * sequence).
     *
     * @return a cart iterator over the elements in this cart (in proper
     * sequence)
     */
    @Override
    public ListIterator<CartElement> listIterator() {
        return cartElementList.listIterator();
    }

    /**
     * Returns a cart iterator over the elements in this cart (in proper
     * sequence), starting at the specified position in the cart.
     * The specified index indicates the first element that would be
     * returned by an initial call to {@link ListIterator#next next}.
     * An initial call to {@link ListIterator#previous previous} would
     * return the element with the specified index minus one.
     *
     * @param index index of the first element to be returned from the
     *              cart iterator (by a call to {@link ListIterator#next next})
     * @return a cart iterator over the elements in this cart (in proper
     * sequence), starting at the specified position in the cart
     * @throws IndexOutOfBoundsException if the index is out of range
     *                                   ({@code index < 0 || index > size()})
     */
    @Override
    public ListIterator<CartElement> listIterator(int index) {
        return cartElementList.listIterator(index);
    }

    /**
     * Returns a view of the portion of this cart between the specified
     * {@code fromIndex}, inclusive, and {@code toIndex}, exclusive.  (If
     * {@code fromIndex} and {@code toIndex} are equal, the returned cart is
     * empty.)  The returned cart is backed by this cart, so non-structural
     * changes in the returned cart are reflected in this cart, and vice-versa.
     * The returned cart supports all of the optional cart operations supported
     * by this cart.<p>
     * <p>
     * This method eliminates the need for explicit range operations (of
     * the sort that commonly exist for arrays).  Any operation that expects
     * a cart can be used as a range operation by passing a subList view
     * instead of a whole cart.  For example, the following idiom
     * removes a range of elements from a cart:
     * <pre>{@code
     *      cart.subList(from, to).clear();
     * }</pre>
     * Similar idioms may be constructed for {@code indexOf} and
     * {@code lastIndexOf}, and all of the algorithms in the
     * {@code Collections} class can be applied to a subList.<p>
     * <p>
     * The semantics of the cart returned by this method become undefined if
     * the backing cart (i.e., this cart) is <i>structurally modified</i> in
     * any way other than via the returned cart.  (Structural modifications are
     * those that change the size of this cart, or otherwise perturb it in such
     * a fashion that iterations in progress may yield incorrect results.)
     *
     * @param fromIndex low endpoint (inclusive) of the subList
     * @param toIndex   high endpoint (exclusive) of the subList
     * @return a view of the specified range within this cart
     * @throws IndexOutOfBoundsException for an illegal endpoint index value
     *                                   ({@code fromIndex < 0 || toIndex > size ||
     *                                   fromIndex > toIndex})
     */
    @Override
    public List<CartElement> subList(int fromIndex, int toIndex) {
        return cartElementList.subList(fromIndex, toIndex);
    }
}
