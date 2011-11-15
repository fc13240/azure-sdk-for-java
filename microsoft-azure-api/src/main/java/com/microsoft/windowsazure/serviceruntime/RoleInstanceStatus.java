package com.microsoft.windowsazure.serviceruntime;

/**
 * Defines role instance status values, such as Busy and Ready.
 * <p>
 * The {@link RoleEnvironment#setStatus} method
 * uses a value from this enumeration.
 * 
 * Copyright (c)2011 Microsoft. All rights reserved.
 * 
 * @author mariok
 * 
 */
public enum RoleInstanceStatus {
    /**
     * The role instance is unavailable for requests.
     */
    Busy,
    /**
     * The role instance is ready to accept requests.
     */
    Ready
}