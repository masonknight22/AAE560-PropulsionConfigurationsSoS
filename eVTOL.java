package _6p_h;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Currency;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Random;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.Stack;
import java.util.Timer;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;
import java.awt.Color;
import java.awt.Font;
import com.anylogic.engine.connectivity.ResultSet;
import com.anylogic.engine.connectivity.Statement;
import com.anylogic.engine.elements.*;
import com.anylogic.engine.markup.Network;
import com.anylogic.engine.Position;
import com.anylogic.engine.markup.PedFlowStatistics;
import com.anylogic.engine.markup.DensityMap;


import static java.lang.Math.*;
import static com.anylogic.engine.UtilitiesArray.*;
import static com.anylogic.engine.UtilitiesCollection.*;
import static com.anylogic.engine.presentation.UtilitiesColor.*;
import static com.anylogic.engine.HyperArray.*;

import com.anylogic.engine.*;
import com.anylogic.engine.analysis.*;
import com.anylogic.engine.connectivity.*;
import com.anylogic.engine.database.*;
import com.anylogic.engine.gis.*;
import com.anylogic.engine.markup.*;
import com.anylogic.engine.routing.*;
import com.anylogic.engine.presentation.*;
import com.anylogic.engine.gui.*;

import com.anylogic.libraries.modules.markup_descriptors.*;
import com.anylogic.libraries.pedestrian.*;

import java.awt.geom.Arc2D;

public class Main extends Agent
{
  // Parameters
  @AnyLogicInternalCodegenAPI
  private static Map<String, IElementDescriptor> elementDesciptors_xjal = createElementDescriptors( Main.class );
  
  @AnyLogicInternalCodegenAPI
  @Override
  public Map<String, IElementDescriptor> getElementDesciptors() {
    return elementDesciptors_xjal;
  }
  @AnyLogicCustomProposalPriority(type = AnyLogicCustomProposalPriority.Type.STATIC_ELEMENT)
  public static final Scale scale = new Scale( 10.0 );

  @Override
  public Scale getScale() {
    return scale;
  }



	

  /** Internal constant, shouldn't be accessed by user */
  @AnyLogicInternalCodegenAPI
  protected static final int _STATECHART_COUNT_xjal = 0;


  // Embedded Objects

  public com.anylogic.libraries.pedestrian.PedSource<
Agent 
> MBsource;
  public com.anylogic.libraries.pedestrian.PedSink<
Agent 
> MQsuccess;
  public com.anylogic.libraries.pedestrian.PedGoTo<
Agent 
> MQdepart;
  public com.anylogic.libraries.pedestrian.PedWait<
Agent 
> MQstep;
  public com.anylogic.libraries.pedestrian.PedSource<
Agent 
> MchargeSo;
  public com.anylogic.libraries.pedestrian.PedWait<
Agent 
> MCharge;
  public com.anylogic.libraries.pedestrian.PedSink<
Agent 
> MchargeSi;
  public com.anylogic.libraries.pedestrian.PedGoTo<
Agent 
> BQdepart;
  public com.anylogic.libraries.pedestrian.PedWait<
Agent 
> BQstep;
  public com.anylogic.libraries.pedestrian.PedSelectOutput<
Agent 
> MBchoose;
  public com.anylogic.libraries.pedestrian.PedSink<
Agent 
> BQsuccess;
  public com.anylogic.libraries.pedestrian.PedSource<
Agent 
> BQsource;
  public com.anylogic.libraries.pedestrian.PedSink<
Agent 
> BMsuccess;
  public com.anylogic.libraries.pedestrian.PedGoTo<
Agent 
> BMdepart;
  public com.anylogic.libraries.pedestrian.PedWait<
Agent 
> BMstep;
  public com.anylogic.libraries.pedestrian.PedGoTo<
Agent 
> QMdepart;
  public com.anylogic.libraries.pedestrian.PedWait<
Agent 
> QMstep;
  public com.anylogic.libraries.pedestrian.PedSelectOutput<
Agent 
> BQchoose;
  public com.anylogic.libraries.pedestrian.PedSource<
Agent 
> QMsource;
  public com.anylogic.libraries.pedestrian.PedGoTo<
Agent 
> QBdepart;
  public com.anylogic.libraries.pedestrian.PedWait<
Agent 
> QBstep;
  public com.anylogic.libraries.pedestrian.PedGoTo<
Agent 
> MBdepart;
  public com.anylogic.libraries.pedestrian.PedWait<
Agent 
> MBstep;
  public com.anylogic.libraries.pedestrian.PedSelectOutput<
Agent 
> QMchoose;
  public com.anylogic.libraries.pedestrian.PedSource<
Agent 
> TriggerSo;
  public com.anylogic.libraries.pedestrian.PedSink<
Agent 
> TriggerSi;
  public com.anylogic.libraries.pedestrian.PedSelectOutput<
Agent 
> MCheck;
  public com.anylogic.libraries.pedestrian.PedWait<
Agent 
> MMaintenance;
  public com.anylogic.libraries.pedestrian.PedSource<
Agent 
> BchargeSo;
  public com.anylogic.libraries.pedestrian.PedWait<
Agent 
> BCharge;
  public com.anylogic.libraries.pedestrian.PedSink<
Agent 
> BchargeSi;
  public com.anylogic.libraries.pedestrian.PedSelectOutput<
Agent 
> BCheck;
  public com.anylogic.libraries.pedestrian.PedWait<
Agent 
> BMaintenance;
  public com.anylogic.libraries.pedestrian.PedSource<
Agent 
> QchargeSo;
  public com.anylogic.libraries.pedestrian.PedWait<
Agent 
> QCharge;
  public com.anylogic.libraries.pedestrian.PedSink<
Agent 
> QchargeSi;
  public com.anylogic.libraries.pedestrian.PedSelectOutput<
Agent 
> QCheck;
  public com.anylogic.libraries.pedestrian.PedWait<
Agent 
> QMaintenance;
  public com.anylogic.libraries.pedestrian.PedWait<
Agent 
> MQfly;
  public com.anylogic.libraries.pedestrian.PedWait<
Agent 
> BQfly;
  public com.anylogic.libraries.pedestrian.PedWait<
Agent 
> BMfly;
  public com.anylogic.libraries.pedestrian.PedWait<
Agent 
> MQqueue;
  public com.anylogic.libraries.pedestrian.PedSelectOutput<
Agent 
> MQpatience;
  public com.anylogic.libraries.pedestrian.PedSink<
Agent 
> MQimpatient;
  public com.anylogic.libraries.pedestrian.PedWait<
Agent 
> BQqueue;
  public com.anylogic.libraries.pedestrian.PedSelectOutput<
Agent 
> BQpatience;
  public com.anylogic.libraries.pedestrian.PedSink<
Agent 
> BQimpatient;
  public com.anylogic.libraries.pedestrian.PedSelectOutput<
Agent 
> BMpatience;
  public com.anylogic.libraries.pedestrian.PedWait<
Agent 
> BMqueue;
  public com.anylogic.libraries.pedestrian.PedSink<
Agent 
> BMimpatient;
  public com.anylogic.libraries.pedestrian.PedSelectOutput<
Agent 
> QMpatience;
  public com.anylogic.libraries.pedestrian.PedWait<
Agent 
> QMqueue;
  public com.anylogic.libraries.pedestrian.PedSink<
Agent 
> QMimpatient;
  public com.anylogic.libraries.pedestrian.PedSelectOutput<
Agent 
> QBpatience;
  public com.anylogic.libraries.pedestrian.PedWait<
Agent 
> QBqueue;
  public com.anylogic.libraries.pedestrian.PedSink<
Agent 
> QBimpatient;
  public com.anylogic.libraries.pedestrian.PedSelectOutput<
Agent 
> MBpatience;
  public com.anylogic.libraries.pedestrian.PedWait<
Agent 
> MBqueue;
  public com.anylogic.libraries.pedestrian.PedSink<
Agent 
> MBimpatient;
  public com.anylogic.libraries.pedestrian.PedSource<
Agent 
> FlightCountSo;
  public com.anylogic.libraries.pedestrian.PedSink<
Agent 
> FlightCountSi;

  public String getNameOf( Agent ao ) {
    if ( ao == MBsource ) return "MBsource";
    if ( ao == MQsuccess ) return "MQsuccess";
    if ( ao == MQdepart ) return "MQdepart";
    if ( ao == MQstep ) return "MQstep";
    if ( ao == MchargeSo ) return "MchargeSo";
    if ( ao == MCharge ) return "MCharge";
    if ( ao == MchargeSi ) return "MchargeSi";
    if ( ao == BQdepart ) return "BQdepart";
    if ( ao == BQstep ) return "BQstep";
    if ( ao == MBchoose ) return "MBchoose";
    if ( ao == BQsuccess ) return "BQsuccess";
    if ( ao == BQsource ) return "BQsource";
    if ( ao == BMsuccess ) return "BMsuccess";
    if ( ao == BMdepart ) return "BMdepart";
    if ( ao == BMstep ) return "BMstep";
    if ( ao == QMdepart ) return "QMdepart";
    if ( ao == QMstep ) return "QMstep";
    if ( ao == BQchoose ) return "BQchoose";
    if ( ao == QMsource ) return "QMsource";
    if ( ao == QBdepart ) return "QBdepart";
    if ( ao == QBstep ) return "QBstep";
    if ( ao == MBdepart ) return "MBdepart";
    if ( ao == MBstep ) return "MBstep";
    if ( ao == QMchoose ) return "QMchoose";
    if ( ao == TriggerSo ) return "TriggerSo";
    if ( ao == TriggerSi ) return "TriggerSi";
    if ( ao == MCheck ) return "MCheck";
    if ( ao == MMaintenance ) return "MMaintenance";
    if ( ao == BchargeSo ) return "BchargeSo";
    if ( ao == BCharge ) return "BCharge";
    if ( ao == BchargeSi ) return "BchargeSi";
    if ( ao == BCheck ) return "BCheck";
    if ( ao == BMaintenance ) return "BMaintenance";
    if ( ao == QchargeSo ) return "QchargeSo";
    if ( ao == QCharge ) return "QCharge";
    if ( ao == QchargeSi ) return "QchargeSi";
    if ( ao == QCheck ) return "QCheck";
    if ( ao == QMaintenance ) return "QMaintenance";
    if ( ao == MQfly ) return "MQfly";
    if ( ao == BQfly ) return "BQfly";
    if ( ao == BMfly ) return "BMfly";
    if ( ao == MQqueue ) return "MQqueue";
    if ( ao == MQpatience ) return "MQpatience";
    if ( ao == MQimpatient ) return "MQimpatient";
    if ( ao == BQqueue ) return "BQqueue";
    if ( ao == BQpatience ) return "BQpatience";
    if ( ao == BQimpatient ) return "BQimpatient";
    if ( ao == BMpatience ) return "BMpatience";
    if ( ao == BMqueue ) return "BMqueue";
    if ( ao == BMimpatient ) return "BMimpatient";
    if ( ao == QMpatience ) return "QMpatience";
    if ( ao == QMqueue ) return "QMqueue";
    if ( ao == QMimpatient ) return "QMimpatient";
    if ( ao == QBpatience ) return "QBpatience";
    if ( ao == QBqueue ) return "QBqueue";
    if ( ao == QBimpatient ) return "QBimpatient";
    if ( ao == MBpatience ) return "MBpatience";
    if ( ao == MBqueue ) return "MBqueue";
    if ( ao == MBimpatient ) return "MBimpatient";
    if ( ao == FlightCountSo ) return "FlightCountSo";
    if ( ao == FlightCountSi ) return "FlightCountSi";
    return super.getNameOf( ao );
  }

  public AgentAnimationSettings getAnimationSettingsOf( Agent ao ) {
    return super.getAnimationSettingsOf( ao );
  }


  public String getNameOf( AgentList<?> aolist ) {
    return super.getNameOf( aolist );
  }
  
