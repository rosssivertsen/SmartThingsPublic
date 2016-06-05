/**
 *  PE653
 *
 *  Copyright 2016 Ross Sivertsen
 *
 *  Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 *  in compliance with the License. You may obtain a copy of the License at:
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software distributed under the License is distributed
 *  on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License
 *  for the specific language governing permissions and limitations under the License.
 *
 */
metadata {
	definition (name: "PE653", namespace: "rosssivertsen", author: "Ross Sivertsen") {
		capability "Configuration"
		capability "Polling"
		capability "Refresh"
		capability "Switch"

		attribute "Switch1", "string"
		attribute "Switch2", "string"
		attribute "Switch3", "string"
		attribute "Switch4", "string"
		attribute "Switch5", "string"

		command "On1"
		command "Off1"
		command "On2"
		command "Off2"
		command "On3"
		command "Off3"
		command "On4"
		command "Off4"
		command "On5"
		command "Off5"
	}

	simulator {
		// TODO: define status and reply messages here
	}

	tiles {
		// TODO: define your main and details tiles here
	}
}

// parse events into attributes
def parse(String description) {
	log.debug "Parsing '${description}'"
	// TODO: handle 'switch' attribute
	// TODO: handle 'Switch1' attribute
	// TODO: handle 'Switch2' attribute
	// TODO: handle 'Switch3' attribute
	// TODO: handle 'Switch4' attribute
	// TODO: handle 'Switch5' attribute

}

// handle commands
def configure() {
	log.debug "Executing 'configure'"
	// TODO: handle 'configure' command
}

def poll() {
	log.debug "Executing 'poll'"
	// TODO: handle 'poll' command
}

def refresh() {
	log.debug "Executing 'refresh'"
	// TODO: handle 'refresh' command
}

def on() {
	log.debug "Executing 'on'"
	// TODO: handle 'on' command
}

def off() {
	log.debug "Executing 'off'"
	// TODO: handle 'off' command
}

def On1() {
	log.debug "Executing 'On1'"
	// TODO: handle 'On1' command
}

def Off1() {
	log.debug "Executing 'Off1'"
	// TODO: handle 'Off1' command
}

def On2() {
	log.debug "Executing 'On2'"
	// TODO: handle 'On2' command
}

def Off2() {
	log.debug "Executing 'Off2'"
	// TODO: handle 'Off2' command
}

def On3() {
	log.debug "Executing 'On3'"
	// TODO: handle 'On3' command
}

def Off3() {
	log.debug "Executing 'Off3'"
	// TODO: handle 'Off3' command
}

def On4() {
	log.debug "Executing 'On4'"
	// TODO: handle 'On4' command
}

def Off4() {
	log.debug "Executing 'Off4'"
	// TODO: handle 'Off4' command
}

def On5() {
	log.debug "Executing 'On5'"
	// TODO: handle 'On5' command
}

def Off5() {
	log.debug "Executing 'Off5'"
	// TODO: handle 'Off5' command
}