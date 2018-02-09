/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.android.cameraview;

public class Log {
    private static int sLogLevel = android.util.Log.VERBOSE;

    private Log() {
    }

    /**
     * Get log level.
     *
     * @return Log level.
     */
    public static int getLogLevel() {
        return sLogLevel;
    }

    /**
     * Set log level.
     * It does not print a log of less than the specified level.
     *
     *
     * @param logLevel Log level. Set log level from {@link android.util.Log#VERBOSE} to {@link android.util.Log#ERROR}.
     */
    public static void setLogLevel(int logLevel) {
        sLogLevel = logLevel;
    }

    /**
     * Print a {@link android.util.Log#VERBOSE} log message.
     *
     * @param tag Used to identify the source of a log message.
     * @param msg The message you would like logged.
     */
    public static void v(String tag, String msg) {
        if (sLogLevel <= android.util.Log.VERBOSE) {
            android.util.Log.v(tag, msg);
        }
    }

    /**
     * Send a {@link android.util.Log#VERBOSE} log message and log the exception.
     *
     * @param tag Used to identify the source of a log message.
     * @param msg The message you would like logged.
     * @param tr  An exception to log
     */
    public static void v(String tag, String msg, Throwable tr) {
        if (sLogLevel <= android.util.Log.VERBOSE) {
            android.util.Log.v(tag, msg, tr);
        }
    }

    /**
     * Send a {@link android.util.Log#DEBUG} log message.
     *
     * @param tag Used to identify the source of a log message.
     * @param msg The message you would like logged.
     */
    public static void d(String tag, String msg) {
        if (sLogLevel <= android.util.Log.DEBUG) {
            android.util.Log.d(tag, msg);
        }
    }

    /**
     * Send a {@link android.util.Log#DEBUG} log message and log the exception.
     *
     * @param tag Used to identify the source of a log message.
     * @param msg The message you would like logged.
     * @param tr  An exception to log
     */
    public static void d(String tag, String msg, Throwable tr) {
        if (sLogLevel <= android.util.Log.DEBUG) {
            android.util.Log.d(tag, msg, tr);
        }
    }

    /**
     * Send an {@link android.util.Log#INFO} log message.
     *
     * @param tag Used to identify the source of a log message.
     * @param msg The message you would like logged.
     */
    public static void i(String tag, String msg) {
        if (sLogLevel <= android.util.Log.INFO) {
            android.util.Log.i(tag, msg);
        }
    }

    /**
     * Send a {@link android.util.Log#INFO} log message and log the exception.
     *
     * @param tag Used to identify the source of a log message.
     * @param msg The message you would like logged.
     * @param tr  An exception to log
     */
    public static void i(String tag, String msg, Throwable tr) {
        if (sLogLevel <= android.util.Log.INFO) {
            android.util.Log.i(tag, msg, tr);
        }
    }

    /**
     * Send a {@link android.util.Log#WARN} log message.
     *
     * @param tag Used to identify the source of a log message.
     * @param msg The message you would like logged.
     */
    public static void w(String tag, String msg) {
        if (sLogLevel <= android.util.Log.WARN) {
            android.util.Log.w(tag, msg);
        }
    }

    /**
     * Send a {@link android.util.Log#WARN} log message and log the exception.
     *
     * @param tag Used to identify the source of a log message.
     * @param msg The message you would like logged.
     * @param tr  An exception to log
     */
    public static void w(String tag, String msg, Throwable tr) {
        if (sLogLevel <= android.util.Log.WARN) {
            android.util.Log.w(tag, msg, tr);
        }
    }

    /**
     * Send a {@link android.util.Log#WARN} log message and log the exception.
     *
     * @param tag  Used to identify the source of a log message.
     * @param WARN An exception to log
     */
    public static void w(String tag, Throwable WARN) {
        if (sLogLevel <= android.util.Log.WARN) {
            android.util.Log.w(tag, WARN);
        }
    }

    /**
     * Send an {@link android.util.Log#ERROR} log message.
     *
     * @param tag Used to identify the source of a log message.
     * @param msg The message you would like logged.
     */
    public static void e(String tag, String msg) {
        if (sLogLevel <= android.util.Log.ERROR) {
            android.util.Log.e(tag, msg);
        }
    }

    /**
     * Send a {@link android.util.Log#ERROR} log message and log the exception.
     *
     * @param tag Used to identify the source of a log message.
     * @param msg The message you would like logged.
     * @param tr  An exception to log
     */
    public static void e(String tag, String msg, Throwable tr) {
        if (sLogLevel <= android.util.Log.ERROR) {
            android.util.Log.e(tag, msg, tr);
        }
    }
}