  public AgentAnimationSettings getAnimationSettingsOf( AgentList<?> aolist ) {
    return super.getAnimationSettingsOf( aolist );
  }


  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.pedestrian.PedSource<Agent> instantiate_MBsource_xjal() {
    com.anylogic.libraries.pedestrian.PedSource<Agent> _result_xjal = new com.anylogic.libraries.pedestrian.PedSource<Agent>( getEngine(), this, null ) {
      @Override
      public AreaNode<?> locationNode( Agent ped ) {
        return _MBsource_locationNode_xjal( this, ped );
      }

      @AnyLogicInternalCodegenAPI
      public RateUnits getUnitsForCodeOf_rate() {
        return PER_MINUTE;
      }
	};
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_MBsource_xjal( final com.anylogic.libraries.pedestrian.PedSource<Agent> self, TableInput _t ) {
    self.locationType = 
self.LOCATION_NODE 
;
    self.arrivalType = self._arrivalType_DefaultValue_xjal();
    self.rate = 
2.4 
;
    self.rate = PER_MINUTE.convertTo( self.rate, PER_HOUR );
    self.rateSchedule = self._rateSchedule_DefaultValue_xjal();
    self.modifyRate = self._modifyRate_DefaultValue_xjal();
    self.arrivalSchedule = self._arrivalSchedule_DefaultValue_xjal();
    self.limitArrivals = self._limitArrivals_DefaultValue_xjal();
    self.maxArrivals = self._maxArrivals_DefaultValue_xjal();
    self.createGroups = self._createGroups_DefaultValue_xjal();
    self.groupFormation = self._groupFormation_DefaultValue_xjal();
    self.serviceGroupBehavior = self._serviceGroupBehavior_DefaultValue_xjal();
    self.solidCancelling = self._solidCancelling_DefaultValue_xjal();
    self.addToCustomPopulation = self._addToCustomPopulation_DefaultValue_xjal();
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_MBsource_xjal( com.anylogic.libraries.pedestrian.PedSource<Agent> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.pedestrian.PedSink<Agent> instantiate_MQsuccess_xjal() {
    com.anylogic.libraries.pedestrian.PedSink<Agent> _result_xjal = new com.anylogic.libraries.pedestrian.PedSink<Agent>( getEngine(), this, null );
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_MQsuccess_xjal( final com.anylogic.libraries.pedestrian.PedSink<Agent> self, TableInput _t ) {
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_MQsuccess_xjal( com.anylogic.libraries.pedestrian.PedSink<Agent> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.pedestrian.PedGoTo<Agent> instantiate_MQdepart_xjal() {
    com.anylogic.libraries.pedestrian.PedGoTo<Agent> _result_xjal = new com.anylogic.libraries.pedestrian.PedGoTo<Agent>( getEngine(), this, null ) {
      @Override
      public AreaNode<?> locationNode( Agent ped ) {
        return _MQdepart_locationNode_xjal( this, ped );
      }
	};
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_MQdepart_xjal( final com.anylogic.libraries.pedestrian.PedGoTo<Agent> self, TableInput _t ) {
    self.mode = self._mode_DefaultValue_xjal();
    self.locationType = 
self.LOCATION_NODE 
;
    self.reachTolerance = self._reachTolerance_DefaultValue_xjal();
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_MQdepart_xjal( com.anylogic.libraries.pedestrian.PedGoTo<Agent> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.pedestrian.PedWait<Agent> instantiate_MQstep_xjal() {
    com.anylogic.libraries.pedestrian.PedWait<Agent> _result_xjal = new com.anylogic.libraries.pedestrian.PedWait<Agent>( getEngine(), this, null ) {
      @Override
      public AreaNode<?> locationNode( Agent ped ) {
        return _MQstep_locationNode_xjal( this, ped );
      }
	};
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_MQstep_xjal( final com.anylogic.libraries.pedestrian.PedWait<Agent> self, TableInput _t ) {
    self.locationType = self._locationType_DefaultValue_xjal();
    self.attractorChoice = self._attractorChoice_DefaultValue_xjal();
    self.delayType = 
self.DELAY_MANUAL 
;
    self.waitForGroup = self._waitForGroup_DefaultValue_xjal();
    self.delayStartsWhen = self._delayStartsWhen_DefaultValue_xjal();
    self.maximumCapacity = 
false 
;
    self.capacity = 
6 
;
    self.targetReachTolerance = self._targetReachTolerance_DefaultValue_xjal();
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_MQstep_xjal( com.anylogic.libraries.pedestrian.PedWait<Agent> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.pedestrian.PedSource<Agent> instantiate_MchargeSo_xjal() {
    com.anylogic.libraries.pedestrian.PedSource<Agent> _result_xjal = new com.anylogic.libraries.pedestrian.PedSource<Agent>( getEngine(), this, null ) {
      @Override
      public TargetLine locationLine( Agent ped ) {
        return _MchargeSo_locationLine_xjal( this, ped );
      }
	};
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_MchargeSo_xjal( final com.anylogic.libraries.pedestrian.PedSource<Agent> self, TableInput _t ) {
    self.locationType = self._locationType_DefaultValue_xjal();
    self.arrivalType = 
self.MANUAL 
;
    self.rate = self._rate_DefaultValue_xjal();
    self.rateSchedule = self._rateSchedule_DefaultValue_xjal();
    self.modifyRate = self._modifyRate_DefaultValue_xjal();
    self.arrivalSchedule = self._arrivalSchedule_DefaultValue_xjal();
    self.limitArrivals = self._limitArrivals_DefaultValue_xjal();
    self.maxArrivals = self._maxArrivals_DefaultValue_xjal();
    self.createGroups = self._createGroups_DefaultValue_xjal();
    self.groupFormation = self._groupFormation_DefaultValue_xjal();
    self.serviceGroupBehavior = self._serviceGroupBehavior_DefaultValue_xjal();
    self.solidCancelling = self._solidCancelling_DefaultValue_xjal();
    self.addToCustomPopulation = self._addToCustomPopulation_DefaultValue_xjal();
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_MchargeSo_xjal( com.anylogic.libraries.pedestrian.PedSource<Agent> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.pedestrian.PedWait<Agent> instantiate_MCharge_xjal() {
    com.anylogic.libraries.pedestrian.PedWait<Agent> _result_xjal = new com.anylogic.libraries.pedestrian.PedWait<Agent>( getEngine(), this, null ) {
      @Override
      public TargetLine locationLine( Agent ped ) {
        return _MCharge_locationLine_xjal( this, ped );
      }
      @Override
      public double delayTimeout( Agent ped ) {
        return _MCharge_delayTimeout_xjal( this, ped );
      }

      @AnyLogicInternalCodegenAPI
      public TimeUnits getUnitsForCodeOf_delayTimeout() {
        return MINUTE;
      }
      @Override
      public void onExit( Agent ped ) {
        _MCharge_onExit_xjal( this, ped );
      }
	};
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_MCharge_xjal( final com.anylogic.libraries.pedestrian.PedWait<Agent> self, TableInput _t ) {
    self.locationType = 
self.LOCATION_LINE 
;
    self.attractorChoice = self._attractorChoice_DefaultValue_xjal();
    self.delayType = self._delayType_DefaultValue_xjal();
    self.waitForGroup = self._waitForGroup_DefaultValue_xjal();
    self.delayStartsWhen = self._delayStartsWhen_DefaultValue_xjal();
    self.maximumCapacity = 
false 
;
    self.capacity = self._capacity_DefaultValue_xjal();
    self.targetReachTolerance = self._targetReachTolerance_DefaultValue_xjal();
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_MCharge_xjal( com.anylogic.libraries.pedestrian.PedWait<Agent> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.pedestrian.PedSink<Agent> instantiate_MchargeSi_xjal() {
    com.anylogic.libraries.pedestrian.PedSink<Agent> _result_xjal = new com.anylogic.libraries.pedestrian.PedSink<Agent>( getEngine(), this, null ) {
      @Override
      public void onEnter( Agent ped ) {
        _MchargeSi_onEnter_xjal( this, ped );
      }
	};
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_MchargeSi_xjal( final com.anylogic.libraries.pedestrian.PedSink<Agent> self, TableInput _t ) {
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_MchargeSi_xjal( com.anylogic.libraries.pedestrian.PedSink<Agent> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.pedestrian.PedGoTo<Agent> instantiate_BQdepart_xjal() {
    com.anylogic.libraries.pedestrian.PedGoTo<Agent> _result_xjal = new com.anylogic.libraries.pedestrian.PedGoTo<Agent>( getEngine(), this, null ) {
      @Override
      public AreaNode<?> locationNode( Agent ped ) {
        return _BQdepart_locationNode_xjal( this, ped );
      }
	};
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_BQdepart_xjal( final com.anylogic.libraries.pedestrian.PedGoTo<Agent> self, TableInput _t ) {
    self.mode = self._mode_DefaultValue_xjal();
    self.locationType = 
self.LOCATION_NODE 
;
    self.reachTolerance = self._reachTolerance_DefaultValue_xjal();
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_BQdepart_xjal( com.anylogic.libraries.pedestrian.PedGoTo<Agent> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.pedestrian.PedWait<Agent> instantiate_BQstep_xjal() {
    com.anylogic.libraries.pedestrian.PedWait<Agent> _result_xjal = new com.anylogic.libraries.pedestrian.PedWait<Agent>( getEngine(), this, null ) {
      @Override
      public AreaNode<?> locationNode( Agent ped ) {
        return _BQstep_locationNode_xjal( this, ped );
      }
	};
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_BQstep_xjal( final com.anylogic.libraries.pedestrian.PedWait<Agent> self, TableInput _t ) {
    self.locationType = self._locationType_DefaultValue_xjal();
    self.attractorChoice = self._attractorChoice_DefaultValue_xjal();
    self.delayType = 
self.DELAY_MANUAL 
;
    self.waitForGroup = self._waitForGroup_DefaultValue_xjal();
    self.delayStartsWhen = self._delayStartsWhen_DefaultValue_xjal();
    self.maximumCapacity = 
false 
;
    self.capacity = 
6 
;
    self.targetReachTolerance = self._targetReachTolerance_DefaultValue_xjal();
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_BQstep_xjal( com.anylogic.libraries.pedestrian.PedWait<Agent> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.pedestrian.PedSelectOutput<Agent> instantiate_MBchoose_xjal() {
    com.anylogic.libraries.pedestrian.PedSelectOutput<Agent> _result_xjal = new com.anylogic.libraries.pedestrian.PedSelectOutput<Agent>( getEngine(), this, null ) {
      @Override
      public double probability1( Agent ped ) {
        return _MBchoose_probability1_xjal( this, ped );
      }
      @Override
      public double probability2( Agent ped ) {
        return _MBchoose_probability2_xjal( this, ped );
      }
      @Override
      public double probability3( Agent ped ) {
        return _MBchoose_probability3_xjal( this, ped );
      }
      @Override
      public double probability4( Agent ped ) {
        return _MBchoose_probability4_xjal( this, ped );
      }
      @Override
      public double probability5( Agent ped ) {
        return _MBchoose_probability5_xjal( this, ped );
      }
	};
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_MBchoose_xjal( final com.anylogic.libraries.pedestrian.PedSelectOutput<Agent> self, TableInput _t ) {
    self.type = self._type_DefaultValue_xjal();
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_MBchoose_xjal( com.anylogic.libraries.pedestrian.PedSelectOutput<Agent> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.pedestrian.PedSink<Agent> instantiate_BQsuccess_xjal() {
    com.anylogic.libraries.pedestrian.PedSink<Agent> _result_xjal = new com.anylogic.libraries.pedestrian.PedSink<Agent>( getEngine(), this, null );
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_BQsuccess_xjal( final com.anylogic.libraries.pedestrian.PedSink<Agent> self, TableInput _t ) {
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_BQsuccess_xjal( com.anylogic.libraries.pedestrian.PedSink<Agent> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.pedestrian.PedSource<Agent> instantiate_BQsource_xjal() {
    com.anylogic.libraries.pedestrian.PedSource<Agent> _result_xjal = new com.anylogic.libraries.pedestrian.PedSource<Agent>( getEngine(), this, null ) {
      @Override
      public AreaNode<?> locationNode( Agent ped ) {
        return _BQsource_locationNode_xjal( this, ped );
      }

      @AnyLogicInternalCodegenAPI
      public RateUnits getUnitsForCodeOf_rate() {
        return PER_MINUTE;
      }
	};
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_BQsource_xjal( final com.anylogic.libraries.pedestrian.PedSource<Agent> self, TableInput _t ) {
    self.locationType = 
self.LOCATION_NODE 
;
    self.arrivalType = self._arrivalType_DefaultValue_xjal();
    self.rate = 
2.4 
;
    self.rate = PER_MINUTE.convertTo( self.rate, PER_HOUR );
    self.rateSchedule = self._rateSchedule_DefaultValue_xjal();
    self.modifyRate = self._modifyRate_DefaultValue_xjal();
    self.arrivalSchedule = self._arrivalSchedule_DefaultValue_xjal();
    self.limitArrivals = self._limitArrivals_DefaultValue_xjal();
    self.maxArrivals = self._maxArrivals_DefaultValue_xjal();
    self.createGroups = self._createGroups_DefaultValue_xjal();
    self.groupFormation = self._groupFormation_DefaultValue_xjal();
    self.serviceGroupBehavior = self._serviceGroupBehavior_DefaultValue_xjal();
    self.solidCancelling = self._solidCancelling_DefaultValue_xjal();
    self.addToCustomPopulation = self._addToCustomPopulation_DefaultValue_xjal();
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_BQsource_xjal( com.anylogic.libraries.pedestrian.PedSource<Agent> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.pedestrian.PedSink<Agent> instantiate_BMsuccess_xjal() {
    com.anylogic.libraries.pedestrian.PedSink<Agent> _result_xjal = new com.anylogic.libraries.pedestrian.PedSink<Agent>( getEngine(), this, null );
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_BMsuccess_xjal( final com.anylogic.libraries.pedestrian.PedSink<Agent> self, TableInput _t ) {
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_BMsuccess_xjal( com.anylogic.libraries.pedestrian.PedSink<Agent> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.pedestrian.PedGoTo<Agent> instantiate_BMdepart_xjal() {
    com.anylogic.libraries.pedestrian.PedGoTo<Agent> _result_xjal = new com.anylogic.libraries.pedestrian.PedGoTo<Agent>( getEngine(), this, null ) {
      @Override
      public AreaNode<?> locationNode( Agent ped ) {
        return _BMdepart_locationNode_xjal( this, ped );
      }
	};
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_BMdepart_xjal( final com.anylogic.libraries.pedestrian.PedGoTo<Agent> self, TableInput _t ) {
    self.mode = self._mode_DefaultValue_xjal();
    self.locationType = 
self.LOCATION_NODE 
;
    self.reachTolerance = self._reachTolerance_DefaultValue_xjal();
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_BMdepart_xjal( com.anylogic.libraries.pedestrian.PedGoTo<Agent> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.pedestrian.PedWait<Agent> instantiate_BMstep_xjal() {
    com.anylogic.libraries.pedestrian.PedWait<Agent> _result_xjal = new com.anylogic.libraries.pedestrian.PedWait<Agent>( getEngine(), this, null ) {
      @Override
      public AreaNode<?> locationNode( Agent ped ) {
        return _BMstep_locationNode_xjal( this, ped );
      }
	};
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_BMstep_xjal( final com.anylogic.libraries.pedestrian.PedWait<Agent> self, TableInput _t ) {
    self.locationType = self._locationType_DefaultValue_xjal();
    self.attractorChoice = self._attractorChoice_DefaultValue_xjal();
    self.delayType = 
self.DELAY_MANUAL 
;
    self.waitForGroup = self._waitForGroup_DefaultValue_xjal();
    self.delayStartsWhen = self._delayStartsWhen_DefaultValue_xjal();
    self.maximumCapacity = 
false 
;
    self.capacity = 
6 
;
    self.targetReachTolerance = self._targetReachTolerance_DefaultValue_xjal();
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_BMstep_xjal( com.anylogic.libraries.pedestrian.PedWait<Agent> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.pedestrian.PedGoTo<Agent> instantiate_QMdepart_xjal() {
    com.anylogic.libraries.pedestrian.PedGoTo<Agent> _result_xjal = new com.anylogic.libraries.pedestrian.PedGoTo<Agent>( getEngine(), this, null ) {
      @Override
      public AreaNode<?> locationNode( Agent ped ) {
        return _QMdepart_locationNode_xjal( this, ped );
      }
	};
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_QMdepart_xjal( final com.anylogic.libraries.pedestrian.PedGoTo<Agent> self, TableInput _t ) {
    self.mode = self._mode_DefaultValue_xjal();
    self.locationType = 
self.LOCATION_NODE 
;
    self.reachTolerance = self._reachTolerance_DefaultValue_xjal();
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_QMdepart_xjal( com.anylogic.libraries.pedestrian.PedGoTo<Agent> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.pedestrian.PedWait<Agent> instantiate_QMstep_xjal() {
    com.anylogic.libraries.pedestrian.PedWait<Agent> _result_xjal = new com.anylogic.libraries.pedestrian.PedWait<Agent>( getEngine(), this, null ) {
      @Override
      public AreaNode<?> locationNode( Agent ped ) {
        return _QMstep_locationNode_xjal( this, ped );
      }
	};
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_QMstep_xjal( final com.anylogic.libraries.pedestrian.PedWait<Agent> self, TableInput _t ) {
    self.locationType = self._locationType_DefaultValue_xjal();
    self.attractorChoice = self._attractorChoice_DefaultValue_xjal();
    self.delayType = 
self.DELAY_MANUAL 
;
    self.waitForGroup = self._waitForGroup_DefaultValue_xjal();
    self.delayStartsWhen = self._delayStartsWhen_DefaultValue_xjal();
    self.maximumCapacity = 
false 
;
    self.capacity = 
6 
;
    self.targetReachTolerance = self._targetReachTolerance_DefaultValue_xjal();
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_QMstep_xjal( com.anylogic.libraries.pedestrian.PedWait<Agent> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.pedestrian.PedSelectOutput<Agent> instantiate_BQchoose_xjal() {
    com.anylogic.libraries.pedestrian.PedSelectOutput<Agent> _result_xjal = new com.anylogic.libraries.pedestrian.PedSelectOutput<Agent>( getEngine(), this, null ) {
      @Override
      public double probability1( Agent ped ) {
        return _BQchoose_probability1_xjal( this, ped );
      }
      @Override
      public double probability2( Agent ped ) {
        return _BQchoose_probability2_xjal( this, ped );
      }
      @Override
      public double probability3( Agent ped ) {
        return _BQchoose_probability3_xjal( this, ped );
      }
      @Override
      public double probability4( Agent ped ) {
        return _BQchoose_probability4_xjal( this, ped );
      }
      @Override
      public double probability5( Agent ped ) {
        return _BQchoose_probability5_xjal( this, ped );
      }
	};
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_BQchoose_xjal( final com.anylogic.libraries.pedestrian.PedSelectOutput<Agent> self, TableInput _t ) {
    self.type = self._type_DefaultValue_xjal();
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_BQchoose_xjal( com.anylogic.libraries.pedestrian.PedSelectOutput<Agent> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.pedestrian.PedSource<Agent> instantiate_QMsource_xjal() {
    com.anylogic.libraries.pedestrian.PedSource<Agent> _result_xjal = new com.anylogic.libraries.pedestrian.PedSource<Agent>( getEngine(), this, null ) {
      @Override
      public AreaNode<?> locationNode( Agent ped ) {
        return _QMsource_locationNode_xjal( this, ped );
      }

      @AnyLogicInternalCodegenAPI
      public RateUnits getUnitsForCodeOf_rate() {
        return PER_MINUTE;
      }
	};
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_QMsource_xjal( final com.anylogic.libraries.pedestrian.PedSource<Agent> self, TableInput _t ) {
    self.locationType = 
self.LOCATION_NODE 
;
    self.arrivalType = self._arrivalType_DefaultValue_xjal();
    self.rate = 
2.4 
;
    self.rate = PER_MINUTE.convertTo( self.rate, PER_HOUR );
    self.rateSchedule = self._rateSchedule_DefaultValue_xjal();
    self.modifyRate = self._modifyRate_DefaultValue_xjal();
    self.arrivalSchedule = self._arrivalSchedule_DefaultValue_xjal();
    self.limitArrivals = self._limitArrivals_DefaultValue_xjal();
    self.maxArrivals = self._maxArrivals_DefaultValue_xjal();
    self.createGroups = self._createGroups_DefaultValue_xjal();
    self.groupFormation = self._groupFormation_DefaultValue_xjal();
    self.serviceGroupBehavior = self._serviceGroupBehavior_DefaultValue_xjal();
    self.solidCancelling = self._solidCancelling_DefaultValue_xjal();
    self.addToCustomPopulation = self._addToCustomPopulation_DefaultValue_xjal();
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_QMsource_xjal( com.anylogic.libraries.pedestrian.PedSource<Agent> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.pedestrian.PedGoTo<Agent> instantiate_QBdepart_xjal() {
    com.anylogic.libraries.pedestrian.PedGoTo<Agent> _result_xjal = new com.anylogic.libraries.pedestrian.PedGoTo<Agent>( getEngine(), this, null ) {
      @Override
      public AreaNode<?> locationNode( Agent ped ) {
        return _QBdepart_locationNode_xjal( this, ped );
      }
	};
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_QBdepart_xjal( final com.anylogic.libraries.pedestrian.PedGoTo<Agent> self, TableInput _t ) {
    self.mode = self._mode_DefaultValue_xjal();
    self.locationType = 
self.LOCATION_NODE 
;
    self.reachTolerance = self._reachTolerance_DefaultValue_xjal();
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_QBdepart_xjal( com.anylogic.libraries.pedestrian.PedGoTo<Agent> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.pedestrian.PedWait<Agent> instantiate_QBstep_xjal() {
    com.anylogic.libraries.pedestrian.PedWait<Agent> _result_xjal = new com.anylogic.libraries.pedestrian.PedWait<Agent>( getEngine(), this, null ) {
      @Override
      public AreaNode<?> locationNode( Agent ped ) {
        return _QBstep_locationNode_xjal( this, ped );
      }
	};
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_QBstep_xjal( final com.anylogic.libraries.pedestrian.PedWait<Agent> self, TableInput _t ) {
    self.locationType = self._locationType_DefaultValue_xjal();
    self.attractorChoice = self._attractorChoice_DefaultValue_xjal();
    self.delayType = 
self.DELAY_MANUAL 
;
    self.waitForGroup = self._waitForGroup_DefaultValue_xjal();
    self.delayStartsWhen = self._delayStartsWhen_DefaultValue_xjal();
    self.maximumCapacity = 
false 
;
    self.capacity = 
6 
;
    self.targetReachTolerance = self._targetReachTolerance_DefaultValue_xjal();
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_QBstep_xjal( com.anylogic.libraries.pedestrian.PedWait<Agent> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.pedestrian.PedGoTo<Agent> instantiate_MBdepart_xjal() {
    com.anylogic.libraries.pedestrian.PedGoTo<Agent> _result_xjal = new com.anylogic.libraries.pedestrian.PedGoTo<Agent>( getEngine(), this, null ) {
      @Override
      public AreaNode<?> locationNode( Agent ped ) {
        return _MBdepart_locationNode_xjal( this, ped );
      }
	};
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_MBdepart_xjal( final com.anylogic.libraries.pedestrian.PedGoTo<Agent> self, TableInput _t ) {
    self.mode = self._mode_DefaultValue_xjal();
    self.locationType = 
self.LOCATION_NODE 
;
    self.reachTolerance = self._reachTolerance_DefaultValue_xjal();
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_MBdepart_xjal( com.anylogic.libraries.pedestrian.PedGoTo<Agent> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.pedestrian.PedWait<Agent> instantiate_MBstep_xjal() {
    com.anylogic.libraries.pedestrian.PedWait<Agent> _result_xjal = new com.anylogic.libraries.pedestrian.PedWait<Agent>( getEngine(), this, null ) {
      @Override
      public AreaNode<?> locationNode( Agent ped ) {
        return _MBstep_locationNode_xjal( this, ped );
      }
	};
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_MBstep_xjal( final com.anylogic.libraries.pedestrian.PedWait<Agent> self, TableInput _t ) {
    self.locationType = self._locationType_DefaultValue_xjal();
    self.attractorChoice = self._attractorChoice_DefaultValue_xjal();
    self.delayType = 
self.DELAY_MANUAL 
;
    self.waitForGroup = self._waitForGroup_DefaultValue_xjal();
    self.delayStartsWhen = self._delayStartsWhen_DefaultValue_xjal();
    self.maximumCapacity = 
false 
;
    self.capacity = 
6 
;
    self.targetReachTolerance = self._targetReachTolerance_DefaultValue_xjal();
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_MBstep_xjal( com.anylogic.libraries.pedestrian.PedWait<Agent> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.pedestrian.PedSelectOutput<Agent> instantiate_QMchoose_xjal() {
    com.anylogic.libraries.pedestrian.PedSelectOutput<Agent> _result_xjal = new com.anylogic.libraries.pedestrian.PedSelectOutput<Agent>( getEngine(), this, null ) {
      @Override
      public double probability1( Agent ped ) {
        return _QMchoose_probability1_xjal( this, ped );
      }
      @Override
      public double probability2( Agent ped ) {
        return _QMchoose_probability2_xjal( this, ped );
      }
      @Override
      public double probability3( Agent ped ) {
        return _QMchoose_probability3_xjal( this, ped );
      }
      @Override
      public double probability4( Agent ped ) {
        return _QMchoose_probability4_xjal( this, ped );
      }
      @Override
      public double probability5( Agent ped ) {
        return _QMchoose_probability5_xjal( this, ped );
      }
	};
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_QMchoose_xjal( final com.anylogic.libraries.pedestrian.PedSelectOutput<Agent> self, TableInput _t ) {
    self.type = self._type_DefaultValue_xjal();
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_QMchoose_xjal( com.anylogic.libraries.pedestrian.PedSelectOutput<Agent> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.pedestrian.PedSource<Agent> instantiate_TriggerSo_xjal() {
    com.anylogic.libraries.pedestrian.PedSource<Agent> _result_xjal = new com.anylogic.libraries.pedestrian.PedSource<Agent>( getEngine(), this, null ) {
      @Override
      public TargetLine locationLine( Agent ped ) {
        return _TriggerSo_locationLine_xjal( this, ped );
      }

      @AnyLogicInternalCodegenAPI
      public RateUnits getUnitsForCodeOf_rate() {
        return PER_SECOND;
      }
      @Override
      public void onExit( Agent ped ) {
        _TriggerSo_onExit_xjal( this, ped );
      }
	};
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_TriggerSo_xjal( final com.anylogic.libraries.pedestrian.PedSource<Agent> self, TableInput _t ) {
    self.locationType = self._locationType_DefaultValue_xjal();
    self.arrivalType = self._arrivalType_DefaultValue_xjal();
    self.rate = 
1 
;
    self.rate = PER_SECOND.convertTo( self.rate, PER_HOUR );
    self.rateSchedule = self._rateSchedule_DefaultValue_xjal();
    self.modifyRate = self._modifyRate_DefaultValue_xjal();
    self.arrivalSchedule = self._arrivalSchedule_DefaultValue_xjal();
    self.limitArrivals = 
true 
;
    self.maxArrivals = 
1 
;
    self.createGroups = self._createGroups_DefaultValue_xjal();
    self.groupFormation = self._groupFormation_DefaultValue_xjal();
    self.serviceGroupBehavior = self._serviceGroupBehavior_DefaultValue_xjal();
    self.solidCancelling = self._solidCancelling_DefaultValue_xjal();
    self.addToCustomPopulation = self._addToCustomPopulation_DefaultValue_xjal();
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_TriggerSo_xjal( com.anylogic.libraries.pedestrian.PedSource<Agent> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.pedestrian.PedSink<Agent> instantiate_TriggerSi_xjal() {
    com.anylogic.libraries.pedestrian.PedSink<Agent> _result_xjal = new com.anylogic.libraries.pedestrian.PedSink<Agent>( getEngine(), this, null );
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_TriggerSi_xjal( final com.anylogic.libraries.pedestrian.PedSink<Agent> self, TableInput _t ) {
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_TriggerSi_xjal( com.anylogic.libraries.pedestrian.PedSink<Agent> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.pedestrian.PedSelectOutput<Agent> instantiate_MCheck_xjal() {
    com.anylogic.libraries.pedestrian.PedSelectOutput<Agent> _result_xjal = new com.anylogic.libraries.pedestrian.PedSelectOutput<Agent>( getEngine(), this, null ) {
      @Override
      public double probability1( Agent ped ) {
        return _MCheck_probability1_xjal( this, ped );
      }
      @Override
      public double probability2( Agent ped ) {
        return _MCheck_probability2_xjal( this, ped );
      }
      @Override
      public double probability3( Agent ped ) {
        return _MCheck_probability3_xjal( this, ped );
      }
      @Override
      public double probability4( Agent ped ) {
        return _MCheck_probability4_xjal( this, ped );
      }
      @Override
      public double probability5( Agent ped ) {
        return _MCheck_probability5_xjal( this, ped );
      }
	};
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_MCheck_xjal( final com.anylogic.libraries.pedestrian.PedSelectOutput<Agent> self, TableInput _t ) {
    self.type = self._type_DefaultValue_xjal();
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_MCheck_xjal( com.anylogic.libraries.pedestrian.PedSelectOutput<Agent> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.pedestrian.PedWait<Agent> instantiate_MMaintenance_xjal() {
    com.anylogic.libraries.pedestrian.PedWait<Agent> _result_xjal = new com.anylogic.libraries.pedestrian.PedWait<Agent>( getEngine(), this, null ) {
      @Override
      public TargetLine locationLine( Agent ped ) {
        return _MMaintenance_locationLine_xjal( this, ped );
      }
      @Override
      public double delayTimeout( Agent ped ) {
        return _MMaintenance_delayTimeout_xjal( this, ped );
      }

      @AnyLogicInternalCodegenAPI
      public TimeUnits getUnitsForCodeOf_delayTimeout() {
        return MINUTE;
      }
      @Override
      public void onExit( Agent ped ) {
        _MMaintenance_onExit_xjal( this, ped );
      }
	};
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_MMaintenance_xjal( final com.anylogic.libraries.pedestrian.PedWait<Agent> self, TableInput _t ) {
    self.locationType = 
self.LOCATION_LINE 
;
    self.attractorChoice = self._attractorChoice_DefaultValue_xjal();
    self.delayType = self._delayType_DefaultValue_xjal();
    self.waitForGroup = self._waitForGroup_DefaultValue_xjal();
    self.delayStartsWhen = self._delayStartsWhen_DefaultValue_xjal();
    self.maximumCapacity = 
false 
;
    self.capacity = self._capacity_DefaultValue_xjal();
    self.targetReachTolerance = self._targetReachTolerance_DefaultValue_xjal();
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_MMaintenance_xjal( com.anylogic.libraries.pedestrian.PedWait<Agent> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.pedestrian.PedSource<Agent> instantiate_BchargeSo_xjal() {
    com.anylogic.libraries.pedestrian.PedSource<Agent> _result_xjal = new com.anylogic.libraries.pedestrian.PedSource<Agent>( getEngine(), this, null ) {
      @Override
      public TargetLine locationLine( Agent ped ) {
        return _BchargeSo_locationLine_xjal( this, ped );
      }
	};
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_BchargeSo_xjal( final com.anylogic.libraries.pedestrian.PedSource<Agent> self, TableInput _t ) {
    self.locationType = self._locationType_DefaultValue_xjal();
    self.arrivalType = 
self.MANUAL 
;
    self.rate = self._rate_DefaultValue_xjal();
    self.rateSchedule = self._rateSchedule_DefaultValue_xjal();
    self.modifyRate = self._modifyRate_DefaultValue_xjal();
    self.arrivalSchedule = self._arrivalSchedule_DefaultValue_xjal();
    self.limitArrivals = self._limitArrivals_DefaultValue_xjal();
    self.maxArrivals = self._maxArrivals_DefaultValue_xjal();
    self.createGroups = self._createGroups_DefaultValue_xjal();
    self.groupFormation = self._groupFormation_DefaultValue_xjal();
    self.serviceGroupBehavior = self._serviceGroupBehavior_DefaultValue_xjal();
    self.solidCancelling = self._solidCancelling_DefaultValue_xjal();
    self.addToCustomPopulation = self._addToCustomPopulation_DefaultValue_xjal();
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_BchargeSo_xjal( com.anylogic.libraries.pedestrian.PedSource<Agent> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.pedestrian.PedWait<Agent> instantiate_BCharge_xjal() {
    com.anylogic.libraries.pedestrian.PedWait<Agent> _result_xjal = new com.anylogic.libraries.pedestrian.PedWait<Agent>( getEngine(), this, null ) {
      @Override
      public TargetLine locationLine( Agent ped ) {
        return _BCharge_locationLine_xjal( this, ped );
      }
      @Override
      public double delayTimeout( Agent ped ) {
        return _BCharge_delayTimeout_xjal( this, ped );
      }

      @AnyLogicInternalCodegenAPI
      public TimeUnits getUnitsForCodeOf_delayTimeout() {
        return MINUTE;
      }
      @Override
      public void onExit( Agent ped ) {
        _BCharge_onExit_xjal( this, ped );
      }
	};
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_BCharge_xjal( final com.anylogic.libraries.pedestrian.PedWait<Agent> self, TableInput _t ) {
    self.locationType = 
self.LOCATION_LINE 
;
    self.attractorChoice = self._attractorChoice_DefaultValue_xjal();
    self.delayType = self._delayType_DefaultValue_xjal();
    self.waitForGroup = self._waitForGroup_DefaultValue_xjal();
    self.delayStartsWhen = self._delayStartsWhen_DefaultValue_xjal();
    self.maximumCapacity = 
false 
;
    self.capacity = self._capacity_DefaultValue_xjal();
    self.targetReachTolerance = self._targetReachTolerance_DefaultValue_xjal();
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_BCharge_xjal( com.anylogic.libraries.pedestrian.PedWait<Agent> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.pedestrian.PedSink<Agent> instantiate_BchargeSi_xjal() {
    com.anylogic.libraries.pedestrian.PedSink<Agent> _result_xjal = new com.anylogic.libraries.pedestrian.PedSink<Agent>( getEngine(), this, null ) {
      @Override
      public void onEnter( Agent ped ) {
        _BchargeSi_onEnter_xjal( this, ped );
      }
	};
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_BchargeSi_xjal( final com.anylogic.libraries.pedestrian.PedSink<Agent> self, TableInput _t ) {
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_BchargeSi_xjal( com.anylogic.libraries.pedestrian.PedSink<Agent> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.pedestrian.PedSelectOutput<Agent> instantiate_BCheck_xjal() {
    com.anylogic.libraries.pedestrian.PedSelectOutput<Agent> _result_xjal = new com.anylogic.libraries.pedestrian.PedSelectOutput<Agent>( getEngine(), this, null ) {
      @Override
      public double probability1( Agent ped ) {
        return _BCheck_probability1_xjal( this, ped );
      }
      @Override
      public double probability2( Agent ped ) {
        return _BCheck_probability2_xjal( this, ped );
      }
      @Override
      public double probability3( Agent ped ) {
        return _BCheck_probability3_xjal( this, ped );
      }
      @Override
      public double probability4( Agent ped ) {
        return _BCheck_probability4_xjal( this, ped );
      }
      @Override
      public double probability5( Agent ped ) {
        return _BCheck_probability5_xjal( this, ped );
      }
	};
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_BCheck_xjal( final com.anylogic.libraries.pedestrian.PedSelectOutput<Agent> self, TableInput _t ) {
    self.type = self._type_DefaultValue_xjal();
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_BCheck_xjal( com.anylogic.libraries.pedestrian.PedSelectOutput<Agent> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.pedestrian.PedWait<Agent> instantiate_BMaintenance_xjal() {
    com.anylogic.libraries.pedestrian.PedWait<Agent> _result_xjal = new com.anylogic.libraries.pedestrian.PedWait<Agent>( getEngine(), this, null ) {
      @Override
      public TargetLine locationLine( Agent ped ) {
        return _BMaintenance_locationLine_xjal( this, ped );
      }
      @Override
      public double delayTimeout( Agent ped ) {
        return _BMaintenance_delayTimeout_xjal( this, ped );
      }

      @AnyLogicInternalCodegenAPI
      public TimeUnits getUnitsForCodeOf_delayTimeout() {
        return MINUTE;
      }
      @Override
      public void onExit( Agent ped ) {
        _BMaintenance_onExit_xjal( this, ped );
      }
	};
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_BMaintenance_xjal( final com.anylogic.libraries.pedestrian.PedWait<Agent> self, TableInput _t ) {
    self.locationType = 
self.LOCATION_LINE 
;
    self.attractorChoice = self._attractorChoice_DefaultValue_xjal();
    self.delayType = self._delayType_DefaultValue_xjal();
    self.waitForGroup = self._waitForGroup_DefaultValue_xjal();
    self.delayStartsWhen = self._delayStartsWhen_DefaultValue_xjal();
    self.maximumCapacity = 
false 
;
    self.capacity = self._capacity_DefaultValue_xjal();
    self.targetReachTolerance = self._targetReachTolerance_DefaultValue_xjal();
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_BMaintenance_xjal( com.anylogic.libraries.pedestrian.PedWait<Agent> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.pedestrian.PedSource<Agent> instantiate_QchargeSo_xjal() {
    com.anylogic.libraries.pedestrian.PedSource<Agent> _result_xjal = new com.anylogic.libraries.pedestrian.PedSource<Agent>( getEngine(), this, null ) {
      @Override
      public TargetLine locationLine( Agent ped ) {
        return _QchargeSo_locationLine_xjal( this, ped );
      }
	};
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_QchargeSo_xjal( final com.anylogic.libraries.pedestrian.PedSource<Agent> self, TableInput _t ) {
    self.locationType = self._locationType_DefaultValue_xjal();
    self.arrivalType = 
self.MANUAL 
;
    self.rate = self._rate_DefaultValue_xjal();
    self.rateSchedule = self._rateSchedule_DefaultValue_xjal();
    self.modifyRate = self._modifyRate_DefaultValue_xjal();
    self.arrivalSchedule = self._arrivalSchedule_DefaultValue_xjal();
    self.limitArrivals = self._limitArrivals_DefaultValue_xjal();
    self.maxArrivals = self._maxArrivals_DefaultValue_xjal();
    self.createGroups = self._createGroups_DefaultValue_xjal();
    self.groupFormation = self._groupFormation_DefaultValue_xjal();
    self.serviceGroupBehavior = self._serviceGroupBehavior_DefaultValue_xjal();
    self.solidCancelling = self._solidCancelling_DefaultValue_xjal();
    self.addToCustomPopulation = self._addToCustomPopulation_DefaultValue_xjal();
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_QchargeSo_xjal( com.anylogic.libraries.pedestrian.PedSource<Agent> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.pedestrian.PedWait<Agent> instantiate_QCharge_xjal() {
    com.anylogic.libraries.pedestrian.PedWait<Agent> _result_xjal = new com.anylogic.libraries.pedestrian.PedWait<Agent>( getEngine(), this, null ) {
      @Override
      public TargetLine locationLine( Agent ped ) {
        return _QCharge_locationLine_xjal( this, ped );
      }
      @Override
      public double delayTimeout( Agent ped ) {
        return _QCharge_delayTimeout_xjal( this, ped );
      }

      @AnyLogicInternalCodegenAPI
      public TimeUnits getUnitsForCodeOf_delayTimeout() {
        return MINUTE;
      }
      @Override
      public void onExit( Agent ped ) {
        _QCharge_onExit_xjal( this, ped );
      }
	};
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_QCharge_xjal( final com.anylogic.libraries.pedestrian.PedWait<Agent> self, TableInput _t ) {
    self.locationType = 
self.LOCATION_LINE 
;
    self.attractorChoice = self._attractorChoice_DefaultValue_xjal();
    self.delayType = self._delayType_DefaultValue_xjal();
    self.waitForGroup = self._waitForGroup_DefaultValue_xjal();
    self.delayStartsWhen = self._delayStartsWhen_DefaultValue_xjal();
    self.maximumCapacity = 
false 
;
    self.capacity = self._capacity_DefaultValue_xjal();
    self.targetReachTolerance = self._targetReachTolerance_DefaultValue_xjal();
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_QCharge_xjal( com.anylogic.libraries.pedestrian.PedWait<Agent> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.pedestrian.PedSink<Agent> instantiate_QchargeSi_xjal() {
    com.anylogic.libraries.pedestrian.PedSink<Agent> _result_xjal = new com.anylogic.libraries.pedestrian.PedSink<Agent>( getEngine(), this, null ) {
      @Override
      public void onEnter( Agent ped ) {
        _QchargeSi_onEnter_xjal( this, ped );
      }
	};
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_QchargeSi_xjal( final com.anylogic.libraries.pedestrian.PedSink<Agent> self, TableInput _t ) {
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_QchargeSi_xjal( com.anylogic.libraries.pedestrian.PedSink<Agent> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.pedestrian.PedSelectOutput<Agent> instantiate_QCheck_xjal() {
    com.anylogic.libraries.pedestrian.PedSelectOutput<Agent> _result_xjal = new com.anylogic.libraries.pedestrian.PedSelectOutput<Agent>( getEngine(), this, null ) {
      @Override
      public double probability1( Agent ped ) {
        return _QCheck_probability1_xjal( this, ped );
      }
      @Override
      public double probability2( Agent ped ) {
        return _QCheck_probability2_xjal( this, ped );
      }
      @Override
      public double probability3( Agent ped ) {
        return _QCheck_probability3_xjal( this, ped );
      }
      @Override
      public double probability4( Agent ped ) {
        return _QCheck_probability4_xjal( this, ped );
      }
      @Override
      public double probability5( Agent ped ) {
        return _QCheck_probability5_xjal( this, ped );
      }
	};
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_QCheck_xjal( final com.anylogic.libraries.pedestrian.PedSelectOutput<Agent> self, TableInput _t ) {
    self.type = self._type_DefaultValue_xjal();
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_QCheck_xjal( com.anylogic.libraries.pedestrian.PedSelectOutput<Agent> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.pedestrian.PedWait<Agent> instantiate_QMaintenance_xjal() {
    com.anylogic.libraries.pedestrian.PedWait<Agent> _result_xjal = new com.anylogic.libraries.pedestrian.PedWait<Agent>( getEngine(), this, null ) {
      @Override
      public TargetLine locationLine( Agent ped ) {
        return _QMaintenance_locationLine_xjal( this, ped );
      }
      @Override
      public double delayTimeout( Agent ped ) {
        return _QMaintenance_delayTimeout_xjal( this, ped );
      }

      @AnyLogicInternalCodegenAPI
      public TimeUnits getUnitsForCodeOf_delayTimeout() {
        return MINUTE;
      }
      @Override
      public void onExit( Agent ped ) {
        _QMaintenance_onExit_xjal( this, ped );
      }
	};
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_QMaintenance_xjal( final com.anylogic.libraries.pedestrian.PedWait<Agent> self, TableInput _t ) {
    self.locationType = 
self.LOCATION_LINE 
;
    self.attractorChoice = self._attractorChoice_DefaultValue_xjal();
    self.delayType = self._delayType_DefaultValue_xjal();
    self.waitForGroup = self._waitForGroup_DefaultValue_xjal();
    self.delayStartsWhen = self._delayStartsWhen_DefaultValue_xjal();
    self.maximumCapacity = 
false 
;
    self.capacity = self._capacity_DefaultValue_xjal();
    self.targetReachTolerance = self._targetReachTolerance_DefaultValue_xjal();
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_QMaintenance_xjal( com.anylogic.libraries.pedestrian.PedWait<Agent> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.pedestrian.PedWait<Agent> instantiate_MQfly_xjal() {
    com.anylogic.libraries.pedestrian.PedWait<Agent> _result_xjal = new com.anylogic.libraries.pedestrian.PedWait<Agent>( getEngine(), this, null ) {
      @Override
      public TargetLine locationLine( Agent ped ) {
        return _MQfly_locationLine_xjal( this, ped );
      }
      @Override
      public double delayTimeout( Agent ped ) {
        return _MQfly_delayTimeout_xjal( this, ped );
      }

      @AnyLogicInternalCodegenAPI
      public TimeUnits getUnitsForCodeOf_delayTimeout() {
        return MINUTE;
      }
	};
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_MQfly_xjal( final com.anylogic.libraries.pedestrian.PedWait<Agent> self, TableInput _t ) {
    self.locationType = 
self.LOCATION_LINE 
;
    self.attractorChoice = self._attractorChoice_DefaultValue_xjal();
    self.delayType = self._delayType_DefaultValue_xjal();
    self.waitForGroup = self._waitForGroup_DefaultValue_xjal();
    self.delayStartsWhen = self._delayStartsWhen_DefaultValue_xjal();
    self.maximumCapacity = self._maximumCapacity_DefaultValue_xjal();
    self.capacity = self._capacity_DefaultValue_xjal();
    self.targetReachTolerance = self._targetReachTolerance_DefaultValue_xjal();
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_MQfly_xjal( com.anylogic.libraries.pedestrian.PedWait<Agent> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.pedestrian.PedWait<Agent> instantiate_BQfly_xjal() {
    com.anylogic.libraries.pedestrian.PedWait<Agent> _result_xjal = new com.anylogic.libraries.pedestrian.PedWait<Agent>( getEngine(), this, null ) {
      @Override
      public TargetLine locationLine( Agent ped ) {
        return _BQfly_locationLine_xjal( this, ped );
      }
      @Override
      public double delayTimeout( Agent ped ) {
        return _BQfly_delayTimeout_xjal( this, ped );
      }

      @AnyLogicInternalCodegenAPI
      public TimeUnits getUnitsForCodeOf_delayTimeout() {
        return MINUTE;
      }
	};
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_BQfly_xjal( final com.anylogic.libraries.pedestrian.PedWait<Agent> self, TableInput _t ) {
    self.locationType = 
self.LOCATION_LINE 
;
    self.attractorChoice = self._attractorChoice_DefaultValue_xjal();
    self.delayType = self._delayType_DefaultValue_xjal();
    self.waitForGroup = self._waitForGroup_DefaultValue_xjal();
    self.delayStartsWhen = self._delayStartsWhen_DefaultValue_xjal();
    self.maximumCapacity = self._maximumCapacity_DefaultValue_xjal();
    self.capacity = self._capacity_DefaultValue_xjal();
    self.targetReachTolerance = self._targetReachTolerance_DefaultValue_xjal();
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_BQfly_xjal( com.anylogic.libraries.pedestrian.PedWait<Agent> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.pedestrian.PedWait<Agent> instantiate_BMfly_xjal() {
    com.anylogic.libraries.pedestrian.PedWait<Agent> _result_xjal = new com.anylogic.libraries.pedestrian.PedWait<Agent>( getEngine(), this, null ) {
      @Override
      public TargetLine locationLine( Agent ped ) {
        return _BMfly_locationLine_xjal( this, ped );
      }
      @Override
      public double delayTimeout( Agent ped ) {
        return _BMfly_delayTimeout_xjal( this, ped );
      }

      @AnyLogicInternalCodegenAPI
      public TimeUnits getUnitsForCodeOf_delayTimeout() {
        return MINUTE;
      }
	};
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_BMfly_xjal( final com.anylogic.libraries.pedestrian.PedWait<Agent> self, TableInput _t ) {
    self.locationType = 
self.LOCATION_LINE 
;
    self.attractorChoice = self._attractorChoice_DefaultValue_xjal();
    self.delayType = self._delayType_DefaultValue_xjal();
    self.waitForGroup = self._waitForGroup_DefaultValue_xjal();
    self.delayStartsWhen = self._delayStartsWhen_DefaultValue_xjal();
    self.maximumCapacity = self._maximumCapacity_DefaultValue_xjal();
    self.capacity = self._capacity_DefaultValue_xjal();
    self.targetReachTolerance = self._targetReachTolerance_DefaultValue_xjal();
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_BMfly_xjal( com.anylogic.libraries.pedestrian.PedWait<Agent> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.pedestrian.PedWait<Agent> instantiate_MQqueue_xjal() {
    com.anylogic.libraries.pedestrian.PedWait<Agent> _result_xjal = new com.anylogic.libraries.pedestrian.PedWait<Agent>( getEngine(), this, null ) {
      @Override
      public AreaNode<?> locationNode( Agent ped ) {
        return _MQqueue_locationNode_xjal( this, ped );
      }
      @Override
      public double delayTimeout( Agent ped ) {
        return _MQqueue_delayTimeout_xjal( this, ped );
      }

      @AnyLogicInternalCodegenAPI
      public TimeUnits getUnitsForCodeOf_delayTimeout() {
        return SECOND;
      }
	};
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_MQqueue_xjal( final com.anylogic.libraries.pedestrian.PedWait<Agent> self, TableInput _t ) {
    self.locationType = self._locationType_DefaultValue_xjal();
    self.attractorChoice = self._attractorChoice_DefaultValue_xjal();
    self.delayType = self._delayType_DefaultValue_xjal();
    self.waitForGroup = self._waitForGroup_DefaultValue_xjal();
    self.delayStartsWhen = self._delayStartsWhen_DefaultValue_xjal();
    self.maximumCapacity = self._maximumCapacity_DefaultValue_xjal();
    self.capacity = self._capacity_DefaultValue_xjal();
    self.targetReachTolerance = self._targetReachTolerance_DefaultValue_xjal();
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_MQqueue_xjal( com.anylogic.libraries.pedestrian.PedWait<Agent> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.pedestrian.PedSelectOutput<Agent> instantiate_MQpatience_xjal() {
    com.anylogic.libraries.pedestrian.PedSelectOutput<Agent> _result_xjal = new com.anylogic.libraries.pedestrian.PedSelectOutput<Agent>( getEngine(), this, null ) {
      @Override
      public boolean condition1( Agent ped ) {
        return _MQpatience_condition1_xjal( this, ped );
      }
      @Override
      public boolean condition2( Agent ped ) {
        return _MQpatience_condition2_xjal( this, ped );
      }
	};
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_MQpatience_xjal( final com.anylogic.libraries.pedestrian.PedSelectOutput<Agent> self, TableInput _t ) {
    self.type = 
self.TYPE_CONDITIONS 
;
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_MQpatience_xjal( com.anylogic.libraries.pedestrian.PedSelectOutput<Agent> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.pedestrian.PedSink<Agent> instantiate_MQimpatient_xjal() {
    com.anylogic.libraries.pedestrian.PedSink<Agent> _result_xjal = new com.anylogic.libraries.pedestrian.PedSink<Agent>( getEngine(), this, null );
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_MQimpatient_xjal( final com.anylogic.libraries.pedestrian.PedSink<Agent> self, TableInput _t ) {
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_MQimpatient_xjal( com.anylogic.libraries.pedestrian.PedSink<Agent> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.pedestrian.PedWait<Agent> instantiate_BQqueue_xjal() {
    com.anylogic.libraries.pedestrian.PedWait<Agent> _result_xjal = new com.anylogic.libraries.pedestrian.PedWait<Agent>( getEngine(), this, null ) {
      @Override
      public AreaNode<?> locationNode( Agent ped ) {
        return _BQqueue_locationNode_xjal( this, ped );
      }
      @Override
      public double delayTimeout( Agent ped ) {
        return _BQqueue_delayTimeout_xjal( this, ped );
      }

      @AnyLogicInternalCodegenAPI
      public TimeUnits getUnitsForCodeOf_delayTimeout() {
        return SECOND;
      }
	};
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_BQqueue_xjal( final com.anylogic.libraries.pedestrian.PedWait<Agent> self, TableInput _t ) {
    self.locationType = self._locationType_DefaultValue_xjal();
    self.attractorChoice = self._attractorChoice_DefaultValue_xjal();
    self.delayType = self._delayType_DefaultValue_xjal();
    self.waitForGroup = self._waitForGroup_DefaultValue_xjal();
    self.delayStartsWhen = self._delayStartsWhen_DefaultValue_xjal();
    self.maximumCapacity = self._maximumCapacity_DefaultValue_xjal();
    self.capacity = self._capacity_DefaultValue_xjal();
    self.targetReachTolerance = self._targetReachTolerance_DefaultValue_xjal();
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_BQqueue_xjal( com.anylogic.libraries.pedestrian.PedWait<Agent> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.pedestrian.PedSelectOutput<Agent> instantiate_BQpatience_xjal() {
    com.anylogic.libraries.pedestrian.PedSelectOutput<Agent> _result_xjal = new com.anylogic.libraries.pedestrian.PedSelectOutput<Agent>( getEngine(), this, null ) {
      @Override
      public boolean condition1( Agent ped ) {
        return _BQpatience_condition1_xjal( this, ped );
      }
      @Override
      public boolean condition2( Agent ped ) {
        return _BQpatience_condition2_xjal( this, ped );
      }
	};
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_BQpatience_xjal( final com.anylogic.libraries.pedestrian.PedSelectOutput<Agent> self, TableInput _t ) {
    self.type = 
self.TYPE_CONDITIONS 
;
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_BQpatience_xjal( com.anylogic.libraries.pedestrian.PedSelectOutput<Agent> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.pedestrian.PedSink<Agent> instantiate_BQimpatient_xjal() {
    com.anylogic.libraries.pedestrian.PedSink<Agent> _result_xjal = new com.anylogic.libraries.pedestrian.PedSink<Agent>( getEngine(), this, null );
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_BQimpatient_xjal( final com.anylogic.libraries.pedestrian.PedSink<Agent> self, TableInput _t ) {
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_BQimpatient_xjal( com.anylogic.libraries.pedestrian.PedSink<Agent> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.pedestrian.PedSelectOutput<Agent> instantiate_BMpatience_xjal() {
    com.anylogic.libraries.pedestrian.PedSelectOutput<Agent> _result_xjal = new com.anylogic.libraries.pedestrian.PedSelectOutput<Agent>( getEngine(), this, null ) {
      @Override
      public boolean condition1( Agent ped ) {
        return _BMpatience_condition1_xjal( this, ped );
      }
      @Override
      public boolean condition2( Agent ped ) {
        return _BMpatience_condition2_xjal( this, ped );
      }
	};
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_BMpatience_xjal( final com.anylogic.libraries.pedestrian.PedSelectOutput<Agent> self, TableInput _t ) {
    self.type = 
self.TYPE_CONDITIONS 
;
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_BMpatience_xjal( com.anylogic.libraries.pedestrian.PedSelectOutput<Agent> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.pedestrian.PedWait<Agent> instantiate_BMqueue_xjal() {
    com.anylogic.libraries.pedestrian.PedWait<Agent> _result_xjal = new com.anylogic.libraries.pedestrian.PedWait<Agent>( getEngine(), this, null ) {
      @Override
      public AreaNode<?> locationNode( Agent ped ) {
        return _BMqueue_locationNode_xjal( this, ped );
      }
      @Override
      public double delayTimeout( Agent ped ) {
        return _BMqueue_delayTimeout_xjal( this, ped );
      }

      @AnyLogicInternalCodegenAPI
      public TimeUnits getUnitsForCodeOf_delayTimeout() {
        return SECOND;
      }
	};
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_BMqueue_xjal( final com.anylogic.libraries.pedestrian.PedWait<Agent> self, TableInput _t ) {
    self.locationType = self._locationType_DefaultValue_xjal();
    self.attractorChoice = self._attractorChoice_DefaultValue_xjal();
    self.delayType = self._delayType_DefaultValue_xjal();
    self.waitForGroup = self._waitForGroup_DefaultValue_xjal();
    self.delayStartsWhen = self._delayStartsWhen_DefaultValue_xjal();
    self.maximumCapacity = self._maximumCapacity_DefaultValue_xjal();
    self.capacity = self._capacity_DefaultValue_xjal();
    self.targetReachTolerance = self._targetReachTolerance_DefaultValue_xjal();
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_BMqueue_xjal( com.anylogic.libraries.pedestrian.PedWait<Agent> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.pedestrian.PedSink<Agent> instantiate_BMimpatient_xjal() {
    com.anylogic.libraries.pedestrian.PedSink<Agent> _result_xjal = new com.anylogic.libraries.pedestrian.PedSink<Agent>( getEngine(), this, null );
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_BMimpatient_xjal( final com.anylogic.libraries.pedestrian.PedSink<Agent> self, TableInput _t ) {
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_BMimpatient_xjal( com.anylogic.libraries.pedestrian.PedSink<Agent> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.pedestrian.PedSelectOutput<Agent> instantiate_QMpatience_xjal() {
    com.anylogic.libraries.pedestrian.PedSelectOutput<Agent> _result_xjal = new com.anylogic.libraries.pedestrian.PedSelectOutput<Agent>( getEngine(), this, null ) {
      @Override
      public boolean condition1( Agent ped ) {
        return _QMpatience_condition1_xjal( this, ped );
      }
      @Override
      public boolean condition2( Agent ped ) {
        return _QMpatience_condition2_xjal( this, ped );
      }
	};
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_QMpatience_xjal( final com.anylogic.libraries.pedestrian.PedSelectOutput<Agent> self, TableInput _t ) {
    self.type = 
self.TYPE_CONDITIONS 
;
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_QMpatience_xjal( com.anylogic.libraries.pedestrian.PedSelectOutput<Agent> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.pedestrian.PedWait<Agent> instantiate_QMqueue_xjal() {
    com.anylogic.libraries.pedestrian.PedWait<Agent> _result_xjal = new com.anylogic.libraries.pedestrian.PedWait<Agent>( getEngine(), this, null ) {
      @Override
      public AreaNode<?> locationNode( Agent ped ) {
        return _QMqueue_locationNode_xjal( this, ped );
      }
      @Override
      public double delayTimeout( Agent ped ) {
        return _QMqueue_delayTimeout_xjal( this, ped );
      }

      @AnyLogicInternalCodegenAPI
      public TimeUnits getUnitsForCodeOf_delayTimeout() {
        return SECOND;
      }
	};
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_QMqueue_xjal( final com.anylogic.libraries.pedestrian.PedWait<Agent> self, TableInput _t ) {
    self.locationType = self._locationType_DefaultValue_xjal();
    self.attractorChoice = self._attractorChoice_DefaultValue_xjal();
    self.delayType = self._delayType_DefaultValue_xjal();
    self.waitForGroup = self._waitForGroup_DefaultValue_xjal();
    self.delayStartsWhen = self._delayStartsWhen_DefaultValue_xjal();
    self.maximumCapacity = self._maximumCapacity_DefaultValue_xjal();
    self.capacity = self._capacity_DefaultValue_xjal();
    self.targetReachTolerance = self._targetReachTolerance_DefaultValue_xjal();
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_QMqueue_xjal( com.anylogic.libraries.pedestrian.PedWait<Agent> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.pedestrian.PedSink<Agent> instantiate_QMimpatient_xjal() {
    com.anylogic.libraries.pedestrian.PedSink<Agent> _result_xjal = new com.anylogic.libraries.pedestrian.PedSink<Agent>( getEngine(), this, null );
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_QMimpatient_xjal( final com.anylogic.libraries.pedestrian.PedSink<Agent> self, TableInput _t ) {
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_QMimpatient_xjal( com.anylogic.libraries.pedestrian.PedSink<Agent> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.pedestrian.PedSelectOutput<Agent> instantiate_QBpatience_xjal() {
    com.anylogic.libraries.pedestrian.PedSelectOutput<Agent> _result_xjal = new com.anylogic.libraries.pedestrian.PedSelectOutput<Agent>( getEngine(), this, null ) {
      @Override
      public boolean condition1( Agent ped ) {
        return _QBpatience_condition1_xjal( this, ped );
      }
      @Override
      public boolean condition2( Agent ped ) {
        return _QBpatience_condition2_xjal( this, ped );
      }
	};
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_QBpatience_xjal( final com.anylogic.libraries.pedestrian.PedSelectOutput<Agent> self, TableInput _t ) {
    self.type = 
self.TYPE_CONDITIONS 
;
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_QBpatience_xjal( com.anylogic.libraries.pedestrian.PedSelectOutput<Agent> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.pedestrian.PedWait<Agent> instantiate_QBqueue_xjal() {
    com.anylogic.libraries.pedestrian.PedWait<Agent> _result_xjal = new com.anylogic.libraries.pedestrian.PedWait<Agent>( getEngine(), this, null ) {
      @Override
      public AreaNode<?> locationNode( Agent ped ) {
        return _QBqueue_locationNode_xjal( this, ped );
      }
      @Override
      public double delayTimeout( Agent ped ) {
        return _QBqueue_delayTimeout_xjal( this, ped );
      }

      @AnyLogicInternalCodegenAPI
      public TimeUnits getUnitsForCodeOf_delayTimeout() {
        return SECOND;
      }
	};
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_QBqueue_xjal( final com.anylogic.libraries.pedestrian.PedWait<Agent> self, TableInput _t ) {
    self.locationType = self._locationType_DefaultValue_xjal();
    self.attractorChoice = self._attractorChoice_DefaultValue_xjal();
    self.delayType = self._delayType_DefaultValue_xjal();
    self.waitForGroup = self._waitForGroup_DefaultValue_xjal();
    self.delayStartsWhen = self._delayStartsWhen_DefaultValue_xjal();
    self.maximumCapacity = self._maximumCapacity_DefaultValue_xjal();
    self.capacity = self._capacity_DefaultValue_xjal();
    self.targetReachTolerance = self._targetReachTolerance_DefaultValue_xjal();
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_QBqueue_xjal( com.anylogic.libraries.pedestrian.PedWait<Agent> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.pedestrian.PedSink<Agent> instantiate_QBimpatient_xjal() {
    com.anylogic.libraries.pedestrian.PedSink<Agent> _result_xjal = new com.anylogic.libraries.pedestrian.PedSink<Agent>( getEngine(), this, null );
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_QBimpatient_xjal( final com.anylogic.libraries.pedestrian.PedSink<Agent> self, TableInput _t ) {
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_QBimpatient_xjal( com.anylogic.libraries.pedestrian.PedSink<Agent> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.pedestrian.PedSelectOutput<Agent> instantiate_MBpatience_xjal() {
    com.anylogic.libraries.pedestrian.PedSelectOutput<Agent> _result_xjal = new com.anylogic.libraries.pedestrian.PedSelectOutput<Agent>( getEngine(), this, null ) {
      @Override
      public boolean condition1( Agent ped ) {
        return _MBpatience_condition1_xjal( this, ped );
      }
      @Override
      public boolean condition2( Agent ped ) {
        return _MBpatience_condition2_xjal( this, ped );
      }
	};
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_MBpatience_xjal( final com.anylogic.libraries.pedestrian.PedSelectOutput<Agent> self, TableInput _t ) {
    self.type = 
self.TYPE_CONDITIONS 
;
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_MBpatience_xjal( com.anylogic.libraries.pedestrian.PedSelectOutput<Agent> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.pedestrian.PedWait<Agent> instantiate_MBqueue_xjal() {
    com.anylogic.libraries.pedestrian.PedWait<Agent> _result_xjal = new com.anylogic.libraries.pedestrian.PedWait<Agent>( getEngine(), this, null ) {
      @Override
      public AreaNode<?> locationNode( Agent ped ) {
        return _MBqueue_locationNode_xjal( this, ped );
      }
      @Override
      public double delayTimeout( Agent ped ) {
        return _MBqueue_delayTimeout_xjal( this, ped );
      }

      @AnyLogicInternalCodegenAPI
      public TimeUnits getUnitsForCodeOf_delayTimeout() {
        return SECOND;
      }
	};
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_MBqueue_xjal( final com.anylogic.libraries.pedestrian.PedWait<Agent> self, TableInput _t ) {
    self.locationType = self._locationType_DefaultValue_xjal();
    self.attractorChoice = self._attractorChoice_DefaultValue_xjal();
    self.delayType = self._delayType_DefaultValue_xjal();
    self.waitForGroup = self._waitForGroup_DefaultValue_xjal();
    self.delayStartsWhen = self._delayStartsWhen_DefaultValue_xjal();
    self.maximumCapacity = self._maximumCapacity_DefaultValue_xjal();
    self.capacity = self._capacity_DefaultValue_xjal();
    self.targetReachTolerance = self._targetReachTolerance_DefaultValue_xjal();
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_MBqueue_xjal( com.anylogic.libraries.pedestrian.PedWait<Agent> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.pedestrian.PedSink<Agent> instantiate_MBimpatient_xjal() {
    com.anylogic.libraries.pedestrian.PedSink<Agent> _result_xjal = new com.anylogic.libraries.pedestrian.PedSink<Agent>( getEngine(), this, null );
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_MBimpatient_xjal( final com.anylogic.libraries.pedestrian.PedSink<Agent> self, TableInput _t ) {
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_MBimpatient_xjal( com.anylogic.libraries.pedestrian.PedSink<Agent> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.pedestrian.PedSource<Agent> instantiate_FlightCountSo_xjal() {
    com.anylogic.libraries.pedestrian.PedSource<Agent> _result_xjal = new com.anylogic.libraries.pedestrian.PedSource<Agent>( getEngine(), this, null ) {
      @Override
      public TargetLine locationLine( Agent ped ) {
        return _FlightCountSo_locationLine_xjal( this, ped );
      }
	};
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_FlightCountSo_xjal( final com.anylogic.libraries.pedestrian.PedSource<Agent> self, TableInput _t ) {
    self.locationType = self._locationType_DefaultValue_xjal();
    self.arrivalType = 
self.MANUAL 
;
    self.rate = self._rate_DefaultValue_xjal();
    self.rateSchedule = self._rateSchedule_DefaultValue_xjal();
    self.modifyRate = self._modifyRate_DefaultValue_xjal();
    self.arrivalSchedule = self._arrivalSchedule_DefaultValue_xjal();
    self.limitArrivals = self._limitArrivals_DefaultValue_xjal();
    self.maxArrivals = self._maxArrivals_DefaultValue_xjal();
    self.createGroups = self._createGroups_DefaultValue_xjal();
    self.groupFormation = self._groupFormation_DefaultValue_xjal();
    self.serviceGroupBehavior = self._serviceGroupBehavior_DefaultValue_xjal();
    self.solidCancelling = self._solidCancelling_DefaultValue_xjal();
    self.addToCustomPopulation = self._addToCustomPopulation_DefaultValue_xjal();
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_FlightCountSo_xjal( com.anylogic.libraries.pedestrian.PedSource<Agent> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.pedestrian.PedSink<Agent> instantiate_FlightCountSi_xjal() {
    com.anylogic.libraries.pedestrian.PedSink<Agent> _result_xjal = new com.anylogic.libraries.pedestrian.PedSink<Agent>( getEngine(), this, null );
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_FlightCountSi_xjal( final com.anylogic.libraries.pedestrian.PedSink<Agent> self, TableInput _t ) {
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_FlightCountSi_xjal( com.anylogic.libraries.pedestrian.PedSink<Agent> self, TableInput _t ) {
  }

  private AreaNode<?> _MBsource_locationNode_xjal( final com.anylogic.libraries.pedestrian.PedSource<Agent> self, Agent ped ) {
    AreaNode<?> _value;
    _value = 
MBarea 
;
    return _value;
  }
  private AreaNode<?> _MQdepart_locationNode_xjal( final com.anylogic.libraries.pedestrian.PedGoTo<Agent> self, Agent ped ) {
    AreaNode<?> _value;
    _value = 
Queens 
;
    return _value;
  }
  private AreaNode<?> _MQstep_locationNode_xjal( final com.anylogic.libraries.pedestrian.PedWait<Agent> self, Agent ped ) {
    AreaNode<?> _value;
    _value = 
Manhatten 
;
    return _value;
  }
  private TargetLine _MchargeSo_locationLine_xjal( final com.anylogic.libraries.pedestrian.PedSource<Agent> self, Agent ped ) {
    TargetLine _value;
    _value = 
MA 
;
    return _value;
  }
  private TargetLine _MCharge_locationLine_xjal( final com.anylogic.libraries.pedestrian.PedWait<Agent> self, Agent ped ) {
    TargetLine _value;
    _value = 
MB 
;
    return _value;
  }
  private double _MCharge_delayTimeout_xjal( final com.anylogic.libraries.pedestrian.PedWait<Agent> self, Agent ped ) {
    double _value;
    _value = 
5 
;
    _value = MINUTE.convertTo( _value, SECOND );
    return _value;
  }
  private void _MCharge_onExit_xjal( final com.anylogic.libraries.pedestrian.PedWait<Agent> self, Agent ped ) {
    
MQstep.freeAll();
MBstep.freeAll(); 
;
  }
  private void _MchargeSi_onEnter_xjal( final com.anylogic.libraries.pedestrian.PedSink<Agent> self, Agent ped ) {
    
MchargeSo.inject();
FlightCountSo.inject(); 
;
  }
  private AreaNode<?> _BQdepart_locationNode_xjal( final com.anylogic.libraries.pedestrian.PedGoTo<Agent> self, Agent ped ) {
    AreaNode<?> _value;
    _value = 
Queens 
;
    return _value;
  }
  private AreaNode<?> _BQstep_locationNode_xjal( final com.anylogic.libraries.pedestrian.PedWait<Agent> self, Agent ped ) {
    AreaNode<?> _value;
    _value = 
Brooklyn 
;
    return _value;
  }
  private double _MBchoose_probability1_xjal( final com.anylogic.libraries.pedestrian.PedSelectOutput<Agent> self, Agent ped ) {
    double _value;
    _value = 
0.6 
;
    return _value;
  }
  private double _MBchoose_probability2_xjal( final com.anylogic.libraries.pedestrian.PedSelectOutput<Agent> self, Agent ped ) {
    double _value;
    _value = 
0.4 
;
    return _value;
  }
  private double _MBchoose_probability3_xjal( final com.anylogic.libraries.pedestrian.PedSelectOutput<Agent> self, Agent ped ) {
    double _value;
    _value = 
0 
;
    return _value;
  }
  private double _MBchoose_probability4_xjal( final com.anylogic.libraries.pedestrian.PedSelectOutput<Agent> self, Agent ped ) {
    double _value;
    _value = 
0 
;
    return _value;
  }
  private double _MBchoose_probability5_xjal( final com.anylogic.libraries.pedestrian.PedSelectOutput<Agent> self, Agent ped ) {
    double _value;
    _value = 
0 
;
    return _value;
  }
  private AreaNode<?> _BQsource_locationNode_xjal( final com.anylogic.libraries.pedestrian.PedSource<Agent> self, Agent ped ) {
    AreaNode<?> _value;
    _value = 
BQarea 
;
    return _value;
  }
  private AreaNode<?> _BMdepart_locationNode_xjal( final com.anylogic.libraries.pedestrian.PedGoTo<Agent> self, Agent ped ) {
    AreaNode<?> _value;
    _value = 
Manhatten 
;
    return _value;
  }
  private AreaNode<?> _BMstep_locationNode_xjal( final com.anylogic.libraries.pedestrian.PedWait<Agent> self, Agent ped ) {
    AreaNode<?> _value;
    _value = 
Brooklyn 
;
    return _value;
  }
  private AreaNode<?> _QMdepart_locationNode_xjal( final com.anylogic.libraries.pedestrian.PedGoTo<Agent> self, Agent ped ) {
    AreaNode<?> _value;
    _value = 
Manhatten 
;
    return _value;
  }
  private AreaNode<?> _QMstep_locationNode_xjal( final com.anylogic.libraries.pedestrian.PedWait<Agent> self, Agent ped ) {
    AreaNode<?> _value;
    _value = 
Queens 
;
    return _value;
  }
  private double _BQchoose_probability1_xjal( final com.anylogic.libraries.pedestrian.PedSelectOutput<Agent> self, Agent ped ) {
    double _value;
    _value = 
0.6 
;
    return _value;
  }
  private double _BQchoose_probability2_xjal( final com.anylogic.libraries.pedestrian.PedSelectOutput<Agent> self, Agent ped ) {
    double _value;
    _value = 
0.4 
;
    return _value;
  }
  private double _BQchoose_probability3_xjal( final com.anylogic.libraries.pedestrian.PedSelectOutput<Agent> self, Agent ped ) {
    double _value;
    _value = 
0 
;
    return _value;
  }
  private double _BQchoose_probability4_xjal( final com.anylogic.libraries.pedestrian.PedSelectOutput<Agent> self, Agent ped ) {
    double _value;
    _value = 
0 
;
    return _value;
  }
  private double _BQchoose_probability5_xjal( final com.anylogic.libraries.pedestrian.PedSelectOutput<Agent> self, Agent ped ) {
    double _value;
    _value = 
0 
;
    return _value;
  }
  private AreaNode<?> _QMsource_locationNode_xjal( final com.anylogic.libraries.pedestrian.PedSource<Agent> self, Agent ped ) {
    AreaNode<?> _value;
    _value = 
QMarea 
;
    return _value;
  }
  private AreaNode<?> _QBdepart_locationNode_xjal( final com.anylogic.libraries.pedestrian.PedGoTo<Agent> self, Agent ped ) {
    AreaNode<?> _value;
    _value = 
Brooklyn 
;
    return _value;
  }
  private AreaNode<?> _QBstep_locationNode_xjal( final com.anylogic.libraries.pedestrian.PedWait<Agent> self, Agent ped ) {
    AreaNode<?> _value;
    _value = 
Queens 
;
    return _value;
  }
  private AreaNode<?> _MBdepart_locationNode_xjal( final com.anylogic.libraries.pedestrian.PedGoTo<Agent> self, Agent ped ) {
    AreaNode<?> _value;
    _value = 
Brooklyn 
;
    return _value;
  }
  private AreaNode<?> _MBstep_locationNode_xjal( final com.anylogic.libraries.pedestrian.PedWait<Agent> self, Agent ped ) {
    AreaNode<?> _value;
    _value = 
Manhatten 
;
    return _value;
  }
  private double _QMchoose_probability1_xjal( final com.anylogic.libraries.pedestrian.PedSelectOutput<Agent> self, Agent ped ) {
    double _value;
    _value = 
0.6 
;
    return _value;
  }
  private double _QMchoose_probability2_xjal( final com.anylogic.libraries.pedestrian.PedSelectOutput<Agent> self, Agent ped ) {
    double _value;
    _value = 
0.4 
;
    return _value;
  }
  private double _QMchoose_probability3_xjal( final com.anylogic.libraries.pedestrian.PedSelectOutput<Agent> self, Agent ped ) {
    double _value;
    _value = 
0 
;
    return _value;
  }
  private double _QMchoose_probability4_xjal( final com.anylogic.libraries.pedestrian.PedSelectOutput<Agent> self, Agent ped ) {
    double _value;
    _value = 
0 
;
    return _value;
  }
  private double _QMchoose_probability5_xjal( final com.anylogic.libraries.pedestrian.PedSelectOutput<Agent> self, Agent ped ) {
    double _value;
    _value = 
0 
;
    return _value;
  }
  private TargetLine _TriggerSo_locationLine_xjal( final com.anylogic.libraries.pedestrian.PedSource<Agent> self, Agent ped ) {
    TargetLine _value;
    _value = 
SimTrigger 
;
    return _value;
  }
  private void _TriggerSo_onExit_xjal( final com.anylogic.libraries.pedestrian.PedSource<Agent> self, Agent ped ) {
    
MchargeSo.inject();
BchargeSo.inject();
QchargeSo.inject(); 
;
  }
  private double _MCheck_probability1_xjal( final com.anylogic.libraries.pedestrian.PedSelectOutput<Agent> self, Agent ped ) {
    double _value;
    _value = 
0.95 
;
    return _value;
  }
  private double _MCheck_probability2_xjal( final com.anylogic.libraries.pedestrian.PedSelectOutput<Agent> self, Agent ped ) {
    double _value;
    _value = 
0.05 
;
    return _value;
  }
  private double _MCheck_probability3_xjal( final com.anylogic.libraries.pedestrian.PedSelectOutput<Agent> self, Agent ped ) {
    double _value;
    _value = 
0 
;
    return _value;
  }
  private double _MCheck_probability4_xjal( final com.anylogic.libraries.pedestrian.PedSelectOutput<Agent> self, Agent ped ) {
    double _value;
    _value = 
0 
;
    return _value;
  }
  private double _MCheck_probability5_xjal( final com.anylogic.libraries.pedestrian.PedSelectOutput<Agent> self, Agent ped ) {
    double _value;
    _value = 
0 
;
    return _value;
  }
  private TargetLine _MMaintenance_locationLine_xjal( final com.anylogic.libraries.pedestrian.PedWait<Agent> self, Agent ped ) {
    TargetLine _value;
    _value = 
MB 
;
    return _value;
  }
  private double _MMaintenance_delayTimeout_xjal( final com.anylogic.libraries.pedestrian.PedWait<Agent> self, Agent ped ) {
    double _value;
    _value = 
35 
;
    _value = MINUTE.convertTo( _value, SECOND );
    return _value;
  }
  private void _MMaintenance_onExit_xjal( final com.anylogic.libraries.pedestrian.PedWait<Agent> self, Agent ped ) {
    
MQstep.freeAll();
MBstep.freeAll(); 
;
  }
  private TargetLine _BchargeSo_locationLine_xjal( final com.anylogic.libraries.pedestrian.PedSource<Agent> self, Agent ped ) {
    TargetLine _value;
    _value = 
BA 
;
    return _value;
  }
  private TargetLine _BCharge_locationLine_xjal( final com.anylogic.libraries.pedestrian.PedWait<Agent> self, Agent ped ) {
    TargetLine _value;
    _value = 
BB 
;
    return _value;
  }
  private double _BCharge_delayTimeout_xjal( final com.anylogic.libraries.pedestrian.PedWait<Agent> self, Agent ped ) {
    double _value;
    _value = 
5 
;
    _value = MINUTE.convertTo( _value, SECOND );
    return _value;
  }
  private void _BCharge_onExit_xjal( final com.anylogic.libraries.pedestrian.PedWait<Agent> self, Agent ped ) {
    
BQstep.freeAll();
BMstep.freeAll(); 
;
  }
  private void _BchargeSi_onEnter_xjal( final com.anylogic.libraries.pedestrian.PedSink<Agent> self, Agent ped ) {
    
BchargeSo.inject();
FlightCountSo.inject(); 
;
  }
  private double _BCheck_probability1_xjal( final com.anylogic.libraries.pedestrian.PedSelectOutput<Agent> self, Agent ped ) {
    double _value;
    _value = 
0.95 
;
    return _value;
  }
  private double _BCheck_probability2_xjal( final com.anylogic.libraries.pedestrian.PedSelectOutput<Agent> self, Agent ped ) {
    double _value;
    _value = 
0.05 
;
    return _value;
  }
  private double _BCheck_probability3_xjal( final com.anylogic.libraries.pedestrian.PedSelectOutput<Agent> self, Agent ped ) {
    double _value;
    _value = 
0 
;
    return _value;
  }
  private double _BCheck_probability4_xjal( final com.anylogic.libraries.pedestrian.PedSelectOutput<Agent> self, Agent ped ) {
    double _value;
    _value = 
0 
;
    return _value;
  }
  private double _BCheck_probability5_xjal( final com.anylogic.libraries.pedestrian.PedSelectOutput<Agent> self, Agent ped ) {
    double _value;
    _value = 
0 
;
    return _value;
  }
  private TargetLine _BMaintenance_locationLine_xjal( final com.anylogic.libraries.pedestrian.PedWait<Agent> self, Agent ped ) {
    TargetLine _value;
    _value = 
BB 
;
    return _value;
  }
  private double _BMaintenance_delayTimeout_xjal( final com.anylogic.libraries.pedestrian.PedWait<Agent> self, Agent ped ) {
    double _value;
    _value = 
35 
;
    _value = MINUTE.convertTo( _value, SECOND );
    return _value;
  }
  private void _BMaintenance_onExit_xjal( final com.anylogic.libraries.pedestrian.PedWait<Agent> self, Agent ped ) {
    
BQstep.freeAll();
BMstep.freeAll(); 
;
  }
  private TargetLine _QchargeSo_locationLine_xjal( final com.anylogic.libraries.pedestrian.PedSource<Agent> self, Agent ped ) {
    TargetLine _value;
    _value = 
QA 
;
    return _value;
  }
  private TargetLine _QCharge_locationLine_xjal( final com.anylogic.libraries.pedestrian.PedWait<Agent> self, Agent ped ) {
    TargetLine _value;
    _value = 
QB 
;
    return _value;
  }
  private double _QCharge_delayTimeout_xjal( final com.anylogic.libraries.pedestrian.PedWait<Agent> self, Agent ped ) {
    double _value;
    _value = 
5 
;
    _value = MINUTE.convertTo( _value, SECOND );
    return _value;
  }
  private void _QCharge_onExit_xjal( final com.anylogic.libraries.pedestrian.PedWait<Agent> self, Agent ped ) {
    
QMstep.freeAll();
QBstep.freeAll(); 
;
  }
  private void _QchargeSi_onEnter_xjal( final com.anylogic.libraries.pedestrian.PedSink<Agent> self, Agent ped ) {
    
QchargeSo.inject();
FlightCountSo.inject(); 
;
  }
  private double _QCheck_probability1_xjal( final com.anylogic.libraries.pedestrian.PedSelectOutput<Agent> self, Agent ped ) {
    double _value;
    _value = 
0.95 
;
    return _value;
  }
  private double _QCheck_probability2_xjal( final com.anylogic.libraries.pedestrian.PedSelectOutput<Agent> self, Agent ped ) {
    double _value;
    _value = 
0.05 
;
    return _value;
  }
  private double _QCheck_probability3_xjal( final com.anylogic.libraries.pedestrian.PedSelectOutput<Agent> self, Agent ped ) {
    double _value;
    _value = 
0 
;
    return _value;
  }
  private double _QCheck_probability4_xjal( final com.anylogic.libraries.pedestrian.PedSelectOutput<Agent> self, Agent ped ) {
    double _value;
    _value = 
0 
;
    return _value;
  }
  private double _QCheck_probability5_xjal( final com.anylogic.libraries.pedestrian.PedSelectOutput<Agent> self, Agent ped ) {
    double _value;
    _value = 
0 
;
    return _value;
  }
  private TargetLine _QMaintenance_locationLine_xjal( final com.anylogic.libraries.pedestrian.PedWait<Agent> self, Agent ped ) {
    TargetLine _value;
    _value = 
QB 
;
    return _value;
  }
  private double _QMaintenance_delayTimeout_xjal( final com.anylogic.libraries.pedestrian.PedWait<Agent> self, Agent ped ) {
    double _value;
    _value = 
35 
;
    _value = MINUTE.convertTo( _value, SECOND );
    return _value;
  }
  private void _QMaintenance_onExit_xjal( final com.anylogic.libraries.pedestrian.PedWait<Agent> self, Agent ped ) {
    
QMstep.freeAll();
QBstep.freeAll(); 
;
  }
  private TargetLine _MQfly_locationLine_xjal( final com.anylogic.libraries.pedestrian.PedWait<Agent> self, Agent ped ) {
    TargetLine _value;
    _value = 
MQroute 
;
    return _value;
  }
  private double _MQfly_delayTimeout_xjal( final com.anylogic.libraries.pedestrian.PedWait<Agent> self, Agent ped ) {
    double _value;
    _value = 
15 
;
    _value = MINUTE.convertTo( _value, SECOND );
    return _value;
  }
  private TargetLine _BQfly_locationLine_xjal( final com.anylogic.libraries.pedestrian.PedWait<Agent> self, Agent ped ) {
    TargetLine _value;
    _value = 
BQroute 
;
    return _value;
  }
  private double _BQfly_delayTimeout_xjal( final com.anylogic.libraries.pedestrian.PedWait<Agent> self, Agent ped ) {
    double _value;
    _value = 
12.6 
;
    _value = MINUTE.convertTo( _value, SECOND );
    return _value;
  }
  private TargetLine _BMfly_locationLine_xjal( final com.anylogic.libraries.pedestrian.PedWait<Agent> self, Agent ped ) {
    TargetLine _value;
    _value = 
BMroute 
;
    return _value;
  }
  private double _BMfly_delayTimeout_xjal( final com.anylogic.libraries.pedestrian.PedWait<Agent> self, Agent ped ) {
    double _value;
    _value = 
15 
;
    _value = MINUTE.convertTo( _value, SECOND );
    return _value;
  }
  private AreaNode<?> _MQqueue_locationNode_xjal( final com.anylogic.libraries.pedestrian.PedWait<Agent> self, Agent ped ) {
    AreaNode<?> _value;
    _value = 
Manhatten 
;
    return _value;
  }
  private double _MQqueue_delayTimeout_xjal( final com.anylogic.libraries.pedestrian.PedWait<Agent> self, Agent ped ) {
    double _value;
    _value = 
0 
;
    return _value;
  }
  private boolean _MQpatience_condition1_xjal( final com.anylogic.libraries.pedestrian.PedSelectOutput<Agent> self, Agent ped ) {
    boolean _value;
    _value = 
MQqueue.size() < 9 
;
    return _value;
  }
  private boolean _MQpatience_condition2_xjal( final com.anylogic.libraries.pedestrian.PedSelectOutput<Agent> self, Agent ped ) {
    boolean _value;
    _value = 
randomTrue(1) 
;
    return _value;
  }
  private AreaNode<?> _BQqueue_locationNode_xjal( final com.anylogic.libraries.pedestrian.PedWait<Agent> self, Agent ped ) {
    AreaNode<?> _value;
    _value = 
Brooklyn 
;
    return _value;
  }
  private double _BQqueue_delayTimeout_xjal( final com.anylogic.libraries.pedestrian.PedWait<Agent> self, Agent ped ) {
    double _value;
    _value = 
0 
;
    return _value;
  }
  private boolean _BQpatience_condition1_xjal( final com.anylogic.libraries.pedestrian.PedSelectOutput<Agent> self, Agent ped ) {
    boolean _value;
    _value = 
BQqueue.size() < 9 
;
    return _value;
  }
  private boolean _BQpatience_condition2_xjal( final com.anylogic.libraries.pedestrian.PedSelectOutput<Agent> self, Agent ped ) {
    boolean _value;
    _value = 
randomTrue(1) 
;
    return _value;
  }
  private boolean _BMpatience_condition1_xjal( final com.anylogic.libraries.pedestrian.PedSelectOutput<Agent> self, Agent ped ) {
    boolean _value;
    _value = 
BMqueue.size() < 27 
;
    return _value;
  }
  private boolean _BMpatience_condition2_xjal( final com.anylogic.libraries.pedestrian.PedSelectOutput<Agent> self, Agent ped ) {
    boolean _value;
    _value = 
randomTrue(1) 
;
    return _value;
  }
  private AreaNode<?> _BMqueue_locationNode_xjal( final com.anylogic.libraries.pedestrian.PedWait<Agent> self, Agent ped ) {
    AreaNode<?> _value;
    _value = 
Brooklyn 
;
    return _value;
  }
  private double _BMqueue_delayTimeout_xjal( final com.anylogic.libraries.pedestrian.PedWait<Agent> self, Agent ped ) {
    double _value;
    _value = 
0 
;
    return _value;
  }
  private boolean _QMpatience_condition1_xjal( final com.anylogic.libraries.pedestrian.PedSelectOutput<Agent> self, Agent ped ) {
    boolean _value;
    _value = 
QMqueue.size() < 9 
;
    return _value;
  }
  private boolean _QMpatience_condition2_xjal( final com.anylogic.libraries.pedestrian.PedSelectOutput<Agent> self, Agent ped ) {
    boolean _value;
    _value = 
randomTrue(1) 
;
    return _value;
  }
  private AreaNode<?> _QMqueue_locationNode_xjal( final com.anylogic.libraries.pedestrian.PedWait<Agent> self, Agent ped ) {
    AreaNode<?> _value;
    _value = 
Queens 
;
    return _value;
  }
  private double _QMqueue_delayTimeout_xjal( final com.anylogic.libraries.pedestrian.PedWait<Agent> self, Agent ped ) {
    double _value;
    _value = 
0 
;
    return _value;
  }
  private boolean _QBpatience_condition1_xjal( final com.anylogic.libraries.pedestrian.PedSelectOutput<Agent> self, Agent ped ) {
    boolean _value;
    _value = 
QBqueue.size() < 9 
;
    return _value;
  }
  private boolean _QBpatience_condition2_xjal( final com.anylogic.libraries.pedestrian.PedSelectOutput<Agent> self, Agent ped ) {
    boolean _value;
    _value = 
randomTrue(1) 
;
    return _value;
  }
  private AreaNode<?> _QBqueue_locationNode_xjal( final com.anylogic.libraries.pedestrian.PedWait<Agent> self, Agent ped ) {
    AreaNode<?> _value;
    _value = 
Queens 
;
    return _value;
  }
  private double _QBqueue_delayTimeout_xjal( final com.anylogic.libraries.pedestrian.PedWait<Agent> self, Agent ped ) {
    double _value;
    _value = 
0 
;
    return _value;
  }
  private boolean _MBpatience_condition1_xjal( final com.anylogic.libraries.pedestrian.PedSelectOutput<Agent> self, Agent ped ) {
    boolean _value;
    _value = 
MBqueue.size() < 27 
;
    return _value;
  }
  private boolean _MBpatience_condition2_xjal( final com.anylogic.libraries.pedestrian.PedSelectOutput<Agent> self, Agent ped ) {
    boolean _value;
    _value = 
randomTrue(1) 
;
    return _value;
  }
  private AreaNode<?> _MBqueue_locationNode_xjal( final com.anylogic.libraries.pedestrian.PedWait<Agent> self, Agent ped ) {
    AreaNode<?> _value;
    _value = 
Manhatten 
;
    return _value;
  }
  private double _MBqueue_delayTimeout_xjal( final com.anylogic.libraries.pedestrian.PedWait<Agent> self, Agent ped ) {
    double _value;
    _value = 
0 
;
    return _value;
  }
  private TargetLine _FlightCountSo_locationLine_xjal( final com.anylogic.libraries.pedestrian.PedSource<Agent> self, Agent ped ) {
    TargetLine _value;
    _value = 
FCLine 
;
    return _value;
  }
  // View areas
  public ViewArea _origin_VA = new ViewArea( this, "[Origin]", 0, 0, 2160.0, 880.0 );
  @Override
  @AnyLogicInternalCodegenAPI
  public int getViewAreas(Map<String, ViewArea> _output) {
    if ( _output != null ) {
      _output.put( "_origin_VA", this._origin_VA );
    }
    return 1 + super.getViewAreas( _output );
  }
  @AnyLogicInternalCodegenAPI
  protected static final int _MBroute = 1;
  @AnyLogicInternalCodegenAPI
  protected static final int _Manhatten = 2;
  @AnyLogicInternalCodegenAPI
  protected static final int _Brooklyn = 3;
  @AnyLogicInternalCodegenAPI
  protected static final int _MBarea = 4;
  @AnyLogicInternalCodegenAPI
  protected static final int _Queens = 5;
  @AnyLogicInternalCodegenAPI
  protected static final int _MA = 6;
  @AnyLogicInternalCodegenAPI
  protected static final int _MB = 7;
  @AnyLogicInternalCodegenAPI
  protected static final int _BQarea = 8;
  @AnyLogicInternalCodegenAPI
  protected static final int _QMarea = 9;
  @AnyLogicInternalCodegenAPI
  protected static final int _BA = 10;
  @AnyLogicInternalCodegenAPI
  protected static final int _BB = 11;
  @AnyLogicInternalCodegenAPI
  protected static final int _QA = 12;
  @AnyLogicInternalCodegenAPI
  protected static final int _QB = 13;
  @AnyLogicInternalCodegenAPI
  protected static final int _SimTrigger = 14;
  @AnyLogicInternalCodegenAPI
  protected static final int _MQroute = 15;
  @AnyLogicInternalCodegenAPI
  protected static final int _BQroute = 16;
  @AnyLogicInternalCodegenAPI
  protected static final int _BMroute = 17;
  @AnyLogicInternalCodegenAPI
  protected static final int _FCLine = 18;

  /** Internal constant, shouldn't be accessed by user */
  @AnyLogicInternalCodegenAPI
  protected static final int _SHAPE_NEXT_ID_xjal = 19;

  @AnyLogicInternalCodegenAPI
  public boolean isPublicPresentationDefined() {
    return true;
  }

  @AnyLogicInternalCodegenAPI
  public boolean isEmbeddedAgentPresentationVisible( Agent _a ) {
    return super.isEmbeddedAgentPresentationVisible( _a );
  }
  @AnyLogicInternalCodegenAPI
  private void _initialize_level_xjal() {
	  level.addAll(MBroute, Manhatten, Brooklyn, MBarea, Queens, MA, MB, BQarea, QMarea, BA, BB, QA, QB, SimTrigger, MQroute, BQroute, BMroute, FCLine);
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] _MA_pointsDX_xjal() {
    return new double[] { 0.0, 0.0,  };
  }

  @AnyLogicInternalCodegenAPI
  protected static final double[] _MA_pointsDY_xjal() {
    return new double[] { 0.0, 50.0,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] _MB_pointsDX_xjal() {
    return new double[] { 0.0, 0.0,  };
  }

  @AnyLogicInternalCodegenAPI
  protected static final double[] _MB_pointsDY_xjal() {
    return new double[] { 0.0, 50.0,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] _BA_pointsDX_xjal() {
    return new double[] { 0.0, 0.0,  };
  }

  @AnyLogicInternalCodegenAPI
  protected static final double[] _BA_pointsDY_xjal() {
    return new double[] { 0.0, 50.0,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] _BB_pointsDX_xjal() {
    return new double[] { 0.0, 0.0,  };
  }

  @AnyLogicInternalCodegenAPI
  protected static final double[] _BB_pointsDY_xjal() {
    return new double[] { 0.0, 50.0,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] _QA_pointsDX_xjal() {
    return new double[] { 0.0, 0.0,  };
  }

  @AnyLogicInternalCodegenAPI
  protected static final double[] _QA_pointsDY_xjal() {
    return new double[] { 0.0, 50.0,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] _QB_pointsDX_xjal() {
    return new double[] { 0.0, 0.0,  };
  }

  @AnyLogicInternalCodegenAPI
  protected static final double[] _QB_pointsDY_xjal() {
    return new double[] { 0.0, 50.0,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] _SimTrigger_pointsDX_xjal() {
    return new double[] { 0.0, 0.0,  };
  }

  @AnyLogicInternalCodegenAPI
  protected static final double[] _SimTrigger_pointsDY_xjal() {
    return new double[] { 0.0, 50.0,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] _MQroute_pointsDX_xjal() {
    return new double[] { 0.0, -30.0,  };
  }

  @AnyLogicInternalCodegenAPI
  protected static final double[] _MQroute_pointsDY_xjal() {
    return new double[] { 0.0, 50.0,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] _BQroute_pointsDX_xjal() {
    return new double[] { 0.0, 40.0,  };
  }

  @AnyLogicInternalCodegenAPI
  protected static final double[] _BQroute_pointsDY_xjal() {
    return new double[] { 0.0, 40.0,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] _BMroute_pointsDX_xjal() {
    return new double[] { 0.0, -50.0,  };
  }

  @AnyLogicInternalCodegenAPI
  protected static final double[] _BMroute_pointsDY_xjal() {
    return new double[] { 0.0, 0.0,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] _FCLine_pointsDX_xjal() {
    return new double[] { 0.0, 0.0,  };
  }

  @AnyLogicInternalCodegenAPI
  protected static final double[] _FCLine_pointsDY_xjal() {
    return new double[] { 0.0, 50.0,  };
  }

  protected ShapeImage MBroute;
  protected RectangularNode<Agent> Manhatten;
  protected RectangularNode<Agent> Brooklyn;
  protected RectangularNode<Agent> MBarea;
  protected RectangularNode<Agent> Queens;
  protected TargetLine MA;
  protected TargetLine MB;
  protected RectangularNode<Agent> BQarea;
  protected RectangularNode<Agent> QMarea;
  protected TargetLine BA;
  protected TargetLine BB;
  protected TargetLine QA;
  protected TargetLine QB;
  protected TargetLine SimTrigger;
  protected TargetLine MQroute;
  protected TargetLine BQroute;
  protected TargetLine BMroute;
  protected TargetLine FCLine;
  protected com.anylogic.engine.markup.Level level;

  private com.anylogic.engine.markup.Level[] _getLevels_xjal;

  @Override
  public com.anylogic.engine.markup.Level[] getLevels() {
    return _getLevels_xjal;
  }

  @AnyLogicInternalCodegenAPI
  private void _createPersistentElementsBP0_xjal() {
    MBroute = new ShapeImage(
		Main.this, SHAPE_DRAW_2D3D, true, 180.0, 120.0, 0.0, 0.0, 
			690.0, 650.0, "/_6p_h/", 
			new String[]{"New York Map.png",}	 );

    MA = new TargetLine( this, SHAPE_DRAW_2D, true, 910.0, 180.0, _MA_pointsDX_xjal(), _MA_pointsDY_xjal(), green );

    MB = new TargetLine( this, SHAPE_DRAW_2D, true, 930.0, 180.0, _MB_pointsDX_xjal(), _MB_pointsDY_xjal(), green );

    BA = new TargetLine( this, SHAPE_DRAW_2D, true, 910.0, 340.0, _BA_pointsDX_xjal(), _BA_pointsDY_xjal(), green );

    BB = new TargetLine( this, SHAPE_DRAW_2D, true, 930.0, 340.0, _BB_pointsDX_xjal(), _BB_pointsDY_xjal(), green );

    QA = new TargetLine( this, SHAPE_DRAW_2D, true, 910.0, 500.0, _QA_pointsDX_xjal(), _QA_pointsDY_xjal(), green );

    QB = new TargetLine( this, SHAPE_DRAW_2D, true, 930.0, 500.0, _QB_pointsDX_xjal(), _QB_pointsDY_xjal(), green );

    SimTrigger = new TargetLine( this, SHAPE_DRAW_2D, true, 920.0, 630.0, _SimTrigger_pointsDX_xjal(), _SimTrigger_pointsDY_xjal(), green );

    MQroute = new TargetLine( this, SHAPE_DRAW_2D, true, 650.0, 330.0, _MQroute_pointsDX_xjal(), _MQroute_pointsDY_xjal(), green );

    BQroute = new TargetLine( this, SHAPE_DRAW_2D, true, 620.0, 450.0, _BQroute_pointsDX_xjal(), _BQroute_pointsDY_xjal(), green );

    BMroute = new TargetLine( this, SHAPE_DRAW_2D, true, 580.0, 420.0, _BMroute_pointsDX_xjal(), _BMroute_pointsDY_xjal(), green );

    FCLine = new TargetLine( this, SHAPE_DRAW_2D, true, 920.0, 740.0, _FCLine_pointsDX_xjal(), _FCLine_pointsDY_xjal(), green );

    Manhatten = new RectangularNode<Agent>( this, SHAPE_DRAW_2D3D, true,
    null, 520.0, 300.0, 0.0, 50.0, 40.0, 0.0,
            null, black, 3.0, LINE_STYLE_DASHED, POSITION_CHOICE_RANDOM, new PathEnd[] {} );

    Brooklyn = new RectangularNode<Agent>( this, SHAPE_DRAW_2D3D, true,
    null, 540.0, 500.0, 0.0, 40.0, 40.0, 0.0,
            null, black, 3.0, LINE_STYLE_DASHED, POSITION_CHOICE_RANDOM, new PathEnd[] {} );

    MBarea = new RectangularNode<Agent>( this, SHAPE_DRAW_2D3D, true,
    null, 440.0, 400.0, 0.0, 40.0, 40.0, 0.0,
            null, dodgerBlue, 1.0, LINE_STYLE_DASHED, POSITION_CHOICE_RANDOM, new PathEnd[] {} );

    Queens = new RectangularNode<Agent>( this, SHAPE_DRAW_2D3D, true,
    null, 690.0, 400.0, 0.0, 40.0, 40.0, 0.0,
            null, black, 3.0, LINE_STYLE_DASHED, POSITION_CHOICE_RANDOM, new PathEnd[] {} );

    BQarea = new RectangularNode<Agent>( this, SHAPE_DRAW_2D3D, true,
    null, 670.0, 510.0, 0.0, 40.0, 40.0, 0.0,
            null, dodgerBlue, 1.0, LINE_STYLE_DASHED, POSITION_CHOICE_RANDOM, new PathEnd[] {} );

    QMarea = new RectangularNode<Agent>( this, SHAPE_DRAW_2D3D, true,
    null, 660.0, 280.0, 0.0, 40.0, 40.0, 0.0,
            null, dodgerBlue, 1.0, LINE_STYLE_DASHED, POSITION_CHOICE_RANDOM, new PathEnd[] {} );

  }

  @AnyLogicInternalCodegenAPI
  private void _createPersistentElementsAP0_xjal() {
  }

  @AnyLogicInternalCodegenAPI
  private void _createPersistentElementsBS0_xjal() {
  }


  // Static initialization of persistent elements
  private void instantiatePersistentElements_xjal() {
    level = new com.anylogic.engine.markup.Level(this, "level", SHAPE_DRAW_2D3D, 0.0, true, true);  			
	_getLevels_xjal = new com.anylogic.engine.markup.Level[] { 
      level };
    _createPersistentElementsBP0_xjal();
  }
  protected ShapeTopLevelPresentationGroup presentation;
  protected ShapeModelElementsGroup icon; 

  @Override
  @AnyLogicInternalCodegenAPI
  public ShapeTopLevelPresentationGroup getPresentationShape() {
    return presentation;
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public ShapeModelElementsGroup getModelElementsShape() {
    return icon;
  }

	


  /**
   * Constructor
   */
  public Main( Engine engine, Agent owner, AgentList<? extends Main> ownerPopulation ) {
    super( engine, owner, ownerPopulation );
    instantiateBaseStructureThis_xjal();
  }

  @AnyLogicInternalCodegenAPI
  public void onOwnerChanged_xjal() {
    super.onOwnerChanged_xjal();
    setupReferences_xjal();
  }

  @AnyLogicInternalCodegenAPI
  public void instantiateBaseStructure_xjal() {
    super.instantiateBaseStructure_xjal();
    instantiateBaseStructureThis_xjal();
  }
  
  @AnyLogicInternalCodegenAPI
  private void instantiateBaseStructureThis_xjal() {
    MBsource = instantiate_MBsource_xjal();
    MQsuccess = instantiate_MQsuccess_xjal();
    MQdepart = instantiate_MQdepart_xjal();
    MQstep = instantiate_MQstep_xjal();
    MchargeSo = instantiate_MchargeSo_xjal();
    MCharge = instantiate_MCharge_xjal();
    MchargeSi = instantiate_MchargeSi_xjal();
    BQdepart = instantiate_BQdepart_xjal();
    BQstep = instantiate_BQstep_xjal();
    MBchoose = instantiate_MBchoose_xjal();
    BQsuccess = instantiate_BQsuccess_xjal();
    BQsource = instantiate_BQsource_xjal();
    BMsuccess = instantiate_BMsuccess_xjal();
    BMdepart = instantiate_BMdepart_xjal();
    BMstep = instantiate_BMstep_xjal();
    QMdepart = instantiate_QMdepart_xjal();
    QMstep = instantiate_QMstep_xjal();
    BQchoose = instantiate_BQchoose_xjal();
    QMsource = instantiate_QMsource_xjal();
    QBdepart = instantiate_QBdepart_xjal();
    QBstep = instantiate_QBstep_xjal();
    MBdepart = instantiate_MBdepart_xjal();
    MBstep = instantiate_MBstep_xjal();
    QMchoose = instantiate_QMchoose_xjal();
    TriggerSo = instantiate_TriggerSo_xjal();
    TriggerSi = instantiate_TriggerSi_xjal();
    MCheck = instantiate_MCheck_xjal();
    MMaintenance = instantiate_MMaintenance_xjal();
    BchargeSo = instantiate_BchargeSo_xjal();
    BCharge = instantiate_BCharge_xjal();
    BchargeSi = instantiate_BchargeSi_xjal();
    BCheck = instantiate_BCheck_xjal();
    BMaintenance = instantiate_BMaintenance_xjal();
    QchargeSo = instantiate_QchargeSo_xjal();
    QCharge = instantiate_QCharge_xjal();
    QchargeSi = instantiate_QchargeSi_xjal();
    QCheck = instantiate_QCheck_xjal();
    QMaintenance = instantiate_QMaintenance_xjal();
    MQfly = instantiate_MQfly_xjal();
    BQfly = instantiate_BQfly_xjal();
    BMfly = instantiate_BMfly_xjal();
    MQqueue = instantiate_MQqueue_xjal();
    MQpatience = instantiate_MQpatience_xjal();
    MQimpatient = instantiate_MQimpatient_xjal();
    BQqueue = instantiate_BQqueue_xjal();
    BQpatience = instantiate_BQpatience_xjal();
    BQimpatient = instantiate_BQimpatient_xjal();
    BMpatience = instantiate_BMpatience_xjal();
    BMqueue = instantiate_BMqueue_xjal();
    BMimpatient = instantiate_BMimpatient_xjal();
    QMpatience = instantiate_QMpatience_xjal();
    QMqueue = instantiate_QMqueue_xjal();
    QMimpatient = instantiate_QMimpatient_xjal();
    QBpatience = instantiate_QBpatience_xjal();
    QBqueue = instantiate_QBqueue_xjal();
    QBimpatient = instantiate_QBimpatient_xjal();
    MBpatience = instantiate_MBpatience_xjal();
    MBqueue = instantiate_MBqueue_xjal();
    MBimpatient = instantiate_MBimpatient_xjal();
    FlightCountSo = instantiate_FlightCountSo_xjal();
    FlightCountSi = instantiate_FlightCountSi_xjal();
	instantiatePersistentElements_xjal();
    setupReferences_xjal();
  }
  
  @AnyLogicInternalCodegenAPI
  private void setupReferences_xjal() {
  }
  
  /**
   * Simple constructor. Please add created agent to some population by calling goToPopulation() function
   */
  public Main() {
  }
  
  /**
   * Creating embedded object instances
   */
  @AnyLogicInternalCodegenAPI
  private void instantiatePopulations_xjal() {
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public void doCreate() {
    super.doCreate();
    // Creating embedded object instances
    instantiatePopulations_xjal();
    // Assigning initial values for plain variables
    setupPlainVariables_Main_xjal();
    // Dynamic initialization of persistent elements
    _createPersistentElementsAP0_xjal();
	_initialize_level_xjal();
    level.initialize();
    presentation = new ShapeTopLevelPresentationGroup( Main.this, true, 0, 0, 0, 0 , level );
    // Creating embedded object instances
    instantiatePopulations_xjal();
    icon = new ShapeModelElementsGroup( Main.this, getElementProperty( "_6p_h.Main.icon", IElementDescriptor.MODEL_ELEMENT_DESCRIPTORS )  );
    icon.setIconOffsets( 0.0, 0.0 );
    // Creating non-replicated embedded objects
    setupParameters_MBsource_xjal( MBsource, null );
    doBeforeCreate_MBsource_xjal( MBsource, null );
    MBsource.createAsEmbedded();
    setupParameters_MQsuccess_xjal( MQsuccess, null );
    doBeforeCreate_MQsuccess_xjal( MQsuccess, null );
    MQsuccess.createAsEmbedded();
    setupParameters_MQdepart_xjal( MQdepart, null );
    doBeforeCreate_MQdepart_xjal( MQdepart, null );
    MQdepart.createAsEmbedded();
    setupParameters_MQstep_xjal( MQstep, null );
    doBeforeCreate_MQstep_xjal( MQstep, null );
    MQstep.createAsEmbedded();
    setupParameters_MchargeSo_xjal( MchargeSo, null );
    doBeforeCreate_MchargeSo_xjal( MchargeSo, null );
    MchargeSo.createAsEmbedded();
    setupParameters_MCharge_xjal( MCharge, null );
    doBeforeCreate_MCharge_xjal( MCharge, null );
    MCharge.createAsEmbedded();
    setupParameters_MchargeSi_xjal( MchargeSi, null );
    doBeforeCreate_MchargeSi_xjal( MchargeSi, null );
    MchargeSi.createAsEmbedded();
    setupParameters_BQdepart_xjal( BQdepart, null );
    doBeforeCreate_BQdepart_xjal( BQdepart, null );
    BQdepart.createAsEmbedded();
    setupParameters_BQstep_xjal( BQstep, null );
    doBeforeCreate_BQstep_xjal( BQstep, null );
    BQstep.createAsEmbedded();
    setupParameters_MBchoose_xjal( MBchoose, null );
    doBeforeCreate_MBchoose_xjal( MBchoose, null );
    MBchoose.createAsEmbedded();
    setupParameters_BQsuccess_xjal( BQsuccess, null );
    doBeforeCreate_BQsuccess_xjal( BQsuccess, null );
    BQsuccess.createAsEmbedded();
    setupParameters_BQsource_xjal( BQsource, null );
    doBeforeCreate_BQsource_xjal( BQsource, null );
    BQsource.createAsEmbedded();
    setupParameters_BMsuccess_xjal( BMsuccess, null );
    doBeforeCreate_BMsuccess_xjal( BMsuccess, null );
    BMsuccess.createAsEmbedded();
    setupParameters_BMdepart_xjal( BMdepart, null );
    doBeforeCreate_BMdepart_xjal( BMdepart, null );
    BMdepart.createAsEmbedded();
    setupParameters_BMstep_xjal( BMstep, null );
    doBeforeCreate_BMstep_xjal( BMstep, null );
    BMstep.createAsEmbedded();
    setupParameters_QMdepart_xjal( QMdepart, null );
    doBeforeCreate_QMdepart_xjal( QMdepart, null );
    QMdepart.createAsEmbedded();
    setupParameters_QMstep_xjal( QMstep, null );
    doBeforeCreate_QMstep_xjal( QMstep, null );
    QMstep.createAsEmbedded();
    setupParameters_BQchoose_xjal( BQchoose, null );
    doBeforeCreate_BQchoose_xjal( BQchoose, null );
    BQchoose.createAsEmbedded();
    setupParameters_QMsource_xjal( QMsource, null );
    doBeforeCreate_QMsource_xjal( QMsource, null );
    QMsource.createAsEmbedded();
    setupParameters_QBdepart_xjal( QBdepart, null );
    doBeforeCreate_QBdepart_xjal( QBdepart, null );
    QBdepart.createAsEmbedded();
    setupParameters_QBstep_xjal( QBstep, null );
    doBeforeCreate_QBstep_xjal( QBstep, null );
    QBstep.createAsEmbedded();
    setupParameters_MBdepart_xjal( MBdepart, null );
    doBeforeCreate_MBdepart_xjal( MBdepart, null );
    MBdepart.createAsEmbedded();
    setupParameters_MBstep_xjal( MBstep, null );
    doBeforeCreate_MBstep_xjal( MBstep, null );
    MBstep.createAsEmbedded();
    setupParameters_QMchoose_xjal( QMchoose, null );
    doBeforeCreate_QMchoose_xjal( QMchoose, null );
    QMchoose.createAsEmbedded();
    setupParameters_TriggerSo_xjal( TriggerSo, null );
    doBeforeCreate_TriggerSo_xjal( TriggerSo, null );
    TriggerSo.createAsEmbedded();
    setupParameters_TriggerSi_xjal( TriggerSi, null );
    doBeforeCreate_TriggerSi_xjal( TriggerSi, null );
    TriggerSi.createAsEmbedded();
    setupParameters_MCheck_xjal( MCheck, null );
    doBeforeCreate_MCheck_xjal( MCheck, null );
    MCheck.createAsEmbedded();
    setupParameters_MMaintenance_xjal( MMaintenance, null );
    doBeforeCreate_MMaintenance_xjal( MMaintenance, null );
    MMaintenance.createAsEmbedded();
    setupParameters_BchargeSo_xjal( BchargeSo, null );
    doBeforeCreate_BchargeSo_xjal( BchargeSo, null );
    BchargeSo.createAsEmbedded();
    setupParameters_BCharge_xjal( BCharge, null );
    doBeforeCreate_BCharge_xjal( BCharge, null );
    BCharge.createAsEmbedded();
    setupParameters_BchargeSi_xjal( BchargeSi, null );
    doBeforeCreate_BchargeSi_xjal( BchargeSi, null );
    BchargeSi.createAsEmbedded();
    setupParameters_BCheck_xjal( BCheck, null );
    doBeforeCreate_BCheck_xjal( BCheck, null );
    BCheck.createAsEmbedded();
    setupParameters_BMaintenance_xjal( BMaintenance, null );
    doBeforeCreate_BMaintenance_xjal( BMaintenance, null );
    BMaintenance.createAsEmbedded();
    setupParameters_QchargeSo_xjal( QchargeSo, null );
    doBeforeCreate_QchargeSo_xjal( QchargeSo, null );
    QchargeSo.createAsEmbedded();
    setupParameters_QCharge_xjal( QCharge, null );
    doBeforeCreate_QCharge_xjal( QCharge, null );
    QCharge.createAsEmbedded();
    setupParameters_QchargeSi_xjal( QchargeSi, null );
    doBeforeCreate_QchargeSi_xjal( QchargeSi, null );
    QchargeSi.createAsEmbedded();
    setupParameters_QCheck_xjal( QCheck, null );
    doBeforeCreate_QCheck_xjal( QCheck, null );
    QCheck.createAsEmbedded();
    setupParameters_QMaintenance_xjal( QMaintenance, null );
    doBeforeCreate_QMaintenance_xjal( QMaintenance, null );
    QMaintenance.createAsEmbedded();
    setupParameters_MQfly_xjal( MQfly, null );
    doBeforeCreate_MQfly_xjal( MQfly, null );
    MQfly.createAsEmbedded();
    setupParameters_BQfly_xjal( BQfly, null );
    doBeforeCreate_BQfly_xjal( BQfly, null );
    BQfly.createAsEmbedded();
    setupParameters_BMfly_xjal( BMfly, null );
    doBeforeCreate_BMfly_xjal( BMfly, null );
    BMfly.createAsEmbedded();
    setupParameters_MQqueue_xjal( MQqueue, null );
    doBeforeCreate_MQqueue_xjal( MQqueue, null );
    MQqueue.createAsEmbedded();
    setupParameters_MQpatience_xjal( MQpatience, null );
    doBeforeCreate_MQpatience_xjal( MQpatience, null );
    MQpatience.createAsEmbedded();
    setupParameters_MQimpatient_xjal( MQimpatient, null );
    doBeforeCreate_MQimpatient_xjal( MQimpatient, null );
    MQimpatient.createAsEmbedded();
    setupParameters_BQqueue_xjal( BQqueue, null );
    doBeforeCreate_BQqueue_xjal( BQqueue, null );
    BQqueue.createAsEmbedded();
    setupParameters_BQpatience_xjal( BQpatience, null );
    doBeforeCreate_BQpatience_xjal( BQpatience, null );
    BQpatience.createAsEmbedded();
    setupParameters_BQimpatient_xjal( BQimpatient, null );
    doBeforeCreate_BQimpatient_xjal( BQimpatient, null );
    BQimpatient.createAsEmbedded();
    setupParameters_BMpatience_xjal( BMpatience, null );
    doBeforeCreate_BMpatience_xjal( BMpatience, null );
    BMpatience.createAsEmbedded();
    setupParameters_BMqueue_xjal( BMqueue, null );
    doBeforeCreate_BMqueue_xjal( BMqueue, null );
    BMqueue.createAsEmbedded();
    setupParameters_BMimpatient_xjal( BMimpatient, null );
    doBeforeCreate_BMimpatient_xjal( BMimpatient, null );
    BMimpatient.createAsEmbedded();
    setupParameters_QMpatience_xjal( QMpatience, null );
    doBeforeCreate_QMpatience_xjal( QMpatience, null );
    QMpatience.createAsEmbedded();
    setupParameters_QMqueue_xjal( QMqueue, null );
    doBeforeCreate_QMqueue_xjal( QMqueue, null );
    QMqueue.createAsEmbedded();
    setupParameters_QMimpatient_xjal( QMimpatient, null );
    doBeforeCreate_QMimpatient_xjal( QMimpatient, null );
    QMimpatient.createAsEmbedded();
    setupParameters_QBpatience_xjal( QBpatience, null );
    doBeforeCreate_QBpatience_xjal( QBpatience, null );
    QBpatience.createAsEmbedded();
    setupParameters_QBqueue_xjal( QBqueue, null );
    doBeforeCreate_QBqueue_xjal( QBqueue, null );
    QBqueue.createAsEmbedded();
    setupParameters_QBimpatient_xjal( QBimpatient, null );
    doBeforeCreate_QBimpatient_xjal( QBimpatient, null );
    QBimpatient.createAsEmbedded();
    setupParameters_MBpatience_xjal( MBpatience, null );
    doBeforeCreate_MBpatience_xjal( MBpatience, null );
    MBpatience.createAsEmbedded();
    setupParameters_MBqueue_xjal( MBqueue, null );
    doBeforeCreate_MBqueue_xjal( MBqueue, null );
    MBqueue.createAsEmbedded();
    setupParameters_MBimpatient_xjal( MBimpatient, null );
    doBeforeCreate_MBimpatient_xjal( MBimpatient, null );
    MBimpatient.createAsEmbedded();
    setupParameters_FlightCountSo_xjal( FlightCountSo, null );
    doBeforeCreate_FlightCountSo_xjal( FlightCountSo, null );
    FlightCountSo.createAsEmbedded();
    setupParameters_FlightCountSi_xjal( FlightCountSi, null );
    doBeforeCreate_FlightCountSi_xjal( FlightCountSi, null );
    FlightCountSi.createAsEmbedded();
	 // Port connectors with non-replicated objects
    MQstep.out.connect( MQdepart.in ); // connector5
    MchargeSi.in.connect( MCharge.out ); // connector14
    BQstep.out.connect( BQdepart.in ); // connector15
    MBsource.out.connect( MBchoose.in ); // connector17
    BMstep.out.connect( BMdepart.in ); // connector20
    QMstep.out.connect( QMdepart.in ); // connector21
    BQsource.out.connect( BQchoose.in ); // connector24
    QBstep.out.connect( QBdepart.in ); // connector27
    MBstep.out.connect( MBdepart.in ); // connector28
    QMsource.out.connect( QMchoose.in ); // connector31
    TriggerSo.out.connect( TriggerSi.in ); // connector37
    MCheck.in.connect( MchargeSo.out ); // connector13
    MCheck.out1.connect( MCharge.in ); // connector38
    MCheck.out2.connect( MMaintenance.in ); // connector39
    MMaintenance.out.connect( MchargeSi.in ); // connector40
    BchargeSi.in.connect( BCharge.out ); // connector41
    BCheck.in.connect( BchargeSo.out ); // connector42
    BCheck.out1.connect( BCharge.in ); // connector43
    BCheck.out2.connect( BMaintenance.in ); // connector44
    BMaintenance.out.connect( BchargeSi.in ); // connector45
    QchargeSi.in.connect( QCharge.out ); // connector46
    QCheck.in.connect( QchargeSo.out ); // connector47
    QCheck.out1.connect( QCharge.in ); // connector48
    QCheck.out2.connect( QMaintenance.in ); // connector49
    QMaintenance.out.connect( QchargeSi.in ); // connector50
    MQdepart.out.connect( MQfly.in ); // connector3
    QMdepart.out.connect( MQfly.in ); // connector6
    MQfly.out.connect( MQsuccess.in ); // connector7
    BQdepart.out.connect( BQfly.in ); // connector8
    BQfly.out.connect( BQsuccess.in ); // connector9
    QBdepart.out.connect( BQfly.in ); // connector10
    BMdepart.out.connect( BMfly.in ); // connector11
    MBdepart.out.connect( BMfly.in ); // connector12
    BMfly.out.connect( BMsuccess.in ); // connector18
    MQqueue.out.connect( MQstep.in ); // connector1
    MQpatience.out1.connect( MQqueue.in ); // connector
    MBchoose.out1.connect( MQpatience.in ); // connector2
    MQpatience.out2.connect( MQimpatient.in ); // connector4
    BQqueue.out.connect( BQstep.in ); // connector16
    MBchoose.out2.connect( BQpatience.in ); // connector19
    BQpatience.out1.connect( BQqueue.in ); // connector25
    BQpatience.out2.connect( BQimpatient.in ); // connector26
    BQchoose.out1.connect( BMpatience.in ); // connector22
    BMqueue.out.connect( BMstep.in ); // connector23
    BMpatience.out1.connect( BMqueue.in ); // connector32
    BMpatience.out2.connect( BMimpatient.in ); // connector33
    BQchoose.out2.connect( QMpatience.in ); // connector34
    QMqueue.out.connect( QMstep.in ); // connector35
    QMpatience.out1.connect( QMqueue.in ); // connector36
    QMpatience.out2.connect( QMimpatient.in ); // connector51
    QBpatience.in.connect( QMchoose.out1 ); // connector29
    QBqueue.out.connect( QBstep.in ); // connector30
    QBpatience.out1.connect( QBqueue.in ); // connector52
    QBpatience.out2.connect( QBimpatient.in ); // connector53
    QMchoose.out2.connect( MBpatience.in ); // connector54
    MBqueue.out.connect( MBstep.in ); // connector55
    MBpatience.out1.connect( MBqueue.in ); // connector56
    MBpatience.out2.connect( MBimpatient.in ); // connector57
    FlightCountSo.out.connect( FlightCountSi.in ); // connector58
    // Creating replicated embedded objects
    setupInitialConditions_xjal( Main.class );
    // Dynamic initialization of persistent elements
    _createPersistentElementsBS0_xjal();
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public void doStart() {
    super.doStart();
    MBsource.startAsEmbedded();
    MQsuccess.startAsEmbedded();
    MQdepart.startAsEmbedded();
    MQstep.startAsEmbedded();
    MchargeSo.startAsEmbedded();
    MCharge.startAsEmbedded();
    MchargeSi.startAsEmbedded();
    BQdepart.startAsEmbedded();
    BQstep.startAsEmbedded();
    MBchoose.startAsEmbedded();
    BQsuccess.startAsEmbedded();
    BQsource.startAsEmbedded();
    BMsuccess.startAsEmbedded();
    BMdepart.startAsEmbedded();
    BMstep.startAsEmbedded();
    QMdepart.startAsEmbedded();
    QMstep.startAsEmbedded();
    BQchoose.startAsEmbedded();
    QMsource.startAsEmbedded();
    QBdepart.startAsEmbedded();
    QBstep.startAsEmbedded();
    MBdepart.startAsEmbedded();
    MBstep.startAsEmbedded();
    QMchoose.startAsEmbedded();
    TriggerSo.startAsEmbedded();
    TriggerSi.startAsEmbedded();
    MCheck.startAsEmbedded();
    MMaintenance.startAsEmbedded();
    BchargeSo.startAsEmbedded();
    BCharge.startAsEmbedded();
    BchargeSi.startAsEmbedded();
    BCheck.startAsEmbedded();
    BMaintenance.startAsEmbedded();
    QchargeSo.startAsEmbedded();
    QCharge.startAsEmbedded();
    QchargeSi.startAsEmbedded();
    QCheck.startAsEmbedded();
    QMaintenance.startAsEmbedded();
    MQfly.startAsEmbedded();
    BQfly.startAsEmbedded();
    BMfly.startAsEmbedded();
    MQqueue.startAsEmbedded();
    MQpatience.startAsEmbedded();
    MQimpatient.startAsEmbedded();
    BQqueue.startAsEmbedded();
    BQpatience.startAsEmbedded();
    BQimpatient.startAsEmbedded();
    BMpatience.startAsEmbedded();
    BMqueue.startAsEmbedded();
    BMimpatient.startAsEmbedded();
    QMpatience.startAsEmbedded();
    QMqueue.startAsEmbedded();
    QMimpatient.startAsEmbedded();
    QBpatience.startAsEmbedded();
    QBqueue.startAsEmbedded();
    QBimpatient.startAsEmbedded();
    MBpatience.startAsEmbedded();
    MBqueue.startAsEmbedded();
    MBimpatient.startAsEmbedded();
    FlightCountSo.startAsEmbedded();
    FlightCountSi.startAsEmbedded();
  }
 

  /**
   * Assigning initial values for plain variables<br>
   * <em>This method isn't designed to be called by user and may be removed in future releases.</em>
   */
  @AnyLogicInternalCodegenAPI
  public void setupPlainVariables_xjal() {
    setupPlainVariables_Main_xjal();
  }

  /**
   * Assigning initial values for plain variables<br>
   * <em>This method isn't designed to be called by user and may be removed in future releases.</em>
   */
  @AnyLogicInternalCodegenAPI
  private void setupPlainVariables_Main_xjal() {
  }

  // User API -----------------------------------------------------
  @AnyLogicInternalCodegenAPI
  public static LinkToAgentAnimationSettings _connections_commonAnimationSettings_xjal = new LinkToAgentAnimationSettingsImpl( false, black, 1.0, LINE_STYLE_SOLID, ARROW_NONE, 0.0 );

  public LinkToAgentCollection<Agent, Agent> connections = new LinkToAgentStandardImpl<Agent, Agent>(this, _connections_commonAnimationSettings_xjal);
  @Override
  public LinkToAgentCollection<? extends Agent, ? extends Agent> getLinkToAgentStandard_xjal() {
    return connections;
  }


  @AnyLogicInternalCodegenAPI
  public void drawLinksToAgents(boolean _underAgents_xjal, LinkToAgentAnimator _animator_xjal) {
    super.drawLinksToAgents(_underAgents_xjal, _animator_xjal);
    if ( _underAgents_xjal ) {
      _animator_xjal.drawLink( this, connections, true, true );
    }
  }

  public List<Object> getEmbeddedObjects() {
    List<Object> list = super.getEmbeddedObjects();
    if (list == null) {
      list = new LinkedList<Object>();
    }
    list.add( MBsource );
    list.add( MQsuccess );
    list.add( MQdepart );
    list.add( MQstep );
    list.add( MchargeSo );
    list.add( MCharge );
    list.add( MchargeSi );
    list.add( BQdepart );
    list.add( BQstep );
    list.add( MBchoose );
    list.add( BQsuccess );
    list.add( BQsource );
    list.add( BMsuccess );
    list.add( BMdepart );
    list.add( BMstep );
    list.add( QMdepart );
    list.add( QMstep );
    list.add( BQchoose );
    list.add( QMsource );
    list.add( QBdepart );
    list.add( QBstep );
    list.add( MBdepart );
    list.add( MBstep );
    list.add( QMchoose );
    list.add( TriggerSo );
    list.add( TriggerSi );
    list.add( MCheck );
    list.add( MMaintenance );
    list.add( BchargeSo );
    list.add( BCharge );
    list.add( BchargeSi );
    list.add( BCheck );
    list.add( BMaintenance );
    list.add( QchargeSo );
    list.add( QCharge );
    list.add( QchargeSi );
    list.add( QCheck );
    list.add( QMaintenance );
    list.add( MQfly );
    list.add( BQfly );
    list.add( BMfly );
    list.add( MQqueue );
    list.add( MQpatience );
    list.add( MQimpatient );
    list.add( BQqueue );
    list.add( BQpatience );
    list.add( BQimpatient );
    list.add( BMpatience );
    list.add( BMqueue );
    list.add( BMimpatient );
    list.add( QMpatience );
    list.add( QMqueue );
    list.add( QMimpatient );
    list.add( QBpatience );
    list.add( QBqueue );
    list.add( QBimpatient );
    list.add( MBpatience );
    list.add( MBqueue );
    list.add( MBimpatient );
    list.add( FlightCountSo );
    list.add( FlightCountSi );
    return list;
  }

  public AgentList<? extends Main> getPopulation() {
    return (AgentList<? extends Main>) super.getPopulation();
  }

  public List<? extends Main> agentsInRange( double distance ) {
    return (List<? extends Main>) super.agentsInRange( distance );
  }

  @AnyLogicInternalCodegenAPI
  public void onDestroy() {
    MBsource.onDestroy();
    MQsuccess.onDestroy();
    MQdepart.onDestroy();
    MQstep.onDestroy();
    MchargeSo.onDestroy();
    MCharge.onDestroy();
    MchargeSi.onDestroy();
    BQdepart.onDestroy();
    BQstep.onDestroy();
    MBchoose.onDestroy();
    BQsuccess.onDestroy();
    BQsource.onDestroy();
    BMsuccess.onDestroy();
    BMdepart.onDestroy();
    BMstep.onDestroy();
    QMdepart.onDestroy();
    QMstep.onDestroy();
    BQchoose.onDestroy();
    QMsource.onDestroy();
    QBdepart.onDestroy();
    QBstep.onDestroy();
    MBdepart.onDestroy();
    MBstep.onDestroy();
    QMchoose.onDestroy();
    TriggerSo.onDestroy();
    TriggerSi.onDestroy();
    MCheck.onDestroy();
    MMaintenance.onDestroy();
    BchargeSo.onDestroy();
    BCharge.onDestroy();
    BchargeSi.onDestroy();
    BCheck.onDestroy();
    BMaintenance.onDestroy();
    QchargeSo.onDestroy();
    QCharge.onDestroy();
    QchargeSi.onDestroy();
    QCheck.onDestroy();
    QMaintenance.onDestroy();
    MQfly.onDestroy();
    BQfly.onDestroy();
    BMfly.onDestroy();
    MQqueue.onDestroy();
    MQpatience.onDestroy();
    MQimpatient.onDestroy();
    BQqueue.onDestroy();
    BQpatience.onDestroy();
    BQimpatient.onDestroy();
    BMpatience.onDestroy();
    BMqueue.onDestroy();
    BMimpatient.onDestroy();
    QMpatience.onDestroy();
    QMqueue.onDestroy();
    QMimpatient.onDestroy();
    QBpatience.onDestroy();
    QBqueue.onDestroy();
    QBimpatient.onDestroy();
    MBpatience.onDestroy();
    MBqueue.onDestroy();
    MBimpatient.onDestroy();
    FlightCountSo.onDestroy();
    FlightCountSi.onDestroy();
    super.onDestroy();
  }

  @AnyLogicInternalCodegenAPI
  @Override
  public void doFinish() {
    super.doFinish();
    MBsource.doFinish();
    MQsuccess.doFinish();
    MQdepart.doFinish();
    MQstep.doFinish();
    MchargeSo.doFinish();
    MCharge.doFinish();
    MchargeSi.doFinish();
    BQdepart.doFinish();
    BQstep.doFinish();
    MBchoose.doFinish();
    BQsuccess.doFinish();
    BQsource.doFinish();
    BMsuccess.doFinish();
    BMdepart.doFinish();
    BMstep.doFinish();
    QMdepart.doFinish();
    QMstep.doFinish();
    BQchoose.doFinish();
    QMsource.doFinish();
    QBdepart.doFinish();
    QBstep.doFinish();
    MBdepart.doFinish();
    MBstep.doFinish();
    QMchoose.doFinish();
    TriggerSo.doFinish();
    TriggerSi.doFinish();
    MCheck.doFinish();
    MMaintenance.doFinish();
    BchargeSo.doFinish();
    BCharge.doFinish();
    BchargeSi.doFinish();
    BCheck.doFinish();
    BMaintenance.doFinish();
    QchargeSo.doFinish();
    QCharge.doFinish();
    QchargeSi.doFinish();
    QCheck.doFinish();
    QMaintenance.doFinish();
    MQfly.doFinish();
    BQfly.doFinish();
    BMfly.doFinish();
    MQqueue.doFinish();
    MQpatience.doFinish();
    MQimpatient.doFinish();
    BQqueue.doFinish();
    BQpatience.doFinish();
    BQimpatient.doFinish();
    BMpatience.doFinish();
    BMqueue.doFinish();
    BMimpatient.doFinish();
    QMpatience.doFinish();
    QMqueue.doFinish();
    QMimpatient.doFinish();
    QBpatience.doFinish();
    QBqueue.doFinish();
    QBimpatient.doFinish();
    MBpatience.doFinish();
    MBqueue.doFinish();
    MBimpatient.doFinish();
    FlightCountSo.doFinish();
    FlightCountSi.doFinish();
  }



}
