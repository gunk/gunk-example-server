// package: v1
// file: github.com/gunk/gunk-example-server/api/v1/all.proto

import * as jspb from "google-protobuf";
import * as google_api_annotations_pb from "../../../../../google/api/annotations_pb";
import * as google_protobuf_empty_pb from "google-protobuf/google/protobuf/empty_pb";

export class Country extends jspb.Message {
  getName(): string;
  setName(value: string): void;

  getCode(): string;
  setCode(value: string): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): Country.AsObject;
  static toObject(includeInstance: boolean, msg: Country): Country.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: Country, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): Country;
  static deserializeBinaryFromReader(message: Country, reader: jspb.BinaryReader): Country;
}

export namespace Country {
  export type AsObject = {
    name: string,
    code: string,
  }
}

export class GetCountriesRequest extends jspb.Message {
  clearCountriesList(): void;
  getCountriesList(): Array<string>;
  setCountriesList(value: Array<string>): void;
  addCountries(value: string, index?: number): string;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): GetCountriesRequest.AsObject;
  static toObject(includeInstance: boolean, msg: GetCountriesRequest): GetCountriesRequest.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: GetCountriesRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): GetCountriesRequest;
  static deserializeBinaryFromReader(message: GetCountriesRequest, reader: jspb.BinaryReader): GetCountriesRequest;
}

export namespace GetCountriesRequest {
  export type AsObject = {
    countriesList: Array<string>,
  }
}

export class GetCountriesResponse extends jspb.Message {
  getCountriesMap(): jspb.Map<string, Country>;
  clearCountriesMap(): void;
  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): GetCountriesResponse.AsObject;
  static toObject(includeInstance: boolean, msg: GetCountriesResponse): GetCountriesResponse.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: GetCountriesResponse, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): GetCountriesResponse;
  static deserializeBinaryFromReader(message: GetCountriesResponse, reader: jspb.BinaryReader): GetCountriesResponse;
}

export namespace GetCountriesResponse {
  export type AsObject = {
    countriesMap: Array<[string, Country.AsObject]>,
  }
}

export class Message extends jspb.Message {
  getMsg(): string;
  setMsg(value: string): void;

  getCode(): number;
  setCode(value: number): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): Message.AsObject;
  static toObject(includeInstance: boolean, msg: Message): Message.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: Message, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): Message;
  static deserializeBinaryFromReader(message: Message, reader: jspb.BinaryReader): Message;
}

export namespace Message {
  export type AsObject = {
    msg: string,
    code: number,
  }
}

export class CheckStatusResponse extends jspb.Message {
  getStatus(): StatusMap[keyof StatusMap];
  setStatus(value: StatusMap[keyof StatusMap]): void;

  getOldfield(): number;
  setOldfield(value: number): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): CheckStatusResponse.AsObject;
  static toObject(includeInstance: boolean, msg: CheckStatusResponse): CheckStatusResponse.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: CheckStatusResponse, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): CheckStatusResponse;
  static deserializeBinaryFromReader(message: CheckStatusResponse, reader: jspb.BinaryReader): CheckStatusResponse;
}

export namespace CheckStatusResponse {
  export type AsObject = {
    status: StatusMap[keyof StatusMap],
    oldfield: number,
  }
}

export interface StatusMap {
  UNKNOWN: 0;
  ERROR: 1;
  OK: 2;
}

export const Status: StatusMap;

