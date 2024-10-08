'use strict';

const plugins = {}
plugins.db = require('./mongo')
// deactivating kafka here did not work
plugins.queue = require('./kafka')

const { waitForPlugins } = require('./wait')

plugins.waitForPlugins = async () => { await waitForPlugins(plugins) }

module.exports = plugins
