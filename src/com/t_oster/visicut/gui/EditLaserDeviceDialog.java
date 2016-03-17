/**
 * This file is part of VisiCut.
 * Copyright (C) 2011 - 2013 Thomas Oster <thomas.oster@rwth-aachen.de>
 * RWTH Aachen University - 52062 Aachen, Germany
 *
 *     VisiCut is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU Lesser General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     VisiCut is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU Lesser General Public License for more details.
 *
 *     You should have received a copy of the GNU Lesser General Public License
 *     along with VisiCut.  If not, see <http://www.gnu.org/licenses/>.
 **/
/*
 * EditLaserDeviceDialog.java
 *
 * Created on 06.09.2011, 22:04:06
 */
package com.t_oster.visicut.gui;

import com.t_oster.liblasercut.LaserCutter;
import com.t_oster.uicomponents.BetterJTable;
import com.t_oster.visicut.gui.beans.CustomizableTableModel;
import com.t_oster.visicut.managers.PreferencesManager;
import com.t_oster.visicut.misc.DialogHelper;
import com.t_oster.visicut.misc.Helper;
import com.t_oster.visicut.model.LaserDevice;
import java.util.Arrays;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Thomas Oster <thomas.oster@rwth-aachen.de>
 */
public class EditLaserDeviceDialog extends javax.swing.JDialog
{

  /** Creates new form EditLaserDeviceDialog */
  public EditLaserDeviceDialog(java.awt.Frame parent, boolean modal)
  {
    super(parent, modal);
    initComponents();
    this.driverComboBox.removeAllItems();
    for (String s : PreferencesManager.getInstance().getPreferences().getAvailableLasercutterDrivers())
    {
      driverComboBox.addItem(s);
    }
    this.settingsTable.putClientProperty("terminateEditOnFocusLost", Boolean.TRUE);
  }
  protected LaserDevice laserDevice = null;
  public static final String PROP_LASERDEVICE = "laserDevice";

  /**
   * Get the value of laserDevice
   *
   * @return the value of laserDevice
   */
  public LaserDevice getLaserDevice()
  {
    return laserDevice;
  }

  /**
   * Set the value of laserDevice
   *
   * @param laserDevice new value of laserDevice
   */
  public void setLaserDevice(LaserDevice laserDevice)
  {
    LaserDevice oldLaserDevice = this.laserDevice;
    this.laserDevice = laserDevice;
    firePropertyChange(PROP_LASERDEVICE, oldLaserDevice, laserDevice);
    if (laserDevice != null)
    {
      this.setCurrentLaserDevice(laserDevice.clone());
    }
  }
  protected LaserDevice currentLaserDevice = null;
  public static final String PROP_CURRENTLASERDEVICE = "currentLaserDevice";

  /**
   * Get the value of currentLaserDevice
   *
   * @return the value of currentLaserDevice
   */
  public LaserDevice getCurrentLaserDevice()
  {
    return currentLaserDevice;
  }

  /**
   * Set the value of currentLaserDevice
   *
   * @param currentLaserDevice new value of currentLaserDevice
   */
  public void setCurrentLaserDevice(LaserDevice currentLaserDevice)
  {
    LaserDevice oldCurrentLaserDevice = this.currentLaserDevice;
    this.currentLaserDevice = currentLaserDevice;
    firePropertyChange(PROP_CURRENTLASERDEVICE, oldCurrentLaserDevice, currentLaserDevice);
    this.driverComboBox.setSelectedItem(currentLaserDevice.getLaserCutter().getClass().toString().substring(6));
    this.settingsTable.setModel(new CustomizableTableModel(currentLaserDevice.getLaserCutter()));
  }

