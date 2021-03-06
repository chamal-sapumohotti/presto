/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.facebook.presto.hive;

public abstract class AbstractTestSplitIteratorBackpressure
        extends AbstractTestHiveClient
{
    @Override
    protected void setup(String host, int port, String databaseName, String timeZone)
    {
        // Restrict the outstanding splits to 1 and only use 2 threads per iterator
        setup(host, port, databaseName, timeZone, "hive-push-backtest", 1, 2);
    }
}
