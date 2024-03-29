/**
 * generated by Xtext 2.10.0
 */
package org.xtext.example.mydsl.myDsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.mydsl.myDsl.Footer;
import org.xtext.example.mydsl.myDsl.Header;
import org.xtext.example.mydsl.myDsl.Mensamodel;
import org.xtext.example.mydsl.myDsl.Menu;
import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.Sidebar;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mensamodel</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.MensamodelImpl#getHeader <em>Header</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.MensamodelImpl#getSidebar <em>Sidebar</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.MensamodelImpl#getFooter <em>Footer</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.MensamodelImpl#getMenus <em>Menus</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MensamodelImpl extends MinimalEObjectImpl.Container implements Mensamodel
{
  /**
   * The cached value of the '{@link #getHeader() <em>Header</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHeader()
   * @generated
   * @ordered
   */
  protected Header header;

  /**
   * The cached value of the '{@link #getSidebar() <em>Sidebar</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSidebar()
   * @generated
   * @ordered
   */
  protected EList<Sidebar> sidebar;

  /**
   * The cached value of the '{@link #getFooter() <em>Footer</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFooter()
   * @generated
   * @ordered
   */
  protected EList<Footer> footer;

  /**
   * The cached value of the '{@link #getMenus() <em>Menus</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMenus()
   * @generated
   * @ordered
   */
  protected EList<Menu> menus;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MensamodelImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return MyDslPackage.Literals.MENSAMODEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Header getHeader()
  {
    return header;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetHeader(Header newHeader, NotificationChain msgs)
  {
    Header oldHeader = header;
    header = newHeader;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.MENSAMODEL__HEADER, oldHeader, newHeader);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHeader(Header newHeader)
  {
    if (newHeader != header)
    {
      NotificationChain msgs = null;
      if (header != null)
        msgs = ((InternalEObject)header).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.MENSAMODEL__HEADER, null, msgs);
      if (newHeader != null)
        msgs = ((InternalEObject)newHeader).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.MENSAMODEL__HEADER, null, msgs);
      msgs = basicSetHeader(newHeader, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.MENSAMODEL__HEADER, newHeader, newHeader));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Sidebar> getSidebar()
  {
    if (sidebar == null)
    {
      sidebar = new EObjectContainmentEList<Sidebar>(Sidebar.class, this, MyDslPackage.MENSAMODEL__SIDEBAR);
    }
    return sidebar;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Footer> getFooter()
  {
    if (footer == null)
    {
      footer = new EObjectContainmentEList<Footer>(Footer.class, this, MyDslPackage.MENSAMODEL__FOOTER);
    }
    return footer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Menu> getMenus()
  {
    if (menus == null)
    {
      menus = new EObjectContainmentEList<Menu>(Menu.class, this, MyDslPackage.MENSAMODEL__MENUS);
    }
    return menus;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case MyDslPackage.MENSAMODEL__HEADER:
        return basicSetHeader(null, msgs);
      case MyDslPackage.MENSAMODEL__SIDEBAR:
        return ((InternalEList<?>)getSidebar()).basicRemove(otherEnd, msgs);
      case MyDslPackage.MENSAMODEL__FOOTER:
        return ((InternalEList<?>)getFooter()).basicRemove(otherEnd, msgs);
      case MyDslPackage.MENSAMODEL__MENUS:
        return ((InternalEList<?>)getMenus()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case MyDslPackage.MENSAMODEL__HEADER:
        return getHeader();
      case MyDslPackage.MENSAMODEL__SIDEBAR:
        return getSidebar();
      case MyDslPackage.MENSAMODEL__FOOTER:
        return getFooter();
      case MyDslPackage.MENSAMODEL__MENUS:
        return getMenus();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MyDslPackage.MENSAMODEL__HEADER:
        setHeader((Header)newValue);
        return;
      case MyDslPackage.MENSAMODEL__SIDEBAR:
        getSidebar().clear();
        getSidebar().addAll((Collection<? extends Sidebar>)newValue);
        return;
      case MyDslPackage.MENSAMODEL__FOOTER:
        getFooter().clear();
        getFooter().addAll((Collection<? extends Footer>)newValue);
        return;
      case MyDslPackage.MENSAMODEL__MENUS:
        getMenus().clear();
        getMenus().addAll((Collection<? extends Menu>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case MyDslPackage.MENSAMODEL__HEADER:
        setHeader((Header)null);
        return;
      case MyDslPackage.MENSAMODEL__SIDEBAR:
        getSidebar().clear();
        return;
      case MyDslPackage.MENSAMODEL__FOOTER:
        getFooter().clear();
        return;
      case MyDslPackage.MENSAMODEL__MENUS:
        getMenus().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case MyDslPackage.MENSAMODEL__HEADER:
        return header != null;
      case MyDslPackage.MENSAMODEL__SIDEBAR:
        return sidebar != null && !sidebar.isEmpty();
      case MyDslPackage.MENSAMODEL__FOOTER:
        return footer != null && !footer.isEmpty();
      case MyDslPackage.MENSAMODEL__MENUS:
        return menus != null && !menus.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //MensamodelImpl