  /** This method is called from within the constructor to
   * initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is
   * always regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        selectThumbnailButton1 = new com.t_oster.uicomponents.SelectThumbnailButton();
        jLabel1 = new javax.swing.JLabel();
        jNameField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jDescriptionTextField = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        driverPanel = new javax.swing.JPanel();
        driverLabel = new javax.swing.JLabel();
        driverComboBox = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        settingsTable = new BetterJTable();
        cameraPanel = new javax.swing.JPanel();
        cameraUrlLabel = new javax.swing.JLabel();
        cameraUrlTextField = new javax.swing.JTextField();
        searchCameraButton = new javax.swing.JButton();
        urlUserLabel = new javax.swing.JLabel();
        urlUserTextField = new javax.swing.JTextField();
        urlPasswordLabel = new javax.swing.JLabel();
        urlPasswordField = new javax.swing.JPasswordField();
        projectorUrlLabel = new javax.swing.JLabel();
        projectorUrlTextField = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jSpinner3 = new javax.swing.JSpinner();
        jLabel13 = new javax.swing.JLabel();
        jSpinner4 = new javax.swing.JSpinner();
        jLabel14 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jSpinner5 = new javax.swing.JSpinner();
        jLabel9 = new javax.swing.JLabel();
        jSpinner2 = new javax.swing.JSpinner();
        jLabel10 = new javax.swing.JLabel();
        jobPanel = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        tfJobPrefix = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("com/t_oster/visicut/gui/resources/EditLaserDeviceDialog"); // NOI18N
        setTitle(bundle.getString("TITLE")); // NOI18N
        setName("Form"); // NOI18N

        selectThumbnailButton1.setName("selectThumbnailButton1"); // NOI18N

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${currentLaserDevice.thumbnailPath}"), selectThumbnailButton1, org.jdesktop.beansbinding.BeanProperty.create("thumbnailPath"), "thumbnailbutton");
        bindingGroup.addBinding(binding);

        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(com.t_oster.visicut.gui.VisicutApp.class).getContext().getResourceMap(EditLaserDeviceDialog.class);
        jLabel1.setText(resourceMap.getString("jLabel1.text")); // NOI18N
        jLabel1.setName("jLabel1"); // NOI18N

        jNameField.setName("jNameField"); // NOI18N

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${currentLaserDevice.name}"), jNameField, org.jdesktop.beansbinding.BeanProperty.create("text_ON_ACTION_OR_FOCUS_LOST"), "name");
        bindingGroup.addBinding(binding);

        jLabel2.setText(resourceMap.getString("jLabel2.text")); // NOI18N
        jLabel2.setName("jLabel2"); // NOI18N

        jDescriptionTextField.setName("jDescriptionTextField"); // NOI18N

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${currentLaserDevice.description}"), jDescriptionTextField, org.jdesktop.beansbinding.BeanProperty.create("text_ON_ACTION_OR_FOCUS_LOST"));
        bindingGroup.addBinding(binding);

        jButton1.setText(resourceMap.getString("jButton1.text")); // NOI18N
        jButton1.setName("jButton1"); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText(resourceMap.getString("jButton2.text")); // NOI18N
        jButton2.setName("jButton2"); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTabbedPane1.setName("jTabbedPane1"); // NOI18N

        driverPanel.setName("driverPanel"); // NOI18N

        driverLabel.setText(resourceMap.getString("driverLabel.text")); // NOI18N
        driverLabel.setName("driverLabel"); // NOI18N

        driverComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        driverComboBox.setName("driverComboBox"); // NOI18N

        jScrollPane1.setName("jScrollPane1"); // NOI18N

        settingsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        settingsTable.setName("settingsTable"); // NOI18N
        jScrollPane1.setViewportView(settingsTable);
        if (settingsTable.getColumnModel().getColumnCount() > 0) {
            settingsTable.getColumnModel().getColumn(0).setHeaderValue(resourceMap.getString("settingsTable.columnModel.title0")); // NOI18N
            settingsTable.getColumnModel().getColumn(1).setHeaderValue(resourceMap.getString("settingsTable.columnModel.title1")); // NOI18N
            settingsTable.getColumnModel().getColumn(2).setHeaderValue(resourceMap.getString("settingsTable.columnModel.title2")); // NOI18N
            settingsTable.getColumnModel().getColumn(3).setHeaderValue(resourceMap.getString("settingsTable.columnModel.title3")); // NOI18N
        }

        javax.swing.GroupLayout driverPanelLayout = new javax.swing.GroupLayout(driverPanel);
        driverPanel.setLayout(driverPanelLayout);
        driverPanelLayout.setHorizontalGroup(
            driverPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(driverPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(driverPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(driverPanelLayout.createSequentialGroup()
                        .addComponent(driverLabel)
                        .addGap(61, 61, 61)
                        .addComponent(driverComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 433, Short.MAX_VALUE))
                .addContainerGap())
        );
        driverPanelLayout.setVerticalGroup(
            driverPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(driverPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(driverPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(driverLabel)
                    .addComponent(driverComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                .addGap(14, 14, 14))
        );

        jTabbedPane1.addTab(resourceMap.getString("driverPanel.TabConstraints.tabTitle"), driverPanel); // NOI18N

        cameraPanel.setName("cameraPanel"); // NOI18N

        cameraUrlLabel.setText(resourceMap.getString("cameraUrlLabel.text")); // NOI18N
        cameraUrlLabel.setName("cameraUrlLabel"); // NOI18N

        cameraUrlTextField.setToolTipText(resourceMap.getString("cameraUrlTextField.toolTipText")); // NOI18N
        cameraUrlTextField.setName("cameraUrlTextField"); // NOI18N

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${currentLaserDevice.cameraURL}"), cameraUrlTextField, org.jdesktop.beansbinding.BeanProperty.create("text"), "urls");
        bindingGroup.addBinding(binding);

        searchCameraButton.setText(resourceMap.getString("searchCameraButton.text")); // NOI18N
        searchCameraButton.setName("searchCameraButton"); // NOI18N
        searchCameraButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchCameraButtonActionPerformed(evt);
            }
        });

        urlUserLabel.setText(resourceMap.getString("urlUserLabel.text")); // NOI18N
        urlUserLabel.setToolTipText(resourceMap.getString("urlUserLabel.toolTipText")); // NOI18N
        urlUserLabel.setName("urlUserLabel"); // NOI18N

        urlUserTextField.setToolTipText(resourceMap.getString("urlUserTextField.toolTipText")); // NOI18N
        urlUserTextField.setName("urlUserTextField"); // NOI18N

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${currentLaserDevice.URLUser}"), urlUserTextField, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        urlPasswordLabel.setText(resourceMap.getString("urlPasswordLabel.text")); // NOI18N
        urlPasswordLabel.setToolTipText(resourceMap.getString("urlPasswordLabel.toolTipText")); // NOI18N
        urlPasswordLabel.setName("urlPasswordLabel"); // NOI18N

        urlPasswordField.setToolTipText(resourceMap.getString("urlPasswordField.toolTipText")); // NOI18N
        urlPasswordField.setName("urlPasswordField"); // NOI18N

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${currentLaserDevice.URLPassword}"), urlPasswordField, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        projectorUrlLabel.setText(resourceMap.getString("projectorUrlLabel.text")); // NOI18N
        projectorUrlLabel.setName("projectorUrlLabel"); // NOI18N

        projectorUrlTextField.setToolTipText(resourceMap.getString("projectorUrlTextField.toolTipText")); // NOI18N
        projectorUrlTextField.setName("projectorUrlTextField"); // NOI18N

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${currentLaserDevice.projectorURL}"), projectorUrlTextField, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jLabel12.setText(resourceMap.getString("jLabel12.text")); // NOI18N
        jLabel12.setName("jLabel12"); // NOI18N

        jSpinner3.setModel(new javax.swing.SpinnerNumberModel(1280, 0, 4000, 1));
        jSpinner3.setName("jSpinner3"); // NOI18N

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${currentLaserDevice.projectorWidth}"), jSpinner3, org.jdesktop.beansbinding.BeanProperty.create("value"));
        bindingGroup.addBinding(binding);

        jLabel13.setText(resourceMap.getString("jLabel13.text")); // NOI18N
        jLabel13.setName("jLabel13"); // NOI18N

        jSpinner4.setModel(new javax.swing.SpinnerNumberModel(720, 0, 4000, 1));
        jSpinner4.setName("jSpinner4"); // NOI18N

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${currentLaserDevice.projectorHeight}"), jSpinner4, org.jdesktop.beansbinding.BeanProperty.create("value"));
        bindingGroup.addBinding(binding);

        jLabel14.setText(resourceMap.getString("jLabel14.text")); // NOI18N
        jLabel14.setName("jLabel14"); // NOI18N

        jLabel8.setText(resourceMap.getString("jLabel8.text")); // NOI18N
        jLabel8.setName("jLabel8"); // NOI18N

        jSpinner5.setModel(new javax.swing.SpinnerNumberModel(50, 0, 300000, 1));
        jSpinner5.setName("jSpinner5"); // NOI18N

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${currentLaserDevice.cameraTiming}"), jSpinner5, org.jdesktop.beansbinding.BeanProperty.create("value"));
        bindingGroup.addBinding(binding);

        jLabel9.setText(resourceMap.getString("jLabel9.text")); // NOI18N
        jLabel9.setName("jLabel9"); // NOI18N

        jSpinner2.setModel(new javax.swing.SpinnerNumberModel(50, 0, 300000, 1));
        jSpinner2.setName("jSpinner2"); // NOI18N

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${currentLaserDevice.projectorTiming}"), jSpinner2, org.jdesktop.beansbinding.BeanProperty.create("value"));
        bindingGroup.addBinding(binding);

        jLabel10.setText(resourceMap.getString("jLabel10.text")); // NOI18N
        jLabel10.setName("jLabel10"); // NOI18N

        javax.swing.GroupLayout cameraPanelLayout = new javax.swing.GroupLayout(cameraPanel);
        cameraPanel.setLayout(cameraPanelLayout);
        cameraPanelLayout.setHorizontalGroup(
            cameraPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(cameraPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(cameraPanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(cameraPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel12)
                        .addComponent(jLabel8)
                        .addGroup(cameraPanelLayout.createSequentialGroup()
                            .addGroup(cameraPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cameraUrlLabel)
                                .addComponent(urlUserLabel)
                                .addComponent(urlPasswordLabel)
                                .addComponent(projectorUrlLabel))
                            .addGap(22, 22, 22)
                            .addGroup(cameraPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cameraPanelLayout.createSequentialGroup()
                                    .addComponent(cameraUrlTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(searchCameraButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addComponent(urlUserTextField)
                                .addComponent(urlPasswordField)
                                .addComponent(projectorUrlTextField)
                                .addGroup(cameraPanelLayout.createSequentialGroup()
                                    .addGroup(cameraPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jSpinner5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jSpinner3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(cameraPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel13)
                                        .addComponent(jLabel9))
                                    .addGap(70, 70, 70)
                                    .addGroup(cameraPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(cameraPanelLayout.createSequentialGroup()
                                            .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jLabel10))
                                        .addGroup(cameraPanelLayout.createSequentialGroup()
                                            .addComponent(jSpinner4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jLabel14)))))))
                    .addContainerGap()))
        );
        cameraPanelLayout.setVerticalGroup(
            cameraPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(cameraPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(cameraPanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(cameraPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cameraUrlLabel)
                        .addComponent(cameraUrlTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(searchCameraButton))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(cameraPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(urlUserLabel)
                        .addComponent(urlUserTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(cameraPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(urlPasswordLabel)
                        .addComponent(urlPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(cameraPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(projectorUrlLabel)
                        .addComponent(projectorUrlTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(cameraPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel12)
                        .addComponent(jSpinner4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jSpinner3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel13)
                        .addComponent(jLabel14))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(cameraPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9)
                        .addComponent(jSpinner5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab(resourceMap.getString("cameraPanel.TabConstraints.tabTitle"), cameraPanel); // NOI18N

        jobPanel.setName("jobPanel"); // NOI18N

        jLabel6.setText(resourceMap.getString("jLabel6.text")); // NOI18N
        jLabel6.setName("jLabel6"); // NOI18N

        tfJobPrefix.setToolTipText(resourceMap.getString("tfJobPrefix.toolTipText")); // NOI18N
        tfJobPrefix.setName("tfJobPrefix"); // NOI18N

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${currentLaserDevice.jobPrefix}"), tfJobPrefix, org.jdesktop.beansbinding.BeanProperty.create("text_ON_ACTION_OR_FOCUS_LOST"), "jobPrefixBinding");
        bindingGroup.addBinding(binding);

        jLabel7.setText(resourceMap.getString("jLabel7.text")); // NOI18N
        jLabel7.setName("jLabel7"); // NOI18N

        jScrollPane2.setName("jScrollPane2"); // NOI18N

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setToolTipText(resourceMap.getString("jTextArea1.toolTipText")); // NOI18N
        jTextArea1.setName("jTextArea1"); // NOI18N

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${currentLaserDevice.jobSentText}"), jTextArea1, org.jdesktop.beansbinding.BeanProperty.create("text_ON_ACTION_OR_FOCUS_LOST"), "sentText");
        bindingGroup.addBinding(binding);

        jScrollPane2.setViewportView(jTextArea1);
        jTextArea1.getAccessibleContext().setAccessibleDescription(resourceMap.getString("jTextArea1.AccessibleContext.accessibleDescription")); // NOI18N

        javax.swing.GroupLayout jobPanelLayout = new javax.swing.GroupLayout(jobPanel);
        jobPanel.setLayout(jobPanelLayout);
        jobPanelLayout.setHorizontalGroup(
            jobPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jobPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jobPanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jobPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel7)
                        .addComponent(jLabel6))
                    .addGap(22, 22, 22)
                    .addGroup(jobPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(tfJobPrefix, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addContainerGap()))
        );
        jobPanelLayout.setVerticalGroup(
            jobPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 265, Short.MAX_VALUE)
            .addGroup(jobPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jobPanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jobPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tfJobPrefix, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jobPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jobPanelLayout.createSequentialGroup()
                            .addComponent(jLabel7)
                            .addGap(0, 203, Short.MAX_VALUE))
                        .addComponent(jScrollPane2))
                    .addContainerGap()))
        );

        jTabbedPane1.addTab(resourceMap.getString("jobPanel.TabConstraints.tabTitle"), jobPanel); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(selectThumbnailButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jNameField, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jDescriptionTextField, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1))
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(selectThumbnailButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDescriptionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jTabbedPane1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap())
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

  private void jButton2ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton2ActionPerformed
  {//GEN-HEADEREND:event_jButton2ActionPerformed
    this.setLaserDevice(null);
    this.setVisible(false);
  }//GEN-LAST:event_jButton2ActionPerformed

  private void jButton1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton1ActionPerformed
  {//GEN-HEADEREND:event_jButton1ActionPerformed
    String driver = (String) this.driverComboBox.getSelectedItem();
    try
    {
      LaserCutter cutter;
      try
      {
        Class driverclass = Class.forName(driver);
        cutter = (LaserCutter) driverclass.newInstance();
        //Try to set every setting from the current Lasercutter
        for (String a : this.currentLaserDevice.getLaserCutter().getPropertyKeys())
        {
          cutter.setProperty(a, this.currentLaserDevice.getLaserCutter().getProperty(a));
        }
      }
      catch (Exception e)
      {
        throw new Exception(java.util.ResourceBundle.getBundle("com/t_oster/visicut/gui/resources/EditLaserDeviceDialog").getString("THE DRIVER COULD NOT BE LOADED: ") + e.getMessage());
      }
      currentLaserDevice.setLaserCutter(cutter);
      if ("".equals(currentLaserDevice.getCameraURL()))
      {
        currentLaserDevice.setCameraURL(null);
      }
      if (currentLaserDevice.getName() == null || currentLaserDevice.getName().equals(""))
      {
        throw new Exception(java.util.ResourceBundle.getBundle("com/t_oster/visicut/gui/resources/EditLaserDeviceDialog").getString("THE NAME MUST NOT BE EMPTY"));
      }
      //If class not existing yet in preferences, add them
      boolean found = false;
      String[] drivers = PreferencesManager.getInstance().getPreferences().getAvailableLasercutterDrivers();
      for (String s : drivers)
      {
        if (s.equals(driver))
        {
          found = true;
          break;
        }
      }
      if (!found)
      {
        drivers = Arrays.copyOf(drivers, drivers.length + 1);
        drivers[drivers.length - 1] = driver;
        PreferencesManager.getInstance().getPreferences().setAvailableLasercutterDrivers(drivers);
      }
      this.setLaserDevice(currentLaserDevice);
      this.setVisible(false);
    }
    catch (Exception ex)
    {
      JOptionPane.showMessageDialog(this, java.util.ResourceBundle.getBundle("com/t_oster/visicut/gui/resources/EditLaserDeviceDialog").getString("ERROR: ") + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
      return;
    }
  }//GEN-LAST:event_jButton1ActionPerformed

private void searchCameraButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchCameraButtonActionPerformed
  this.searchCameraButton.setEnabled(false);
  new Thread(){
      @Override
    public void run()
    {
      DialogHelper dialog = new DialogHelper(EditLaserDeviceDialog.this, "VisiCut");
      List<String> camUrls = Helper.findVisiCamInstances();
      if (camUrls.isEmpty())
      {
        dialog.showInfoMessage(java.util.ResourceBundle.getBundle("com/t_oster/visicut/gui/resources/EditLaserDeviceDialog").getString("NO_CAM_FOUND"));
      }
      else
      {
        String url = camUrls.size() == 1 ? camUrls.get(0) : dialog.askElement(camUrls, java.util.ResourceBundle.getBundle("com/t_oster/visicut/gui/resources/EditLaserDeviceDialog").getString("SELECT_CAMERA"));
        if (url != null)
        {
          EditLaserDeviceDialog.this.cameraUrlTextField.setText(url);
          EditLaserDeviceDialog.this.currentLaserDevice.setCameraURL(url);
        }
      }
      EditLaserDeviceDialog.this.searchCameraButton.setEnabled(true);
    }
  }.start();
}//GEN-LAST:event_searchCameraButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel cameraPanel;
    private javax.swing.JLabel cameraUrlLabel;
    private javax.swing.JTextField cameraUrlTextField;
    private javax.swing.JComboBox driverComboBox;
    private javax.swing.JLabel driverLabel;
    private javax.swing.JPanel driverPanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JTextField jDescriptionTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jNameField;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JSpinner jSpinner3;
    private javax.swing.JSpinner jSpinner4;
    private javax.swing.JSpinner jSpinner5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JPanel jobPanel;
    private javax.swing.JLabel projectorUrlLabel;
    private javax.swing.JTextField projectorUrlTextField;
    private javax.swing.JButton searchCameraButton;
    private com.t_oster.uicomponents.SelectThumbnailButton selectThumbnailButton1;
    private javax.swing.JTable settingsTable;
    private javax.swing.JTextField tfJobPrefix;
    private javax.swing.JPasswordField urlPasswordField;
    private javax.swing.JLabel urlPasswordLabel;
    private javax.swing.JLabel urlUserLabel;
    private javax.swing.JTextField urlUserTextField;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
